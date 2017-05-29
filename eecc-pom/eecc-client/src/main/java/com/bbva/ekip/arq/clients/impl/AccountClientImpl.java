package com.bbva.ekip.arq.clients.impl;

import com.bbva.ccol.account.facade.v01.dto.DTOOutListAccounts;
import com.bbva.ccol.account.facade.v01.dto.FacadeOutAccount;
import com.bbva.ccol.account.facade.v01.impl.SrvAccountV01;
import com.bbva.ekip.arq.clients.AccountClient;
import com.bbva.ekip.arq.util.HeaderUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.Map;

@Service
public class AccountClientImpl extends ServiceBase implements AccountClient {

    @Value(value = "${account.url}")
    private String URL_SERVICE;


    public Response listAccounts(String customerId, Map<String, String> headers) throws Exception {
        SrvAccountV01 srv = (SrvAccountV01) getClient(URL_SERVICE, SrvAccountV01.class);

        HeaderUtils.applyHeaders(WebClient.client(srv), headers);
        Response res = srv.listAccounts("50", 50L, customerId);
        evaluateResponse(res);

        return res;
    }

    public FacadeOutAccount getAccount(String accountId, Map<String, String> headers) throws Exception {
        return null;
    }
}

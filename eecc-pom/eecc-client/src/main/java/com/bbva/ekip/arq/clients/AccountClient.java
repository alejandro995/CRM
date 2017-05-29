package com.bbva.ekip.arq.clients;

import com.bbva.ccol.account.facade.v01.dto.DTOOutListAccounts;
import com.bbva.ccol.account.facade.v01.dto.FacadeOutAccount;

import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Created by christian on 9/08/16.
 */
public interface AccountClient {
    //DTOOutListAccounts listAccounts(String customerId, Map<String, String> headers) throws Exception;
    Response listAccounts(String customerId, Map<String, String> headers) throws Exception;

    FacadeOutAccount getAccount(String accountId, Map<String, String> headers) throws Exception;
}

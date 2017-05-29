package com.bbva.ekip.arq.clients.impl;


import com.bbva.ccol.financialinformation.facade.v01.dto.Data;
import com.bbva.ccol.financialinformation.facade.v01.dto.FinancialInformation;
import com.bbva.ccol.financialinformation.facade.v01.impl.SrvFinancialInformationV01;
import com.bbva.ekip.arq.clients.FinancialInformationClient;
import com.bbva.ekip.arq.util.HeaderUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Created by mile on 12/08/2016.
 */

@Service
public class FinancialInformationImpl extends ServiceBase implements FinancialInformationClient {
    @Value(value = "${financialInformation.url}")
    private String URL_SERVICE;

    public Response createFinancialInformation(String documentId, String documentType, FinancialInformation financialinformation, Map<String, String> headers) throws Exception{
        SrvFinancialInformationV01 srv = (SrvFinancialInformationV01) getClient(URL_SERVICE, SrvFinancialInformationV01.class);
        HeaderUtils.applyHeaders(WebClient.client(srv), headers);

        Response res = srv.createFinancialInformation(documentId, documentType, financialinformation);
        evaluateResponse(res);
        if (res.equals("200")){
            return  res;
        }
        return res;
    }

    public Data getFinancialInformation(String documentId, String documentType, String order, String orderBy, Map<String, String> headers) throws Exception{
        SrvFinancialInformationV01 srv = (SrvFinancialInformationV01) getClient(URL_SERVICE, SrvFinancialInformationV01.class);
        HeaderUtils.applyHeaders(WebClient.client(srv), headers);

        Response res = srv.getFinancialInformation(documentId, documentType, order, orderBy);
        evaluateResponse(res);

        return res.readEntity(Data.class);
    }

    public Response modifyFinancialInformation(String documentId, String documentType, FinancialInformation financialinformation, Map<String, String> headers) throws Exception{
        SrvFinancialInformationV01 srv = (SrvFinancialInformationV01) getClient(URL_SERVICE, SrvFinancialInformationV01.class);
        HeaderUtils.applyHeaders(WebClient.client(srv), headers);

        Response res = srv.modifyFinancialInformation(documentId, documentId, documentType, financialinformation);
        evaluateResponse(res);
        if (res.equals("200")){
            return  res;
        }
        return res;
    }
}

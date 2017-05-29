package com.bbva.ekip.arq.clients;

import com.bbva.ccol.financialinformation.facade.v01.dto.Data;
import com.bbva.ccol.financialinformation.facade.v01.dto.FinancialInformation;


import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Created by mile on 12/08/2016.
 */
public interface FinancialInformationClient {
    Response createFinancialInformation(String documentId, String documentType, FinancialInformation financialinformation, Map<String,String> headers) throws Exception;
    Data getFinancialInformation(String documentId, String documentType, String order, String orderBy, Map<String,String> headers) throws Exception;
    Response modifyFinancialInformation(String documentId, String documentType, FinancialInformation financialinformation, Map<String,String> headers) throws Exception;
}

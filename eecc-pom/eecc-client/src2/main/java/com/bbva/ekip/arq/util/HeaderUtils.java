package com.bbva.ekip.arq.util;

import org.apache.cxf.jaxrs.client.Client;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Esta utilidad toma los encabezados minimos requeridos para el consumo de la aquitectura de servicios
 */
public class HeaderUtils {

    public static Map<String, String> getHeaders(HttpServletRequest req) {
        HashMap<String, String> headers = new HashMap<String, String>();

        headers.put(HeaderVars.USER_ID, req.getHeader(HeaderVars.USER_ID));
        headers.put(HeaderVars.TSEC_VALID, req.getHeader(HeaderVars.TSEC_VALID));
        headers.put(HeaderVars.TSEC, req.getHeader(HeaderVars.TSEC));
        headers.put(HeaderVars.IV_TICKETSERVICE, req.getHeader(HeaderVars.IV_TICKETSERVICE));

        return headers;
    }

    public static void applyHeaders(Client wc, Map<String, String> headers) {
        wc.header(HeaderVars.USER_ID, headers.get(HeaderVars.USER_ID));
        wc.header(HeaderVars.IV_TICKETSERVICE, headers.get(HeaderVars.IV_TICKETSERVICE));
    }

}
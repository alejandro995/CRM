/**
 * Grupo CMC Colombia
 * 15/09/2016
 */
package com.bbva.ekip.arq.clients.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bbva.ccol.warranty.facade.v01.dto.Warranty;
import com.bbva.ccol.warranty.facade.v01.impl.SrvWarrantyV01;
import com.bbva.ekip.arq.clients.WarrantyClient;
//import com.bbva.ekip.arq.jpa.front.api.ActualizaTablaLog;
import com.bbva.ekip.arq.util.HeaderUtils;



/**
 * @author VYG0139 - JFBC
 */

@Service
public class WarrantyClientImpl extends ServiceBase implements WarrantyClient {
	
//	@Autowired
//	ActualizaTablaLog ////////atl;

	@Value(value = "${warranty.url}")
	private String URL_SERVICE;


	public Warranty createWarranty(String loanId, int numEjec, Warranty wrr, Map<String, String> headers) throws Exception {

		SrvWarrantyV01 sw = (SrvWarrantyV01) getClient(URL_SERVICE, SrvWarrantyV01.class);
		HeaderUtils.applyHeaders(WebClient.client(sw), headers);
		Response r = sw.createWarranty(loanId, wrr);

		if (r.getStatus() == Status.OK.getStatusCode()) {
			evaluateResponse(r);
			//atl.main(loanId, "Warranty", numEjec, "Completado", "Completado", null, null, "200",null);
			return r.readEntity(Warranty.class);
		} else {
			Object se = r.readEntity(Object.class);
			LinkedHashMap<String, String> errorMap = new LinkedHashMap<String, String>();
			errorMap = (LinkedHashMap<String, String>) se;
			String codigo = String.valueOf(errorMap.get("http-status"));
			String mensaje = errorMap.get("error-message");
			//atl.main(loanId, "Warranty", numEjec, "Fallido", "Fallido", null, null, codigo, mensaje);
			return null;
		}
	}
}

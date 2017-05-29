/**
 * Grupo CMC Colombia
 * 16/09/2016
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

import com.bbva.ccol.securePolicy.facade.v01.impl.SrvSecurePolicyV01;
import com.bbva.ccol.transactions.facade.v01.dto.Data;
import com.bbva.ccol.transactions.facade.v01.dto.Policy;
import com.bbva.ekip.arq.clients.SecurePolicyClient;
//import com.bbva.ekip.arq.jpa.front.api.ActualizaTablaLog;
import com.bbva.ekip.arq.util.HeaderUtils;

/**
 * @author VYG0139 - JFBC
 */
@Service
public class SecurePolicyClientImpl extends ServiceBase implements SecurePolicyClient {
	
//	@Autowired
//	ActualizaTablaLog //atl;
	
//	@Value(value = "${securePolicy.url}")
    private String URL_SERVICE;
	
	public Data createSecurePolicy(String securePolicyId, int numEjec, Policy p, Map<String, String> headers) throws Exception{
		
		SrvSecurePolicyV01 ssp = (SrvSecurePolicyV01)getClient(URL_SERVICE,SrvSecurePolicyV01.class);
		HeaderUtils.applyHeaders(WebClient.client(ssp), headers);
		Response r = ssp.createSecurePolicy(securePolicyId, p);
			
		if(r.getStatus() == Status.OK.getStatusCode()){
			evaluateResponse(r);
			//atl.main(securePolicyId, "SecurePolicy", numEjec, "Completado", "Completado", null, null, "200",null);
			//return r.readEntity(Data.class);
			return new Data();
		}else{
			Object se = r.readEntity(Object.class);
			LinkedHashMap<String, String> errorMap = new LinkedHashMap<String, String>();
			errorMap = (LinkedHashMap<String, String>) se;
			String codigo = String.valueOf(errorMap.get("http-status"));
			String mensaje = errorMap.get("error-message");
			//atl.main(securePolicyId, "SecurePolicy", numEjec, "Fallido", "Fallido", null, null, codigo, mensaje);
			return null;
		}
	}
}

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

import com.bbva.ccol.loans.facade.v01.dto.DataDisbursement;
import com.bbva.ccol.loans.facade.v01.dto.DataLoan;
import com.bbva.ccol.loans.facade.v01.dto.Loan;
import com.bbva.ccol.loans.facade.v01.dto.Participant;
import com.bbva.ccol.loans.facade.v01.dto.RelatedContract;
import com.bbva.ccol.loans.facade.v01.impl.SrvLoansV01;
import com.bbva.ekip.arq.clients.LoanClient;
//import com.bbva.ekip.arq.jpa.front.api.ActualizaTablaLog;
import com.bbva.ekip.arq.util.HeaderUtils;

/**
 * @author VYG0139 - JFBC
 */

@Service
public class LoanClientImpl extends ServiceBase implements LoanClient {
	
//	@Autowired
//	ActualizaTablaLog //atl;

//	@Value(value = "${loan.url}")
	private String URL_SERVICE;

	public Loan modifyDisbursementLoan(String loanId, String disbursementId, DataDisbursement disbursement,
			Map<String, String> headers) throws Exception {

		SrvLoansV01 svl = (SrvLoansV01) getClient(URL_SERVICE, SrvLoansV01.class);
		HeaderUtils.applyHeaders(WebClient.client(svl), headers);
		Response r = svl.modifyDisbursementLoan(loanId, disbursementId, disbursement);

		if (r.getStatus() == Status.OK.getStatusCode()) {
			evaluateResponse(r);
			//atl.main(loanId, "Disbursement", 1, "Completado", "Completado", null, null, "200",null);
			return r.readEntity(Loan.class);
		} else {
			Object se = r.readEntity(Object.class);
			LinkedHashMap<String, String> errorMap = new LinkedHashMap<String, String>();
			errorMap = (LinkedHashMap<String, String>) se;
			String codigo = String.valueOf(errorMap.get("http-status"));
                    String mensaje = errorMap.get("error-message");
			//atl.main(loanId, "Disbursement", 1, "Fallido", "Fallido", null, null, codigo, mensaje);
			return null;
		}

	}

	public RelatedContract addRelatedContracts(String loanId, RelatedContract rc, Map<String, String> headers) throws Exception {

		SrvLoansV01 svl = (SrvLoansV01) getClient(URL_SERVICE, SrvLoansV01.class);
		HeaderUtils.applyHeaders(WebClient.client(svl), headers);
		Response r = svl.addRelatedContracts(loanId, rc);
		int opcion = Integer.parseInt(rc.getRelationType().getId());
		if (r.getStatus() == Status.OK.getStatusCode()) {
			evaluateResponse(r);
			//atl.main(loanId, "RelatedContract", opcion, "Completado", "Completado", null, null, "200",null);
			return r.readEntity(RelatedContract.class);
		} else {
			Object se = r.readEntity(Object.class);
			LinkedHashMap<String, String> errorMap = new LinkedHashMap<String, String>();
			errorMap = (LinkedHashMap<String, String>) se;
			String codigo = String.valueOf(errorMap.get("http-status"));
			String mensaje = errorMap.get("error-message");
			//atl.main(loanId, "RelatedContract", opcion, "Fallido", "Fallido", null, null, codigo, mensaje);
			return null;
		}
	}

	public Participant addRelatedParticipants(String loanId, int numEjec, Participant pa, Map<String, String> headers)
			throws Exception {

		SrvLoansV01 svl = (SrvLoansV01) getClient(URL_SERVICE, SrvLoansV01.class);
		HeaderUtils.applyHeaders(WebClient.client(svl), headers);
		Response r = svl.addRelatedParticipants(loanId, pa);

		if (r.getStatus() == Status.OK.getStatusCode()) {
			evaluateResponse(r);
			//atl.main(loanId, "RelatedParticipants", numEjec, "Completado", "Completado", null, null, "200",null);
			return new Participant();
		} else {
			Object se = r.readEntity(Object.class);
			LinkedHashMap<String, String> errorMap = new LinkedHashMap<String, String>();
			errorMap = (LinkedHashMap<String, String>) se;
			String codigo = String.valueOf(errorMap.get("http-status"));
			String mensaje = errorMap.get("error-message");
			//atl.main(loanId, "RelatedParticipants", numEjec, "Fallido", "Fallido", null, null, codigo, mensaje);
			//return r.readEntity(RelatedContract.class);
			return null;
		}
	}
	
	// Efron
	public DataLoan modifyLoan(String loanId, Loan loan, Map<String, String> headers) throws Exception {
		SrvLoansV01 srv = (SrvLoansV01) getClient(URL_SERVICE, SrvLoansV01.class);
		HeaderUtils.applyHeaders(WebClient.client(srv), headers);
		// Loan loane = new Loan();
		String tip = "1";
		String Num = "123456";
		Response res = srv.modifyLoan(loanId, tip, Num, loan);

		if (res.getStatus() == Status.OK.getStatusCode()) {
			return res.readEntity(DataLoan.class);

		} else {
			Object se = res.readEntity(Object.class);
			LinkedHashMap<String, String> errorMap = new LinkedHashMap<String, String>();
			errorMap = (LinkedHashMap<String, String>) se;
			String exception = res.getStatus() +"&&"+ errorMap.get("error-code") + " - " + errorMap.get("error-message");
			throw new Exception(exception);
		}
		
	}

}

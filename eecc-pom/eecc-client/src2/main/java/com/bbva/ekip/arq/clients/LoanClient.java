/**
 * Grupo CMC Colombia
 * 15/09/2016
 */
package com.bbva.ekip.arq.clients;

import java.util.Map;

import com.bbva.ccol.loans.facade.v01.dto.DataDisbursement;
import com.bbva.ccol.loans.facade.v01.dto.DataLoan;
import com.bbva.ccol.loans.facade.v01.dto.Loan;
import com.bbva.ccol.loans.facade.v01.dto.Participant;
import com.bbva.ccol.loans.facade.v01.dto.RelatedContract;

/**
 * @author VYG0139 - JFBC
 */

public interface LoanClient {
	
	Loan modifyDisbursementLoan(String loanId, String disbursementId, DataDisbursement disbursement, Map<String, String> headers) throws Exception;
	RelatedContract addRelatedContracts(String loanId, RelatedContract rc, Map<String, String> headers) throws Exception;
	Participant addRelatedParticipants(String loanId, int numEjec, Participant pa, Map<String, String> headers) throws Exception;
	//Efron Consulting
	DataLoan modifyLoan(String loanId, Loan loan, Map<String,String> headers) throws Exception;
//	Response modifyLoan(String loanId, Loan loan, String userEKIP,String sessionEKIP) throws Exception;
	
}

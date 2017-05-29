/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.bbva.ccol.loans.facade.v01.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.bbva.ccol.loans.facade.v01.dto.DataChange;
import com.bbva.ccol.loans.facade.v01.dto.DataDisbursement;
import com.bbva.ccol.loans.facade.v01.dto.DataListExpenses;
import com.bbva.ccol.loans.facade.v01.dto.DataListIndicators;
import com.bbva.ccol.loans.facade.v01.dto.DataListInstallments;
import com.bbva.ccol.loans.facade.v01.dto.DataListLiquidations;
import com.bbva.ccol.loans.facade.v01.dto.DataListLoan;
import com.bbva.ccol.loans.facade.v01.dto.DataListTransactions;
import com.bbva.ccol.loans.facade.v01.dto.DataLoan;
import com.bbva.ccol.loans.facade.v01.dto.DataWarranties;
import com.bbva.ccol.loans.facade.v01.dto.Disbursement;
import com.bbva.ccol.loans.facade.v01.dto.Loan;
import com.bbva.ccol.loans.facade.v01.dto.Participant;
import com.bbva.ccol.loans.facade.v01.dto.RelatedContract;
import com.bbva.ccol.loans.facade.v01.dto.Warranty;

@Path("/V01")
public interface SrvLoansV01 {

    @GET
    @Produces("application/json")
    @Path("/loans")
    DataListLoan listLoans();

    @GET
    @Produces("application/json")
    @Path("/loans/{loanId}")
    DataLoan getLoan(@PathParam("loanId") String loanId);

    @PATCH
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{loanId}")
//    DataLoan modifyLoan(@PathParam("loanId") String loanId, Loan loan);
    Response modifyLoan(@PathParam("loanId") String loanId, @QueryParam("tipIdentificacion") String tipIdentificacion, @QueryParam("numIdentificacion") String numIdentificacion, Loan loan);
    @GET
    @Produces("application/json")
    @Path("/{loanId}/changes")
    DataChange getLoanChanges(@PathParam("loanId") String loanId);

    @PATCH
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{loanId}/disbursement/{disbursementId}")
    //DataDisbursement modifyDisbursementLoan(@PathParam("loanId") String loanId, @PathParam("disbursementId") String disbursementId, Loan loan);
    Response modifyDisbursementLoan(@PathParam("loanId") String loanId, @PathParam("disbursementId") String disbursementId, DataDisbursement disbursement);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{loanId}/disbursment/{disbursementId}")
    DataDisbursement addLoansDisbursment(@PathParam("loanId") String loanId, Disbursement disbursement);
    //Response addLoansDisbursment(@PathParam("loanId") String loanId, Disbursement disbursement, @PathParam("disbursementId") String disbursementId);

    @GET
    @Produces("application/json")
    @Path("/{loanId}/expenses")
    DataListExpenses getExpenses(@PathParam("loanId") String loanId);

    @GET
    @Produces("application/json")
    @Path("/{loanId}/indicators")
    DataListIndicators listLoanindicators(@PathParam("loanId") String loanId);

    @GET
    @Produces("application/json")
    @Path("/{loanId}/installments")
    DataListInstallments getLoanInstallments(@PathParam("loanId") String loanId);

    @GET
    @Produces("application/json")
    @Path("/{loanId}/liquidations")
    DataListLiquidations getLoanLiquidations(@PathParam("loanId") String loanId);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{loanId}/relatedContracts")
    Response addRelatedContracts(@PathParam("loanId") String loanId, RelatedContract relatedcontract);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{loanId}/relatedParticipants")
    Response addRelatedParticipants(@PathParam("loanId") String loanId, Participant participant);

    @GET
    @Produces("application/json")
    @Path("/{loanId}/transactions")
    DataListTransactions getTransactions(@PathParam("loanId") String loanId, @QueryParam("fromDate") String fromDate, @QueryParam("toDate") String toDate);

}
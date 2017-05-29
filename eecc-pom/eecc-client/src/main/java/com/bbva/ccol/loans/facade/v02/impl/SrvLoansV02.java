/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.bbva.ccol.loans.facade.v02.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.bbva.ccol.loans.facade.v02.dto.Loan;
    
@Path("/V01")
public interface SrvLoansV02 {


    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/getLoanResume/{idLoan}")
    Response getLoanResume(@PathParam("idLoan") String idLoan);

    
    
    
}
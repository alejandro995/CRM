/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.bbva.ccol.financialinformation.facade.v01.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.bbva.ccol.customers.facade.v02.anotaciones.PATCH;
import com.bbva.ccol.financialinformation.facade.v01.dto.Data;
import com.bbva.ccol.financialinformation.facade.v01.dto.FinancialInformation;

@Path("/V01")
public interface SrvFinancialInformationV01 {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    Response createFinancialInformation(@QueryParam("documentId") String documentId, @QueryParam("documentType") String documentType, FinancialInformation financialinformation);

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{documentId}")
    Response getFinancialInformation(@PathParam("documentId") String documentId, @QueryParam("documentType") String documentType, @QueryParam("order") String order, @QueryParam("orderBy") String orderBy);

    @PATCH
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{documentId}")
    Response modifyFinancialInformation(@PathParam("documentId")String documentId2, @QueryParam("documentId") String documentId, @QueryParam("documentType") String documentType, FinancialInformation financialinformation);

}
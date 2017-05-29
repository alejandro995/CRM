/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.bbva.ccol.account.facade.v01.impl;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/V00")
public interface SrvAccountV01 {

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/accounts/")
    //DTOOutListAccounts listAccounts(@QueryParam("paginationKey") String paginationKey, @QueryParam("pageSize") Long pageSize, @QueryParam("customerId") String customerId);
    Response listAccounts(@QueryParam("paginationKey") String paginationKey, @QueryParam("pageSize") Long pageSize, @QueryParam("identityDocuments.identityDocument.documentNumber") String customerId);

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/accounts/{accountId}")
    //FacadeOutAccount getAccount(@PathParam("accountId") String accountId);
    Response getAccount(@PathParam("accountId") String accountId);

}
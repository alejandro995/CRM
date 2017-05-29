/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.bbva.ccol.securePolicy.facade.v01.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.bbva.ccol.transactions.facade.v01.dto.Data;
import com.bbva.ccol.transactions.facade.v01.dto.DataList;
import com.bbva.ccol.transactions.facade.v01.dto.Policy;

@Path("/V01")
public interface SrvSecurePolicyV01 {

    @GET
    @Produces("application/json")
    @Path("/{securePolicyId}")
    Data getSecurePolicy(@PathParam("securePolicyId") String securePolicyId);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{securePolicyId}")
    //Data createSecurePolicy(@PathParam("securePolicyId") String securePolicyId, SecurePolicy securepolicy);
    Response createSecurePolicy(@PathParam("securePolicyId") String securePolicyId, Policy securepolicy);
    
    @GET
    @Produces("application/json")
    @Path("/{securePolicyId}/transaction")
    DataList listSecurePolicyTransactions(@PathParam("securePolicyId") String securePolicyId);

}
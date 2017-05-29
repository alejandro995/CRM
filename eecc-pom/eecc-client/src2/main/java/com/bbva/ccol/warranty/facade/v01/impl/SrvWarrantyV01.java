package com.bbva.ccol.warranty.facade.v01.impl;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.bbva.ccol.warranty.facade.v01.dto.Warranty;

@Path("/V01")
public interface SrvWarrantyV01 {

	//Warranty
    @POST
    @Consumes("application/json")
    @Produces("application/json;charset=UTF-8")
    public Response createWarranty(@QueryParam("loanId") @DefaultValue("null") String loanId, Warranty warranty);

    @GET
    @Consumes("application/json")
    @Produces("application/json;charset=UTF-8")
    @Path("/{loanId}/warranty/{warrantyTypeId}")
    public Response getWarranty(@PathParam("loanId") String loanId, @PathParam("warrantyTypeId") String warrantyTypeId);

    @PUT
    @Consumes("application/json")
    @Produces("application/json;charset=UTF-8")
    @Path("/{idWarranty}")
    public Response updateWarranty(@PathParam("idWarranty") String idWarranty);
}

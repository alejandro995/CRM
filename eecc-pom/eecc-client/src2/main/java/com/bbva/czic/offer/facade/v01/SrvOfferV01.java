/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.bbva.czic.offer.facade.v01;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.bbva.czic.dto.non_canonical_model.Offer;

@Path("/V01")
public interface SrvOfferV01 {

	@GET
	@Consumes("application/json")
	@Produces("application/json")
	Response listOffers(@QueryParam("paginationKey") @DefaultValue("null") String paginationKey,
			@QueryParam("pageSize") @DefaultValue("null") String pageSize,
			@QueryParam("$filter") @DefaultValue("null") String $filter,
			@QueryParam("idCliente") @DefaultValue("null") String idCliente,
			@QueryParam("tipoDocumento") @DefaultValue("null") String tipoDocumento,
			@QueryParam("product") @DefaultValue("null") String product);

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	Response modifyOffer(@QueryParam("$filter") @DefaultValue("null") String $filter,
			@QueryParam("idCliente") @DefaultValue("null") String idCliente,
			@QueryParam("tipoDocumento") @DefaultValue("null") String tipoDocumento, Offer offer);

}
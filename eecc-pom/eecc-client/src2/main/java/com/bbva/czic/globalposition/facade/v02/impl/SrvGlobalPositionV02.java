/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.bbva.czic.globalposition.facade.v02.impl;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/V02")
public interface SrvGlobalPositionV02 {

    @GET
    @Consumes("application/json")
    @Produces("application/json;charset=UTF-8")
    Response getGlobalPosition(@QueryParam("$filter") String $filter, @QueryParam("$expands") String $expands);
}
/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.bbva.ccol.scoring.facade.v01.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.bbva.ccol.scoring.facade.v01.dto.DataScoringAdd;
import com.bbva.ccol.scoring.facade.v01.dto.DataScoringGet;
import com.bbva.ccol.scoring.facade.v01.dto.InScoringAdd;

@Path("/V01")
public interface SrvScoringV01 {

    @GET
    @Produces("application/json")
    @Consumes("application/json")
//    DataScoringGet getScoring(@QueryParam("numoper") String numoper, @QueryParam("numiden") String numiden);
    Response getScoring(@QueryParam("numoper") String numoper, @QueryParam("numiden") String numiden);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
//    DataScoringAdd addScoring(InScoringAdd inscoringadd);
    Response addScoring(InScoringAdd inscoringadd);

}
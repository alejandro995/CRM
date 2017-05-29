package com.bbva.czic.libertyBBVA.facade.v01.impl;




import com.bbva.czic.libertyBBVA.facade.v01.dto.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by jonnathan.quijano on 07/12/2016.
 */
@Path("/V01")
public interface SrvLibertyBBVA {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/accountchange")
    Response notificationAccountChange(NotificationAccountChange notificationaccountchange);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/AdjuntarDocumentacion")
    Response addDocumentation(RecepcionFicherosRq recepcionficherosrq);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/contractAuto")
    Response contractAuto(ContractAutomovil contractautomovil);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/inspectionAuto")
    Response notificationInspectionAuto(NotificationInspectionsAutos notificationinspectionsautos);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/simulationAutomovil")
    Response simulate(SimulationAutomovil simulationautomovil);
}

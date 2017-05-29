package com.bbva.ekip.arq.clients.impl;


import com.bbva.czic.libertyBBVA.facade.v01.dto.*;
import com.bbva.czic.libertyBBVA.facade.v01.impl.SrvLibertyBBVA;
import com.bbva.ekip.arq.clients.LibertyBBVAClient;
import com.bbva.ekip.arq.util.HeaderUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Created by jonnathan.quijano on 07/12/2016.
 */
@Service
public class LibertyBBVAClienImpl extends ServiceBase implements LibertyBBVAClient {
    @Value(value = "${liberty.url}")
    private String URL_SERVICE;
    public SimulationAutomovilResponse simulationAutomovilResponse(SimulationAutomovil simulationAutomovil, Map<String, String> headers) throws Exception {
        SrvLibertyBBVA srv = (SrvLibertyBBVA)getClient(URL_SERVICE,SrvLibertyBBVA.class);
        HeaderUtils.applyHeaders(WebClient.client(srv),headers);
        Response res = srv.simulate(simulationAutomovil);
        evaluateResponse(res);
        return res.readEntity(SimulationAutomovilResponse.class);
    }

    public NotificationInspectionsAutosResponse notificationInspectionsAutosResponse(NotificationInspectionsAutos notificationInspectionsAutos, Map<String, String> headers) throws Exception {
        SrvLibertyBBVA srv = (SrvLibertyBBVA)getClient(URL_SERVICE,SrvLibertyBBVA.class);
        HeaderUtils.applyHeaders(WebClient.client(srv),headers);
        Response res = srv.notificationInspectionAuto(notificationInspectionsAutos);
        evaluateResponse(res);
        return res.readEntity(NotificationInspectionsAutosResponse.class);
    }

    public NotificationAccountChangeResponse notificationAccountChangeResponse(NotificationAccountChange notificationAccountChange, Map<String, String> headers) throws Exception {

        SrvLibertyBBVA srv = (SrvLibertyBBVA)getClient(URL_SERVICE,SrvLibertyBBVA.class);
        HeaderUtils.applyHeaders(WebClient.client(srv),headers);
        Response res = srv.notificationAccountChange(notificationAccountChange);
        evaluateResponse(res);
        return res.readEntity(NotificationAccountChangeResponse.class);
    }

    public RecepcionFicherosRs recepcionFicherosRs(RecepcionFicherosRq recepcionFicherosRq, Map<String, String> headers) throws Exception {
        SrvLibertyBBVA srv = (SrvLibertyBBVA)getClient(URL_SERVICE,SrvLibertyBBVA.class);
        HeaderUtils.applyHeaders(WebClient.client(srv),headers);
        Response res = srv.addDocumentation(recepcionFicherosRq);
        evaluateResponse(res);
        return res.readEntity(RecepcionFicherosRs.class);
    }

    public ContractAutomovilResponse contractAutomovilResponse(ContractAutomovil contractAutomovil, Map<String, String> headers) throws Exception {

        SrvLibertyBBVA srv = (SrvLibertyBBVA)getClient(URL_SERVICE,SrvLibertyBBVA.class);
        HeaderUtils.applyHeaders(WebClient.client(srv),headers);
        Response res = srv.contractAuto(contractAutomovil);
        evaluateResponse(res);
        return res.readEntity(ContractAutomovilResponse.class);
    }
}

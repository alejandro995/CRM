package com.bbva.ekip.arq.clients;

import com.bbva.czic.libertyBBVA.facade.v01.dto.*;

import java.util.Map;

/**
 * Created by jonnathan.quijano on 07/12/2016.
 */
public interface LibertyBBVAClient {
    public SimulationAutomovilResponse simulationAutomovilResponse (SimulationAutomovil simulationAutomovil, Map<String,String> headers)  throws Exception;

    public NotificationInspectionsAutosResponse notificationInspectionsAutosResponse (NotificationInspectionsAutos notificationInspectionsAutos, Map<String,String> headers)  throws Exception;

    public NotificationAccountChangeResponse notificationAccountChangeResponse (NotificationAccountChange notificationAccountChange, Map<String,String> headers) throws Exception;

    public RecepcionFicherosRs recepcionFicherosRs(RecepcionFicherosRq recepcionFicherosRq,Map<String,String> headers) throws Exception;

    public ContractAutomovilResponse contractAutomovilResponse (ContractAutomovil contractAutomovil, Map<String,String> headers) throws Exception;
}

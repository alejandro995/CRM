/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.bbva.saz.co.grantingticket.facade.v02;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.bbva.saz.co.grantingticket.v02.CreateTicketRequest;
import com.bbva.saz.co.grantingticket.v02.CreateTicketResponse;

@Path("/V02")
public interface SrvCoGrantingTicketV02 {

    @DELETE
    void deleteTicket();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    //CreateTicketResponse createTicket(CreateTicketRequest createticketrequest);
    Response createTicket(CreateTicketRequest createticketrequest);

    @DELETE
    @Path("/deleteTsec")
    void deleteTsec();

}
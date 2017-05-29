package com.bbva.ekip.arq.clients;

import com.bbva.saz.co.grantingticket.v02.CreateTicketRequest;

/**
 * Created by jquijano82 on 8/06/16.
 */
public interface GrantingTicket {
    String createTicket(CreateTicketRequest req) throws Exception;
}

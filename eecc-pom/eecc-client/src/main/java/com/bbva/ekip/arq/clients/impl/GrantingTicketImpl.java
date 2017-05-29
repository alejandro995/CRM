package com.bbva.ekip.arq.clients.impl;

import com.bbva.ekip.arq.clients.GrantingTicket;
import com.bbva.saz.co.grantingticket.facade.v02.SrvCoGrantingTicketV02;
import com.bbva.saz.co.grantingticket.v02.CreateTicketRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by jquijano82 on 8/06/16.
 */
@Service
public class GrantingTicketImpl extends ServiceBase implements GrantingTicket {

    @Value(value = "${grantingTicket.url}")
    private String GT_URL;

    public String createTicket(CreateTicketRequest req) throws Exception {
        SrvCoGrantingTicketV02 srv = (SrvCoGrantingTicketV02)getClient(GT_URL,SrvCoGrantingTicketV02.class);
        Response res = srv.createTicket(req);
        evaluateResponse(res);


        MultivaluedMap<String, Object> headers = res.getHeaders();
        String tsec = ((List)headers.get("tsec")).get(0).toString();

        return tsec;
    }
}

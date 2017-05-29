package com.bbva.ekip.arq.clients.impl;


import com.bbva.czic.globalposition.facade.v02.dto.GlobalPosition;
import com.bbva.czic.globalposition.facade.v02.impl.SrvGlobalPositionV02;
import com.bbva.ekip.arq.clients.GlobalPositionClient;
import com.bbva.ekip.arq.util.HeaderUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Created by jonnathan.quijano on 12/10/2016.
 */
@Service
public class GlobalPositionClientImpl extends ServiceBase implements GlobalPositionClient {
//    @Value(value = "${globalPosition.url}")
    private String URL_SERVICE;

    public GlobalPosition getGlobalPostion(String $filter, String $expands, Map<String,String> headers) throws Exception {

        SrvGlobalPositionV02 srv = (SrvGlobalPositionV02)getClient(URL_SERVICE,SrvGlobalPositionV02.class);
        HeaderUtils.applyHeaders(WebClient.client(srv),headers);

        Response res = srv.getGlobalPosition($filter, $expands);
        evaluateResponse(res);
        return res.readEntity(GlobalPosition.class);
    }
}

package com.bbva.ekip.arq.clients;

import com.bbva.czic.globalposition.facade.v02.dto.GlobalPosition;

import java.util.Map;

/**
 * Created by jonnathan.quijano on 12/10/2016.
 */
public interface GlobalPositionClient {
    GlobalPosition getGlobalPostion (String $filter, String $expands,Map<String,String> headers) throws Exception ;
}

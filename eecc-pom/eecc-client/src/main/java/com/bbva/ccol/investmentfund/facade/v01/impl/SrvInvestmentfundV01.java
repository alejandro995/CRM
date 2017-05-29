package com.bbva.ccol.investmentfund.facade.v01.impl;

import com.bbva.ccol.customers.facade.v02.anotaciones.PATCH;
import com.bbva.ccol.investmentfund.facade.v01.dto.Condition;
import com.bbva.ccol.investmentfund.facade.v01.dto.InvestmentFund;
import com.bbva.ccol.investmentfund.facade.v01.dto.RelatedContract;
import java.util.List;
import java.util.Map;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro.daza
 */
@Path("/V01")
public interface SrvInvestmentfundV01 {
    
    
		
                @POST
                @Consumes("aplication/json")
                @Produces("aplication/json")
		Response createInvestementfund (InvestmentFund investmentfund);
                
                @GET
                @Consumes("aplication/json")
                @Produces("aplication/json")
                @Path("/{investmentfundId}/funds")
                Response getInvestementfund (@PathParam("investmentfundId") String investmentfundID);
    
                @PATCH
                @Consumes("aplication/json")
                @Produces("aplication/json")
                @Path("/{investmentfundId}")
                Response modifyInvestmentfund (@PathParam("investmentfundId") String investmentfundID);
}

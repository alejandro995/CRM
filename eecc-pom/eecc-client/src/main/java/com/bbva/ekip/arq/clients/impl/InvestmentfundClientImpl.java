/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.ekip.arq.clients.impl;

import com.bbva.ccol.employee.facade.v02.dto.Employees;
import com.bbva.ccol.employee.facade.v02.impl.SrvEmployeeV02;
import com.bbva.ccol.investmentfund.facade.v01.dto.InvestmentFund;
import com.bbva.ccol.investmentfund.facade.v01.impl.SrvInvestmentfundV01;
import com.bbva.ekip.arq.clients.InvestmentfundClient;
import com.bbva.ekip.arq.util.HeaderUtils;
import java.util.Map;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.WebClient;
import org.aspectj.weaver.patterns.IVerificationRequired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandro.daza
 */
@Service
public class InvestmentfundClientImpl extends ServiceBase implements InvestmentfundClient{

    @Value(value ="${investment.url}")
    private String URL_SERVICE;
    
    @Override
    public InvestmentFund createInvestmentfund(InvestmentFund investmentfound, Map<String, String> headers) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response modifyInvestmentfund(String investmentfundId, InvestmentFund investmentfund, Map<String, String> headers) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InvestmentFund getInvestmentfund(String investmentfundId, Map<String, String> headers) throws Exception {
        try{
           System.out.println(URL_SERVICE);
        SrvInvestmentfundV01 srv = (SrvInvestmentfundV01)getClient(URL_SERVICE, SrvInvestmentfundV01.class);
            HeaderUtils.applyHeaders(WebClient.client(srv), headers);
            
            Response res= srv.getInvestementfund(investmentfundId);
            System.out.println("Tuvo respuesta del servicio");
            evaluateResponse(res);
            
            
            return res.readEntity(InvestmentFund.class);
        }catch(Exception e){
           System.out.println("Si llego hasta aca"+ URL_SERVICE);
        }
        
        return null;
    }
    
}

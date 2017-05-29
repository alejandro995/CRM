/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.ekip.arq;


import com.bbva.ccol.investmentfund.facade.v01.dto.InvestmentFund;
import com.bbva.ekip.arq.clients.InvestmentfundClient;
import com.bbva.ekip.arq.clients.impl.InvestmentfundClientImpl;
import java.util.HashMap;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.bbva.ekip.arq.util.HeaderVars;
import org.junit.Test;
/**
 *
 * @author alejandro.daza
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
            "classpath:/META-INF/spring/testContext.xml",
            "classpath:/META-INF/spring/appContext.xml"

        }
)



public class InvestmentfundTest {
    
    @Autowired
    private InvestmentfundClient investmentfound;
    
    @Test
    public void prueba () throws Exception {
        HashMap<String, String> headers = new HashMap<String, String>();
        
        
        InvestmentFund data = new InvestmentFund();
                
        headers.put(HeaderVars.EKIP_USER, "CC99999");
        headers.put(HeaderVars.IV_TICKETSERVICE, "SWhLXx9IytLJSyk+18pnwNj8+jdvk+hr0JzAc2ygjD8=");
        
         data = investmentfound.getInvestmentfund("1", headers);
        
        System.out.println(data.getClientName());
    }
    
    
}

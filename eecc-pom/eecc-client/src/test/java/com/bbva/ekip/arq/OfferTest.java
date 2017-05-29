/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.ekip.arq;

import com.bbva.ccol.account.facade.v01.dto.Account;
import com.bbva.ccol.account.facade.v01.dto.DTOOutListAccounts;
import com.bbva.ccol.financialinformation.facade.v01.dto.Balance;
import com.bbva.czic.dto.non_canonical_model.Offer;
import com.bbva.czic.globalposition.facade.v02.dto.GlobalPosition;
import com.bbva.ekip.arq.clients.AccountClient;
import com.bbva.ekip.arq.clients.FinancialInformationClient;
import com.bbva.ekip.arq.clients.OfferClient;
import com.bbva.ekip.arq.util.HeaderVars;
import com.bbva.net.consulta.cifin.service.OpConsultaCifinClienteImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import javax.ws.rs.core.Response;

/**
 * Created by jquijano82 on 8/06/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
            "classpath:/META-INF/spring/testContext.xml",
            "classpath:/META-INF/spring/appContext.xml"

        }
)

/**
 *
 * @author Administrator
 */
public class OfferTest {
    
    @Autowired
    private OfferClient oferta;
    
   // private GlobalPosition globalposition;
    
    @Test
    public void prueba ()throws Exception {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put(HeaderVars.EKIP_USER, "CC99999");
        headers.put(HeaderVars.IV_TICKETSERVICE, "SWhLXx9IytLJSyk+18pnwNj8+jdvk+hr0JzAc2ygjD8=");
        List<Offer> list= oferta.listOffer("status==1", "5", "1", "000000024755817", "1", "1", headers);
        
        for(Offer offer: list){
            System.out.print(offer.getName());
            System.out.print(offer.getProduct().toString());
            System.out.print(offer.getStartDate().toString());
            
        }
        
        
    }
    
}

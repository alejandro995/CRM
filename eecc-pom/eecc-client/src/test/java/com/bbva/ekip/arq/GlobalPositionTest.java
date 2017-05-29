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
import com.bbva.czic.globalposition.facade.v02.dto.CreditPosition;
import com.bbva.czic.globalposition.facade.v02.dto.GlobalPosition;
import com.bbva.czic.globalposition.facade.v02.dto.Transaction;
import com.bbva.ekip.arq.clients.AccountClient;
import com.bbva.ekip.arq.clients.FinancialInformationClient;
import com.bbva.ekip.arq.clients.GlobalPositionClient;
import com.bbva.ekip.arq.clients.LoanClient;
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
 *
 * @author Administrator
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
            "classpath:/META-INF/spring/testContext.xml",
            "classpath:/META-INF/spring/appContext.xml"

        }
)

public class GlobalPositionTest {       
    
    @Autowired
    private GlobalPositionClient posicionGlobal;
    
    @Test
    public void GlobalTest ()throws Exception{
        HashMap<String, String> headers = new HashMap<String, String>();
//        headers.put(HeaderVars.EKIP_USER, "CC99999");
        headers.put(HeaderVars.EKIP_USER, "CC99999");
        headers.put(HeaderVars.IV_TICKETSERVICE, "SWhLXx9IytLJSyk+18pnwNj8+jdvk+hr0JzAc2ygjD8=");
        
        
        //Error
        GlobalPosition posicionGlobalAUX = posicionGlobal.getGlobalPostion("identityDocument=gt=000000006572898;type=ge=1", "2", headers);
       
        System.out.println("asdsadasdasdasdasdasdasdasd");
        
        /*
        System.err.println(posicionGlobalAUX.getOwner().toString());
        System.err.println(posicionGlobalAUX.getSpouse().toString());
        System.err.println(posicionGlobalAUX.getOwnerDebts().toString());
        System.err.println(posicionGlobalAUX.getSpouseDebts().toString());
        System.err.println(posicionGlobalAUX.getNonPayments().toString());
        System.err.println(posicionGlobalAUX.getCreditPosition().toString());
        System.err.println(posicionGlobalAUX.getAnnuledUnauthorisedOperations().toString());
        System.err.println(posicionGlobalAUX.getOngoingOperations().toString());
        System.out.println(posicionGlobalAUX.getCancelledOperations().toString());
        System.out.println(posicionGlobalAUX.getGuarantees().toString());
        System.out.println(posicionGlobalAUX.getValuedRelationships().toString());
        System.out.println(posicionGlobalAUX.getPayRoll().toString());
//        System.out.println(posicionGlobalAUX.get.toString());
        
       */
        
        
        
       
        
        System.out.print(posicionGlobalAUX.getSpouse().getIdentityDocument());
        System.out.print(posicionGlobalAUX.getOwner().getIdentityDocument());
        
        
        
        for(CreditPosition cposition:posicionGlobalAUX.getCreditPosition()){
            System.out.print(" " +cposition.getCurrentBalance().getAmount());
            System.out.print(" " +cposition.getAccountType().getName() + " "+ cposition.getAccountType().getName());
            System.out.print(" " +cposition.getAccountType().getName() + " "+ cposition.getAccountType().getName());
            
        }
        posicionGlobalAUX.getOwner().toString();
        
         
    }
    
}

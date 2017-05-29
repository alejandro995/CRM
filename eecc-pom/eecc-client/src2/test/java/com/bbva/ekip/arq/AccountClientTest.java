package com.bbva.ekip.arq;

import com.bbva.ekip.arq.clients.AccountClient;
import com.bbva.ekip.arq.clients.FinancialInformationClient;
import com.bbva.ekip.arq.util.HeaderVars;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jquijano82 on 8/06/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
            "classpath:/META-INF/spring/testContext.xml",
            "classpath*:/META-INF/spring/appContext.xml"

        }
)
public class AccountClientTest {

    @Autowired
    private AccountClient cliente;
    @Autowired
    private FinancialInformationClient financialInformationClient;

    @Test
    public void prueba() throws Exception {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put(HeaderVars.USER_ID, "CC99999");
        headers.put(HeaderVars.IV_TICKETSERVICE, "SWhLXx9IytLJSyk+18pnwNj8+jdvk+hr0JzAc2ygjD8=");
//        financialInformationClient.getFinancialInformation("1000000024755817", "1", "1", "1", headers);
        cliente.getAccount("1000000024755817",  headers);

        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(String.format("LLave: %s Valor: %s", key,value));
        }
    }
}

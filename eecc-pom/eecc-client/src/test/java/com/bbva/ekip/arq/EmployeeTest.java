/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.ekip.arq;

import com.bbva.ccol.employee.facade.v02.dto.DataEmployeesList;
import com.bbva.ccol.employee.facade.v02.dto.Employees;
import com.bbva.ekip.arq.clients.EmployeesClient;
import com.bbva.ekip.arq.util.HeaderVars;
import java.util.HashMap;
import javax.ws.rs.core.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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




public class EmployeeTest {
    @Autowired
private EmployeesClient employee;

@Test
public void prueba() throws Exception{
     HashMap<String,String> headers = new HashMap<String, String>();
     
     headers.put(HeaderVars.EKIP_USER, "CC99999");
     headers.put(HeaderVars.IV_TICKETSERVICE, "SWhLXx9IytLJSyk+18pnwNj8+jdvk+hr0JzAc2ygjD8=");
     
     Employees data = employee.getEmployee("1", headers);
     System.out.println("Employee" + data.getFirstName());
    
}

}

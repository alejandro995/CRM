/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.ekip.arq.clients.impl;

import com.bbva.ccol.customers.facade.v02.dto.DataCustomer;
import com.bbva.ccol.customers.facade.v02.dto.EmploymentInformation;
import com.bbva.ccol.employee.facade.v02.dto.DataEmployeesList;
import com.bbva.ccol.employee.facade.v02.dto.Employees;
import com.bbva.ccol.employee.facade.v02.impl.SrvEmployeeV02;
import com.bbva.ekip.arq.clients.EmployeesClient;
import com.bbva.ekip.arq.util.HeaderUtils;
import java.util.Map;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class EmployeesClientImpl extends ServiceBase implements EmployeesClient {
    
    @Value(value ="${employees.url}")
    private String URL_SERVICE;
        
    
  
    public DataEmployeesList createEmployees(Employees employeess, Map<String, String> headers) throws Exception {
            SrvEmployeeV02 srv = (SrvEmployeeV02)getClient(URL_SERVICE, SrvEmployeeV02.class);
            HeaderUtils.applyHeaders(WebClient.client(srv), headers);
            
            Response res= srv.createEmployees(employeess);
            evaluateResponse(res);
            return res.readEntity(DataEmployeesList.class);
            
    }

    
    public Response modifyEmployee(String employeeId, Employees employees, Map<String, String> headers) throws Exception {
            SrvEmployeeV02 srv = (SrvEmployeeV02)getClient(URL_SERVICE, SrvEmployeeV02.class);
            HeaderUtils.applyHeaders(WebClient.client(srv), headers);
            
            Response res= srv.modifyEmployee(employeeId, employees);
            evaluateResponse(res);
            if(res.equals("204")){
                return res;
            }
            
            return res;
    }
    public Employees getEmployee(String employeeId, Map<String, String> headers) throws Exception {
        System.out.println(URL_SERVICE);
        SrvEmployeeV02 srv = (SrvEmployeeV02)getClient(URL_SERVICE, SrvEmployeeV02.class);
            HeaderUtils.applyHeaders(WebClient.client(srv), headers);
            
            Response res= srv.getEmployee(employeeId);
            evaluateResponse(res);
            
            return res.readEntity(Employees.class);
    }
    
    
    
}


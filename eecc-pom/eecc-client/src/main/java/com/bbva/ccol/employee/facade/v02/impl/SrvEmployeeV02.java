/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.ccol.employee.facade.v02.impl;

import com.bbva.ccol.customers.facade.v02.anotaciones.PATCH;
import com.bbva.ccol.employee.facade.v02.dto.DataEmployeesList;
import com.bbva.ccol.employee.facade.v02.dto.Employees;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author Administrator
 */
@Path("/V02/employees")
public interface SrvEmployeeV02 {
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    //String createCustomers(Customers customers);
    Response createEmployees(Employees employees);

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{employeeId}")
    //DataEmployeesList getCustomer(@PathParam("customerId") String customerId);
    Response getEmployee(@PathParam("employeeId") String employeeId);

    @PATCH
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{employeeId}")
   // Response modifyCustomer(@PathParam("customerId") String customerId, Customers customers);
    Response modifyEmployee(@PathParam("employeeId") String employeeId, Employees employees);

}
    


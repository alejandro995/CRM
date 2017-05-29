/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.bbva.ccol.customers.facade.v02.impl;

import com.bbva.ccol.customers.facade.v02.anotaciones.PATCH;
import com.bbva.ccol.customers.facade.v02.dto.Customers;
import com.bbva.ccol.customers.facade.v02.dto.DataCustomer;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/V02")
public interface SrvCustomersV02 {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    //String createCustomers(Customers customers);
    Response createCustomers(Customers customers);

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{customerId}")
    //DataCustomer getCustomer(@PathParam("customerId") String customerId);
    Response getCustomer(@PathParam("customerId") String customerId);

    @PATCH
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{customerId}")
   // Response modifyCustomer(@PathParam("customerId") String customerId, Customers customers);
    Response modifyCustomer(@PathParam("customerId") String customerId, Customers customers);

}
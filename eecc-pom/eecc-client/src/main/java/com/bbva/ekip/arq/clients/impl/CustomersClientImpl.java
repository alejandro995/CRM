package com.bbva.ekip.arq.clients.impl;

import com.bbva.ccol.customers.facade.v02.dto.Customers;
import com.bbva.ccol.customers.facade.v02.dto.DataCustomer;
import com.bbva.ccol.customers.facade.v02.impl.SrvCustomersV02;
import com.bbva.ekip.arq.clients.CustomersClient;
import com.bbva.ekip.arq.util.HeaderUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.Map;

//import static org.junit.Assert.*;

/**
 * Created by mile on 12/08/2016.
 */

@Service
public class CustomersClientImpl extends ServiceBase implements CustomersClient {

    @Value(value = "${customers.url}")
    private String URL_SERVICE;

     public DataCustomer createCustomers(Customers customers, Map<String,String> headers) throws Exception {
        SrvCustomersV02 srv = (SrvCustomersV02)getClient(URL_SERVICE,SrvCustomersV02.class);
        HeaderUtils.applyHeaders(WebClient.client(srv),headers);

        Response res = srv.createCustomers(customers);
        evaluateResponse(res);
        return  res.readEntity(DataCustomer.class);

    }

    public Response modifyCustomer(String customerId, Customers customers, Map<String,String> headers) throws Exception {
        SrvCustomersV02 srv = (SrvCustomersV02)getClient(URL_SERVICE,SrvCustomersV02.class);
        HeaderUtils.applyHeaders(WebClient.client(srv),headers);

        Response res = srv.modifyCustomer(customerId,customers);
        evaluateResponse(res);
        if (res.equals("204")){
            return  res;
        }
       //return res.readEntity(DataCustomer.class);

        return res;
    }

    public DataCustomer getCustomer(String customerId, Map<String,String> headers) throws Exception {
        SrvCustomersV02 srv = (SrvCustomersV02) getClient(URL_SERVICE, SrvCustomersV02.class);
        HeaderUtils.applyHeaders(WebClient.client(srv),headers);

        Response res = srv.getCustomer(customerId);
        evaluateResponse(res);

        return res.readEntity(DataCustomer.class);
    }

}

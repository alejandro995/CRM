package com.bbva.ekip.arq.clients;

import com.bbva.ccol.customers.facade.v02.dto.Customers;
import com.bbva.ccol.customers.facade.v02.dto.DataCustomer;

import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Created by mile on 12/08/2016.
 */
public interface CustomersClient {
    DataCustomer createCustomers(Customers customers, Map<String,String> headers)throws Exception;
    Response modifyCustomer(String customerId, Customers customers, Map<String,String> headers)throws Exception;
    DataCustomer getCustomer(String customerId, Map<String,String> headers)throws Exception;

}

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.ekip.arq.clients;

import com.bbva.ccol.customers.facade.v02.dto.Customers;
import com.bbva.ccol.customers.facade.v02.dto.DataCustomer;
import com.bbva.ccol.employee.facade.v02.dto.DataEmployeesList;
import com.bbva.ccol.employee.facade.v02.dto.Employees;
import java.util.Map;
import javax.ws.rs.core.Response;

/**
 *
 * @author Administrator
 */
public interface EmployeesClient {

    DataEmployeesList createEmployees(Employees employeess, Map<String, String> headers) throws Exception;

    Response modifyEmployee(String employeeId, Employees employees, Map<String, String> headers) throws Exception;

    Employees getEmployee(String employeeId, Map<String, String> headers) throws Exception;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.service;

import com.bbva.ccol.employee.facade.v02.dto.DataEmployeesList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bbva.ccol.employee.facade.v02.dto.Employees;
import com.bbva.ekip.arq.clients.EmployeesClient;
import java.util.HashMap;

/**
 *
 * @author Administrator
 */
@Service
public class EmployeeData extends BaseService implements EmployeeService, Serializable {

    @Autowired
    private EmployeesClient cliente;

    final static Logger logger = LoggerFactory.getLogger(Employees.class);

    @Override
    public Employees buscarEmployee(String idEmployee, HashMap<String, String> headers) {
        try {
            Employees employees = new Employees();
            employees.setEmployeeId("1111111");
            employees.setFirstName("employee");
            employees.setLastName("employeeLast");
            employees.setRegistrationIdentifier("employeeRegisrationId");
//            return cliente.getEmployee(idEmployee, headers);
            System.out.println(""+ employees.getEmployeeId());
            
            return employees;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

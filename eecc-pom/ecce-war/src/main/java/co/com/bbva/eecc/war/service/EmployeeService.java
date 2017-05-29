/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.service;

import com.bbva.ccol.employee.facade.v02.dto.Employees;
import java.util.HashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public interface EmployeeService {

    public Employees buscarEmployee(String idEmployee, HashMap<String, String> headers);

}

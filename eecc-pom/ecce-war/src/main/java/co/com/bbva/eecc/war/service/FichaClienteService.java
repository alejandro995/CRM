/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.service;

import co.com.bbva.eecc.war.dto.DTOCliente;
import java.util.List;
import org.springframework.webflow.execution.RequestContext;

/**
 *
 * @author luis.berna
 */
public interface FichaClienteService  {

    public String buscarCliente(SearchCriteria criteria, RequestContext context);
    public List<DTOCliente> buscarClientes();
}

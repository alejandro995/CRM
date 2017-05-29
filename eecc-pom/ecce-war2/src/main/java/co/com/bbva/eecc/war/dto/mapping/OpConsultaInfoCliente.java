/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.dto.mapping;

import co.com.bbva.eecc.war.dto.DTOCliente;
import java.util.Map;

/**
 * Created by Luis Berna on 23/03/2017.
 */
public interface OpConsultaInfoCliente {

    public DTOCliente consultarInfoCliente(String numeroIdentificacion, Map<String, String> headers) throws Exception;

}

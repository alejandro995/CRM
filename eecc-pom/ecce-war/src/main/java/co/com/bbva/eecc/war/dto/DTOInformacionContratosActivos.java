/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.dto;

import java.io.Serializable;

/**
 * DTOInformacionContratosActivos.java - Permite ver los saldos en linea de los
 * contratos activos del cliente
 *
 * @author Luis Berna
 * @version 1.0
 * @date 20/01/2017
 * @see
 */
public class DTOInformacionContratosActivos implements Serializable {

    /**
     * @emisorNomina - Numero y nombre del emisor de la nomina.
     */
    private String emisorNomina;
    /**
     * @contactoIc - Más números de telefono de contacto.
     */
    private String contactoIc;

    /**
     * @return the emisorNomina
     */
    public String getEmisorNomina() {
        return emisorNomina;
    }

    /**
     * @param emisorNomina the emisorNomina to set
     */
    public void setEmisorNomina(String emisorNomina) {
        this.emisorNomina = emisorNomina;
    }

    /**
     * @return the contactoIc
     */
    public String getContactoIc() {
        return contactoIc;
    }

    /**
     * @param contactoIc the contactoIc to set
     */
    public void setContactoIc(String contactoIc) {
        this.contactoIc = contactoIc;
    }

}

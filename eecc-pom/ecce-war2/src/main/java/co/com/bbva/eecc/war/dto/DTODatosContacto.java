/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.dto;

import java.io.Serializable;

/**
 * DTODatosContacto.java - Información de contato del cliente
 *
 * @author Luis Berna
 * @version 1.0
 * @date 23/01/2017
 * @see
 */
public class DTODatosContacto implements Serializable {

    /**
     * @numeroTelefono1 - Telefono 1 para contacto con el cliente
     */
    private String numeroTelefono1;
    /**
     * @numeroTelefono2 - Telefono 2 para contacto con el cliente
     */
    private String numeroTelefono2; 
    /**
     * @numeroCelular - Número de celular de contacto del cliente
     */
    private String numeroCelular;
    /**
     * @direccionPrincipal - Dirección principal del cliente
     */
    private String direccionPrincipal;
    /**
     * @correoElectronico - Correo electronico del cliente
     */
    private String correoElectronico;
    /**
     * @referencia - Nombre de quien ha referenciado al cliente
     */
    private String referencia;
    /**
     * @casaCobranza - Nombre de la casa de cobranza asignada a ese cliente
     */
    private String casaCobranza;

    /**
     * @return the numeroTelefono1
     */
    public String getNumeroTelefono1() {
        return numeroTelefono1;
    }

    /**
     * @param numeroTelefono1 the numeroTelefono1 to set
     */
    public void setNumeroTelefono1(String numeroTelefono1) {
        this.numeroTelefono1 = numeroTelefono1;
    }

    /**
     * @return the numeroTelefono2
     */
    public String getNumeroTelefono2() {
        return numeroTelefono2;
    }

    /**
     * @param numeroTelefono2 the numeroTelefono2 to set
     */
    public void setNumeroTelefono2(String numeroTelefono2) {
        this.numeroTelefono2 = numeroTelefono2;
    }

    /**
     * @return the numeroCelular
     */
    public String getNumeroCelular() {
        return numeroCelular;
    }

    /**
     * @param numeroCelular the numeroCelular to set
     */
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    /**
     * @return the direccionPrincipal
     */
    public String getDireccionPrincipal() {
        return direccionPrincipal;
    }

    /**
     * @param direccionPrincipal the direccionPrincipal to set
     */
    public void setDireccionPrincipal(String direccionPrincipal) {
        this.direccionPrincipal = direccionPrincipal;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the casaCobranza
     */
    public String getCasaCobranza() {
        return casaCobranza;
    }

    /**
     * @param casaCobranza the casaCobranza to set
     */
    public void setCasaCobranza(String casaCobranza) {
        this.casaCobranza = casaCobranza;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.dto;

import java.io.Serializable;

/**
 * DTODatosBasicos.java - Active contract for the client
 *
 * @author Sergio Guerrero
 * @version 1.0
 * @date 20/01/2017
 * @see DTOCustomer
 */
public class DTODatosBasicos implements Serializable {

    public DTODatosBasicos(String primerNombre, String apellidos, String segmento, String cuadrante) {
        this.primerNombre = primerNombre;
        this.apellidos = apellidos;
        this.segmento = segmento;
        this.cuadrante = cuadrante;
    }

    public DTODatosBasicos() {
    }

    /**
     * @customerId Identificador del cliente
     */
    private String customerId = "cliente";
    /**
     * @primerNombre Primer nombre del cliente
     */
    private String primerNombre;
    /**
     * @apellidos Apellido del cliente
     */
    private String apellidos;
    /**
     * @tipoDocumento Tipo de documento del cliente
     */
    private String tipoDocumento;
    /**
     * @numeroDocumento Número de documento del cliente
     */
    private String numeroDocumento;
    /**
     * @empresaLabora Empresa donde labora
     */
    private String empresaLabora;
    /**
     * @numeroClienteAltamira Número del cliente altamira asociacio al documento
     */
    private String numeroClienteAltamira;
    /**
     * @segmento Segmento al que pertenece el cliente
     */
    private String segmento;
    /**
     * @edad Edad de cliente
     */
    private String edad;
    /**
     * @cuadrante es el que determina volumen de negocio de un cliente; va de
     * cero a cuatro
     */
    private String cuadrante;
    /**
     * @gestorPrincipal Gestor asignado para atención personalizada del cliente
     */
    private String gestorPrincipal;
    /**
     * @oficinaPrincipal Código de oficina y descripción de la oficina principal
     * que atiende al cliente
     */
    private String oficinaPrincipal;
    /**
     * @totalIngresos Valor monetario de ingresos del cliente
     */
    private String totalIngresos;
    /**
     * @antiguedadCliente Fecha de antigüedad como cliente del banco
     */
    private String antiguedadCliente;
    /**
     * @telefonoPrincipal Telefono del cliente
     */
    private String telefonoPrincipal;
    /**
     * @deudaVencida Deuda vencida del cliente
     */
    private String deudaVencida;

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the primerNombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * @param primerNombre the primerNombre to set
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the numeroDocumento
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * @param numeroDocumento the numeroDocumento to set
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    /**
     * @return the empresaLabora
     */
    public String getEmpresaLabora() {
        return empresaLabora;
    }

    /**
     * @param empresaLabora the empresaLabora to set
     */
    public void setEmpresaLabora(String empresaLabora) {
        this.empresaLabora = empresaLabora;
    }

    /**
     * @return the numeroClienteAltamira
     */
    public String getNumeroClienteAltamira() {
        return numeroClienteAltamira;
    }

    /**
     * @param numeroClienteAltamira the numeroClienteAltamira to set
     */
    public void setNumeroClienteAltamira(String numeroClienteAltamira) {
        this.numeroClienteAltamira = numeroClienteAltamira;
    }

    /**
     * @return the segmento
     */
    public String getSegmento() {
        return segmento;
    }

    /**
     * @param segmento the segmento to set
     */
    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the cuadrante
     */
    public String getCuadrante() {
        return cuadrante;
    }

    /**
     * @param cuadrante the cuadrante to set
     */
    public void setCuadrante(String cuadrante) {
        this.cuadrante = cuadrante;
    }

    /**
     * @return the gestorPrincipal
     */
    public String getGestorPrincipal() {
        return gestorPrincipal;
    }

    /**
     * @param gestorPrincipal the gestorPrincipal to set
     */
    public void setGestorPrincipal(String gestorPrincipal) {
        this.gestorPrincipal = gestorPrincipal;
    }

    /**
     * @return the oficinaPrincipal
     */
    public String getOficinaPrincipal() {
        return oficinaPrincipal;
    }

    /**
     * @param oficinaPrincipal the oficinaPrincipal to set
     */
    public void setOficinaPrincipal(String oficinaPrincipal) {
        this.oficinaPrincipal = oficinaPrincipal;
    }

    /**
     * @return the totalIngresos
     */
    public String getTotalIngresos() {
        return totalIngresos;
    }

    /**
     * @param totalIngresos the totalIngresos to set
     */
    public void setTotalIngresos(String totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    /**
     * @return the antiguedadCliente
     */
    public String getAntiguedadCliente() {
        return antiguedadCliente;
    }

    /**
     * @param antiguedadCliente the antiguedadCliente to set
     */
    public void setAntiguedadCliente(String antiguedadCliente) {
        this.antiguedadCliente = antiguedadCliente;
    }

    /**
     * @return the telefonoPrincipal
     */
    public String getTelefonoPrincipal() {
        return telefonoPrincipal;
    }

    /**
     * @param telefonoPrincipal the telefonoPrincipal to set
     */
    public void setTelefonoPrincipal(String telefonoPrincipal) {
        this.telefonoPrincipal = telefonoPrincipal;
    }

    /**
     * @return the deudaVencida
     */
    public String getDeudaVencida() {
        return deudaVencida;
    }

    /**
     * @param deudaVencida the deudaVencida to set
     */
    public void setDeudaVencida(String deudaVencida) {
        this.deudaVencida = deudaVencida;
    }

}

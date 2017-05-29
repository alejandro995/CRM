/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.dto;

import java.io.Serializable;

/**
 * DTOInformacionFinanciera.java - Información financiera del cliente
 *
 * @author Luis Berna
 * @version 1.0
 * @date 20/01/2017
 * @see
 */
public class DTOInformacionPersonal implements Serializable {

    /**
     * @sexo - Sexo del cliente femenino o masculino
     */
    private String sexo;
    /**
     * @FechaNacimiento - Fecha de nacimiento del cliente
     */
    private String fechaNacimiento;
    /**
     * @nacionalidad - Nacionalidad del cliente
     */
    private String nacionalidad;
    /**
     * @numeroPersonasAcargo - Número de personas que tiene a cargo el cliente
     */
    private String numeroPersonasAcargo;
    /**
     * @valorRentabilidad - Valor de la rentabilidad acumulada del cliente
     */
    private String valorRentabilidad;
    /**
     * @estadoCivil - Estado civil del cliente
     */
    private String estadoCivil;
    /**
     * @antiguedadEmpleado - Fecha de antigüedad de empleo
     */
    private String antiguedadEmpleado;
    /**
     * @ciudadNacimiento - Ciudad de nacimiento del cliente
     */
    private String ciudadNacimiento;
    /**
     * @departamento - departamento del cliente
     */
    private String departamento;

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the FechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the FechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the numeroPersonasAcargo
     */
    public String getNumeroPersonasAcargo() {
        return numeroPersonasAcargo;
    }

    /**
     * @param numeroPersonasAcargo the numeroPersonasAcargo to set
     */
    public void setNumeroPersonasAcargo(String numeroPersonasAcargo) {
        this.numeroPersonasAcargo = numeroPersonasAcargo;
    }

    /**
     * @return the valorRentabilidad
     */
    public String getValorRentabilidad() {
        return valorRentabilidad;
    }

    /**
     * @param valorRentabilidad the valorRentabilidad to set
     */
    public void setValorRentabilidad(String valorRentabilidad) {
        this.valorRentabilidad = valorRentabilidad;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the antiguedadEmpleado
     */
    public String getAntiguedadEmpleado() {
        return antiguedadEmpleado;
    }

    /**
     * @param antiguedadEmpleado the antiguedadEmpleado to set
     */
    public void setAntiguedadEmpleado(String antiguedadEmpleado) {
        this.antiguedadEmpleado = antiguedadEmpleado;
    }

    /**
     * @return the ciudadNacimiento
     */
    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    /**
     * @param ciudadNacimiento the ciudadNacimiento to set
     */
    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}

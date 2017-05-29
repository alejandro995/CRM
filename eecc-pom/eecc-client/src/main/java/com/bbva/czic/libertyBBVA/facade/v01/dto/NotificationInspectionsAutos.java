package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for NotificarInspeccionesAutosBBVARq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificarInspeccionesAutosBBVARq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoRequest" type="{http://com.lsc.services.bbva.common/libertyTypes}InfoRequest"/>
 *         &lt;element name="nombrePersona" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lugarInspeccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationInspectionsAutos", propOrder = {
    "infoRequest",
    "nombrePersona",
    "placa",
    "lugarInspeccion",
    "telefono",
    "numeroSolicitud"
})
@XmlRootElement(name = "NotificationInspectionsAutos")
public class NotificationInspectionsAutos {

    @XmlElement(required = true)
    protected InfoRequest infoRequest;
    @XmlElement(required = true)
    protected String nombrePersona;
    @XmlElement(required = true)
    protected String placa;
    @XmlElement(required = true)
    protected String lugarInspeccion;
    @XmlElement(required = true)
    protected String telefono;
    @XmlElement(required = true)
    protected String numeroSolicitud;

    /**
     * Gets the value of the infoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InfoRequest }
     *     
     */
    public InfoRequest getInfoRequest() {
        return infoRequest;
    }

    /**
     * Sets the value of the infoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRequest }
     *     
     */
    public void setInfoRequest(InfoRequest value) {
        this.infoRequest = value;
    }

    /**
     * Gets the value of the nombrePersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Sets the value of the nombrePersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePersona(String value) {
        this.nombrePersona = value;
    }

    /**
     * Gets the value of the placa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Sets the value of the placa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Gets the value of the lugarInspeccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarInspeccion() {
        return lugarInspeccion;
    }

    /**
     * Sets the value of the lugarInspeccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarInspeccion(String value) {
        this.lugarInspeccion = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the numeroSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }

    /**
     * Sets the value of the numeroSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSolicitud(String value) {
        this.numeroSolicitud = value;
    }

}



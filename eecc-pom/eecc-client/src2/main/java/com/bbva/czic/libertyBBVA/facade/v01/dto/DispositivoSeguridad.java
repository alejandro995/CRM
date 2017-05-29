package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DispositivoSeguridad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DispositivoSeguridad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaInicioContrato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propietario" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *         &lt;element name="tipo" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DispositivoSeguridad", propOrder = {
    "fechaInicioContrato",
    "numeroContrato",
    "propietario",
    "tipo"
})
public class DispositivoSeguridad {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicioContrato;
    protected String numeroContrato;
    @XmlElement(required = true)
    protected ElementoCodificado propietario;
    @XmlElement(required = true)
    protected ElementoCodificado tipo;

    /**
     * Gets the value of the fechaInicioContrato property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    /**
     * Sets the value of the fechaInicioContrato property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaInicioContrato(XMLGregorianCalendar value) {
        this.fechaInicioContrato = value;
    }

    /**
     * Gets the value of the numeroContrato property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Sets the value of the numeroContrato property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Gets the value of the propietario property.
     *
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *
     */
    public ElementoCodificado getPropietario() {
        return propietario;
    }

    /**
     * Sets the value of the propietario property.
     *
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *
     */
    public void setPropietario(ElementoCodificado value) {
        this.propietario = value;
    }

    /**
     * Gets the value of the tipo property.
     *
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *
     */
    public ElementoCodificado getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     *
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *
     */
    public void setTipo(ElementoCodificado value) {
        this.tipo = value;
    }

}

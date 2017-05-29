package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Automovil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Automovil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datos" type="{http://com.lsc.services.bbva.common/libertyTypes}Datos_type0"/>
 *         &lt;element name="identificacion" type="{http://com.lsc.services.bbva.common/libertyTypes}Identificacion_type0"/>
 *         &lt;element name="otrosDatos" type="{http://com.lsc.services.bbva.common/libertyTypes}OtrosDatos_type0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Automovil", propOrder = {
    "datos",
    "identificacion",
    "otrosDatos"
})

public class Automovil {

    @XmlElement(required = true)
    protected Datos_type0 datos;
    @XmlElement(required = true)
    protected Identificacion_type0 identificacion;
    @XmlElement(required = true)
    protected OtrosDatos_type0 otrosDatos;

    /**
     * Gets the value of the datos property.
     * 
     * @return
     *     possible object is
     *     {@link DatosType0 }
     *     
     */
    public Datos_type0 getDatos() {
        return datos;
    }

    /**
     * Sets the value of the datos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datos_type0 }
     *     
     */
    public void setDatos(Datos_type0 value) {
        this.datos = value;
    }

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionType0 }
     *     
     */
    public Identificacion_type0 getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionType0 }
     *     
     */
    public void setIdentificacion(Identificacion_type0 value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the otrosDatos property.
     * 
     * @return
     *     possible object is
     *     {@link OtrosDatosType0 }
     *     
     */
    public OtrosDatos_type0 getOtrosDatos() {
        return otrosDatos;
    }

    /**
     * Sets the value of the otrosDatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtrosDatosType0 }
     *     
     */
    public void setOtrosDatos(OtrosDatos_type0 value) {
        this.otrosDatos = value;
    }

}

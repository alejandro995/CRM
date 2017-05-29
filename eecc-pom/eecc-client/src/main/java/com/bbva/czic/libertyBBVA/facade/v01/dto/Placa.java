package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Placa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Placa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoPlaca" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Placa", propOrder = {
    "placa",
    "tipoPlaca"
})
public class Placa {

    @XmlElement(required = true)
    protected String placa;
    @XmlElement(required = true)
    protected ElementoCodificado tipoPlaca;

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
     * Gets the value of the tipoPlaca property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getTipoPlaca() {
        return tipoPlaca;
    }

    /**
     * Sets the value of the tipoPlaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setTipoPlaca(ElementoCodificado value) {
        this.tipoPlaca = value;
    }

}

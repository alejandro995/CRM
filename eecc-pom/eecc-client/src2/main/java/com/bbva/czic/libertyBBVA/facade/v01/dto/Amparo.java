package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for Amparo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Amparo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado">
 *       &lt;sequence>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="obligatorio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="primaTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaAnual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amparo", propOrder = {
    "capital",
    "obligatorio",
    "primaTarifa",
    "primaAnual"
})

public class Amparo
    extends ElementoCodificado
{

    protected BigDecimal capital;
    protected Boolean obligatorio;
    protected String primaTarifa;
    protected String primaAnual;

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapital(BigDecimal value) {
        this.capital = value;
    }

    /**
     * Gets the value of the obligatorio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObligatorio() {
        return obligatorio;
    }

    /**
     * Sets the value of the obligatorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObligatorio(Boolean value) {
        this.obligatorio = value;
    }

    /**
     * Gets the value of the primaTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaTarifa() {
        return primaTarifa;
    }

    /**
     * Sets the value of the primaTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaTarifa(String value) {
        this.primaTarifa = value;
    }

    /**
     * Gets the value of the primaAnual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaAnual() {
        return primaAnual;
    }

    /**
     * Sets the value of the primaAnual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaAnual(String value) {
        this.primaAnual = value;
    }

}
package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for Compania complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compania">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado">
 *       &lt;sequence>
 *         &lt;element name="porcentajeParticipacion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="porcentajeGastos" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compania", propOrder = {
    "porcentajeParticipacion",
    "porcentajeGastos"
})
public class Compania
    extends ElementoCodificado
{

    @XmlElement(required = true)
    protected BigDecimal porcentajeParticipacion;
    @XmlElement(required = true)
    protected BigDecimal porcentajeGastos;

    /**
     * Gets the value of the porcentajeParticipacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    /**
     * Sets the value of the porcentajeParticipacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeParticipacion(BigDecimal value) {
        this.porcentajeParticipacion = value;
    }

    /**
     * Gets the value of the porcentajeGastos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeGastos() {
        return porcentajeGastos;
    }

    /**
     * Sets the value of the porcentajeGastos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeGastos(BigDecimal value) {
        this.porcentajeGastos = value;
    }

}

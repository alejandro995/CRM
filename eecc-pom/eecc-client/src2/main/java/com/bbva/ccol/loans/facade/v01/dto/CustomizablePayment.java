
package com.bbva.ccol.loans.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para customizablePayment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="customizablePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumTerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximumTerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minimumPayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customizablePayment", propOrder = {
    "minimumTerm",
    "maximumTerm",
    "interestRate",
    "minimumPayment",
    "currency"
})
public class CustomizablePayment {

    protected Integer minimumTerm;
    protected Integer maximumTerm;
    protected Integer interestRate;
    protected Integer minimumPayment;
    protected String currency;

    /**
     * Obtiene el valor de la propiedad minimumTerm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumTerm() {
        return minimumTerm;
    }

    /**
     * Define el valor de la propiedad minimumTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumTerm(Integer value) {
        this.minimumTerm = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumTerm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumTerm() {
        return maximumTerm;
    }

    /**
     * Define el valor de la propiedad maximumTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumTerm(Integer value) {
        this.maximumTerm = value;
    }

    /**
     * Obtiene el valor de la propiedad interestRate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterestRate() {
        return interestRate;
    }

    /**
     * Define el valor de la propiedad interestRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterestRate(Integer value) {
        this.interestRate = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumPayment.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumPayment() {
        return minimumPayment;
    }

    /**
     * Define el valor de la propiedad minimumPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumPayment(Integer value) {
        this.minimumPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}

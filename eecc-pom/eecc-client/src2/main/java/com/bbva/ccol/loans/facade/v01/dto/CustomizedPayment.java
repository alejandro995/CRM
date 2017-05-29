
package com.bbva.ccol.loans.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para customizedPayment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="customizedPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="currentTerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="repayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalAmortization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customizedPayment", propOrder = {
    "terms",
    "currentTerm",
    "interestRate",
    "repayment",
    "currency",
    "capitalAmortization"
})
public class CustomizedPayment {

    protected Integer terms;
    protected Integer currentTerm;
    protected Integer interestRate;
    protected Integer repayment;
    protected String currency;
    protected Integer capitalAmortization;

    /**
     * Obtiene el valor de la propiedad terms.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerms() {
        return terms;
    }

    /**
     * Define el valor de la propiedad terms.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerms(Integer value) {
        this.terms = value;
    }

    /**
     * Obtiene el valor de la propiedad currentTerm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentTerm() {
        return currentTerm;
    }

    /**
     * Define el valor de la propiedad currentTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentTerm(Integer value) {
        this.currentTerm = value;
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
     * Obtiene el valor de la propiedad repayment.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepayment() {
        return repayment;
    }

    /**
     * Define el valor de la propiedad repayment.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepayment(Integer value) {
        this.repayment = value;
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

    /**
     * Obtiene el valor de la propiedad capitalAmortization.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapitalAmortization() {
        return capitalAmortization;
    }

    /**
     * Define el valor de la propiedad capitalAmortization.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapitalAmortization(Integer value) {
        this.capitalAmortization = value;
    }

}

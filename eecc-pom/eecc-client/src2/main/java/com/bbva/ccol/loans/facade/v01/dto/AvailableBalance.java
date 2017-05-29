
package com.bbva.ccol.loans.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para availableBalance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="availableBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentBalance" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="postedBalance" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="pendingBalance" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availableBalance", propOrder = {
    "currentBalance",
    "postedBalance",
    "pendingBalance"
})
public class AvailableBalance {

    protected Money currentBalance;
    protected Money postedBalance;
    protected Money pendingBalance;

    /**
     * Obtiene el valor de la propiedad currentBalance.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Define el valor de la propiedad currentBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCurrentBalance(Money value) {
        this.currentBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad postedBalance.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPostedBalance() {
        return postedBalance;
    }

    /**
     * Define el valor de la propiedad postedBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPostedBalance(Money value) {
        this.postedBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad pendingBalance.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPendingBalance() {
        return pendingBalance;
    }

    /**
     * Define el valor de la propiedad pendingBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPendingBalance(Money value) {
        this.pendingBalance = value;
    }

}


package com.bbva.ccol.customers.facade.v02.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bankingRelationship complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bankingRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiumFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debitFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankingRelationship", propOrder = {
    "manager",
    "customerFlag",
    "premiumFlag",
    "debitFlag"
})
public class BankingRelationship {

    protected String manager;
    protected String customerFlag;
    protected String premiumFlag;
    protected String debitFlag;

    /**
     * Obtiene el valor de la propiedad manager.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Define el valor de la propiedad manager.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Obtiene el valor de la propiedad customerFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFlag() {
        return customerFlag;
    }

    /**
     * Define el valor de la propiedad customerFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFlag(String value) {
        this.customerFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad premiumFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumFlag() {
        return premiumFlag;
    }

    /**
     * Define el valor de la propiedad premiumFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumFlag(String value) {
        this.premiumFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad debitFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitFlag() {
        return debitFlag;
    }

    /**
     * Define el valor de la propiedad debitFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitFlag(String value) {
        this.debitFlag = value;
    }

}


package com.bbva.ccol.loans.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para balance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="balance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumBalance" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="maximumBalance" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balance", propOrder = {
    "minimumBalance",
    "maximumBalance"
})
public class Balance {

    protected Money minimumBalance;
    protected Money maximumBalance;

    /**
     * Obtiene el valor de la propiedad minimumBalance.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMinimumBalance() {
        return minimumBalance;
    }

    /**
     * Define el valor de la propiedad minimumBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMinimumBalance(Money value) {
        this.minimumBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumBalance.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaximumBalance() {
        return maximumBalance;
    }

    /**
     * Define el valor de la propiedad maximumBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaximumBalance(Money value) {
        this.maximumBalance = value;
    }

}


package com.bbva.ccol.loans.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para principal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="principal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expiredPrincipal" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="notExpiredPrincipal" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "principal", propOrder = {
    "expiredPrincipal",
    "notExpiredPrincipal"
})
public class Principal {

    protected Money expiredPrincipal;
    protected Money notExpiredPrincipal;

    /**
     * Obtiene el valor de la propiedad expiredPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getExpiredPrincipal() {
        return expiredPrincipal;
    }

    /**
     * Define el valor de la propiedad expiredPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setExpiredPrincipal(Money value) {
        this.expiredPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad notExpiredPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNotExpiredPrincipal() {
        return notExpiredPrincipal;
    }

    /**
     * Define el valor de la propiedad notExpiredPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNotExpiredPrincipal(Money value) {
        this.notExpiredPrincipal = value;
    }

}

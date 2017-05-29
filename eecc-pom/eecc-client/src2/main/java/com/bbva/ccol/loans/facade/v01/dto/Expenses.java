
package com.bbva.ccol.loans.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para expenses complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="expenses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}type" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}status" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}chargeType" minOccurs="0"/>
 *         &lt;element name="initialBalance" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="currentBalance" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="pendingBalance" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}businessOffice" minOccurs="0"/>
 *         &lt;element name="activateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expenses", propOrder = {
    "id",
    "type",
    "status",
    "chargeType",
    "initialBalance",
    "currentBalance",
    "pendingBalance",
    "businessOffice",
    "activateDate"
})
public class Expenses {

    protected String id;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Type type;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Status status;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected ChargeType chargeType;
    protected Money initialBalance;
    protected Money currentBalance;
    protected Money pendingBalance;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected BusinessOffice businessOffice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activateDate;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeType.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType }
     *     
     */
    public ChargeType getChargeType() {
        return chargeType;
    }

    /**
     * Define el valor de la propiedad chargeType.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType }
     *     
     */
    public void setChargeType(ChargeType value) {
        this.chargeType = value;
    }

    /**
     * Obtiene el valor de la propiedad initialBalance.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getInitialBalance() {
        return initialBalance;
    }

    /**
     * Define el valor de la propiedad initialBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setInitialBalance(Money value) {
        this.initialBalance = value;
    }

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

    /**
     * Obtiene el valor de la propiedad businessOffice.
     * 
     * @return
     *     possible object is
     *     {@link BusinessOffice }
     *     
     */
    public BusinessOffice getBusinessOffice() {
        return businessOffice;
    }

    /**
     * Define el valor de la propiedad businessOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessOffice }
     *     
     */
    public void setBusinessOffice(BusinessOffice value) {
        this.businessOffice = value;
    }

    /**
     * Obtiene el valor de la propiedad activateDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivateDate() {
        return activateDate;
    }

    /**
     * Define el valor de la propiedad activateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivateDate(XMLGregorianCalendar value) {
        this.activateDate = value;
    }

}

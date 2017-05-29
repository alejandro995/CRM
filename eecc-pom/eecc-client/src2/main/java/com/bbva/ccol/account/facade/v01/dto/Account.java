
package com.bbva.ccol.account.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para account complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="account">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:bbva:ccol:account:facade:v02:dto}contract">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:account:facade:v02:dto}accountType" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:account:facade:v02:dto}numberType" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:account:facade:v02:dto}title" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:account:facade:v02:dto}status" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:account:facade:v02:dto}availableBalance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account", propOrder = {
    "accountId",
    "number",
    "accountType",
    "numberType",
    "title",
    "alias",
    "status",
    "availableBalance"
})
public class Account
    extends Contract
{

    protected String accountId;
    protected String number;
    @XmlElement(namespace = "urn:com:bbva:ccol:account:facade:v02:dto")
    protected AccountType accountType;
    @XmlElement(namespace = "urn:com:bbva:ccol:account:facade:v02:dto")
    protected NumberType numberType;
    @XmlElement(namespace = "urn:com:bbva:ccol:account:facade:v02:dto")
    protected Title title;
    protected String alias;
    @XmlElement(namespace = "urn:com:bbva:ccol:account:facade:v02:dto")
    protected Status status;
    @XmlElement(namespace = "urn:com:bbva:ccol:account:facade:v02:dto")
    protected AvailableBalance availableBalance;

    /**
     * Obtiene el valor de la propiedad accountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Define el valor de la propiedad accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad accountType.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Define el valor de la propiedad accountType.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * Obtiene el valor de la propiedad numberType.
     * 
     * @return
     *     possible object is
     *     {@link NumberType }
     *     
     */
    public NumberType getNumberType() {
        return numberType;
    }

    /**
     * Define el valor de la propiedad numberType.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberType }
     *     
     */
    public void setNumberType(NumberType value) {
        this.numberType = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Define el valor de la propiedad alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
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
     * Obtiene el valor de la propiedad availableBalance.
     * 
     * @return
     *     possible object is
     *     {@link AvailableBalance }
     *     
     */
    public AvailableBalance getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Define el valor de la propiedad availableBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableBalance }
     *     
     */
    public void setAvailableBalance(AvailableBalance value) {
        this.availableBalance = value;
    }

}


package com.bbva.ccol.customers.facade.v02.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para identityDocuments complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="identityDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentType" type="{urn:com:bbva:czic:customers:facade:v02:dto}type" minOccurs="0"/>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expeditionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="countryExpedition" type="{urn:com:bbva:czic:customers:facade:v02:dto}country" minOccurs="0"/>
 *         &lt;element name="stateExpedition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityExpedition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identityDocuments", propOrder = {
    "documentType",
    "documentNumber",
    "expeditionDate",
    "expirationDate",
    "countryExpedition",
    "stateExpedition",
    "cityExpedition"
})
public class IdentityDocuments {

    protected Type documentType;
    protected String documentNumber;
    @XmlSchemaType(name = "dateTime")
    protected String expeditionDate;
    @XmlSchemaType(name = "dateTime")
    protected String expirationDate;
    protected Country countryExpedition;
    protected String stateExpedition;
    protected String cityExpedition;

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setDocumentType(Type value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad documentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Define el valor de la propiedad documentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad expeditionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getExpeditionDate() {
        return expeditionDate;
    }

    /**
     * Define el valor de la propiedad expeditionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpeditionDate(String value) {
        this.expeditionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define el valor de la propiedad expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad countryExpedition.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountryExpedition() {
        return countryExpedition;
    }

    /**
     * Define el valor de la propiedad countryExpedition.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountryExpedition(Country value) {
        this.countryExpedition = value;
    }

    /**
     * Obtiene el valor de la propiedad stateExpedition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateExpedition() {
        return stateExpedition;
    }

    /**
     * Define el valor de la propiedad stateExpedition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateExpedition(String value) {
        this.stateExpedition = value;
    }

    /**
     * Obtiene el valor de la propiedad cityExpedition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityExpedition() {
        return cityExpedition;
    }

    /**
     * Define el valor de la propiedad cityExpedition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityExpedition(String value) {
        this.cityExpedition = value;
    }

}

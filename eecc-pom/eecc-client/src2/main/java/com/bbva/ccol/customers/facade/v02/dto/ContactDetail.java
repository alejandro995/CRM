
package com.bbva.ccol.customers.facade.v02.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contactDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contactDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactType" type="{urn:com:bbva:czic:customers:facade:v02:dto}type" minOccurs="0"/>
 *         &lt;element name="isPreferential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactDetail", propOrder = {
    "id",
    "contact",
    "contactType",
    "isPreferential",
    "isChecked"
})
public class ContactDetail {

    protected String id;
    protected String contact;
    protected Type contactType;
    protected Boolean isPreferential;
    protected Boolean isChecked;

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
     * Obtiene el valor de la propiedad contact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Define el valor de la propiedad contact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Obtiene el valor de la propiedad contactType.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getContactType() {
        return contactType;
    }

    /**
     * Define el valor de la propiedad contactType.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setContactType(Type value) {
        this.contactType = value;
    }

    /**
     * Obtiene el valor de la propiedad isPreferential.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPreferential() {
        return isPreferential;
    }

    /**
     * Define el valor de la propiedad isPreferential.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPreferential(Boolean value) {
        this.isPreferential = value;
    }

    /**
     * Obtiene el valor de la propiedad isChecked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsChecked() {
        return isChecked;
    }

    /**
     * Define el valor de la propiedad isChecked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsChecked(Boolean value) {
        this.isChecked = value;
    }

}

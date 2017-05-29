
package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para identityDocument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="identityDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situation" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="expedition" type="{urn:com:bbva:czic:dto:canonical_model}expeditionData" minOccurs="0"/>
 *         &lt;element name="serialNumberSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identityDocument", propOrder = {
    "type",
    "number",
    "situation",
    "expedition",
    "serialNumberSupport",
    "mrz",
    "expiryDate"
})
public class IdentityDocument {

    protected OptionsList type;
    protected String number;
    protected OptionsList situation;
    protected ExpeditionData expedition;
    protected String serialNumberSupport;
    protected String mrz;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setType(OptionsList value) {
        this.type = value;
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
     * Obtiene el valor de la propiedad situation.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getSituation() {
        return situation;
    }

    /**
     * Define el valor de la propiedad situation.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setSituation(OptionsList value) {
        this.situation = value;
    }

    /**
     * Obtiene el valor de la propiedad expedition.
     * 
     * @return
     *     possible object is
     *     {@link ExpeditionData }
     *     
     */
    public ExpeditionData getExpedition() {
        return expedition;
    }

    /**
     * Define el valor de la propiedad expedition.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpeditionData }
     *     
     */
    public void setExpedition(ExpeditionData value) {
        this.expedition = value;
    }

    /**
     * Obtiene el valor de la propiedad serialNumberSupport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberSupport() {
        return serialNumberSupport;
    }

    /**
     * Define el valor de la propiedad serialNumberSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberSupport(String value) {
        this.serialNumberSupport = value;
    }

    /**
     * Obtiene el valor de la propiedad mrz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrz() {
        return mrz;
    }

    /**
     * Define el valor de la propiedad mrz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrz(String value) {
        this.mrz = value;
    }

    /**
     * Obtiene el valor de la propiedad expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Define el valor de la propiedad expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

}

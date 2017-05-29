
package com.bbva.ccol.warranty.facade.v01.dto;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * <p>Java class for promissoryNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="promissoryNote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberTitle" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeCity " type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateExpedition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateExpiration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicatorInsurance" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promissoryNote", propOrder = {
    "numberTitle",
    "entity",
    "codeDepartment",
    "codeCity0020",
    "dateExpedition",
    "dateExpiration",
    "indicatorInsurance"
})
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PromissoryNote {

    protected BigInteger numberTitle;
    protected String entity;
    protected String codeDepartment;
    @XmlElement(name = "codeCity ")
    protected String codeCity0020;
    protected String dateExpedition;
    protected String dateExpiration;
    protected BigInteger indicatorInsurance;

    /**
     * Gets the value of the numberTitle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberTitle() {
        return numberTitle;
    }

    /**
     * Sets the value of the numberTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberTitle(BigInteger value) {
        this.numberTitle = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the codeDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDepartment() {
        return codeDepartment;
    }

    /**
     * Sets the value of the codeDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDepartment(String value) {
        this.codeDepartment = value;
    }

    /**
     * Gets the value of the codeCity0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCity_0020() {
        return codeCity0020;
    }

    /**
     * Sets the value of the codeCity0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCity_0020(String value) {
        this.codeCity0020 = value;
    }

    /**
     * Gets the value of the dateExpedition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateExpedition() {
        return dateExpedition;
    }

    /**
     * Sets the value of the dateExpedition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateExpedition(String value) {
        this.dateExpedition = value;
    }

    /**
     * Gets the value of the dateExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateExpiration() {
        return dateExpiration;
    }

    /**
     * Sets the value of the dateExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateExpiration(String value) {
        this.dateExpiration = value;
    }

    /**
     * Gets the value of the indicatorInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndicatorInsurance() {
        return indicatorInsurance;
    }

    /**
     * Sets the value of the indicatorInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndicatorInsurance(BigInteger value) {
        this.indicatorInsurance = value;
    }

}

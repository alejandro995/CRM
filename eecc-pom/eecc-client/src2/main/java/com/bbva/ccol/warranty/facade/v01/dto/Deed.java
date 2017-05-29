
package com.bbva.ccol.warranty.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * <p>Java class for deed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notaryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityRegistry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stratum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deed", propOrder = {
    "notaryCode",
    "cityRegistry",
    "stratum"
})
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Deed {

    protected String notaryCode;
    protected String cityRegistry;
    protected String stratum;

    /**
     * Gets the value of the notaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaryCode() {
        return notaryCode;
    }

    /**
     * Sets the value of the notaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaryCode(String value) {
        this.notaryCode = value;
    }

    /**
     * Gets the value of the cityRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityRegistry() {
        return cityRegistry;
    }

    /**
     * Sets the value of the cityRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityRegistry(String value) {
        this.cityRegistry = value;
    }

    /**
     * Gets the value of the stratum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStratum() {
        return stratum;
    }

    /**
     * Sets the value of the stratum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStratum(String value) {
        this.stratum = value;
    }

}

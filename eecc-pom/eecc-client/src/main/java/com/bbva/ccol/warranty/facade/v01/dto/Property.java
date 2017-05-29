
package com.bbva.ccol.warranty.facade.v01.dto;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * <p>Java class for property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeEstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useLife" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mortgage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DestructibleArea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalArea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="constructedArea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deed" type="{http://warranty}deed" minOccurs="0"/>
 *         &lt;element name="tenementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warranty" type="{http://warranty}warranty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "property", propOrder = {
    "typeEstate",
    "useLife",
    "mortgage",
    "destructibleArea",
    "totalArea",
    "constructedArea",
    "propertyType",
    "addressTypeCode",
    "addressDescription",
    "phone",
    "deed",
    "tenementType",
    "warranty"
})
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Property {

    protected String typeEstate;
    protected String useLife;
    protected Long mortgage;
    @XmlElement(name = "DestructibleArea")
    protected BigDecimal destructibleArea;
    protected BigDecimal totalArea;
    protected BigDecimal constructedArea;
    protected String propertyType;
    @XmlElement(name = "AddressTypeCode")
    protected String addressTypeCode;
    protected String addressDescription;
    protected String phone;
    protected Deed deed;
    protected String tenementType;
    protected Warranty warranty;

    /**
     * Gets the value of the typeEstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeEstate() {
        return typeEstate;
    }

    /**
     * Sets the value of the typeEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeEstate(String value) {
        this.typeEstate = value;
    }

    /**
     * Gets the value of the useLife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseLife() {
        return useLife;
    }

    /**
     * Sets the value of the useLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseLife(String value) {
        this.useLife = value;
    }

    /**
     * Gets the value of the mortgage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMortgage() {
        return mortgage;
    }

    /**
     * Sets the value of the mortgage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMortgage(Long value) {
        this.mortgage = value;
    }

    /**
     * Gets the value of the destructibleArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDestructibleArea() {
        return destructibleArea;
    }

    /**
     * Sets the value of the destructibleArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDestructibleArea(BigDecimal value) {
        this.destructibleArea = value;
    }

    /**
     * Gets the value of the totalArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalArea() {
        return totalArea;
    }

    /**
     * Sets the value of the totalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalArea(BigDecimal value) {
        this.totalArea = value;
    }

    /**
     * Gets the value of the constructedArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConstructedArea() {
        return constructedArea;
    }

    /**
     * Sets the value of the constructedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConstructedArea(BigDecimal value) {
        this.constructedArea = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the addressTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Sets the value of the addressTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeCode(String value) {
        this.addressTypeCode = value;
    }

    /**
     * Gets the value of the addressDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDescription() {
        return addressDescription;
    }

    /**
     * Sets the value of the addressDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressDescription(String value) {
        this.addressDescription = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the deed property.
     * 
     * @return
     *     possible object is
     *     {@link Deed }
     *     
     */
    public Deed getDeed() {
        return deed;
    }

    /**
     * Sets the value of the deed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deed }
     *     
     */
    public void setDeed(Deed value) {
        this.deed = value;
    }

    /**
     * Gets the value of the tenementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenementType() {
        return tenementType;
    }

    /**
     * Sets the value of the tenementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenementType(String value) {
        this.tenementType = value;
    }

    /**
     * Gets the value of the warranty property.
     * 
     * @return
     *     possible object is
     *     {@link Warranty }
     *     
     */
    public Warranty getWarranty() {
        return warranty;
    }

    /**
     * Sets the value of the warranty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warranty }
     *     
     */
    public void setWarranty(Warranty value) {
        this.warranty = value;
    }

}

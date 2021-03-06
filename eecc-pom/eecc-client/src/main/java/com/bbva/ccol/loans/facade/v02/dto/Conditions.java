
package com.bbva.ccol.loans.facade.v02.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Conditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conditions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="office" type="{urn:com:bbva:czic:dto:net}Office" minOccurs="0"/>
 *         &lt;element name="mobilizationConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activity" type="{urn:com:bbva:czic:dto:net}Activity" minOccurs="0"/>
 *         &lt;element name="itemCondition" type="{urn:com:bbva:czic:dto:net}itemCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="holders" type="{urn:com:bbva:czic:dto:net}Holder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conditions", propOrder = {
    "type",
    "alias",
    "category",
    "description",
    "openingDate",
    "commission",
    "office",
    "mobilizationConditions",
    "activity",
    "itemCondition",
    "holders"
})
public class Conditions {

    protected String type;
    protected String alias;
    protected String category;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingDate;
    protected String commission;
    protected Office office;
    protected String mobilizationConditions;
    protected Activity activity;
    @XmlElement(nillable = true)
    protected List<ItemCondition> itemCondition;
    @XmlElement(nillable = true)
    protected List<Holder> holders;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the alias property.
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
     * Sets the value of the alias property.
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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the openingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpeningDate() {
        return openingDate;
    }

    /**
     * Sets the value of the openingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpeningDate(XMLGregorianCalendar value) {
        this.openingDate = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommission(String value) {
        this.commission = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setOffice(Office value) {
        this.office = value;
    }

    /**
     * Gets the value of the mobilizationConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilizationConditions() {
        return mobilizationConditions;
    }

    /**
     * Sets the value of the mobilizationConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilizationConditions(String value) {
        this.mobilizationConditions = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivity(Activity value) {
        this.activity = value;
    }

    /**
     * Gets the value of the itemCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCondition }
     * 
     * 
     */
    public List<ItemCondition> getItemCondition() {
        if (itemCondition == null) {
            itemCondition = new ArrayList<ItemCondition>();
        }
        return this.itemCondition;
    }

    /**
     * Gets the value of the holders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Holder }
     * 
     * 
     */
    public List<Holder> getHolders() {
        if (holders == null) {
            holders = new ArrayList<Holder>();
        }
        return this.holders;
    }

}

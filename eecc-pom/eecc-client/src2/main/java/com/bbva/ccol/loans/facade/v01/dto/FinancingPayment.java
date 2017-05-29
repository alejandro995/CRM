
package com.bbva.ccol.loans.facade.v01.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para financingPayment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="financingPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}customizedPayment" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}customizablePayment" minOccurs="0"/>
 *         &lt;element name="interests" type="{urn:com:bbva:ccol:loans:facade:v01:dto}interests" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expenses" type="{urn:com:bbva:ccol:loans:facade:v01:dto}expenses" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financingPayment", propOrder = {
    "id",
    "name",
    "customizedPayment",
    "customizablePayment",
    "interests",
    "expenses"
})
public class FinancingPayment {

    protected String id;
    protected String name;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected CustomizedPayment customizedPayment;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected CustomizablePayment customizablePayment;
    @XmlElement(nillable = true)
    protected List<Interests> interests;
    @XmlElement(nillable = true)
    protected List<Expenses> expenses;

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
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad customizedPayment.
     * 
     * @return
     *     possible object is
     *     {@link CustomizedPayment }
     *     
     */
    public CustomizedPayment getCustomizedPayment() {
        return customizedPayment;
    }

    /**
     * Define el valor de la propiedad customizedPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizedPayment }
     *     
     */
    public void setCustomizedPayment(CustomizedPayment value) {
        this.customizedPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad customizablePayment.
     * 
     * @return
     *     possible object is
     *     {@link CustomizablePayment }
     *     
     */
    public CustomizablePayment getCustomizablePayment() {
        return customizablePayment;
    }

    /**
     * Define el valor de la propiedad customizablePayment.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizablePayment }
     *     
     */
    public void setCustomizablePayment(CustomizablePayment value) {
        this.customizablePayment = value;
    }

    /**
     * Gets the value of the interests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interests }
     * 
     * 
     */
    public List<Interests> getInterests() {
        if (interests == null) {
            interests = new ArrayList<Interests>();
        }
        return this.interests;
    }

    /**
     * Gets the value of the expenses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expenses }
     * 
     * 
     */
    public List<Expenses> getExpenses() {
        if (expenses == null) {
            expenses = new ArrayList<Expenses>();
        }
        return this.expenses;
    }

}

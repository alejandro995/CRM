
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
 * <p>Java class for MortageState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MortageState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aprovementState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualPhase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phaseBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="managerExecutive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prestamos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MortageState", propOrder = {
    "aprovementState",
    "customerName",
    "actualPhase",
    "phaseBeginDate",
    "managerExecutive",
    "comments",
    "prestamos"
})
public class MortageState {

    protected String aprovementState;
    protected String customerName;
    protected String actualPhase;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar phaseBeginDate;
    protected String managerExecutive;
    protected String comments;
    @XmlElement(nillable = true)
    protected List<String> prestamos;

    /**
     * Gets the value of the aprovementState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAprovementState() {
        return aprovementState;
    }

    /**
     * Sets the value of the aprovementState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAprovementState(String value) {
        this.aprovementState = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the actualPhase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualPhase() {
        return actualPhase;
    }

    /**
     * Sets the value of the actualPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualPhase(String value) {
        this.actualPhase = value;
    }

    /**
     * Gets the value of the phaseBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPhaseBeginDate() {
        return phaseBeginDate;
    }

    /**
     * Sets the value of the phaseBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPhaseBeginDate(XMLGregorianCalendar value) {
        this.phaseBeginDate = value;
    }

    /**
     * Gets the value of the managerExecutive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerExecutive() {
        return managerExecutive;
    }

    /**
     * Sets the value of the managerExecutive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerExecutive(String value) {
        this.managerExecutive = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the prestamos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prestamos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrestamos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrestamos() {
        if (prestamos == null) {
            prestamos = new ArrayList<String>();
        }
        return this.prestamos;
    }

}

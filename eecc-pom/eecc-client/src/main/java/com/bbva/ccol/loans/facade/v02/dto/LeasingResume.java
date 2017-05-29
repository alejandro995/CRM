
package com.bbva.ccol.loans.facade.v02.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LeasingResume complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeasingResume">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalBalance" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="totalContractBalance" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="totalBalanceFee" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="calculationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paidFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialCost" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="dateBalance" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="initialRateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="initialDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeasingResume", propOrder = {
    "description",
    "office",
    "totalBalance",
    "totalContractBalance",
    "totalBalanceFee",
    "calculationCode",
    "rateCode",
    "initialTerm",
    "paidFees",
    "initialCost",
    "dateBalance",
    "initialRateDate",
    "initialDate",
    "endDate"
})
public class LeasingResume {

    protected String description;
    protected String office;
    protected Money totalBalance;
    protected Money totalContractBalance;
    protected Money totalBalanceFee;
    protected String calculationCode;
    protected String rateCode;
    protected String initialTerm;
    protected String paidFees;
    protected Money initialCost;
    protected Money dateBalance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialRateDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;

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
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffice(String value) {
        this.office = value;
    }

    /**
     * Gets the value of the totalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalBalance() {
        return totalBalance;
    }

    /**
     * Sets the value of the totalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalBalance(Money value) {
        this.totalBalance = value;
    }

    /**
     * Gets the value of the totalContractBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalContractBalance() {
        return totalContractBalance;
    }

    /**
     * Sets the value of the totalContractBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalContractBalance(Money value) {
        this.totalContractBalance = value;
    }

    /**
     * Gets the value of the totalBalanceFee property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalBalanceFee() {
        return totalBalanceFee;
    }

    /**
     * Sets the value of the totalBalanceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalBalanceFee(Money value) {
        this.totalBalanceFee = value;
    }

    /**
     * Gets the value of the calculationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationCode() {
        return calculationCode;
    }

    /**
     * Sets the value of the calculationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationCode(String value) {
        this.calculationCode = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the initialTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialTerm() {
        return initialTerm;
    }

    /**
     * Sets the value of the initialTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialTerm(String value) {
        this.initialTerm = value;
    }

    /**
     * Gets the value of the paidFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidFees() {
        return paidFees;
    }

    /**
     * Sets the value of the paidFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidFees(String value) {
        this.paidFees = value;
    }

    /**
     * Gets the value of the initialCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getInitialCost() {
        return initialCost;
    }

    /**
     * Sets the value of the initialCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setInitialCost(Money value) {
        this.initialCost = value;
    }

    /**
     * Gets the value of the dateBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDateBalance() {
        return dateBalance;
    }

    /**
     * Sets the value of the dateBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDateBalance(Money value) {
        this.dateBalance = value;
    }

    /**
     * Gets the value of the initialRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialRateDate() {
        return initialRateDate;
    }

    /**
     * Sets the value of the initialRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialRateDate(XMLGregorianCalendar value) {
        this.initialRateDate = value;
    }

    /**
     * Gets the value of the initialDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialDate() {
        return initialDate;
    }

    /**
     * Sets the value of the initialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialDate(XMLGregorianCalendar value) {
        this.initialDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}

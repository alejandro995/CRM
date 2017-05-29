
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
 * <p>Java class for LoanResume complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanResume">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAmountOwed" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="creditBalance" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="totalExpired" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="totalDisbursed" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paidFees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expiredFees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outstandingFees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="disbursedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="disbursedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="automaticAccountPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equityFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditions" type="{urn:com:bbva:czic:dto:net}condition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depreciationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tcea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextAssessment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paymentDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanResume", propOrder = {
    "description",
    "office",
    "totalAmountOwed",
    "creditBalance",
    "totalExpired",
    "totalDisbursed",
    "paymentDate",
    "paidFees",
    "expiredFees",
    "outstandingFees",
    "disbursedDate",
    "disbursedAmount",
    "automaticAccountPayment",
    "paymentMethod",
    "term",
    "equityFrequency",
    "conditions",
    "interestFrequency",
    "depreciationType",
    "tin",
    "tia",
    "tcea",
    "nextAssessment",
    "paymentDay"
})
public class LoanResume {

    protected String description;
    protected String office;
    protected Money totalAmountOwed;
    protected Money creditBalance;
    protected Money totalExpired;
    protected Money totalDisbursed;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    protected Integer paidFees;
    protected Integer expiredFees;
    protected Integer outstandingFees;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disbursedDate;
    protected String disbursedAmount;
    protected String automaticAccountPayment;
    protected String paymentMethod;
    protected String term;
    protected String equityFrequency;
    @XmlElement(nillable = true)
    protected List<Condition> conditions;
    protected String interestFrequency;
    protected String depreciationType;
    protected String tin;
    protected String tia;
    protected String tcea;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextAssessment;
    protected String paymentDay;

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
     * Gets the value of the totalAmountOwed property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalAmountOwed() {
        return totalAmountOwed;
    }

    /**
     * Sets the value of the totalAmountOwed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalAmountOwed(Money value) {
        this.totalAmountOwed = value;
    }

    /**
     * Gets the value of the creditBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCreditBalance() {
        return creditBalance;
    }

    /**
     * Sets the value of the creditBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCreditBalance(Money value) {
        this.creditBalance = value;
    }

    /**
     * Gets the value of the totalExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalExpired() {
        return totalExpired;
    }

    /**
     * Sets the value of the totalExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalExpired(Money value) {
        this.totalExpired = value;
    }

    /**
     * Gets the value of the totalDisbursed property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalDisbursed() {
        return totalDisbursed;
    }

    /**
     * Sets the value of the totalDisbursed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalDisbursed(Money value) {
        this.totalDisbursed = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paidFees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaidFees() {
        return paidFees;
    }

    /**
     * Sets the value of the paidFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaidFees(Integer value) {
        this.paidFees = value;
    }

    /**
     * Gets the value of the expiredFees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiredFees() {
        return expiredFees;
    }

    /**
     * Sets the value of the expiredFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiredFees(Integer value) {
        this.expiredFees = value;
    }

    /**
     * Gets the value of the outstandingFees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutstandingFees() {
        return outstandingFees;
    }

    /**
     * Sets the value of the outstandingFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutstandingFees(Integer value) {
        this.outstandingFees = value;
    }

    /**
     * Gets the value of the disbursedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisbursedDate() {
        return disbursedDate;
    }

    /**
     * Sets the value of the disbursedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisbursedDate(XMLGregorianCalendar value) {
        this.disbursedDate = value;
    }

    /**
     * Gets the value of the disbursedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisbursedAmount() {
        return disbursedAmount;
    }

    /**
     * Sets the value of the disbursedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisbursedAmount(String value) {
        this.disbursedAmount = value;
    }

    /**
     * Gets the value of the automaticAccountPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticAccountPayment() {
        return automaticAccountPayment;
    }

    /**
     * Sets the value of the automaticAccountPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticAccountPayment(String value) {
        this.automaticAccountPayment = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the equityFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquityFrequency() {
        return equityFrequency;
    }

    /**
     * Sets the value of the equityFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquityFrequency(String value) {
        this.equityFrequency = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Condition }
     * 
     * 
     */
    public List<Condition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<Condition>();
        }
        return this.conditions;
    }

    /**
     * Gets the value of the interestFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestFrequency() {
        return interestFrequency;
    }

    /**
     * Sets the value of the interestFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestFrequency(String value) {
        this.interestFrequency = value;
    }

    /**
     * Gets the value of the depreciationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepreciationType() {
        return depreciationType;
    }

    /**
     * Sets the value of the depreciationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepreciationType(String value) {
        this.depreciationType = value;
    }

    /**
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTin(String value) {
        this.tin = value;
    }

    /**
     * Gets the value of the tia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTia() {
        return tia;
    }

    /**
     * Sets the value of the tia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTia(String value) {
        this.tia = value;
    }

    /**
     * Gets the value of the tcea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcea() {
        return tcea;
    }

    /**
     * Sets the value of the tcea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcea(String value) {
        this.tcea = value;
    }

    /**
     * Gets the value of the nextAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextAssessment() {
        return nextAssessment;
    }

    /**
     * Sets the value of the nextAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextAssessment(XMLGregorianCalendar value) {
        this.nextAssessment = value;
    }

    /**
     * Gets the value of the paymentDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDay() {
        return paymentDay;
    }

    /**
     * Sets the value of the paymentDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDay(String value) {
        this.paymentDay = value;
    }

}


package com.bbva.ccol.loans.facade.v02.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoanMovement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanMovement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creditEquity" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="currentInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="arrearsInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="settingReassessment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="otherExpenses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalAmountPaid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="balanceEquity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="office" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calculationCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calculationdesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descriptionRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="balanceDue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="activationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="systemDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cancan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="canon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="subscriptionCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="interestedPaid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalCanon" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valueBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="otherCanon" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valIva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanMovement", propOrder = {
    "transactionDate",
    "creditEquity",
    "currentInterest",
    "arrearsInterest",
    "settingReassessment",
    "otherExpenses",
    "totalAmountPaid",
    "balanceEquity",
    "id",
    "concept",
    "subProduct",
    "office",
    "calculationCode",
    "calculationdesc",
    "codeRate",
    "descriptionRate",
    "initialCost",
    "term",
    "balanceDue",
    "activationDate",
    "startDate",
    "systemDate",
    "cancan",
    "canon",
    "expirationDate",
    "rate",
    "subscriptionCapital",
    "interestedPaid",
    "totalCanon",
    "valueBalance",
    "otherCanon",
    "valIva"
})
public class LoanMovement {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    protected Money creditEquity;
    protected BigDecimal currentInterest;
    protected BigDecimal arrearsInterest;
    protected BigDecimal settingReassessment;
    protected BigDecimal otherExpenses;
    protected BigDecimal totalAmountPaid;
    protected BigDecimal balanceEquity;
    protected String id;
    protected String concept;
    protected String subProduct;
    protected int office;
    protected int calculationCode;
    protected String calculationdesc;
    protected int codeRate;
    protected String descriptionRate;
    protected BigDecimal initialCost;
    protected int term;
    protected BigDecimal balanceDue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemDate;
    protected int cancan;
    protected int canon;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected BigDecimal rate;
    protected BigDecimal subscriptionCapital;
    protected BigDecimal interestedPaid;
    protected BigDecimal totalCanon;
    protected BigDecimal valueBalance;
    protected BigDecimal otherCanon;
    protected BigDecimal valIva;

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the creditEquity property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCreditEquity() {
        return creditEquity;
    }

    /**
     * Sets the value of the creditEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCreditEquity(Money value) {
        this.creditEquity = value;
    }

    /**
     * Gets the value of the currentInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentInterest() {
        return currentInterest;
    }

    /**
     * Sets the value of the currentInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentInterest(BigDecimal value) {
        this.currentInterest = value;
    }

    /**
     * Gets the value of the arrearsInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArrearsInterest() {
        return arrearsInterest;
    }

    /**
     * Sets the value of the arrearsInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArrearsInterest(BigDecimal value) {
        this.arrearsInterest = value;
    }

    /**
     * Gets the value of the settingReassessment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettingReassessment() {
        return settingReassessment;
    }

    /**
     * Sets the value of the settingReassessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettingReassessment(BigDecimal value) {
        this.settingReassessment = value;
    }

    /**
     * Gets the value of the otherExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherExpenses() {
        return otherExpenses;
    }

    /**
     * Sets the value of the otherExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherExpenses(BigDecimal value) {
        this.otherExpenses = value;
    }

    /**
     * Gets the value of the totalAmountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountPaid() {
        return totalAmountPaid;
    }

    /**
     * Sets the value of the totalAmountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountPaid(BigDecimal value) {
        this.totalAmountPaid = value;
    }

    /**
     * Gets the value of the balanceEquity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceEquity() {
        return balanceEquity;
    }

    /**
     * Sets the value of the balanceEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceEquity(BigDecimal value) {
        this.balanceEquity = value;
    }

    /**
     * Gets the value of the id property.
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
     * Sets the value of the id property.
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
     * Gets the value of the concept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcept() {
        return concept;
    }

    /**
     * Sets the value of the concept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcept(String value) {
        this.concept = value;
    }

    /**
     * Gets the value of the subProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProduct() {
        return subProduct;
    }

    /**
     * Sets the value of the subProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProduct(String value) {
        this.subProduct = value;
    }

    /**
     * Gets the value of the office property.
     * 
     */
    public int getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     */
    public void setOffice(int value) {
        this.office = value;
    }

    /**
     * Gets the value of the calculationCode property.
     * 
     */
    public int getCalculationCode() {
        return calculationCode;
    }

    /**
     * Sets the value of the calculationCode property.
     * 
     */
    public void setCalculationCode(int value) {
        this.calculationCode = value;
    }

    /**
     * Gets the value of the calculationdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationdesc() {
        return calculationdesc;
    }

    /**
     * Sets the value of the calculationdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationdesc(String value) {
        this.calculationdesc = value;
    }

    /**
     * Gets the value of the codeRate property.
     * 
     */
    public int getCodeRate() {
        return codeRate;
    }

    /**
     * Sets the value of the codeRate property.
     * 
     */
    public void setCodeRate(int value) {
        this.codeRate = value;
    }

    /**
     * Gets the value of the descriptionRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionRate() {
        return descriptionRate;
    }

    /**
     * Sets the value of the descriptionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionRate(String value) {
        this.descriptionRate = value;
    }

    /**
     * Gets the value of the initialCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialCost() {
        return initialCost;
    }

    /**
     * Sets the value of the initialCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialCost(BigDecimal value) {
        this.initialCost = value;
    }

    /**
     * Gets the value of the term property.
     * 
     */
    public int getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     */
    public void setTerm(int value) {
        this.term = value;
    }

    /**
     * Gets the value of the balanceDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceDue() {
        return balanceDue;
    }

    /**
     * Sets the value of the balanceDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceDue(BigDecimal value) {
        this.balanceDue = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the systemDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemDate() {
        return systemDate;
    }

    /**
     * Sets the value of the systemDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemDate(XMLGregorianCalendar value) {
        this.systemDate = value;
    }

    /**
     * Gets the value of the cancan property.
     * 
     */
    public int getCancan() {
        return cancan;
    }

    /**
     * Sets the value of the cancan property.
     * 
     */
    public void setCancan(int value) {
        this.cancan = value;
    }

    /**
     * Gets the value of the canon property.
     * 
     */
    public int getCanon() {
        return canon;
    }

    /**
     * Sets the value of the canon property.
     * 
     */
    public void setCanon(int value) {
        this.canon = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the subscriptionCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubscriptionCapital() {
        return subscriptionCapital;
    }

    /**
     * Sets the value of the subscriptionCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubscriptionCapital(BigDecimal value) {
        this.subscriptionCapital = value;
    }

    /**
     * Gets the value of the interestedPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestedPaid() {
        return interestedPaid;
    }

    /**
     * Sets the value of the interestedPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestedPaid(BigDecimal value) {
        this.interestedPaid = value;
    }

    /**
     * Gets the value of the totalCanon property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCanon() {
        return totalCanon;
    }

    /**
     * Sets the value of the totalCanon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCanon(BigDecimal value) {
        this.totalCanon = value;
    }

    /**
     * Gets the value of the valueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValueBalance() {
        return valueBalance;
    }

    /**
     * Sets the value of the valueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValueBalance(BigDecimal value) {
        this.valueBalance = value;
    }

    /**
     * Gets the value of the otherCanon property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherCanon() {
        return otherCanon;
    }

    /**
     * Sets the value of the otherCanon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherCanon(BigDecimal value) {
        this.otherCanon = value;
    }

    /**
     * Gets the value of the valIva property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValIva() {
        return valIva;
    }

    /**
     * Sets the value of the valIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValIva(BigDecimal value) {
        this.valIva = value;
    }

}

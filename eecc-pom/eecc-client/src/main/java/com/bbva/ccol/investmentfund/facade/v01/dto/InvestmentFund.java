
package com.bbva.ccol.investmentfund.facade.v01.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvestmentFund complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentFund">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableBalance" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="balance" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="sharesNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sharesNumberd" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="liquidValue" type="{urn:com:bbva:czic:dto:net}money" minOccurs="0"/>
 *         &lt;element name="parentContract" type="{urn:com:bbva:czic:dto:net}Reference" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:com:bbva:czic:dto:net}InvestmentFundProduct" minOccurs="0"/>
 *         &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com:bbva:czic:dto:net}optionsList" minOccurs="0"/>
 *         &lt;element name="conditions" type="{urn:com:bbva:czic:dto:net}condition" minOccurs="0"/>
 *         &lt;element name="relatedContracts" type="{urn:com:bbva:czic:dto:net}RelatedContract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="oficce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expeditionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="openingOficce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mutualFund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimumTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="withdrawalPenalty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pseudonym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFund", propOrder = {
    "availableBalance",
    "balance",
    "sharesNumber",
    "sharesNumberd",
    "liquidValue",
    "parentContract",
    "product",
    "openingDate",
    "status",
    "conditions",
    "relatedContracts",
    "oficce",
    "expeditionDate",
    "openingOficce",
    "mutualFund",
    "participationType",
    "minimumTerm",
    "withdrawalPenalty",
    "pseudonym",
    "clientName",
    "clientId"
})
public class InvestmentFund {

    protected Money availableBalance;
    protected Money balance;
    protected BigDecimal sharesNumber;
    protected BigDecimal sharesNumberd;
    protected Money liquidValue;
    protected Reference parentContract;
    protected InvestmentFundProduct product;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingDate;
    protected OptionsList status;
    protected Condition conditions;
    @XmlElement(nillable = true)
    protected List<RelatedContract> relatedContracts;
    protected String oficce;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expeditionDate;
    protected String openingOficce;
    protected String mutualFund;
    protected String participationType;
    protected String minimumTerm;
    protected String withdrawalPenalty;
    protected String pseudonym;
    protected String clientName;
    protected String clientId;

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAvailableBalance(Money value) {
        this.availableBalance = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBalance(Money value) {
        this.balance = value;
    }

    /**
     * Gets the value of the sharesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSharesNumber() {
        return sharesNumber;
    }

    /**
     * Sets the value of the sharesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSharesNumber(BigDecimal value) {
        this.sharesNumber = value;
    }

    /**
     * Gets the value of the sharesNumberd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSharesNumberd() {
        return sharesNumberd;
    }

    /**
     * Sets the value of the sharesNumberd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSharesNumberd(BigDecimal value) {
        this.sharesNumberd = value;
    }

    /**
     * Gets the value of the liquidValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLiquidValue() {
        return liquidValue;
    }

    /**
     * Sets the value of the liquidValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLiquidValue(Money value) {
        this.liquidValue = value;
    }

    /**
     * Gets the value of the parentContract property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getParentContract() {
        return parentContract;
    }

    /**
     * Sets the value of the parentContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setParentContract(Reference value) {
        this.parentContract = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundProduct }
     *     
     */
    public InvestmentFundProduct getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundProduct }
     *     
     */
    public void setProduct(InvestmentFundProduct value) {
        this.product = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setStatus(OptionsList value) {
        this.status = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setConditions(Condition value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the relatedContracts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedContracts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedContracts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedContract }
     * 
     * 
     */
    public List<RelatedContract> getRelatedContracts() {
        if (relatedContracts == null) {
            relatedContracts = new ArrayList<RelatedContract>();
        }
        return this.relatedContracts;
    }

    /**
     * Gets the value of the oficce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficce() {
        return oficce;
    }

    /**
     * Sets the value of the oficce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficce(String value) {
        this.oficce = value;
    }

    /**
     * Gets the value of the expeditionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpeditionDate() {
        return expeditionDate;
    }

    /**
     * Sets the value of the expeditionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpeditionDate(XMLGregorianCalendar value) {
        this.expeditionDate = value;
    }

    /**
     * Gets the value of the openingOficce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningOficce() {
        return openingOficce;
    }

    /**
     * Sets the value of the openingOficce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningOficce(String value) {
        this.openingOficce = value;
    }

    /**
     * Gets the value of the mutualFund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMutualFund() {
        return mutualFund;
    }

    /**
     * Sets the value of the mutualFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMutualFund(String value) {
        this.mutualFund = value;
    }

    /**
     * Gets the value of the participationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipationType() {
        return participationType;
    }

    /**
     * Sets the value of the participationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipationType(String value) {
        this.participationType = value;
    }

    /**
     * Gets the value of the minimumTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumTerm() {
        return minimumTerm;
    }

    /**
     * Sets the value of the minimumTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumTerm(String value) {
        this.minimumTerm = value;
    }

    /**
     * Gets the value of the withdrawalPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithdrawalPenalty() {
        return withdrawalPenalty;
    }

    /**
     * Sets the value of the withdrawalPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithdrawalPenalty(String value) {
        this.withdrawalPenalty = value;
    }

    /**
     * Gets the value of the pseudonym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudonym() {
        return pseudonym;
    }

    /**
     * Sets the value of the pseudonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudonym(String value) {
        this.pseudonym = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

}

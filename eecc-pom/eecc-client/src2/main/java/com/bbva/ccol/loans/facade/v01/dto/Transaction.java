
package com.bbva.ccol.loans.facade.v01.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para transaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}relatedContract" minOccurs="0"/>
 *         &lt;element name="localAmount" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="postedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="availableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="transactionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}concept" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}moneyFlow" minOccurs="0"/>
 *         &lt;element name="financingType" type="{urn:com:bbva:ccol:loans:facade:v01:dto}type" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}status" minOccurs="0"/>
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}availableBalance" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}disposedBalance" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}financingPayment" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}branch" minOccurs="0"/>
 *         &lt;element name="paymentsMethod" type="{urn:com:bbva:ccol:loans:facade:v01:dto}paymentsMethod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction", propOrder = {
    "transactionId",
    "relatedContract",
    "localAmount",
    "postedDate",
    "availableDate",
    "transactionTimestamp",
    "name",
    "concept",
    "moneyFlow",
    "financingType",
    "status",
    "checkNumber",
    "availableBalance",
    "disposedBalance",
    "financingPayment",
    "branch",
    "paymentsMethod"
})
public class Transaction {

    protected String transactionId;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected RelatedContract relatedContract;
    protected Money localAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar availableDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTimestamp;
    protected String name;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Concept concept;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected MoneyFlow moneyFlow;
    protected Type financingType;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Status status;
    protected String checkNumber;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected AvailableBalance availableBalance;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected DisposedBalance disposedBalance;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected FinancingPayment financingPayment;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Branch branch;
    @XmlElement(nillable = true)
    protected List<PaymentsMethod> paymentsMethod;

    /**
     * Obtiene el valor de la propiedad transactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedContract.
     * 
     * @return
     *     possible object is
     *     {@link RelatedContract }
     *     
     */
    public RelatedContract getRelatedContract() {
        return relatedContract;
    }

    /**
     * Define el valor de la propiedad relatedContract.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedContract }
     *     
     */
    public void setRelatedContract(RelatedContract value) {
        this.relatedContract = value;
    }

    /**
     * Obtiene el valor de la propiedad localAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLocalAmount() {
        return localAmount;
    }

    /**
     * Define el valor de la propiedad localAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLocalAmount(Money value) {
        this.localAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad postedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedDate() {
        return postedDate;
    }

    /**
     * Define el valor de la propiedad postedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedDate(XMLGregorianCalendar value) {
        this.postedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad availableDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailableDate() {
        return availableDate;
    }

    /**
     * Define el valor de la propiedad availableDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailableDate(XMLGregorianCalendar value) {
        this.availableDate = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionTimestamp() {
        return transactionTimestamp;
    }

    /**
     * Define el valor de la propiedad transactionTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionTimestamp(XMLGregorianCalendar value) {
        this.transactionTimestamp = value;
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
     * Obtiene el valor de la propiedad concept.
     * 
     * @return
     *     possible object is
     *     {@link Concept }
     *     
     */
    public Concept getConcept() {
        return concept;
    }

    /**
     * Define el valor de la propiedad concept.
     * 
     * @param value
     *     allowed object is
     *     {@link Concept }
     *     
     */
    public void setConcept(Concept value) {
        this.concept = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyFlow.
     * 
     * @return
     *     possible object is
     *     {@link MoneyFlow }
     *     
     */
    public MoneyFlow getMoneyFlow() {
        return moneyFlow;
    }

    /**
     * Define el valor de la propiedad moneyFlow.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyFlow }
     *     
     */
    public void setMoneyFlow(MoneyFlow value) {
        this.moneyFlow = value;
    }

    /**
     * Obtiene el valor de la propiedad financingType.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getFinancingType() {
        return financingType;
    }

    /**
     * Define el valor de la propiedad financingType.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setFinancingType(Type value) {
        this.financingType = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad checkNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Define el valor de la propiedad checkNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad availableBalance.
     * 
     * @return
     *     possible object is
     *     {@link AvailableBalance }
     *     
     */
    public AvailableBalance getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Define el valor de la propiedad availableBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableBalance }
     *     
     */
    public void setAvailableBalance(AvailableBalance value) {
        this.availableBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad disposedBalance.
     * 
     * @return
     *     possible object is
     *     {@link DisposedBalance }
     *     
     */
    public DisposedBalance getDisposedBalance() {
        return disposedBalance;
    }

    /**
     * Define el valor de la propiedad disposedBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link DisposedBalance }
     *     
     */
    public void setDisposedBalance(DisposedBalance value) {
        this.disposedBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad financingPayment.
     * 
     * @return
     *     possible object is
     *     {@link FinancingPayment }
     *     
     */
    public FinancingPayment getFinancingPayment() {
        return financingPayment;
    }

    /**
     * Define el valor de la propiedad financingPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingPayment }
     *     
     */
    public void setFinancingPayment(FinancingPayment value) {
        this.financingPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad branch.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Define el valor de la propiedad branch.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
    }

    /**
     * Gets the value of the paymentsMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentsMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentsMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentsMethod }
     * 
     * 
     */
    public List<PaymentsMethod> getPaymentsMethod() {
        if (paymentsMethod == null) {
            paymentsMethod = new ArrayList<PaymentsMethod>();
        }
        return this.paymentsMethod;
    }

}

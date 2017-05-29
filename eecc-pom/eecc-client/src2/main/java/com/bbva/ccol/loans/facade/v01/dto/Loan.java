
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
 * <p>Clase Java para loan complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="loan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanType" type="{urn:com:bbva:ccol:loans:facade:v01:dto}type" minOccurs="0"/>
 *         &lt;element name="loanSubType" type="{urn:com:bbva:ccol:loans:facade:v01:dto}type" minOccurs="0"/>
 *         &lt;element name="approvalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pendingBalance" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}branchOficce" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}purpose" minOccurs="0"/>
 *         &lt;element name="expirationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}status" minOccurs="0"/>
 *         &lt;element name="loanRatings" type="{urn:com:bbva:ccol:loans:facade:v01:dto}loanRating" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pendingAmount" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}loanAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}term" minOccurs="0"/>
 *         &lt;element name="interests" type="{urn:com:bbva:ccol:loans:facade:v01:dto}interest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="delinquentAmount" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="relatedContract" type="{urn:com:bbva:ccol:loans:facade:v01:dto}relatedContract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="participants" type="{urn:com:bbva:ccol:loans:facade:v01:dto}participant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="grantedCredit" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="nextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nextPaymentCapitalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{urn:com:bbva:ccol:loans:facade:v01:dto}type" minOccurs="0"/>
 *         &lt;element name="paymentTotalAmount" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}disbursement" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}promissoryNote" minOccurs="0"/>
 *         &lt;element name="documents" type="{urn:com:bbva:ccol:loans:facade:v01:dto}documents" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="variableInterest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rate" type="{urn:com:bbva:ccol:loans:facade:v01:dto}rate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loan", propOrder = {
    "loanId",
    "number",
    "loanType",
    "loanSubType",
    "approvalDate",
    "pendingBalance",
    "branchOficce",
    "purpose",
    "expirationType",
    "requestDate",
    "openingDate",
    "cancellationDate",
    "status",
    "loanRatings",
    "pendingAmount",
    "loanAmount",
    "term",
    "interests",
    "delinquentAmount",
    "relatedContract",
    "participants",
    "grantedCredit",
    "nextPaymentDate",
    "nextPaymentCapitalDate",
    "paymentType",
    "paymentTotalAmount",
    "disbursement",
    "promissoryNote",
    "documents",
    "variableInterest",
    "rate"
})
public class Loan {

    protected String loanId;
    protected String number;
    protected Type loanType;
    protected Type loanSubType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDate;
    protected Money pendingBalance;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected BranchOficce branchOficce;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Purpose purpose;
    protected String expirationType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Status status;
    @XmlElement(nillable = true)
    protected List<LoanRating> loanRatings;
    protected Money pendingAmount;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected LoanAmount loanAmount;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Term term;
    @XmlElement(nillable = true)
    protected List<Interest> interests;
    protected Money delinquentAmount;
    @XmlElement(nillable = true)
    protected List<RelatedContract> relatedContract;
    @XmlElement(nillable = true)
    protected List<Participant> participants;
    protected Money grantedCredit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPaymentDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPaymentCapitalDate;
    protected Type paymentType;
    protected Money paymentTotalAmount;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Disbursement disbursement;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected PromissoryNote promissoryNote;
    @XmlElement(nillable = true)
    protected List<Documents> documents;
    protected Boolean variableInterest;
    @XmlElement(nillable = true)
    protected List<Rate> rate;

    /**
     * Obtiene el valor de la propiedad loanId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanId() {
        return loanId;
    }

    /**
     * Define el valor de la propiedad loanId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanId(String value) {
        this.loanId = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad loanType.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getLoanType() {
        return loanType;
    }

    /**
     * Define el valor de la propiedad loanType.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setLoanType(Type value) {
        this.loanType = value;
    }

    /**
     * Obtiene el valor de la propiedad loanSubType.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getLoanSubType() {
        return loanSubType;
    }

    /**
     * Define el valor de la propiedad loanSubType.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setLoanSubType(Type value) {
        this.loanSubType = value;
    }

    /**
     * Obtiene el valor de la propiedad approvalDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalDate() {
        return approvalDate;
    }

    /**
     * Define el valor de la propiedad approvalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalDate(XMLGregorianCalendar value) {
        this.approvalDate = value;
    }

    /**
     * Obtiene el valor de la propiedad pendingBalance.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPendingBalance() {
        return pendingBalance;
    }

    /**
     * Define el valor de la propiedad pendingBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPendingBalance(Money value) {
        this.pendingBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad branchOficce.
     * 
     * @return
     *     possible object is
     *     {@link BranchOficce }
     *     
     */
    public BranchOficce getBranchOficce() {
        return branchOficce;
    }

    /**
     * Define el valor de la propiedad branchOficce.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchOficce }
     *     
     */
    public void setBranchOficce(BranchOficce value) {
        this.branchOficce = value;
    }

    /**
     * Obtiene el valor de la propiedad purpose.
     * 
     * @return
     *     possible object is
     *     {@link Purpose }
     *     
     */
    public Purpose getPurpose() {
        return purpose;
    }

    /**
     * Define el valor de la propiedad purpose.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose }
     *     
     */
    public void setPurpose(Purpose value) {
        this.purpose = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationType() {
        return expirationType;
    }

    /**
     * Define el valor de la propiedad expirationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationType(String value) {
        this.expirationType = value;
    }

    /**
     * Obtiene el valor de la propiedad requestDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Define el valor de la propiedad requestDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Obtiene el valor de la propiedad openingDate.
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
     * Define el valor de la propiedad openingDate.
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
     * Obtiene el valor de la propiedad cancellationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Define el valor de la propiedad cancellationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
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
     * Gets the value of the loanRatings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanRatings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanRatings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanRating }
     * 
     * 
     */
    public List<LoanRating> getLoanRatings() {
        if (loanRatings == null) {
            loanRatings = new ArrayList<LoanRating>();
        }
        return this.loanRatings;
    }
    
    
     public void setLoanRatings(List<LoanRating> loanRatings) {
		this.loanRatings = loanRatings;
	}

	/**
     * Obtiene el valor de la propiedad pendingAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPendingAmount() {
        return pendingAmount;
    }

    /**
     * Define el valor de la propiedad pendingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPendingAmount(Money value) {
        this.pendingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad loanAmount.
     * 
     * @return
     *     possible object is
     *     {@link LoanAmount }
     *     
     */
    public LoanAmount getLoanAmount() {
        return loanAmount;
    }

    /**
     * Define el valor de la propiedad loanAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAmount }
     *     
     */
    public void setLoanAmount(LoanAmount value) {
        this.loanAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad term.
     * 
     * @return
     *     possible object is
     *     {@link Term }
     *     
     */
    public Term getTerm() {
        return term;
    }

    /**
     * Define el valor de la propiedad term.
     * 
     * @param value
     *     allowed object is
     *     {@link Term }
     *     
     */
    public void setTerm(Term value) {
        this.term = value;
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
     * {@link Interest }
     * 
     * 
     */
    public List<Interest> getInterests() {
        if (interests == null) {
            interests = new ArrayList<Interest>();
        }
        return this.interests;
    }

    /**
     * Obtiene el valor de la propiedad delinquentAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDelinquentAmount() {
        return delinquentAmount;
    }

    /**
     * Define el valor de la propiedad delinquentAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDelinquentAmount(Money value) {
        this.delinquentAmount = value;
    }

    /**
     * Gets the value of the relatedContract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedContract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedContract }
     * 
     * 
     */
    public List<RelatedContract> getRelatedContract() {
        if (relatedContract == null) {
            relatedContract = new ArrayList<RelatedContract>();
        }
        return this.relatedContract;
    }

    /**
     * Gets the value of the participants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Participant }
     * 
     * 
     */
    public List<Participant> getParticipants() {
        if (participants == null) {
            participants = new ArrayList<Participant>();
        }
        return this.participants;
    }
 	public void setRelatedContract(List<RelatedContract> relatedContract) {
		this.relatedContract = relatedContract;
	}
    /**
     * Obtiene el valor de la propiedad grantedCredit.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getGrantedCredit() {
        return grantedCredit;
    }

    /**
     * Define el valor de la propiedad grantedCredit.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setGrantedCredit(Money value) {
        this.grantedCredit = value;
    }

    /**
     * Obtiene el valor de la propiedad nextPaymentDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPaymentDate() {
        return nextPaymentDate;
    }

    /**
     * Define el valor de la propiedad nextPaymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPaymentDate(XMLGregorianCalendar value) {
        this.nextPaymentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad nextPaymentCapitalDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPaymentCapitalDate() {
        return nextPaymentCapitalDate;
    }

    /**
     * Define el valor de la propiedad nextPaymentCapitalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPaymentCapitalDate(XMLGregorianCalendar value) {
        this.nextPaymentCapitalDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentType.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getPaymentType() {
        return paymentType;
    }

    /**
     * Define el valor de la propiedad paymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setPaymentType(Type value) {
        this.paymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentTotalAmount() {
        return paymentTotalAmount;
    }

    /**
     * Define el valor de la propiedad paymentTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentTotalAmount(Money value) {
        this.paymentTotalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad disbursement.
     * 
     * @return
     *     possible object is
     *     {@link Disbursement }
     *     
     */
    public Disbursement getDisbursement() {
        return disbursement;
    }

    /**
     * Define el valor de la propiedad disbursement.
     * 
     * @param value
     *     allowed object is
     *     {@link Disbursement }
     *     
     */
    public void setDisbursement(Disbursement value) {
        this.disbursement = value;
    }

    /**
     * Obtiene el valor de la propiedad promissoryNote.
     * 
     * @return
     *     possible object is
     *     {@link PromissoryNote }
     *     
     */
    public PromissoryNote getPromissoryNote() {
        return promissoryNote;
    }

    /**
     * Define el valor de la propiedad promissoryNote.
     * 
     * @param value
     *     allowed object is
     *     {@link PromissoryNote }
     *     
     */
    public void setPromissoryNote(PromissoryNote value) {
        this.promissoryNote = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Documents }
     * 
     * 
     */
    public List<Documents> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<Documents>();
        }
        return this.documents;
    }

    
    public void setDocuments(List<Documents> documents) {
		this.documents = documents;
	}

	/**
     * Obtiene el valor de la propiedad variableInterest.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariableInterest() {
        return variableInterest;
    }

    /**
     * Define el valor de la propiedad variableInterest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariableInterest(Boolean value) {
        this.variableInterest = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rate }
     * 
     * 
     */
    public List<Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<Rate>();
        }
        return this.rate;
    }

	public Boolean getVariableInterest() {
		return variableInterest;
	}

	public void setInterests(List<Interest> interests) {
		this.interests = interests;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public void setRate(List<Rate> rate) {
		this.rate = rate;
	}

}

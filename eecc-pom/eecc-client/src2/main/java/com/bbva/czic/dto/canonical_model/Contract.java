
package com.bbva.czic.dto.canonical_model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Contract complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Contract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{urn:com:bbva:czic:dto:canonical_model}country" minOccurs="0"/>
 *         &lt;element name="bank" type="{urn:com:bbva:czic:dto:canonical_model}bank" minOccurs="0"/>
 *         &lt;element name="marketerBank" type="{urn:com:bbva:czic:dto:canonical_model}bank" minOccurs="0"/>
 *         &lt;element name="branch" type="{urn:com:bbva:czic:dto:canonical_model}Branch" minOccurs="0"/>
 *         &lt;element name="formats" type="{urn:com:bbva:czic:dto:canonical_model}contractFormat" minOccurs="0"/>
 *         &lt;element name="parentContract" type="{urn:com:bbva:czic:dto:canonical_model}reference" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:com:bbva:czic:dto:canonical_model}currency" minOccurs="0"/>
 *         &lt;element name="userCustomization" type="{urn:com:bbva:czic:dto:canonical_model}userCustomization" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:com:bbva:czic:dto:canonical_model}Product" minOccurs="0"/>
 *         &lt;element name="signaturesRequiredNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="relatedContracts" type="{urn:com:bbva:czic:dto:canonical_model}RelatedContract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancelationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="jointType" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="documents" type="{urn:com:bbva:czic:dto:canonical_model}document" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{urn:com:bbva:czic:dto:canonical_model}Address" minOccurs="0"/>
 *         &lt;element name="participants" type="{urn:com:bbva:czic:dto:canonical_model}Participant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conditions" type="{urn:com:bbva:czic:dto:canonical_model}Condition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preferredStatementDistributionChannel" type="{urn:com:bbva:czic:dto:canonical_model}preferredStatementDistributionChannel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract", propOrder = {
    "id",
    "country",
    "bank",
    "marketerBank",
    "branch",
    "formats",
    "parentContract",
    "currency",
    "userCustomization",
    "product",
    "signaturesRequiredNumber",
    "openingDate",
    "relatedContracts",
    "cancelationDate",
    "expirationDate",
    "status",
    "jointType",
    "documents",
    "address",
    "participants",
    "conditions",
    "preferredStatementDistributionChannel"
})
@XmlSeeAlso({
    RelatedContract.class
})
public class Contract {

    protected String id;
    protected Country country;
    protected Bank bank;
    protected Bank marketerBank;
    protected Branch branch;
    protected ContractFormat formats;
    protected Reference parentContract;
    protected Currency currency;
    protected UserCustomization userCustomization;
    protected Product product;
    protected BigDecimal signaturesRequiredNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingDate;
    @XmlElement(nillable = true)
    protected List<RelatedContract> relatedContracts;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected OptionsList status;
    protected OptionsList jointType;
    @XmlElement(nillable = true)
    protected List<Document> documents;
    protected Address address;
    @XmlElement(nillable = true)
    protected List<Participant> participants;
    @XmlElement(nillable = true)
    protected List<Condition> conditions;
    protected PreferredStatementDistributionChannel preferredStatementDistributionChannel;

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
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad bank.
     * 
     * @return
     *     possible object is
     *     {@link Bank }
     *     
     */
    public Bank getBank() {
        return bank;
    }

    /**
     * Define el valor de la propiedad bank.
     * 
     * @param value
     *     allowed object is
     *     {@link Bank }
     *     
     */
    public void setBank(Bank value) {
        this.bank = value;
    }

    /**
     * Obtiene el valor de la propiedad marketerBank.
     * 
     * @return
     *     possible object is
     *     {@link Bank }
     *     
     */
    public Bank getMarketerBank() {
        return marketerBank;
    }

    /**
     * Define el valor de la propiedad marketerBank.
     * 
     * @param value
     *     allowed object is
     *     {@link Bank }
     *     
     */
    public void setMarketerBank(Bank value) {
        this.marketerBank = value;
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
     * Obtiene el valor de la propiedad formats.
     * 
     * @return
     *     possible object is
     *     {@link ContractFormat }
     *     
     */
    public ContractFormat getFormats() {
        return formats;
    }

    /**
     * Define el valor de la propiedad formats.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractFormat }
     *     
     */
    public void setFormats(ContractFormat value) {
        this.formats = value;
    }

    /**
     * Obtiene el valor de la propiedad parentContract.
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
     * Define el valor de la propiedad parentContract.
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
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad userCustomization.
     * 
     * @return
     *     possible object is
     *     {@link UserCustomization }
     *     
     */
    public UserCustomization getUserCustomization() {
        return userCustomization;
    }

    /**
     * Define el valor de la propiedad userCustomization.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCustomization }
     *     
     */
    public void setUserCustomization(UserCustomization value) {
        this.userCustomization = value;
    }

    /**
     * Obtiene el valor de la propiedad product.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Define el valor de la propiedad product.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Obtiene el valor de la propiedad signaturesRequiredNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSignaturesRequiredNumber() {
        return signaturesRequiredNumber;
    }

    /**
     * Define el valor de la propiedad signaturesRequiredNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSignaturesRequiredNumber(BigDecimal value) {
        this.signaturesRequiredNumber = value;
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
     * Obtiene el valor de la propiedad cancelationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelationDate() {
        return cancelationDate;
    }

    /**
     * Define el valor de la propiedad cancelationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelationDate(XMLGregorianCalendar value) {
        this.cancelationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
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
     * Define el valor de la propiedad expirationDate.
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
     * Obtiene el valor de la propiedad status.
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
     * Define el valor de la propiedad status.
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
     * Obtiene el valor de la propiedad jointType.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getJointType() {
        return jointType;
    }

    /**
     * Define el valor de la propiedad jointType.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setJointType(OptionsList value) {
        this.jointType = value;
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
     * {@link Document }
     * 
     * 
     */
    public List<Document> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<Document>();
        }
        return this.documents;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
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
     * Obtiene el valor de la propiedad preferredStatementDistributionChannel.
     * 
     * @return
     *     possible object is
     *     {@link PreferredStatementDistributionChannel }
     *     
     */
    public PreferredStatementDistributionChannel getPreferredStatementDistributionChannel() {
        return preferredStatementDistributionChannel;
    }

    /**
     * Define el valor de la propiedad preferredStatementDistributionChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredStatementDistributionChannel }
     *     
     */
    public void setPreferredStatementDistributionChannel(PreferredStatementDistributionChannel value) {
        this.preferredStatementDistributionChannel = value;
    }

}

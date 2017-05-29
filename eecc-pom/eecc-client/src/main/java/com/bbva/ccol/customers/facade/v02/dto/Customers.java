
package com.bbva.ccol.customers.facade.v02.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;



/**
 * <p>Clase Java para customers complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="customers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerInformation" type="{bbva:czic:customers:facade:v02:dto}partnerInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nationalities" type="{urn:com:bbva:czic:customers:facade:v02:dto}nationalities" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasPassesAway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityDocuments" type="{urn:com:bbva:czic:customers:facade:v02:dto}identityDocuments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberPersonAssociated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalAddresses" type="{urn:com:bbva:czic:customers:facade:v02:dto}legalAddresses" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactDetails" type="{urn:com:bbva:czic:customers:facade:v02:dto}contactDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bankingRelationship" type="{urn:com:bbva:czic:customers:facade:v02:dto}bankingRelationship" minOccurs="0"/>
 *         &lt;element name="levelStudy" type="{urn:com:bbva:czic:customers:facade:v02:dto}levelStudy" minOccurs="0"/>
 *         &lt;element name="livingPlace" type="{urn:com:bbva:czic:customers:facade:v02:dto}livingPlace" minOccurs="0"/>
 *         &lt;element name="employmentInformation" type="{urn:com:bbva:czic:customers:facade:v02:dto}employmentInformation" minOccurs="0"/>
 *         &lt;element name="indicators" type="{urn:com:bbva:czic:customers:facade:v02:dto}indicator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isPublicPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customers", propOrder = {
    "customerId",
    "firstName",
    "lastName",
    "birthDate",
    "maritalStatus",
    "gender",
    "partnerInformation",
    "nationalities",
    "hasPassesAway",
    "identityDocuments",
    "numberPersonAssociated",
    "legalAddresses",
    "contactDetails",
    "bankingRelationship",
    "levelStudy",
    "livingPlace",
    "employmentInformation",
    "indicators",
    "isPublicPerson"
})
public class Customers {

    protected String customerId;
    protected String firstName;
    protected String lastName;
    @XmlSchemaType(name = "dateTime")
    protected String birthDate;
    protected String maritalStatus;
    protected String gender;
    @XmlElement(nillable = true)
    protected List<PartnerInformation> partnerInformation;
    @XmlElement(nillable = true)
    protected List<Nationalities> nationalities;
    protected String hasPassesAway;
    @XmlElement(nillable = true)
    protected List<IdentityDocuments> identityDocuments;
    protected String numberPersonAssociated;
    @XmlElement(nillable = true)
    protected List<LegalAddresses> legalAddresses;
    @XmlElement(nillable = true)
    protected List<ContactDetail> contactDetails;
    protected BankingRelationship bankingRelationship;
    protected LevelStudy levelStudy;
    protected LivingPlace livingPlace;
    protected EmploymentInformation employmentInformation;
    @XmlElement(nillable = true)
    protected List<Indicator> indicators;
    protected String isPublicPerson;

    /**
     * Obtiene el valor de la propiedad customerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Define el valor de la propiedad birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Obtiene el valor de la propiedad maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Define el valor de la propiedad maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the partnerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerInformation }
     * 
     * 
     */
    public List<PartnerInformation> getPartnerInformation() {
        if (partnerInformation == null) {
            partnerInformation = new ArrayList<PartnerInformation>();
        }
        return this.partnerInformation;
    }

    /**
     * Gets the value of the nationalities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nationalities }
     * 
     * 
     */
    public List<Nationalities> getNationalities() {
        if (nationalities == null) {
            nationalities = new ArrayList<Nationalities>();
        }
        return this.nationalities;
    }

    /**
     * Obtiene el valor de la propiedad hasPassesAway.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasPassesAway() {
        return hasPassesAway;
    }

    /**
     * Define el valor de la propiedad hasPassesAway.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasPassesAway(String value) {
        this.hasPassesAway = value;
    }

    /**
     * Gets the value of the identityDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityDocuments }
     * 
     * 
     */
    public List<IdentityDocuments> getIdentityDocuments() {
        if (identityDocuments == null) {
            identityDocuments = new ArrayList<IdentityDocuments>();
        }
        return this.identityDocuments;
    }

    /**
     * Obtiene el valor de la propiedad numberPersonAssociated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPersonAssociated() {
        return numberPersonAssociated;
    }

    /**
     * Define el valor de la propiedad numberPersonAssociated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPersonAssociated(String value) {
        this.numberPersonAssociated = value;
    }

    /**
     * Gets the value of the legalAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalAddresses }
     * 
     * 
     */
    public List<LegalAddresses> getLegalAddresses() {
        if (legalAddresses == null) {
            legalAddresses = new ArrayList<LegalAddresses>();
        }
        return this.legalAddresses;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetail }
     * 
     * 
     */
    public List<ContactDetail> getContactDetails() {
        if (contactDetails == null) {
            contactDetails = new ArrayList<ContactDetail>();
        }
        return this.contactDetails;
    }

    /**
     * Obtiene el valor de la propiedad bankingRelationship.
     * 
     * @return
     *     possible object is
     *     {@link BankingRelationship }
     *     
     */
    public BankingRelationship getBankingRelationship() {
        return bankingRelationship;
    }

    /**
     * Define el valor de la propiedad bankingRelationship.
     * 
     * @param value
     *     allowed object is
     *     {@link BankingRelationship }
     *     
     */
    public void setBankingRelationship(BankingRelationship value) {
        this.bankingRelationship = value;
    }

    /**
     * Obtiene el valor de la propiedad levelStudy.
     * 
     * @return
     *     possible object is
     *     {@link LevelStudy }
     *     
     */
    public LevelStudy getLevelStudy() {
        return levelStudy;
    }

    /**
     * Define el valor de la propiedad levelStudy.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelStudy }
     *     
     */
    public void setLevelStudy(LevelStudy value) {
        this.levelStudy = value;
    }

    /**
     * Obtiene el valor de la propiedad livingPlace.
     * 
     * @return
     *     possible object is
     *     {@link LivingPlace }
     *     
     */
    public LivingPlace getLivingPlace() {
        return livingPlace;
    }

    /**
     * Define el valor de la propiedad livingPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link LivingPlace }
     *     
     */
    public void setLivingPlace(LivingPlace value) {
        this.livingPlace = value;
    }

    /**
     * Obtiene el valor de la propiedad employmentInformation.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentInformation }
     *     
     */
    public EmploymentInformation getEmploymentInformation() {
        return employmentInformation;
    }

    /**
     * Define el valor de la propiedad employmentInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentInformation }
     *     
     */
    public void setEmploymentInformation(EmploymentInformation value) {
        this.employmentInformation = value;
    }

    /**
     * Gets the value of the indicators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Indicator }
     * 
     * 
     */
    public List<Indicator> getIndicators() {
      /*  if (indicators == null) {
            indicators = new ArrayList<Indicator>();
        }*/
        return this.indicators;
    }

    /**
     * Obtiene el valor de la propiedad isPublicPerson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPublicPerson() {
        return isPublicPerson;
    }

    /**
     * Define el valor de la propiedad isPublicPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPublicPerson(String value) {
        this.isPublicPerson = value;
    }

}

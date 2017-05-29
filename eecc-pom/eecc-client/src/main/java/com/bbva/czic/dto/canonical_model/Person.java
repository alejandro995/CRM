
package com.bbva.czic.dto.canonical_model;

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
 * <p>Clase Java para Person complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identityDocument" type="{urn:com:bbva:czic:dto:canonical_model}identityDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mothersLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="stablishmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="hasPassedAway" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="legalAddress" type="{urn:com:bbva:czic:dto:canonical_model}Address" minOccurs="0"/>
 *         &lt;element name="addresses" type="{urn:com:bbva:czic:dto:canonical_model}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nationality" type="{urn:com:bbva:czic:dto:canonical_model}country" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactsInformation" type="{urn:com:bbva:czic:dto:canonical_model}contactInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="economicData" type="{urn:com:bbva:czic:dto:canonical_model}economicData" minOccurs="0"/>
 *         &lt;element name="sources" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="companyInformation" type="{urn:com:bbva:czic:dto:canonical_model}companyInformation" minOccurs="0"/>
 *         &lt;element name="classification" type="{urn:com:bbva:czic:dto:canonical_model}classification" minOccurs="0"/>
 *         &lt;element name="managementData" type="{urn:com:bbva:czic:dto:canonical_model}personManagementData" minOccurs="0"/>
 *         &lt;element name="extendedData" type="{urn:com:bbva:czic:dto:canonical_model}personExtendedData" minOccurs="0"/>
 *         &lt;element name="image" type="{urn:com:bbva:czic:dto:canonical_model}document" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{urn:com:bbva:czic:dto:canonical_model}reference" minOccurs="0"/>
 *         &lt;element name="legalRepresentatives" type="{urn:com:bbva:czic:dto:canonical_model}Person" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bank" type="{urn:com:bbva:czic:dto:canonical_model}reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "identityDocument",
    "id",
    "type",
    "name",
    "lastName",
    "mothersLastName",
    "birthDate",
    "stablishmentDate",
    "hasPassedAway",
    "isCustomer",
    "legalAddress",
    "addresses",
    "nationality",
    "contactsInformation",
    "economicData",
    "sources",
    "companyInformation",
    "classification",
    "managementData",
    "extendedData",
    "image",
    "reference",
    "country",
    "legalRepresentatives",
    "bank"
})
@XmlSeeAlso({
    ThirdParty.class,
    Participant.class
})
public class Person {

    @XmlElement(nillable = true)
    protected List<IdentityDocument> identityDocument;
    protected String id;
    protected OptionsList type;
    protected String name;
    protected String lastName;
    protected String mothersLastName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stablishmentDate;
    protected Boolean hasPassedAway;
    protected Boolean isCustomer;
    protected Address legalAddress;
    @XmlElement(nillable = true)
    protected List<Address> addresses;
    @XmlElement(nillable = true)
    protected List<Country> nationality;
    @XmlElement(nillable = true)
    protected List<ContactInformation> contactsInformation;
    protected EconomicData economicData;
    @XmlElement(nillable = true)
    protected List<OptionsList> sources;
    protected CompanyInformation companyInformation;
    protected Classification classification;
    protected PersonManagementData managementData;
    protected PersonExtendedData extendedData;
    protected Document image;
    protected String reference;
    protected Reference country;
    @XmlElement(nillable = true)
    protected List<Person> legalRepresentatives;
    protected Reference bank;
	
    public List<ContactInformation> getContactsInformation() {
		return contactsInformation;
	}
	public void setContactsInformation(List<ContactInformation> contactsInformation) {
		this.contactsInformation = contactsInformation;
	}

    

}

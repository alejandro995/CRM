
package com.bbva.ccol.warranty.facade.v01.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * <p>Java class for warranty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="warranty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="warrantyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://warranty}warrantyType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://warranty}value" minOccurs="0"/>
 *         &lt;element name="registryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expeditionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="warrantyPlace" type="{http://warranty}warrantyPlace" minOccurs="0"/>
 *         &lt;element name="insuranceType" type="{http://warranty}insuranceType" minOccurs="0"/>
 *         &lt;element name="features" type="{http://warranty}features" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appraisal" type="{http://warranty}appraisal" minOccurs="0"/>
 *         &lt;element name="documents" type="{http://warranty}documents" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="associatedNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicle" type="{http://warranty}vehicle" minOccurs="0"/>
 *         &lt;element name="property" type="{http://warranty}property" minOccurs="0"/>
 *         &lt;element name="promissoryNote" type="{http://warranty}promissoryNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loan" type="{http://warranty}loan" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "warranty", propOrder = {
    "warrantyId",
    "type",
    "value",
    "registryDate",
    "expeditionDate",
    "expirationDate",
    "warrantyPlace",
    "insuranceType",
    "features",
    "appraisal",
    "documents",
    "code",
    "associatedNumber",
    "relatedContract",
    "description",
    "vehicle",
    "property",
    "promissoryNote",
    "loan"
})
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Warranty {

    protected String warrantyId;
    protected WarrantyType warrantyType;
    protected Value value;
    protected String registryDate;
    protected String expeditionDate;
    protected String expirationDate;
    protected WarrantyPlace warrantyPlace;
    protected InsuranceType insuranceType;
    protected List<Features> features;
    protected Appraisal appraisal;
    protected List<Documents> documents;
    protected String code;
    protected String associatedNumber;
    protected String relatedContract;
    protected String description;
    protected Vehicle vehicle;
    protected Property property;
    protected List<PromissoryNote> promissoryNote;
    protected Loan loan;

    /**
     * Gets the value of the warrantyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyId() {
        return warrantyId;
    }

    /**
     * Sets the value of the warrantyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyId(String value) {
        this.warrantyId = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyType }
     *     
     */
    public WarrantyType getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyType }
     *     
     */
    public void setWarrantyType(WarrantyType value) {
        this.warrantyType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
	 * @return the registryDate
	 */
	public String getRegistryDate() {
		return registryDate;
	}

	/**
	 * @param registryDate the registryDate to set
	 */
	public void setRegistryDate(String registryDate) {
		this.registryDate = registryDate;
	}

	/**
	 * @return the expeditionDate
	 */
	public String getExpeditionDate() {
		return expeditionDate;
	}

	/**
	 * @param expeditionDate the expeditionDate to set
	 */
	public void setExpeditionDate(String expeditionDate) {
		this.expeditionDate = expeditionDate;
	}

	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
     * Gets the value of the warrantyPlace property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyPlace }
     *     
     */
    public WarrantyPlace getWarrantyPlace() {
        return warrantyPlace;
    }

    /**
     * Sets the value of the warrantyPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyPlace }
     *     
     */
    public void setWarrantyPlace(WarrantyPlace value) {
        this.warrantyPlace = value;
    }

    /**
     * Gets the value of the insuranceType property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceType }
     *     
     */
    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    /**
     * Sets the value of the insuranceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceType }
     *     
     */
    public void setInsuranceType(InsuranceType value) {
        this.insuranceType = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Features }
     * 
     * 
     */
    public List<Features> getFeatures() {
        if (features == null) {
            features = new ArrayList<Features>();
        }
        return this.features;
    }

    /**
     * Gets the value of the appraisal property.
     * 
     * @return
     *     possible object is
     *     {@link Appraisal }
     *     
     */
    public Appraisal getAppraisal() {
        return appraisal;
    }

    /**
     * Sets the value of the appraisal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appraisal }
     *     
     */
    public void setAppraisal(Appraisal value) {
        this.appraisal = value;
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

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the associatedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedNumber() {
        return associatedNumber;
    }

    /**
     * Sets the value of the associatedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedNumber(String value) {
        this.associatedNumber = value;
    }

    /**
     * Gets the value of the relatedContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedContract() {
        return relatedContract;
    }

    /**
     * Sets the value of the relatedContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedContract(String value) {
        this.relatedContract = value;
    }

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
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link Property }
     *     
     */
    public Property getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link Property }
     *     
     */
    public void setProperty(Property value) {
        this.property = value;
    }

    /**
     * Gets the value of the promissoryNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promissoryNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromissoryNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromissoryNote }
     * 
     * 
     */
    public List<PromissoryNote> getPromissoryNote() {
        if (promissoryNote == null) {
            promissoryNote = new ArrayList<PromissoryNote>();
        }
        return this.promissoryNote;
    }

    /**
     * Gets the value of the loan property.
     * 
     * @return
     *     possible object is
     *     {@link Loan }
     *     
     */
    public Loan getLoan() {
        return loan;
    }

    /**
     * Sets the value of the loan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loan }
     *     
     */
    public void setLoan(Loan value) {
        this.loan = value;
    }

}

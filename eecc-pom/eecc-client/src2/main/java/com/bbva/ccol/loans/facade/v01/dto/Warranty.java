
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
 * <p>Clase Java para warranty complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="warranty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="warrantyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}warrantyType" minOccurs="0"/>
 *         &lt;element name="value" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="registryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expeditionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}warrantyPlace" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}insuranceType" minOccurs="0"/>
 *         &lt;element name="features" type="{urn:com:bbva:ccol:loans:facade:v01:dto}features" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}appraisal" minOccurs="0"/>
 *         &lt;element name="documents" type="{urn:com:bbva:ccol:loans:facade:v01:dto}documents" maxOccurs="unbounded" minOccurs="0"/>
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
    "name",
    "warrantyType",
    "value",
    "registryDate",
    "expeditionDate",
    "expirationDate",
    "warrantyPlace",
    "insuranceType",
    "features",
    "appraisal",
    "documents"
})
public class Warranty {

    protected String warrantyId;
    protected String name;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected WarrantyType warrantyType;
    protected Money value;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registryDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expeditionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected WarrantyPlace warrantyPlace;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected InsuranceType insuranceType;
    @XmlElement(nillable = true)
    protected List<Features> features;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Appraisal appraisal;
    @XmlElement(nillable = true)
    protected List<Documents> documents;

    /**
     * Obtiene el valor de la propiedad warrantyId.
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
     * Define el valor de la propiedad warrantyId.
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
     * Obtiene el valor de la propiedad warrantyType.
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
     * Define el valor de la propiedad warrantyType.
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
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setValue(Money value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad registryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistryDate() {
        return registryDate;
    }

    /**
     * Define el valor de la propiedad registryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistryDate(XMLGregorianCalendar value) {
        this.registryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expeditionDate.
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
     * Define el valor de la propiedad expeditionDate.
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
     * Obtiene el valor de la propiedad warrantyPlace.
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
     * Define el valor de la propiedad warrantyPlace.
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
     * Obtiene el valor de la propiedad insuranceType.
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
     * Define el valor de la propiedad insuranceType.
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
     * Obtiene el valor de la propiedad appraisal.
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
     * Define el valor de la propiedad appraisal.
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

}

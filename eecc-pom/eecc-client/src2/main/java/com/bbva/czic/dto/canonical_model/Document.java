
package com.bbva.czic.dto.canonical_model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taxonomy" type="{urn:com:bbva:czic:dto:canonical_model}documentTaxonomy" minOccurs="0"/>
 *         &lt;element name="classificationYears" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="security" type="{urn:com:bbva:czic:dto:canonical_model}documentSecurity" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="substatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ocr" type="{urn:com:bbva:czic:dto:canonical_model}documentOcr" minOccurs="0"/>
 *         &lt;element name="deletable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="draft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="inceptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="file" type="{urn:com:bbva:czic:dto:canonical_model}documentFile" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="technicalData" type="{urn:com:bbva:czic:dto:canonical_model}documentTechnicalData" minOccurs="0"/>
 *         &lt;element name="operationCharacteristics" type="{urn:com:bbva:czic:dto:canonical_model}documentOperationCharacteristics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "document", propOrder = {
    "id",
    "createdDate",
    "taxonomy",
    "classificationYears",
    "security",
    "status",
    "substatus",
    "masterId",
    "ocr",
    "deletable",
    "draft",
    "confidential",
    "expirationDate",
    "inceptionDate",
    "location",
    "name",
    "file",
    "comments",
    "technicalData",
    "operationCharacteristics"
})
public class Document {

    protected String id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected DocumentTaxonomy taxonomy;
    protected BigDecimal classificationYears;
    protected DocumentSecurity security;
    protected OptionsList status;
    protected String substatus;
    protected String masterId;
    protected DocumentOcr ocr;
    protected String deletable;
    protected String draft;
    protected String confidential;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inceptionDate;
    protected String location;
    protected String name;
    protected DocumentFile file;
    protected String comments;
    protected DocumentTechnicalData technicalData;
    protected DocumentOperationCharacteristics operationCharacteristics;

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
     * Obtiene el valor de la propiedad createdDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Define el valor de la propiedad createdDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Obtiene el valor de la propiedad taxonomy.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTaxonomy }
     *     
     */
    public DocumentTaxonomy getTaxonomy() {
        return taxonomy;
    }

    /**
     * Define el valor de la propiedad taxonomy.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTaxonomy }
     *     
     */
    public void setTaxonomy(DocumentTaxonomy value) {
        this.taxonomy = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationYears.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClassificationYears() {
        return classificationYears;
    }

    /**
     * Define el valor de la propiedad classificationYears.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClassificationYears(BigDecimal value) {
        this.classificationYears = value;
    }

    /**
     * Obtiene el valor de la propiedad security.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSecurity }
     *     
     */
    public DocumentSecurity getSecurity() {
        return security;
    }

    /**
     * Define el valor de la propiedad security.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSecurity }
     *     
     */
    public void setSecurity(DocumentSecurity value) {
        this.security = value;
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
     * Obtiene el valor de la propiedad substatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstatus() {
        return substatus;
    }

    /**
     * Define el valor de la propiedad substatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstatus(String value) {
        this.substatus = value;
    }

    /**
     * Obtiene el valor de la propiedad masterId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterId() {
        return masterId;
    }

    /**
     * Define el valor de la propiedad masterId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterId(String value) {
        this.masterId = value;
    }

    /**
     * Obtiene el valor de la propiedad ocr.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOcr }
     *     
     */
    public DocumentOcr getOcr() {
        return ocr;
    }

    /**
     * Define el valor de la propiedad ocr.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOcr }
     *     
     */
    public void setOcr(DocumentOcr value) {
        this.ocr = value;
    }

    /**
     * Obtiene el valor de la propiedad deletable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletable() {
        return deletable;
    }

    /**
     * Define el valor de la propiedad deletable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletable(String value) {
        this.deletable = value;
    }

    /**
     * Obtiene el valor de la propiedad draft.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraft() {
        return draft;
    }

    /**
     * Define el valor de la propiedad draft.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraft(String value) {
        this.draft = value;
    }

    /**
     * Obtiene el valor de la propiedad confidential.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidential() {
        return confidential;
    }

    /**
     * Define el valor de la propiedad confidential.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidential(String value) {
        this.confidential = value;
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
     * Obtiene el valor de la propiedad inceptionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInceptionDate() {
        return inceptionDate;
    }

    /**
     * Define el valor de la propiedad inceptionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInceptionDate(XMLGregorianCalendar value) {
        this.inceptionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
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
     * Obtiene el valor de la propiedad file.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFile }
     *     
     */
    public DocumentFile getFile() {
        return file;
    }

    /**
     * Define el valor de la propiedad file.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFile }
     *     
     */
    public void setFile(DocumentFile value) {
        this.file = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad technicalData.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTechnicalData }
     *     
     */
    public DocumentTechnicalData getTechnicalData() {
        return technicalData;
    }

    /**
     * Define el valor de la propiedad technicalData.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTechnicalData }
     *     
     */
    public void setTechnicalData(DocumentTechnicalData value) {
        this.technicalData = value;
    }

    /**
     * Obtiene el valor de la propiedad operationCharacteristics.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOperationCharacteristics }
     *     
     */
    public DocumentOperationCharacteristics getOperationCharacteristics() {
        return operationCharacteristics;
    }

    /**
     * Define el valor de la propiedad operationCharacteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOperationCharacteristics }
     *     
     */
    public void setOperationCharacteristics(DocumentOperationCharacteristics value) {
        this.operationCharacteristics = value;
    }

}

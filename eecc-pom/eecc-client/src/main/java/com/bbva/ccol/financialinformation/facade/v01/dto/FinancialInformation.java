
package com.bbva.ccol.financialinformation.facade.v01.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para financialInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="financialInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}product" minOccurs="0"/>
 *         &lt;element name="typeProduct" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}type" minOccurs="0"/>
 *         &lt;element name="participants" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}participants" minOccurs="0"/>
 *         &lt;element name="indicators" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}indicators" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="balance" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}balance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="risk" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}risk" minOccurs="0"/>
 *         &lt;element name="importDebt" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="relatedContracts" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}relatedContract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financialInformation", propOrder = {
    "documentId",
    "documentType",
    "financialId",
    "product",
    "typeProduct",
    "participants",
    "indicators",
    "balance",
    "expirationDate",
    "requestDate",
    "risk",
    "importDebt",
    "relatedContracts",
    "status"
})
public class FinancialInformation {

    protected String documentId;
    protected String documentType;
    protected String financialId;
    protected Product product;
    protected Type typeProduct;
    protected Participants participants;
    @XmlElement(nillable = true)
    protected List<Indicators> indicators;
    @XmlElement(nillable = true)
    protected List<Balance> balance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    protected Risk risk;
    protected Money importDebt;
    @XmlElement(nillable = true)
    protected List<RelatedContract> relatedContracts;
    protected Status status;

    /**
     * Obtiene el valor de la propiedad documentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Define el valor de la propiedad documentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad financialId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialId() {
        return financialId;
    }

    /**
     * Define el valor de la propiedad financialId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialId(String value) {
        this.financialId = value;
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
     * Obtiene el valor de la propiedad typeProduct.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getTypeProduct() {
        return typeProduct;
    }

    /**
     * Define el valor de la propiedad typeProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setTypeProduct(Type value) {
        this.typeProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad participants.
     * 
     * @return
     *     possible object is
     *     {@link Participants }
     *     
     */
    public Participants getParticipants() {
        return participants;
    }

    /**
     * Define el valor de la propiedad participants.
     * 
     * @param value
     *     allowed object is
     *     {@link Participants }
     *     
     */
    public void setParticipants(Participants value) {
        this.participants = value;
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
     * {@link Indicators }
     * 
     * 
     */
    public List<Indicators> getIndicators() {
        if (indicators == null) {
            indicators = new ArrayList<Indicators>();
        }
        return this.indicators;
    }

    /**
     * Gets the value of the balance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Balance }
     * 
     * 
     */
    public List<Balance> getBalance() {
        if (balance == null) {
            balance = new ArrayList<Balance>();
        }
        return this.balance;
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
     * Obtiene el valor de la propiedad risk.
     * 
     * @return
     *     possible object is
     *     {@link Risk }
     *     
     */
    public Risk getRisk() {
        return risk;
    }

    /**
     * Define el valor de la propiedad risk.
     * 
     * @param value
     *     allowed object is
     *     {@link Risk }
     *     
     */
    public void setRisk(Risk value) {
        this.risk = value;
    }

    /**
     * Obtiene el valor de la propiedad importDebt.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getImportDebt() {
        return importDebt;
    }

    /**
     * Define el valor de la propiedad importDebt.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setImportDebt(Money value) {
        this.importDebt = value;
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

}

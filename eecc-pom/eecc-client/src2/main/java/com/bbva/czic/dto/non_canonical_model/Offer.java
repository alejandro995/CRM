
package com.bbva.czic.dto.non_canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bbva.czic.dto.canonical_model.Condition;
import com.bbva.czic.dto.canonical_model.Money;
import com.bbva.czic.dto.canonical_model.OptionsList;
import com.bbva.czic.dto.canonical_model.Product;
import com.bbva.czic.dto.canonical_model.RelatedContract;


/**
 * <p>Clase Java para offer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="offer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operation" type="{urn:com:bbva:czic:dto:non_canonical_model}operation" minOccurs="0"/>
 *         &lt;element name="amount" type="{urn:com:bbva:czic:dto:canonical_model}money" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="typeOffer" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="condition" type="{urn:com:bbva:czic:dto:canonical_model}Condition" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:com:bbva:czic:dto:canonical_model}Product" minOccurs="0"/>
 *         &lt;element name="acceptationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="acceptationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedContract" type="{urn:com:bbva:czic:dto:canonical_model}RelatedContract" minOccurs="0"/>
 *         &lt;element name="scheme" type="{urn:com:bbva:czic:dto:non_canonical_model}SchemeAgreement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offer", propOrder = {
    "name",
    "operation",
    "amount",
    "startDate",
    "endDate",
    "status",
    "typeOffer",
    "condition",
    "id",
    "product",
    "acceptationDate",
    "acceptationTime",
    "relatedContract",
    "scheme"
})
public class Offer {

    protected String name;
    protected Operation operation;
    protected Money amount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected OptionsList status;
    protected OptionsList typeOffer;
    protected Condition condition;
    protected String id;
    protected Product product;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptationDate;
    protected String acceptationTime;
    protected RelatedContract relatedContract;
    protected SchemeAgreement scheme;

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
     * Obtiene el valor de la propiedad operation.
     * 
     * @return
     *     possible object is
     *     {@link Operation }
     *     
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Define el valor de la propiedad operation.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation }
     *     
     */
    public void setOperation(Operation value) {
        this.operation = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Obtiene el valor de la propiedad typeOffer.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getTypeOffer() {
        return typeOffer;
    }

    /**
     * Define el valor de la propiedad typeOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setTypeOffer(OptionsList value) {
        this.typeOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad condition.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Define el valor de la propiedad condition.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setCondition(Condition value) {
        this.condition = value;
    }

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
     * Obtiene el valor de la propiedad acceptationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptationDate() {
        return acceptationDate;
    }

    /**
     * Define el valor de la propiedad acceptationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptationDate(XMLGregorianCalendar value) {
        this.acceptationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad acceptationTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptationTime() {
        return acceptationTime;
    }

    /**
     * Define el valor de la propiedad acceptationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptationTime(String value) {
        this.acceptationTime = value;
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
     * Obtiene el valor de la propiedad scheme.
     * 
     * @return
     *     possible object is
     *     {@link SchemeAgreement }
     *     
     */
    public SchemeAgreement getScheme() {
        return scheme;
    }

    /**
     * Define el valor de la propiedad scheme.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeAgreement }
     *     
     */
    public void setScheme(SchemeAgreement value) {
        this.scheme = value;
    }

}

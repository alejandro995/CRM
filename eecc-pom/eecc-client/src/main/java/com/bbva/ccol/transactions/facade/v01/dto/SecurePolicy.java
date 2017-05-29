
package com.bbva.ccol.transactions.facade.v01.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para securePolicy complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="securePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expiringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="renovationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branch" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}branch" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}status" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}type" minOccurs="0"/>
 *         &lt;element name="term" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}term" minOccurs="0"/>
 *         &lt;element name="money" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="DiscountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="relatedContract" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}relatedContract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="participants" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}participants" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="secureAttributes" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}secureAttributes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fees" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}fee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securePolicy", propOrder = {
    "requestNumber",
    "creationDate",
    "startingDate",
    "expiringDate",
    "renovationDate",
    "city",
    "geoZone",
    "branch",
    "status",
    "type",
    "term",
    "money",
    "discountIndicator",
    "relatedContract",
    "participants",
    "secureAttributes",
    "fees"
})
public class SecurePolicy {

    protected String requestNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiringDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar renovationDate;
    protected String city;
    protected String geoZone;
    protected Branch branch;
    protected Status status;
    protected Type type;
    protected Term term;
    protected Money money;
    @XmlElement(name = "DiscountIndicator")
    protected boolean discountIndicator;
    @XmlElement(nillable = true)
    protected List<RelatedContract> relatedContract;
    @XmlElement(nillable = true)
    protected List<Participants> participants;
    @XmlElement(nillable = true)
    protected List<SecureAttributes> secureAttributes;
    @XmlElement(nillable = true)
    protected List<Fee> fees;

    /**
     * Obtiene el valor de la propiedad requestNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestNumber() {
        return requestNumber;
    }

    /**
     * Define el valor de la propiedad requestNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestNumber(String value) {
        this.requestNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad startingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartingDate() {
        return startingDate;
    }

    /**
     * Define el valor de la propiedad startingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartingDate(XMLGregorianCalendar value) {
        this.startingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expiringDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiringDate() {
        return expiringDate;
    }

    /**
     * Define el valor de la propiedad expiringDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiringDate(XMLGregorianCalendar value) {
        this.expiringDate = value;
    }

    /**
     * Obtiene el valor de la propiedad renovationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRenovationDate() {
        return renovationDate;
    }

    /**
     * Define el valor de la propiedad renovationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRenovationDate(XMLGregorianCalendar value) {
        this.renovationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad geoZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoZone() {
        return geoZone;
    }

    /**
     * Define el valor de la propiedad geoZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoZone(String value) {
        this.geoZone = value;
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
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
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
     * Obtiene el valor de la propiedad money.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMoney() {
        return money;
    }

    /**
     * Define el valor de la propiedad money.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMoney(Money value) {
        this.money = value;
    }

    /**
     * Obtiene el valor de la propiedad discountIndicator.
     * 
     */
    public boolean isDiscountIndicator() {
        return discountIndicator;
    }

    /**
     * Define el valor de la propiedad discountIndicator.
     * 
     */
    public void setDiscountIndicator(boolean value) {
        this.discountIndicator = value;
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
     * {@link Participants }
     * 
     * 
     */
    public List<Participants> getParticipants() {
        if (participants == null) {
            participants = new ArrayList<Participants>();
        }
        return this.participants;
    }

    /**
     * Gets the value of the secureAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secureAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecureAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecureAttributes }
     * 
     * 
     */
    public List<SecureAttributes> getSecureAttributes() {
        if (secureAttributes == null) {
            secureAttributes = new ArrayList<SecureAttributes>();
        }
        return this.secureAttributes;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * 
     * 
     */
    public List<Fee> getFees() {
        if (fees == null) {
            fees = new ArrayList<Fee>();
        }
        return this.fees;
    }

}


package com.bbva.czic.dto.canonical_model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Branch complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Branch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasQueueManagementService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="address" type="{urn:com:bbva:czic:dto:canonical_model}Address" minOccurs="0"/>
 *         &lt;element name="relatedBranches" type="{urn:com:bbva:czic:dto:canonical_model}relatedBranch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="occupancyInformation" type="{urn:com:bbva:czic:dto:canonical_model}branchOccupancyInformation" minOccurs="0"/>
 *         &lt;element name="calendar" type="{urn:com:bbva:czic:dto:canonical_model}calendar" minOccurs="0"/>
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
@XmlType(name = "Branch", propOrder = {
    "id",
    "code",
    "name",
    "hasQueueManagementService",
    "type",
    "address",
    "relatedBranches",
    "occupancyInformation",
    "calendar",
    "bank"
})
@XmlSeeAlso({
    RelatedBranch.class
})
public class Branch {

    protected String id;
    protected String code;
    protected String name;
    protected Boolean hasQueueManagementService;
    protected OptionsList type;
    protected Address address;
    @XmlElement(nillable = true)
    protected List<RelatedBranch> relatedBranches;
    protected BranchOccupancyInformation occupancyInformation;
    protected Calendar calendar;
    protected Reference bank;

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
     * Obtiene el valor de la propiedad code.
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
     * Define el valor de la propiedad code.
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
     * Obtiene el valor de la propiedad hasQueueManagementService.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasQueueManagementService() {
        return hasQueueManagementService;
    }

    /**
     * Define el valor de la propiedad hasQueueManagementService.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasQueueManagementService(Boolean value) {
        this.hasQueueManagementService = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setType(OptionsList value) {
        this.type = value;
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
     * Gets the value of the relatedBranches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedBranches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedBranches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedBranch }
     * 
     * 
     */
    public List<RelatedBranch> getRelatedBranches() {
        if (relatedBranches == null) {
            relatedBranches = new ArrayList<RelatedBranch>();
        }
        return this.relatedBranches;
    }

    /**
     * Obtiene el valor de la propiedad occupancyInformation.
     * 
     * @return
     *     possible object is
     *     {@link BranchOccupancyInformation }
     *     
     */
    public BranchOccupancyInformation getOccupancyInformation() {
        return occupancyInformation;
    }

    /**
     * Define el valor de la propiedad occupancyInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchOccupancyInformation }
     *     
     */
    public void setOccupancyInformation(BranchOccupancyInformation value) {
        this.occupancyInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad calendar.
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    public Calendar getCalendar() {
        return calendar;
    }

    /**
     * Define el valor de la propiedad calendar.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     */
    public void setCalendar(Calendar value) {
        this.calendar = value;
    }

    /**
     * Obtiene el valor de la propiedad bank.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getBank() {
        return bank;
    }

    /**
     * Define el valor de la propiedad bank.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setBank(Reference value) {
        this.bank = value;
    }

}

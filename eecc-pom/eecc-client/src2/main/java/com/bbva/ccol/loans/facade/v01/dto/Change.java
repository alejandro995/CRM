
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
 * <p>Clase Java para change complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="change">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}status" minOccurs="0"/>
 *         &lt;element name="ejecutionChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}branchOficce" minOccurs="0"/>
 *         &lt;element name="typeAmortization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reducedFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalAmount" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="interestAmount" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="interestChange" type="{urn:com:bbva:ccol:loans:facade:v01:dto}interestChange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comissionValue" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "change", propOrder = {
    "changeId",
    "postedDate",
    "type",
    "status",
    "ejecutionChange",
    "branchOficce",
    "typeAmortization",
    "reducedFees",
    "capitalAmount",
    "interestAmount",
    "interestChange",
    "comissionValue"
})
public class Change {

    protected String changeId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postedDate;
    protected String type;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Status status;
    protected String ejecutionChange;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected BranchOficce branchOficce;
    protected String typeAmortization;
    protected String reducedFees;
    protected Money capitalAmount;
    protected Money interestAmount;
    @XmlElement(nillable = true)
    protected List<InterestChange> interestChange;
    protected Money comissionValue;

    /**
     * Obtiene el valor de la propiedad changeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeId() {
        return changeId;
    }

    /**
     * Define el valor de la propiedad changeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeId(String value) {
        this.changeId = value;
    }

    /**
     * Obtiene el valor de la propiedad postedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedDate() {
        return postedDate;
    }

    /**
     * Define el valor de la propiedad postedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedDate(XMLGregorianCalendar value) {
        this.postedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Obtiene el valor de la propiedad ejecutionChange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjecutionChange() {
        return ejecutionChange;
    }

    /**
     * Define el valor de la propiedad ejecutionChange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjecutionChange(String value) {
        this.ejecutionChange = value;
    }

    /**
     * Obtiene el valor de la propiedad branchOficce.
     * 
     * @return
     *     possible object is
     *     {@link BranchOficce }
     *     
     */
    public BranchOficce getBranchOficce() {
        return branchOficce;
    }

    /**
     * Define el valor de la propiedad branchOficce.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchOficce }
     *     
     */
    public void setBranchOficce(BranchOficce value) {
        this.branchOficce = value;
    }

    /**
     * Obtiene el valor de la propiedad typeAmortization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAmortization() {
        return typeAmortization;
    }

    /**
     * Define el valor de la propiedad typeAmortization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAmortization(String value) {
        this.typeAmortization = value;
    }

    /**
     * Obtiene el valor de la propiedad reducedFees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReducedFees() {
        return reducedFees;
    }

    /**
     * Define el valor de la propiedad reducedFees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReducedFees(String value) {
        this.reducedFees = value;
    }

    /**
     * Obtiene el valor de la propiedad capitalAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCapitalAmount() {
        return capitalAmount;
    }

    /**
     * Define el valor de la propiedad capitalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCapitalAmount(Money value) {
        this.capitalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad interestAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getInterestAmount() {
        return interestAmount;
    }

    /**
     * Define el valor de la propiedad interestAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setInterestAmount(Money value) {
        this.interestAmount = value;
    }

    /**
     * Gets the value of the interestChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestChange }
     * 
     * 
     */
    public List<InterestChange> getInterestChange() {
        if (interestChange == null) {
            interestChange = new ArrayList<InterestChange>();
        }
        return this.interestChange;
    }

    /**
     * Obtiene el valor de la propiedad comissionValue.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getComissionValue() {
        return comissionValue;
    }

    /**
     * Define el valor de la propiedad comissionValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setComissionValue(Money value) {
        this.comissionValue = value;
    }

}

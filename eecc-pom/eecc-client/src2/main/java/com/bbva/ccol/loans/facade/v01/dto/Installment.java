
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
 * <p>Clase Java para installment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="installment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="installmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="postedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="avaliableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expiredDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}principal" minOccurs="0"/>
 *         &lt;element name="interest" type="{urn:com:bbva:ccol:loans:facade:v01:dto}interestInstallments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="installmentexpenses" type="{urn:com:bbva:ccol:loans:facade:v01:dto}installmentExpenses" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pendingAmount" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="capitalAmount" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="interestAmount" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="totalInstallment" type="{urn:com:bbva:ccol:loans:facade:v01:dto}money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "installment", propOrder = {
    "installmentId",
    "name",
    "expirationDate",
    "postedDate",
    "avaliableDate",
    "expiredDays",
    "principal",
    "interest",
    "installmentexpenses",
    "pendingAmount",
    "capitalAmount",
    "interestAmount",
    "totalInstallment"
})
public class Installment {

    protected String installmentId;
    protected String name;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar avaliableDate;
    protected Integer expiredDays;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Principal principal;
    @XmlElement(nillable = true)
    protected List<InterestInstallments> interest;
    @XmlElement(nillable = true)
    protected List<InstallmentExpenses> installmentexpenses;
    protected Money pendingAmount;
    protected Money capitalAmount;
    protected Money interestAmount;
    protected Money totalInstallment;

    /**
     * Obtiene el valor de la propiedad installmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentId() {
        return installmentId;
    }

    /**
     * Define el valor de la propiedad installmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentId(String value) {
        this.installmentId = value;
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
     * Obtiene el valor de la propiedad avaliableDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvaliableDate() {
        return avaliableDate;
    }

    /**
     * Define el valor de la propiedad avaliableDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvaliableDate(XMLGregorianCalendar value) {
        this.avaliableDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expiredDays.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiredDays() {
        return expiredDays;
    }

    /**
     * Define el valor de la propiedad expiredDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiredDays(Integer value) {
        this.expiredDays = value;
    }

    /**
     * Obtiene el valor de la propiedad principal.
     * 
     * @return
     *     possible object is
     *     {@link Principal }
     *     
     */
    public Principal getPrincipal() {
        return principal;
    }

    /**
     * Define el valor de la propiedad principal.
     * 
     * @param value
     *     allowed object is
     *     {@link Principal }
     *     
     */
    public void setPrincipal(Principal value) {
        this.principal = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestInstallments }
     * 
     * 
     */
    public List<InterestInstallments> getInterest() {
        if (interest == null) {
            interest = new ArrayList<InterestInstallments>();
        }
        return this.interest;
    }

    /**
     * Gets the value of the installmentexpenses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installmentexpenses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstallmentexpenses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstallmentExpenses }
     * 
     * 
     */
    public List<InstallmentExpenses> getInstallmentexpenses() {
        if (installmentexpenses == null) {
            installmentexpenses = new ArrayList<InstallmentExpenses>();
        }
        return this.installmentexpenses;
    }

    /**
     * Obtiene el valor de la propiedad pendingAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPendingAmount() {
        return pendingAmount;
    }

    /**
     * Define el valor de la propiedad pendingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPendingAmount(Money value) {
        this.pendingAmount = value;
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
     * Obtiene el valor de la propiedad totalInstallment.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalInstallment() {
        return totalInstallment;
    }

    /**
     * Define el valor de la propiedad totalInstallment.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalInstallment(Money value) {
        this.totalInstallment = value;
    }

}

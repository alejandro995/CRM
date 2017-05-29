
package com.bbva.czic.dto.canonical_model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para economicData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="economicData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="occupationType" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="company" type="{urn:com:bbva:czic:dto:canonical_model}Person" minOccurs="0"/>
 *         &lt;element name="isBusinessPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="economicActivity" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="secondaryEconomicActivity" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="tertiaryEconomicActivity" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="profession" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="startDateActivity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contablesData" type="{urn:com:bbva:czic:dto:canonical_model}contableData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="originIncomes" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="annualSalesAmount" type="{urn:com:bbva:czic:dto:canonical_model}money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "economicData", propOrder = {
    "occupationType",
    "company",
    "isBusinessPartner",
    "economicActivity",
    "secondaryEconomicActivity",
    "tertiaryEconomicActivity",
    "profession",
    "startDateActivity",
    "contablesData",
    "originIncomes",
    "annualSalesAmount"
})
public class EconomicData {

    protected OptionsList occupationType;
    protected Person company;
    protected String isBusinessPartner;
    protected OptionsList economicActivity;
    protected OptionsList secondaryEconomicActivity;
    protected OptionsList tertiaryEconomicActivity;
    protected OptionsList profession;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateActivity;
    @XmlElement(nillable = true)
    protected List<ContableData> contablesData;
    protected OptionsList originIncomes;
    protected Money annualSalesAmount;

    /**
     * Obtiene el valor de la propiedad occupationType.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getOccupationType() {
        return occupationType;
    }

    /**
     * Define el valor de la propiedad occupationType.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setOccupationType(OptionsList value) {
        this.occupationType = value;
    }

    /**
     * Obtiene el valor de la propiedad company.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getCompany() {
        return company;
    }

    /**
     * Define el valor de la propiedad company.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setCompany(Person value) {
        this.company = value;
    }

    /**
     * Obtiene el valor de la propiedad isBusinessPartner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBusinessPartner() {
        return isBusinessPartner;
    }

    /**
     * Define el valor de la propiedad isBusinessPartner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBusinessPartner(String value) {
        this.isBusinessPartner = value;
    }

    /**
     * Obtiene el valor de la propiedad economicActivity.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getEconomicActivity() {
        return economicActivity;
    }

    /**
     * Define el valor de la propiedad economicActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setEconomicActivity(OptionsList value) {
        this.economicActivity = value;
    }

    /**
     * Obtiene el valor de la propiedad secondaryEconomicActivity.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getSecondaryEconomicActivity() {
        return secondaryEconomicActivity;
    }

    /**
     * Define el valor de la propiedad secondaryEconomicActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setSecondaryEconomicActivity(OptionsList value) {
        this.secondaryEconomicActivity = value;
    }

    /**
     * Obtiene el valor de la propiedad tertiaryEconomicActivity.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getTertiaryEconomicActivity() {
        return tertiaryEconomicActivity;
    }

    /**
     * Define el valor de la propiedad tertiaryEconomicActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setTertiaryEconomicActivity(OptionsList value) {
        this.tertiaryEconomicActivity = value;
    }

    /**
     * Obtiene el valor de la propiedad profession.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getProfession() {
        return profession;
    }

    /**
     * Define el valor de la propiedad profession.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setProfession(OptionsList value) {
        this.profession = value;
    }

    /**
     * Obtiene el valor de la propiedad startDateActivity.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateActivity() {
        return startDateActivity;
    }

    /**
     * Define el valor de la propiedad startDateActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateActivity(XMLGregorianCalendar value) {
        this.startDateActivity = value;
    }

    /**
     * Gets the value of the contablesData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contablesData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContablesData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContableData }
     * 
     * 
     */
    public List<ContableData> getContablesData() {
        if (contablesData == null) {
            contablesData = new ArrayList<ContableData>();
        }
        return this.contablesData;
    }

    /**
     * Obtiene el valor de la propiedad originIncomes.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getOriginIncomes() {
        return originIncomes;
    }

    /**
     * Define el valor de la propiedad originIncomes.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setOriginIncomes(OptionsList value) {
        this.originIncomes = value;
    }

    /**
     * Obtiene el valor de la propiedad annualSalesAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAnnualSalesAmount() {
        return annualSalesAmount;
    }

    /**
     * Define el valor de la propiedad annualSalesAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAnnualSalesAmount(Money value) {
        this.annualSalesAmount = value;
    }

}

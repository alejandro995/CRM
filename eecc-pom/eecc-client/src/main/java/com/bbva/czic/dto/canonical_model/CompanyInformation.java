
package com.bbva.czic.dto.canonical_model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para companyInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="companyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="analysisProcessYear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="businessBalanceAmount" type="{urn:com:bbva:czic:dto:canonical_model}money" minOccurs="0"/>
 *         &lt;element name="businessPatrimonyAmount" type="{urn:com:bbva:czic:dto:canonical_model}money" minOccurs="0"/>
 *         &lt;element name="activityTotalAmount" type="{urn:com:bbva:czic:dto:canonical_model}money" minOccurs="0"/>
 *         &lt;element name="dateTotalActivity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="legalForm" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="primarySIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondarySIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acronym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobSeniority" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="activityStartYear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="contractType" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="executivePosition" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyInformation", propOrder = {
    "analysisProcessYear",
    "numberOfEmployees",
    "businessBalanceAmount",
    "businessPatrimonyAmount",
    "activityTotalAmount",
    "dateTotalActivity",
    "legalForm",
    "primarySIC",
    "secondarySIC",
    "acronym",
    "jobSeniority",
    "activityStartYear",
    "contractType",
    "executivePosition"
})
public class CompanyInformation {

    protected BigDecimal analysisProcessYear;
    protected BigDecimal numberOfEmployees;
    protected Money businessBalanceAmount;
    protected Money businessPatrimonyAmount;
    protected Money activityTotalAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTotalActivity;
    protected OptionsList legalForm;
    protected String primarySIC;
    protected String secondarySIC;
    protected String acronym;
    protected BigDecimal jobSeniority;
    protected BigDecimal activityStartYear;
    protected OptionsList contractType;
    protected OptionsList executivePosition;

    /**
     * Obtiene el valor de la propiedad analysisProcessYear.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnalysisProcessYear() {
        return analysisProcessYear;
    }

    /**
     * Define el valor de la propiedad analysisProcessYear.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnalysisProcessYear(BigDecimal value) {
        this.analysisProcessYear = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfEmployees.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Define el valor de la propiedad numberOfEmployees.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfEmployees(BigDecimal value) {
        this.numberOfEmployees = value;
    }

    /**
     * Obtiene el valor de la propiedad businessBalanceAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBusinessBalanceAmount() {
        return businessBalanceAmount;
    }

    /**
     * Define el valor de la propiedad businessBalanceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBusinessBalanceAmount(Money value) {
        this.businessBalanceAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPatrimonyAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBusinessPatrimonyAmount() {
        return businessPatrimonyAmount;
    }

    /**
     * Define el valor de la propiedad businessPatrimonyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBusinessPatrimonyAmount(Money value) {
        this.businessPatrimonyAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad activityTotalAmount.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getActivityTotalAmount() {
        return activityTotalAmount;
    }

    /**
     * Define el valor de la propiedad activityTotalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setActivityTotalAmount(Money value) {
        this.activityTotalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTotalActivity.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTotalActivity() {
        return dateTotalActivity;
    }

    /**
     * Define el valor de la propiedad dateTotalActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTotalActivity(XMLGregorianCalendar value) {
        this.dateTotalActivity = value;
    }

    /**
     * Obtiene el valor de la propiedad legalForm.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getLegalForm() {
        return legalForm;
    }

    /**
     * Define el valor de la propiedad legalForm.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setLegalForm(OptionsList value) {
        this.legalForm = value;
    }

    /**
     * Obtiene el valor de la propiedad primarySIC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySIC() {
        return primarySIC;
    }

    /**
     * Define el valor de la propiedad primarySIC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySIC(String value) {
        this.primarySIC = value;
    }

    /**
     * Obtiene el valor de la propiedad secondarySIC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySIC() {
        return secondarySIC;
    }

    /**
     * Define el valor de la propiedad secondarySIC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySIC(String value) {
        this.secondarySIC = value;
    }

    /**
     * Obtiene el valor de la propiedad acronym.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * Define el valor de la propiedad acronym.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcronym(String value) {
        this.acronym = value;
    }

    /**
     * Obtiene el valor de la propiedad jobSeniority.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJobSeniority() {
        return jobSeniority;
    }

    /**
     * Define el valor de la propiedad jobSeniority.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJobSeniority(BigDecimal value) {
        this.jobSeniority = value;
    }

    /**
     * Obtiene el valor de la propiedad activityStartYear.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivityStartYear() {
        return activityStartYear;
    }

    /**
     * Define el valor de la propiedad activityStartYear.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivityStartYear(BigDecimal value) {
        this.activityStartYear = value;
    }

    /**
     * Obtiene el valor de la propiedad contractType.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getContractType() {
        return contractType;
    }

    /**
     * Define el valor de la propiedad contractType.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setContractType(OptionsList value) {
        this.contractType = value;
    }

    /**
     * Obtiene el valor de la propiedad executivePosition.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getExecutivePosition() {
        return executivePosition;
    }

    /**
     * Define el valor de la propiedad executivePosition.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setExecutivePosition(OptionsList value) {
        this.executivePosition = value;
    }

}

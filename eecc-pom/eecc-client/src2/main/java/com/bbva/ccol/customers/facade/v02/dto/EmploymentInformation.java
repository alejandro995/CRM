
package com.bbva.ccol.customers.facade.v02.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para employmentInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="employmentInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobTittle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeEmployee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="yearsAntiguaty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="purpouseCompany" type="{urn:com:bbva:czic:customers:facade:v02:dto}purpouseCompany" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employmentInformation", propOrder = {
    "jobTittle",
    "isHolder",
    "typeEmployee",
    "startDate",
    "yearsAntiguaty",
    "purpouseCompany"
})
public class EmploymentInformation {

    protected String jobTittle;
    protected String isHolder;
    protected String typeEmployee;
    @XmlSchemaType(name = "dateTime")
    protected String startDate;
    protected Integer yearsAntiguaty;
    protected PurpouseCompany purpouseCompany;

    /**
     * Obtiene el valor de la propiedad jobTittle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTittle() {
        return jobTittle;
    }

    /**
     * Define el valor de la propiedad jobTittle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTittle(String value) {
        this.jobTittle = value;
    }

    /**
     * Obtiene el valor de la propiedad isHolder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHolder() {
        return isHolder;
    }

    /**
     * Define el valor de la propiedad isHolder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHolder(String value) {
        this.isHolder = value;
    }

    /**
     * Obtiene el valor de la propiedad typeEmployee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeEmployee() {
        return typeEmployee;
    }

    /**
     * Define el valor de la propiedad typeEmployee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeEmployee(String value) {
        this.typeEmployee = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getStartDate() {
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
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad yearsAntiguaty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearsAntiguaty() {
        return yearsAntiguaty;
    }

    /**
     * Define el valor de la propiedad yearsAntiguaty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearsAntiguaty(Integer value) {
        this.yearsAntiguaty = value;
    }

    /**
     * Obtiene el valor de la propiedad purpouseCompany.
     * 
     * @return
     *     possible object is
     *     {@link PurpouseCompany }
     *     
     */
    public PurpouseCompany getPurpouseCompany() {
        return purpouseCompany;
    }

    /**
     * Define el valor de la propiedad purpouseCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link PurpouseCompany }
     *     
     */
    public void setPurpouseCompany(PurpouseCompany value) {
        this.purpouseCompany = value;
    }

}

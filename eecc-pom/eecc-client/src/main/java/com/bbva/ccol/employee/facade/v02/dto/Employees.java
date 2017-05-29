
package com.bbva.ccol.employee.facade.v02.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employees">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classifications" type="{urn:com:bbva:ccol:employees:facade:v00:dto}classifications" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactDetails" type="{urn:com:bbva:ccol:employees:facade:v00:dto}contactDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personInCharge" type="{urn:com:bbva:ccol:employees:facade:v00:dto}personInCharge" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:com:bbva:ccol:employees:facade:v00:dto}department" minOccurs="0"/>
 *         &lt;element name="costCenter" type="{urn:com:bbva:ccol:employees:facade:v00:dto}costCenter" minOccurs="0"/>
 *         &lt;element name="workPlace" type="{urn:com:bbva:ccol:employees:facade:v00:dto}workPlace" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employees", propOrder = {
    "employeeId",
    "registrationIdentifier",
    "firstName",
    "lastName",
    "classifications",
    "contactDetails",
    "personInCharge",
    "department",
    "costCenter",
    "workPlace"
})
public class Employees {

    protected String employeeId;
    protected String registrationIdentifier;
    protected String firstName;
    protected String lastName;
    @XmlElement(nillable = true)
    protected List<Classifications> classifications;
    @XmlElement(nillable = true)
    protected List<ContactDetails> contactDetails;
    protected PersonInCharge personInCharge;
    protected Department department;
    protected CostCenter costCenter;
    protected WorkPlace workPlace;

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the registrationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationIdentifier() {
        return registrationIdentifier;
    }

    /**
     * Sets the value of the registrationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationIdentifier(String value) {
        this.registrationIdentifier = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the classifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Classifications }
     * 
     * 
     */
    public List<Classifications> getClassifications() {
        if (classifications == null) {
            classifications = new ArrayList<Classifications>();
        }
        return this.classifications;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetails }
     * 
     * 
     */
    public List<ContactDetails> getContactDetails() {
        if (contactDetails == null) {
            contactDetails = new ArrayList<ContactDetails>();
        }
        return this.contactDetails;
    }

    /**
     * Gets the value of the personInCharge property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInCharge }
     *     
     */
    public PersonInCharge getPersonInCharge() {
        return personInCharge;
    }

    /**
     * Sets the value of the personInCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInCharge }
     *     
     */
    public void setPersonInCharge(PersonInCharge value) {
        this.personInCharge = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link CostCenter }
     *     
     */
    public CostCenter getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostCenter }
     *     
     */
    public void setCostCenter(CostCenter value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the workPlace property.
     * 
     * @return
     *     possible object is
     *     {@link WorkPlace }
     *     
     */
    public WorkPlace getWorkPlace() {
        return workPlace;
    }

    /**
     * Sets the value of the workPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkPlace }
     *     
     */
    public void setWorkPlace(WorkPlace value) {
        this.workPlace = value;
    }

}

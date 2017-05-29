
package com.bbva.ccol.employee.facade.v02.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDetail" type="{urn:com:bbva:ccol:employees:facade:v00:dto}contactDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactDetails", propOrder = {
    "contactDetail"
})
public class ContactDetails {

    protected ContactDetail contactDetail;

    /**
     * Gets the value of the contactDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetail }
     *     
     */
    public ContactDetail getContactDetail() {
        return contactDetail;
    }

    /**
     * Sets the value of the contactDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetail }
     *     
     */
    public void setContactDetail(ContactDetail value) {
        this.contactDetail = value;
    }

}

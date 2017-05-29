
package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para personManagementData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="personManagementData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personalDataDisclosure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="personalDataDisclosureIndicator" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="personalAndEconomicDataDisclosureIndicator" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="minimunDataFilledIndicator" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="isAddressNotInformed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personManagementData", propOrder = {
    "personalDataDisclosure",
    "personalDataDisclosureIndicator",
    "personalAndEconomicDataDisclosureIndicator",
    "minimunDataFilledIndicator",
    "isAddressNotInformed"
})
public class PersonManagementData {

    protected Boolean personalDataDisclosure;
    protected OptionsList personalDataDisclosureIndicator;
    protected OptionsList personalAndEconomicDataDisclosureIndicator;
    protected OptionsList minimunDataFilledIndicator;
    protected Boolean isAddressNotInformed;

    /**
     * Obtiene el valor de la propiedad personalDataDisclosure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalDataDisclosure() {
        return personalDataDisclosure;
    }

    /**
     * Define el valor de la propiedad personalDataDisclosure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalDataDisclosure(Boolean value) {
        this.personalDataDisclosure = value;
    }

    /**
     * Obtiene el valor de la propiedad personalDataDisclosureIndicator.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getPersonalDataDisclosureIndicator() {
        return personalDataDisclosureIndicator;
    }

    /**
     * Define el valor de la propiedad personalDataDisclosureIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setPersonalDataDisclosureIndicator(OptionsList value) {
        this.personalDataDisclosureIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad personalAndEconomicDataDisclosureIndicator.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getPersonalAndEconomicDataDisclosureIndicator() {
        return personalAndEconomicDataDisclosureIndicator;
    }

    /**
     * Define el valor de la propiedad personalAndEconomicDataDisclosureIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setPersonalAndEconomicDataDisclosureIndicator(OptionsList value) {
        this.personalAndEconomicDataDisclosureIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad minimunDataFilledIndicator.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getMinimunDataFilledIndicator() {
        return minimunDataFilledIndicator;
    }

    /**
     * Define el valor de la propiedad minimunDataFilledIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setMinimunDataFilledIndicator(OptionsList value) {
        this.minimunDataFilledIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad isAddressNotInformed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAddressNotInformed() {
        return isAddressNotInformed;
    }

    /**
     * Define el valor de la propiedad isAddressNotInformed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAddressNotInformed(Boolean value) {
        this.isAddressNotInformed = value;
    }

}

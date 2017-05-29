
package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para personExtendedData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="personExtendedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{urn:com:bbva:czic:dto:canonical_model}language" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{urn:com:bbva:czic:dto:canonical_model}Address" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="maritalRegime" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="educationLevel" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefix" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="profession" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personExtendedData", propOrder = {
    "sex",
    "language",
    "birthPlace",
    "maritalStatus",
    "maritalRegime",
    "educationLevel",
    "parents",
    "prefix",
    "profession"
})
public class PersonExtendedData {

    protected String sex;
    protected Language language;
    protected Address birthPlace;
    protected OptionsList maritalStatus;
    protected OptionsList maritalRegime;
    protected OptionsList educationLevel;
    protected String parents;
    protected OptionsList prefix;
    protected OptionsList profession;

    /**
     * Obtiene el valor de la propiedad sex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Define el valor de la propiedad sex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad birthPlace.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBirthPlace() {
        return birthPlace;
    }

    /**
     * Define el valor de la propiedad birthPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBirthPlace(Address value) {
        this.birthPlace = value;
    }

    /**
     * Obtiene el valor de la propiedad maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Define el valor de la propiedad maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setMaritalStatus(OptionsList value) {
        this.maritalStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad maritalRegime.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getMaritalRegime() {
        return maritalRegime;
    }

    /**
     * Define el valor de la propiedad maritalRegime.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setMaritalRegime(OptionsList value) {
        this.maritalRegime = value;
    }

    /**
     * Obtiene el valor de la propiedad educationLevel.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getEducationLevel() {
        return educationLevel;
    }

    /**
     * Define el valor de la propiedad educationLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setEducationLevel(OptionsList value) {
        this.educationLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad parents.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParents() {
        return parents;
    }

    /**
     * Define el valor de la propiedad parents.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParents(String value) {
        this.parents = value;
    }

    /**
     * Obtiene el valor de la propiedad prefix.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getPrefix() {
        return prefix;
    }

    /**
     * Define el valor de la propiedad prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setPrefix(OptionsList value) {
        this.prefix = value;
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

}

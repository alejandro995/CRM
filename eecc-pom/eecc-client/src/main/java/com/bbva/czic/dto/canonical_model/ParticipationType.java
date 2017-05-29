
package com.bbva.czic.dto.canonical_model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para participationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="participationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="isCompulsory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="minimun" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maximun" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="restrictions" type="{urn:com:bbva:czic:dto:canonical_model}participationRestrictions" minOccurs="0"/>
 *         &lt;element name="personType" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="signatures" type="{urn:com:bbva:czic:dto:canonical_model}signatureDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participationType", propOrder = {
    "name",
    "isCompulsory",
    "minimun",
    "maximun",
    "restrictions",
    "personType",
    "signatures"
})
public class ParticipationType {

    protected OptionsList name;
    protected Boolean isCompulsory;
    protected BigDecimal minimun;
    protected BigDecimal maximun;
    protected ParticipationRestrictions restrictions;
    protected OptionsList personType;
    @XmlElement(nillable = true)
    protected List<SignatureDetail> signatures;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setName(OptionsList value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad isCompulsory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompulsory() {
        return isCompulsory;
    }

    /**
     * Define el valor de la propiedad isCompulsory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompulsory(Boolean value) {
        this.isCompulsory = value;
    }

    /**
     * Obtiene el valor de la propiedad minimun.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimun() {
        return minimun;
    }

    /**
     * Define el valor de la propiedad minimun.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimun(BigDecimal value) {
        this.minimun = value;
    }

    /**
     * Obtiene el valor de la propiedad maximun.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximun() {
        return maximun;
    }

    /**
     * Define el valor de la propiedad maximun.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximun(BigDecimal value) {
        this.maximun = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictions.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationRestrictions }
     *     
     */
    public ParticipationRestrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Define el valor de la propiedad restrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationRestrictions }
     *     
     */
    public void setRestrictions(ParticipationRestrictions value) {
        this.restrictions = value;
    }

    /**
     * Obtiene el valor de la propiedad personType.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getPersonType() {
        return personType;
    }

    /**
     * Define el valor de la propiedad personType.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setPersonType(OptionsList value) {
        this.personType = value;
    }

    /**
     * Gets the value of the signatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureDetail }
     * 
     * 
     */
    public List<SignatureDetail> getSignatures() {
        if (signatures == null) {
            signatures = new ArrayList<SignatureDetail>();
        }
        return this.signatures;
    }

}

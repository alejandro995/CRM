
package com.bbva.ccol.customers.facade.v02.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para livingPlace complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="livingPlace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="livingtype" type="{urn:com:bbva:czic:customers:facade:v02:dto}type" minOccurs="0"/>
 *         &lt;element name="relationType" type="{urn:com:bbva:czic:customers:facade:v02:dto}type" minOccurs="0"/>
 *         &lt;element name="livingLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "livingPlace", propOrder = {
    "livingtype",
    "relationType",
    "livingLevel"
})
public class LivingPlace {

    protected Type livingtype;
    protected Type relationType;
    protected Integer livingLevel;

    /**
     * Obtiene el valor de la propiedad livingtype.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getLivingtype() {
        return livingtype;
    }

    /**
     * Define el valor de la propiedad livingtype.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setLivingtype(Type value) {
        this.livingtype = value;
    }

    /**
     * Obtiene el valor de la propiedad relationType.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getRelationType() {
        return relationType;
    }

    /**
     * Define el valor de la propiedad relationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setRelationType(Type value) {
        this.relationType = value;
    }

    /**
     * Obtiene el valor de la propiedad livingLevel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLivingLevel() {
        return livingLevel;
    }

    /**
     * Define el valor de la propiedad livingLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLivingLevel(Integer value) {
        this.livingLevel = value;
    }

}

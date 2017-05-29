
package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemConditionOptionValue complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemConditionOptionValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maximun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemConditionOptionValue", propOrder = {
    "value",
    "minimun",
    "maximun",
    "formatId"
})
public class ItemConditionOptionValue {

    protected String value;
    protected String minimun;
    protected String maximun;
    protected String formatId;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad minimun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimun() {
        return minimun;
    }

    /**
     * Define el valor de la propiedad minimun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimun(String value) {
        this.minimun = value;
    }

    /**
     * Obtiene el valor de la propiedad maximun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximun() {
        return maximun;
    }

    /**
     * Define el valor de la propiedad maximun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximun(String value) {
        this.maximun = value;
    }

    /**
     * Obtiene el valor de la propiedad formatId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatId() {
        return formatId;
    }

    /**
     * Define el valor de la propiedad formatId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatId(String value) {
        this.formatId = value;
    }

}

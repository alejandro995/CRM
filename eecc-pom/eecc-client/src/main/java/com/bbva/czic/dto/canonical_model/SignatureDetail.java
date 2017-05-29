
package com.bbva.czic.dto.canonical_model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para signatureDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="signatureDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="isCompulsory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defermentDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="advanceNoticeDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signatureDetail", propOrder = {
    "type",
    "isCompulsory",
    "defermentDays",
    "advanceNoticeDays"
})
public class SignatureDetail {

    protected OptionsList type;
    protected Boolean isCompulsory;
    protected BigDecimal defermentDays;
    protected BigDecimal advanceNoticeDays;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setType(OptionsList value) {
        this.type = value;
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
     * Obtiene el valor de la propiedad defermentDays.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefermentDays() {
        return defermentDays;
    }

    /**
     * Define el valor de la propiedad defermentDays.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefermentDays(BigDecimal value) {
        this.defermentDays = value;
    }

    /**
     * Obtiene el valor de la propiedad advanceNoticeDays.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvanceNoticeDays() {
        return advanceNoticeDays;
    }

    /**
     * Define el valor de la propiedad advanceNoticeDays.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvanceNoticeDays(BigDecimal value) {
        this.advanceNoticeDays = value;
    }

}

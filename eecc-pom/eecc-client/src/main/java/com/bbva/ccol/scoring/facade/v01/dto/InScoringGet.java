
package com.bbva.ccol.scoring.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inScoringGet complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inScoringGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numoper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numiden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inScoringGet", propOrder = {
    "numoper",
    "numiden"
})
public class InScoringGet {

    protected String numoper;
    protected String numiden;

    /**
     * Obtiene el valor de la propiedad numoper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumoper() {
        return numoper;
    }

    /**
     * Define el valor de la propiedad numoper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumoper(String value) {
        this.numoper = value;
    }

    /**
     * Obtiene el valor de la propiedad numiden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumiden() {
        return numiden;
    }

    /**
     * Define el valor de la propiedad numiden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumiden(String value) {
        this.numiden = value;
    }

}

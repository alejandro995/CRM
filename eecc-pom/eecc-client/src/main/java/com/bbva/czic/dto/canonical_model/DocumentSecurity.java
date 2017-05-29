
package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para documentSecurity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentSecurity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isSecured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signatureCapture" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentSecurity", propOrder = {
    "isSecured",
    "method",
    "signatureCapture"
})
public class DocumentSecurity {

    protected Boolean isSecured;
    protected String method;
    protected OptionsList signatureCapture;

    /**
     * Obtiene el valor de la propiedad isSecured.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSecured() {
        return isSecured;
    }

    /**
     * Define el valor de la propiedad isSecured.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSecured(Boolean value) {
        this.isSecured = value;
    }

    /**
     * Obtiene el valor de la propiedad method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Define el valor de la propiedad method.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureCapture.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getSignatureCapture() {
        return signatureCapture;
    }

    /**
     * Define el valor de la propiedad signatureCapture.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setSignatureCapture(OptionsList value) {
        this.signatureCapture = value;
    }

}

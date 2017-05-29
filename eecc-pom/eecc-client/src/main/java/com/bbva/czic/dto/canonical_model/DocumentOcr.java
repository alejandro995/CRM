
package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para documentOcr complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentOcr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isOcr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="technicalData" type="{urn:com:bbva:czic:dto:canonical_model}documentTechnicalData" minOccurs="0"/>
 *         &lt;element name="documentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentOcr", propOrder = {
    "isOcr",
    "technicalData",
    "documentName"
})
public class DocumentOcr {

    protected Boolean isOcr;
    protected DocumentTechnicalData technicalData;
    protected String documentName;

    /**
     * Obtiene el valor de la propiedad isOcr.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOcr() {
        return isOcr;
    }

    /**
     * Define el valor de la propiedad isOcr.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOcr(Boolean value) {
        this.isOcr = value;
    }

    /**
     * Obtiene el valor de la propiedad technicalData.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTechnicalData }
     *     
     */
    public DocumentTechnicalData getTechnicalData() {
        return technicalData;
    }

    /**
     * Define el valor de la propiedad technicalData.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTechnicalData }
     *     
     */
    public void setTechnicalData(DocumentTechnicalData value) {
        this.technicalData = value;
    }

    /**
     * Obtiene el valor de la propiedad documentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Define el valor de la propiedad documentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

}

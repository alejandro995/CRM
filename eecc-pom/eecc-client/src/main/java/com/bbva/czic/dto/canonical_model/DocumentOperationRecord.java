
package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para documentOperationRecord complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentOperationRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentCodeFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentOperationRecord", propOrder = {
    "documentCodeFile",
    "catalogCode"
})
public class DocumentOperationRecord {

    protected String documentCodeFile;
    protected String catalogCode;

    /**
     * Obtiene el valor de la propiedad documentCodeFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentCodeFile() {
        return documentCodeFile;
    }

    /**
     * Define el valor de la propiedad documentCodeFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentCodeFile(String value) {
        this.documentCodeFile = value;
    }

    /**
     * Obtiene el valor de la propiedad catalogCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogCode() {
        return catalogCode;
    }

    /**
     * Define el valor de la propiedad catalogCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogCode(String value) {
        this.catalogCode = value;
    }

}


package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para documentOperationRelations complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentOperationRelations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeFileParentDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentCatalogCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeReferenceExpedient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeReferencedCatalog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentOperationRelations", propOrder = {
    "codeFileParentDocument",
    "parentCatalogCode",
    "codeReferenceExpedient",
    "codeReferencedCatalog"
})
public class DocumentOperationRelations {

    protected String codeFileParentDocument;
    protected String parentCatalogCode;
    protected String codeReferenceExpedient;
    protected String codeReferencedCatalog;

    /**
     * Obtiene el valor de la propiedad codeFileParentDocument.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeFileParentDocument() {
        return codeFileParentDocument;
    }

    /**
     * Define el valor de la propiedad codeFileParentDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeFileParentDocument(String value) {
        this.codeFileParentDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad parentCatalogCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCatalogCode() {
        return parentCatalogCode;
    }

    /**
     * Define el valor de la propiedad parentCatalogCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCatalogCode(String value) {
        this.parentCatalogCode = value;
    }

    /**
     * Obtiene el valor de la propiedad codeReferenceExpedient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeReferenceExpedient() {
        return codeReferenceExpedient;
    }

    /**
     * Define el valor de la propiedad codeReferenceExpedient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeReferenceExpedient(String value) {
        this.codeReferenceExpedient = value;
    }

    /**
     * Obtiene el valor de la propiedad codeReferencedCatalog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeReferencedCatalog() {
        return codeReferencedCatalog;
    }

    /**
     * Define el valor de la propiedad codeReferencedCatalog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeReferencedCatalog(String value) {
        this.codeReferencedCatalog = value;
    }

}

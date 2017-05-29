
package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para documentOperationCharacteristics complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentOperationCharacteristics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="records" type="{urn:com:bbva:czic:dto:canonical_model}documentOperationRecord" minOccurs="0"/>
 *         &lt;element name="relations" type="{urn:com:bbva:czic:dto:canonical_model}documentOperationRelations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentOperationCharacteristics", propOrder = {
    "records",
    "relations"
})
public class DocumentOperationCharacteristics {

    protected DocumentOperationRecord records;
    protected DocumentOperationRelations relations;

    /**
     * Obtiene el valor de la propiedad records.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOperationRecord }
     *     
     */
    public DocumentOperationRecord getRecords() {
        return records;
    }

    /**
     * Define el valor de la propiedad records.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOperationRecord }
     *     
     */
    public void setRecords(DocumentOperationRecord value) {
        this.records = value;
    }

    /**
     * Obtiene el valor de la propiedad relations.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOperationRelations }
     *     
     */
    public DocumentOperationRelations getRelations() {
        return relations;
    }

    /**
     * Define el valor de la propiedad relations.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOperationRelations }
     *     
     */
    public void setRelations(DocumentOperationRelations value) {
        this.relations = value;
    }

}

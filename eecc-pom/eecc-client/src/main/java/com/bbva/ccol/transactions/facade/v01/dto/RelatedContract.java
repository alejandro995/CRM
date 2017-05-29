
package com.bbva.ccol.transactions.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para relatedContract complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="relatedContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relatedContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}product" minOccurs="0"/>
 *         &lt;element name="relationType" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}relationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedContract", propOrder = {
    "relatedContractId",
    "relatedContractNumber",
    "product",
    "relationType"
})
public class RelatedContract {

    protected String relatedContractId;
    protected String relatedContractNumber;
    protected Product product;
    protected RelationType relationType;

    /**
     * Obtiene el valor de la propiedad relatedContractId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedContractId() {
        return relatedContractId;
    }

    /**
     * Define el valor de la propiedad relatedContractId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedContractId(String value) {
        this.relatedContractId = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedContractNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedContractNumber() {
        return relatedContractNumber;
    }

    /**
     * Define el valor de la propiedad relatedContractNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedContractNumber(String value) {
        this.relatedContractNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad product.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Define el valor de la propiedad product.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Obtiene el valor de la propiedad relationType.
     * 
     * @return
     *     possible object is
     *     {@link RelationType }
     *     
     */
    public RelationType getRelationType() {
        return relationType;
    }

    /**
     * Define el valor de la propiedad relationType.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationType }
     *     
     */
    public void setRelationType(RelationType value) {
        this.relationType = value;
    }

}

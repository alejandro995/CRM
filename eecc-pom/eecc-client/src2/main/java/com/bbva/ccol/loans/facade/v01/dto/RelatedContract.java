
package com.bbva.ccol.loans.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}product" minOccurs="0"/>
 *         &lt;element ref="{urn:com:bbva:ccol:loans:facade:v01:dto}relationType" minOccurs="0"/>
 *         &lt;element name="numberType" type="{urn:com:bbva:ccol:loans:facade:v01:dto}type" minOccurs="0"/>
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
    "contractId",
    "number",
    "product",
    "relationType",
    "numberType"
})
public class RelatedContract {

    protected String relatedContractId;
    protected String contractId;
    protected String number;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected Product product;
    @XmlElement(namespace = "urn:com:bbva:ccol:loans:facade:v01:dto")
    protected RelationType relationType;
    protected Type numberType;

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
     * Obtiene el valor de la propiedad contractId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Define el valor de la propiedad contractId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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

    /**
     * Obtiene el valor de la propiedad numberType.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getNumberType() {
        return numberType;
    }

    /**
     * Define el valor de la propiedad numberType.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setNumberType(Type value) {
        this.numberType = value;
    }

}

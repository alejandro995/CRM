
package com.bbva.ccol.financialinformation.facade.v01.dto;

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
 *         &lt;element name="balance" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberType" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}numberType" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}product" minOccurs="0"/>
 *         &lt;element name="quotaValue" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}money" minOccurs="0"/>
 *         &lt;element name="relatedContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationType" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}relationtype" minOccurs="0"/>
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
    "balance",
    "number",
    "numberType",
    "product",
    "quotaValue",
    "relatedContractId",
    "relationType"
})
public class RelatedContract {

    protected Money balance;
    protected String number;
    protected NumberType numberType;
    protected Product product;
    protected Money quotaValue;
    protected String relatedContractId;
    protected Relationtype relationType;

    /**
     * Obtiene el valor de la propiedad balance.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBalance() {
        return balance;
    }

    /**
     * Define el valor de la propiedad balance.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBalance(Money value) {
        this.balance = value;
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
     * Obtiene el valor de la propiedad numberType.
     * 
     * @return
     *     possible object is
     *     {@link NumberType }
     *     
     */
    public NumberType getNumberType() {
        return numberType;
    }

    /**
     * Define el valor de la propiedad numberType.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberType }
     *     
     */
    public void setNumberType(NumberType value) {
        this.numberType = value;
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
     * Obtiene el valor de la propiedad quotaValue.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getQuotaValue() {
        return quotaValue;
    }

    /**
     * Define el valor de la propiedad quotaValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setQuotaValue(Money value) {
        this.quotaValue = value;
    }

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
     * Obtiene el valor de la propiedad relationType.
     * 
     * @return
     *     possible object is
     *     {@link Relationtype }
     *     
     */
    public Relationtype getRelationType() {
        return relationType;
    }

    /**
     * Define el valor de la propiedad relationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationtype }
     *     
     */
    public void setRelationType(Relationtype value) {
        this.relationType = value;
    }

}

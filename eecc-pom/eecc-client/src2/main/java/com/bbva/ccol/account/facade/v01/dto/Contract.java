
package com.bbva.ccol.account.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contract complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relatedContracts" type="{urn:com:bbva:ccol:account:facade:v02:dto}relatedContract" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract", propOrder = {
    "relatedContracts"
})
@XmlSeeAlso({
    FacadeOutAccount.class,
    RelatedContract.class,
    Account.class
})
public class Contract {

    protected RelatedContract relatedContracts;

    /**
     * Obtiene el valor de la propiedad relatedContracts.
     * 
     * @return
     *     possible object is
     *     {@link RelatedContract }
     *     
     */
    public RelatedContract getRelatedContracts() {
        return relatedContracts;
    }

    /**
     * Define el valor de la propiedad relatedContracts.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedContract }
     *     
     */
    public void setRelatedContracts(RelatedContract value) {
        this.relatedContracts = value;
    }

}

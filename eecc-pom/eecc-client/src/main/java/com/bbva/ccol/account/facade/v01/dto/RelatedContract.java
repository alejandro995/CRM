
package com.bbva.ccol.account.facade.v01.dto;

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
 *     &lt;extension base="{urn:com:bbva:ccol:account:facade:v02:dto}contract">
 *       &lt;sequence>
 *         &lt;element name="relationType" type="{urn:com:bbva:ccol:account:facade:v02:dto}optionsList" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedContract", propOrder = {
    "relationType",
    "number"
})
public class RelatedContract
    extends Contract
{

    protected OptionsList relationType;
    protected String number;

    /**
     * Obtiene el valor de la propiedad relationType.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getRelationType() {
        return relationType;
    }

    /**
     * Define el valor de la propiedad relationType.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setRelationType(OptionsList value) {
        this.relationType = value;
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

}

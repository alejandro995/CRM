
package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RelatedContract complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RelatedContract">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:bbva:czic:dto:canonical_model}Contract">
 *       &lt;sequence>
 *         &lt;element name="relationType" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedContract", propOrder = {
    "relationType"
})
public class RelatedContract
    extends Contract
{

    protected OptionsList relationType;

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

}

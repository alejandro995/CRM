
package com.bbva.czic.dto.non_canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bbva.czic.dto.canonical_model.Scheme;


/**
 * <p>Clase Java para SchemeAgreement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SchemeAgreement">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:bbva:czic:dto:canonical_model}scheme">
 *       &lt;sequence>
 *         &lt;element name="isDomiciliation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemeAgreement", propOrder = {
    "isDomiciliation"
})
public class SchemeAgreement
    extends Scheme
{

    protected Boolean isDomiciliation;

    /**
     * Obtiene el valor de la propiedad isDomiciliation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDomiciliation() {
        return isDomiciliation;
    }

    /**
     * Define el valor de la propiedad isDomiciliation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDomiciliation(Boolean value) {
        this.isDomiciliation = value;
    }

}

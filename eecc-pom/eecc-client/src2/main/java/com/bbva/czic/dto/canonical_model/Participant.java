
package com.bbva.czic.dto.canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Participant complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Participant">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:bbva:czic:dto:canonical_model}Person">
 *       &lt;sequence>
 *         &lt;element name="relationship" type="{urn:com:bbva:czic:dto:canonical_model}participantRelationship" minOccurs="0"/>
 *         &lt;element name="signature" type="{urn:com:bbva:czic:dto:canonical_model}participantSignature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Participant", propOrder = {
    "relationship",
    "signature"
})
public class Participant
    extends Person
{

    protected ParticipantRelationship relationship;
    protected ParticipantSignature signature;

    /**
     * Obtiene el valor de la propiedad relationship.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRelationship }
     *     
     */
    public ParticipantRelationship getRelationship() {
        return relationship;
    }

    /**
     * Define el valor de la propiedad relationship.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRelationship }
     *     
     */
    public void setRelationship(ParticipantRelationship value) {
        this.relationship = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantSignature }
     *     
     */
    public ParticipantSignature getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantSignature }
     *     
     */
    public void setSignature(ParticipantSignature value) {
        this.signature = value;
    }

}


package com.bbva.ccol.financialinformation.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para participants complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="participants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identityDocuments" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}identityDocuments" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:com:bbva:ccol:financialinformation:facade:v01:dto}type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participants", propOrder = {
    "identityDocuments",
    "type"
})
public class Participants {

    protected IdentityDocuments identityDocuments;
    protected Type type;

    /**
     * Obtiene el valor de la propiedad identityDocuments.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocuments }
     *     
     */
    public IdentityDocuments getIdentityDocuments() {
        return identityDocuments;
    }

    /**
     * Define el valor de la propiedad identityDocuments.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocuments }
     *     
     */
    public void setIdentityDocuments(IdentityDocuments value) {
        this.identityDocuments = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

}

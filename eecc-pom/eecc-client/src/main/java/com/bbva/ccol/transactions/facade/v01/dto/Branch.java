
package com.bbva.ccol.transactions.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para branch complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="branch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualBranch" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}actualBranch" minOccurs="0"/>
 *         &lt;element name="lastBranch" type="{urn:com:bbva:ccol:transactions:facade:v01:dto}lastBranch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "branch", propOrder = {
    "name",
    "id",
    "actualBranch",
    "lastBranch"
})
public class Branch {

    protected String name;
    protected String id;
    protected ActualBranch actualBranch;
    protected LastBranch lastBranch;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad actualBranch.
     * 
     * @return
     *     possible object is
     *     {@link ActualBranch }
     *     
     */
    public ActualBranch getActualBranch() {
        return actualBranch;
    }

    /**
     * Define el valor de la propiedad actualBranch.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualBranch }
     *     
     */
    public void setActualBranch(ActualBranch value) {
        this.actualBranch = value;
    }

    /**
     * Obtiene el valor de la propiedad lastBranch.
     * 
     * @return
     *     possible object is
     *     {@link LastBranch }
     *     
     */
    public LastBranch getLastBranch() {
        return lastBranch;
    }

    /**
     * Define el valor de la propiedad lastBranch.
     * 
     * @param value
     *     allowed object is
     *     {@link LastBranch }
     *     
     */
    public void setLastBranch(LastBranch value) {
        this.lastBranch = value;
    }

}

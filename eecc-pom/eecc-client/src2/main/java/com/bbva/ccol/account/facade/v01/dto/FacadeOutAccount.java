
package com.bbva.ccol.account.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para facadeOutAccount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="facadeOutAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:bbva:ccol:account:facade:v02:dto}contract">
 *       &lt;sequence>
 *         &lt;element name="data" type="{urn:com:bbva:ccol:account:facade:v02:dto}account" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facadeOutAccount", propOrder = {
    "data"
})
public class FacadeOutAccount
    extends Contract
{

    protected Account data;

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setData(Account value) {
        this.data = value;
    }

}

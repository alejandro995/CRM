
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SectorRealAlDiaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SectorRealAlDiaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Obligacion" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}ObligacionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectorRealAlDiaType", propOrder = {
    "obligacion"
})
public class SectorRealAlDiaType {

    @XmlElement(name = "Obligacion", required = true)
    protected ObligacionType obligacion;

    /**
     * Obtiene el valor de la propiedad obligacion.
     * 
     * @return
     *     possible object is
     *     {@link ObligacionType }
     *     
     */
    public ObligacionType getObligacion() {
        return obligacion;
    }

    /**
     * Define el valor de la propiedad obligacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ObligacionType }
     *     
     */
    public void setObligacion(ObligacionType value) {
        this.obligacion = value;
    }

}

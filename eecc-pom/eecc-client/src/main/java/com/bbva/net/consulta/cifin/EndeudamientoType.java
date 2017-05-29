
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EndeudamientoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EndeudamientoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EncabezadoEndeudamiento" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}EncabezadoEndeudamientoType"/>
 *         &lt;element name="EndeudamientoTrimI" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}EndeudamientoTrimIType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndeudamientoType", propOrder = {
    "encabezadoEndeudamiento",
    "endeudamientoTrimI"
})
public class EndeudamientoType {

    @XmlElement(name = "EncabezadoEndeudamiento", required = true)
    protected EncabezadoEndeudamientoType encabezadoEndeudamiento;
    @XmlElement(name = "EndeudamientoTrimI", required = true)
    protected EndeudamientoTrimIType endeudamientoTrimI;

    /**
     * Obtiene el valor de la propiedad encabezadoEndeudamiento.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoEndeudamientoType }
     *     
     */
    public EncabezadoEndeudamientoType getEncabezadoEndeudamiento() {
        return encabezadoEndeudamiento;
    }

    /**
     * Define el valor de la propiedad encabezadoEndeudamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoEndeudamientoType }
     *     
     */
    public void setEncabezadoEndeudamiento(EncabezadoEndeudamientoType value) {
        this.encabezadoEndeudamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad endeudamientoTrimI.
     * 
     * @return
     *     possible object is
     *     {@link EndeudamientoTrimIType }
     *     
     */
    public EndeudamientoTrimIType getEndeudamientoTrimI() {
        return endeudamientoTrimI;
    }

    /**
     * Define el valor de la propiedad endeudamientoTrimI.
     * 
     * @param value
     *     allowed object is
     *     {@link EndeudamientoTrimIType }
     *     
     */
    public void setEndeudamientoTrimI(EndeudamientoTrimIType value) {
        this.endeudamientoTrimI = value;
    }

}

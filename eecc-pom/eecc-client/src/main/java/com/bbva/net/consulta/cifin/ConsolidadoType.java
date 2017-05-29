
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsolidadoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsolidadoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResumenPrincipal" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}ResumenPrincipalType"/>
 *         &lt;element name="Registro" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}RegistroType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidadoType", propOrder = {
    "resumenPrincipal",
    "registro"
})
public class ConsolidadoType {

    @XmlElement(name = "ResumenPrincipal", required = true)
    protected ResumenPrincipalType resumenPrincipal;
    @XmlElement(name = "Registro", required = true)
    protected RegistroType registro;

    /**
     * Obtiene el valor de la propiedad resumenPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link ResumenPrincipalType }
     *     
     */
    public ResumenPrincipalType getResumenPrincipal() {
        return resumenPrincipal;
    }

    /**
     * Define el valor de la propiedad resumenPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link ResumenPrincipalType }
     *     
     */
    public void setResumenPrincipal(ResumenPrincipalType value) {
        this.resumenPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad registro.
     * 
     * @return
     *     possible object is
     *     {@link RegistroType }
     *     
     */
    public RegistroType getRegistro() {
        return registro;
    }

    /**
     * Define el valor de la propiedad registro.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroType }
     *     
     */
    public void setRegistro(RegistroType value) {
        this.registro = value;
    }

}

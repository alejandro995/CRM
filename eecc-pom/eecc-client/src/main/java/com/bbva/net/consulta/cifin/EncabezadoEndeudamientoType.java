
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncabezadoEndeudamientoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoEndeudamientoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroEntidadesTrimestreI" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="FechaTrimestreI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroEntidadesTrimestreII" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="FechaTrimestreII" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroEntidadesTrimestreIII" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="FechaTrimestreIII" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroComprasTrimestreI" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroComprasTrimestreII" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroComprasTrimestreIII" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroReestructuracionesTrimestreI" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroReestructuracionesTrimestreII" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroReestructuracionesTrimestreIII" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroCastigosTrimestreI" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroCastigosTrimestreII" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroCastigosTrimestreIII" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoEndeudamientoType", propOrder = {
    "numeroEntidadesTrimestreI",
    "fechaTrimestreI",
    "numeroEntidadesTrimestreII",
    "fechaTrimestreII",
    "numeroEntidadesTrimestreIII",
    "fechaTrimestreIII",
    "numeroComprasTrimestreI",
    "numeroComprasTrimestreII",
    "numeroComprasTrimestreIII",
    "numeroReestructuracionesTrimestreI",
    "numeroReestructuracionesTrimestreII",
    "numeroReestructuracionesTrimestreIII",
    "numeroCastigosTrimestreI",
    "numeroCastigosTrimestreII",
    "numeroCastigosTrimestreIII"
})
public class EncabezadoEndeudamientoType {

    @XmlElement(name = "NumeroEntidadesTrimestreI")
    protected byte numeroEntidadesTrimestreI;
    @XmlElement(name = "FechaTrimestreI", required = true)
    protected String fechaTrimestreI;
    @XmlElement(name = "NumeroEntidadesTrimestreII")
    protected byte numeroEntidadesTrimestreII;
    @XmlElement(name = "FechaTrimestreII", required = true)
    protected String fechaTrimestreII;
    @XmlElement(name = "NumeroEntidadesTrimestreIII")
    protected byte numeroEntidadesTrimestreIII;
    @XmlElement(name = "FechaTrimestreIII", required = true)
    protected String fechaTrimestreIII;
    @XmlElement(name = "NumeroComprasTrimestreI")
    protected byte numeroComprasTrimestreI;
    @XmlElement(name = "NumeroComprasTrimestreII")
    protected byte numeroComprasTrimestreII;
    @XmlElement(name = "NumeroComprasTrimestreIII")
    protected byte numeroComprasTrimestreIII;
    @XmlElement(name = "NumeroReestructuracionesTrimestreI")
    protected byte numeroReestructuracionesTrimestreI;
    @XmlElement(name = "NumeroReestructuracionesTrimestreII")
    protected byte numeroReestructuracionesTrimestreII;
    @XmlElement(name = "NumeroReestructuracionesTrimestreIII")
    protected byte numeroReestructuracionesTrimestreIII;
    @XmlElement(name = "NumeroCastigosTrimestreI")
    protected byte numeroCastigosTrimestreI;
    @XmlElement(name = "NumeroCastigosTrimestreII")
    protected byte numeroCastigosTrimestreII;
    @XmlElement(name = "NumeroCastigosTrimestreIII")
    protected byte numeroCastigosTrimestreIII;

    /**
     * Obtiene el valor de la propiedad numeroEntidadesTrimestreI.
     * 
     */
    public byte getNumeroEntidadesTrimestreI() {
        return numeroEntidadesTrimestreI;
    }

    /**
     * Define el valor de la propiedad numeroEntidadesTrimestreI.
     * 
     */
    public void setNumeroEntidadesTrimestreI(byte value) {
        this.numeroEntidadesTrimestreI = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTrimestreI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTrimestreI() {
        return fechaTrimestreI;
    }

    /**
     * Define el valor de la propiedad fechaTrimestreI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTrimestreI(String value) {
        this.fechaTrimestreI = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroEntidadesTrimestreII.
     * 
     */
    public byte getNumeroEntidadesTrimestreII() {
        return numeroEntidadesTrimestreII;
    }

    /**
     * Define el valor de la propiedad numeroEntidadesTrimestreII.
     * 
     */
    public void setNumeroEntidadesTrimestreII(byte value) {
        this.numeroEntidadesTrimestreII = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTrimestreII.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTrimestreII() {
        return fechaTrimestreII;
    }

    /**
     * Define el valor de la propiedad fechaTrimestreII.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTrimestreII(String value) {
        this.fechaTrimestreII = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroEntidadesTrimestreIII.
     * 
     */
    public byte getNumeroEntidadesTrimestreIII() {
        return numeroEntidadesTrimestreIII;
    }

    /**
     * Define el valor de la propiedad numeroEntidadesTrimestreIII.
     * 
     */
    public void setNumeroEntidadesTrimestreIII(byte value) {
        this.numeroEntidadesTrimestreIII = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTrimestreIII.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTrimestreIII() {
        return fechaTrimestreIII;
    }

    /**
     * Define el valor de la propiedad fechaTrimestreIII.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTrimestreIII(String value) {
        this.fechaTrimestreIII = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComprasTrimestreI.
     * 
     */
    public byte getNumeroComprasTrimestreI() {
        return numeroComprasTrimestreI;
    }

    /**
     * Define el valor de la propiedad numeroComprasTrimestreI.
     * 
     */
    public void setNumeroComprasTrimestreI(byte value) {
        this.numeroComprasTrimestreI = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComprasTrimestreII.
     * 
     */
    public byte getNumeroComprasTrimestreII() {
        return numeroComprasTrimestreII;
    }

    /**
     * Define el valor de la propiedad numeroComprasTrimestreII.
     * 
     */
    public void setNumeroComprasTrimestreII(byte value) {
        this.numeroComprasTrimestreII = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroComprasTrimestreIII.
     * 
     */
    public byte getNumeroComprasTrimestreIII() {
        return numeroComprasTrimestreIII;
    }

    /**
     * Define el valor de la propiedad numeroComprasTrimestreIII.
     * 
     */
    public void setNumeroComprasTrimestreIII(byte value) {
        this.numeroComprasTrimestreIII = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroReestructuracionesTrimestreI.
     * 
     */
    public byte getNumeroReestructuracionesTrimestreI() {
        return numeroReestructuracionesTrimestreI;
    }

    /**
     * Define el valor de la propiedad numeroReestructuracionesTrimestreI.
     * 
     */
    public void setNumeroReestructuracionesTrimestreI(byte value) {
        this.numeroReestructuracionesTrimestreI = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroReestructuracionesTrimestreII.
     * 
     */
    public byte getNumeroReestructuracionesTrimestreII() {
        return numeroReestructuracionesTrimestreII;
    }

    /**
     * Define el valor de la propiedad numeroReestructuracionesTrimestreII.
     * 
     */
    public void setNumeroReestructuracionesTrimestreII(byte value) {
        this.numeroReestructuracionesTrimestreII = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroReestructuracionesTrimestreIII.
     * 
     */
    public byte getNumeroReestructuracionesTrimestreIII() {
        return numeroReestructuracionesTrimestreIII;
    }

    /**
     * Define el valor de la propiedad numeroReestructuracionesTrimestreIII.
     * 
     */
    public void setNumeroReestructuracionesTrimestreIII(byte value) {
        this.numeroReestructuracionesTrimestreIII = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCastigosTrimestreI.
     * 
     */
    public byte getNumeroCastigosTrimestreI() {
        return numeroCastigosTrimestreI;
    }

    /**
     * Define el valor de la propiedad numeroCastigosTrimestreI.
     * 
     */
    public void setNumeroCastigosTrimestreI(byte value) {
        this.numeroCastigosTrimestreI = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCastigosTrimestreII.
     * 
     */
    public byte getNumeroCastigosTrimestreII() {
        return numeroCastigosTrimestreII;
    }

    /**
     * Define el valor de la propiedad numeroCastigosTrimestreII.
     * 
     */
    public void setNumeroCastigosTrimestreII(byte value) {
        this.numeroCastigosTrimestreII = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCastigosTrimestreIII.
     * 
     */
    public byte getNumeroCastigosTrimestreIII() {
        return numeroCastigosTrimestreIII;
    }

    /**
     * Define el valor de la propiedad numeroCastigosTrimestreIII.
     * 
     */
    public void setNumeroCastigosTrimestreIII(byte value) {
        this.numeroCastigosTrimestreIII = value;
    }

}

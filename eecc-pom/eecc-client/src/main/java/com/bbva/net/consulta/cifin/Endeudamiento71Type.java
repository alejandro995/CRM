
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Endeudamiento71Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Endeudamiento71Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoModena" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroOperacionesComercial" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroOperacionesConsumo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroOperacionesVivienda" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroOperacionesMicrocredito" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ValorDeudaComercial" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ValorDeudaConsumo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ValorDeudaVivienda" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ValorDeudaMicrocredito" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ParticipacionTotalDeudas" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CubrimientoGarantiaComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CubrimientoGarantiaConsumo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CubrimientoGarantiaVivienda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CubrimientoGarantiaMicrocredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Endeudamiento71Type", propOrder = {
    "calificacion",
    "tipoModena",
    "numeroOperacionesComercial",
    "numeroOperacionesConsumo",
    "numeroOperacionesVivienda",
    "numeroOperacionesMicrocredito",
    "valorDeudaComercial",
    "valorDeudaConsumo",
    "valorDeudaVivienda",
    "valorDeudaMicrocredito",
    "total",
    "participacionTotalDeudas",
    "cubrimientoGarantiaComercial",
    "cubrimientoGarantiaConsumo",
    "cubrimientoGarantiaVivienda",
    "cubrimientoGarantiaMicrocredito"
})
public class Endeudamiento71Type {

    @XmlElement(name = "Calificacion", required = true)
    protected String calificacion;
    @XmlElement(name = "TipoModena", required = true)
    protected String tipoModena;
    @XmlElement(name = "NumeroOperacionesComercial")
    protected byte numeroOperacionesComercial;
    @XmlElement(name = "NumeroOperacionesConsumo")
    protected byte numeroOperacionesConsumo;
    @XmlElement(name = "NumeroOperacionesVivienda")
    protected byte numeroOperacionesVivienda;
    @XmlElement(name = "NumeroOperacionesMicrocredito")
    protected byte numeroOperacionesMicrocredito;
    @XmlElement(name = "ValorDeudaComercial")
    protected byte valorDeudaComercial;
    @XmlElement(name = "ValorDeudaConsumo")
    protected float valorDeudaConsumo;
    @XmlElement(name = "ValorDeudaVivienda")
    protected byte valorDeudaVivienda;
    @XmlElement(name = "ValorDeudaMicrocredito")
    protected byte valorDeudaMicrocredito;
    @XmlElement(name = "Total")
    protected float total;
    @XmlElement(name = "ParticipacionTotalDeudas")
    protected float participacionTotalDeudas;
    @XmlElement(name = "CubrimientoGarantiaComercial", required = true)
    protected String cubrimientoGarantiaComercial;
    @XmlElement(name = "CubrimientoGarantiaConsumo")
    protected float cubrimientoGarantiaConsumo;
    @XmlElement(name = "CubrimientoGarantiaVivienda", required = true)
    protected String cubrimientoGarantiaVivienda;
    @XmlElement(name = "CubrimientoGarantiaMicrocredito", required = true)
    protected String cubrimientoGarantiaMicrocredito;

    /**
     * Obtiene el valor de la propiedad calificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalificacion() {
        return calificacion;
    }

    /**
     * Define el valor de la propiedad calificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalificacion(String value) {
        this.calificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoModena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoModena() {
        return tipoModena;
    }

    /**
     * Define el valor de la propiedad tipoModena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoModena(String value) {
        this.tipoModena = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacionesComercial.
     * 
     */
    public byte getNumeroOperacionesComercial() {
        return numeroOperacionesComercial;
    }

    /**
     * Define el valor de la propiedad numeroOperacionesComercial.
     * 
     */
    public void setNumeroOperacionesComercial(byte value) {
        this.numeroOperacionesComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacionesConsumo.
     * 
     */
    public byte getNumeroOperacionesConsumo() {
        return numeroOperacionesConsumo;
    }

    /**
     * Define el valor de la propiedad numeroOperacionesConsumo.
     * 
     */
    public void setNumeroOperacionesConsumo(byte value) {
        this.numeroOperacionesConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacionesVivienda.
     * 
     */
    public byte getNumeroOperacionesVivienda() {
        return numeroOperacionesVivienda;
    }

    /**
     * Define el valor de la propiedad numeroOperacionesVivienda.
     * 
     */
    public void setNumeroOperacionesVivienda(byte value) {
        this.numeroOperacionesVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacionesMicrocredito.
     * 
     */
    public byte getNumeroOperacionesMicrocredito() {
        return numeroOperacionesMicrocredito;
    }

    /**
     * Define el valor de la propiedad numeroOperacionesMicrocredito.
     * 
     */
    public void setNumeroOperacionesMicrocredito(byte value) {
        this.numeroOperacionesMicrocredito = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDeudaComercial.
     * 
     */
    public byte getValorDeudaComercial() {
        return valorDeudaComercial;
    }

    /**
     * Define el valor de la propiedad valorDeudaComercial.
     * 
     */
    public void setValorDeudaComercial(byte value) {
        this.valorDeudaComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDeudaConsumo.
     * 
     */
    public float getValorDeudaConsumo() {
        return valorDeudaConsumo;
    }

    /**
     * Define el valor de la propiedad valorDeudaConsumo.
     * 
     */
    public void setValorDeudaConsumo(float value) {
        this.valorDeudaConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDeudaVivienda.
     * 
     */
    public byte getValorDeudaVivienda() {
        return valorDeudaVivienda;
    }

    /**
     * Define el valor de la propiedad valorDeudaVivienda.
     * 
     */
    public void setValorDeudaVivienda(byte value) {
        this.valorDeudaVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDeudaMicrocredito.
     * 
     */
    public byte getValorDeudaMicrocredito() {
        return valorDeudaMicrocredito;
    }

    /**
     * Define el valor de la propiedad valorDeudaMicrocredito.
     * 
     */
    public void setValorDeudaMicrocredito(byte value) {
        this.valorDeudaMicrocredito = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public float getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(float value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad participacionTotalDeudas.
     * 
     */
    public float getParticipacionTotalDeudas() {
        return participacionTotalDeudas;
    }

    /**
     * Define el valor de la propiedad participacionTotalDeudas.
     * 
     */
    public void setParticipacionTotalDeudas(float value) {
        this.participacionTotalDeudas = value;
    }

    /**
     * Obtiene el valor de la propiedad cubrimientoGarantiaComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubrimientoGarantiaComercial() {
        return cubrimientoGarantiaComercial;
    }

    /**
     * Define el valor de la propiedad cubrimientoGarantiaComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubrimientoGarantiaComercial(String value) {
        this.cubrimientoGarantiaComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad cubrimientoGarantiaConsumo.
     * 
     */
    public float getCubrimientoGarantiaConsumo() {
        return cubrimientoGarantiaConsumo;
    }

    /**
     * Define el valor de la propiedad cubrimientoGarantiaConsumo.
     * 
     */
    public void setCubrimientoGarantiaConsumo(float value) {
        this.cubrimientoGarantiaConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad cubrimientoGarantiaVivienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubrimientoGarantiaVivienda() {
        return cubrimientoGarantiaVivienda;
    }

    /**
     * Define el valor de la propiedad cubrimientoGarantiaVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubrimientoGarantiaVivienda(String value) {
        this.cubrimientoGarantiaVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad cubrimientoGarantiaMicrocredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubrimientoGarantiaMicrocredito() {
        return cubrimientoGarantiaMicrocredito;
    }

    /**
     * Define el valor de la propiedad cubrimientoGarantiaMicrocredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubrimientoGarantiaMicrocredito(String value) {
        this.cubrimientoGarantiaMicrocredito = value;
    }

}


package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Endeudamiento72Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Endeudamiento72Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroContingencias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorContingencias" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CuotaEsperada" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CumplimientoCuota" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Endeudamiento72Type", propOrder = {
    "tipoMoneda",
    "numeroContingencias",
    "valorContingencias",
    "cuotaEsperada",
    "cumplimientoCuota"
})
public class Endeudamiento72Type {

    @XmlElement(name = "TipoMoneda", required = true)
    protected String tipoMoneda;
    @XmlElement(name = "NumeroContingencias", required = true)
    protected String numeroContingencias;
    @XmlElement(name = "ValorContingencias")
    protected byte valorContingencias;
    @XmlElement(name = "CuotaEsperada")
    protected short cuotaEsperada;
    @XmlElement(name = "CumplimientoCuota", required = true)
    protected String cumplimientoCuota;

    /**
     * Obtiene el valor de la propiedad tipoMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMoneda() {
        return tipoMoneda;
    }

    /**
     * Define el valor de la propiedad tipoMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMoneda(String value) {
        this.tipoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroContingencias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContingencias() {
        return numeroContingencias;
    }

    /**
     * Define el valor de la propiedad numeroContingencias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContingencias(String value) {
        this.numeroContingencias = value;
    }

    /**
     * Obtiene el valor de la propiedad valorContingencias.
     * 
     */
    public byte getValorContingencias() {
        return valorContingencias;
    }

    /**
     * Define el valor de la propiedad valorContingencias.
     * 
     */
    public void setValorContingencias(byte value) {
        this.valorContingencias = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaEsperada.
     * 
     */
    public short getCuotaEsperada() {
        return cuotaEsperada;
    }

    /**
     * Define el valor de la propiedad cuotaEsperada.
     * 
     */
    public void setCuotaEsperada(short value) {
        this.cuotaEsperada = value;
    }

    /**
     * Obtiene el valor de la propiedad cumplimientoCuota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCumplimientoCuota() {
        return cumplimientoCuota;
    }

    /**
     * Define el valor de la propiedad cumplimientoCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCumplimientoCuota(String value) {
        this.cumplimientoCuota = value;
    }

}

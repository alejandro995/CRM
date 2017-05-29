
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegistroType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaqueteInformacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroObligaciones" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="TotalSaldo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParticipacionDeuda" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroObligacionesDia" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="SaldoObligacionesDia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CuotaObligacionesDia" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CantidadObligacionesMora" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="SaldoObligacionesMora" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CuotaObligacionesMora" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ValorMora" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroType", propOrder = {
    "paqueteInformacion",
    "numeroObligaciones",
    "totalSaldo",
    "participacionDeuda",
    "numeroObligacionesDia",
    "saldoObligacionesDia",
    "cuotaObligacionesDia",
    "cantidadObligacionesMora",
    "saldoObligacionesMora",
    "cuotaObligacionesMora",
    "valorMora"
})
public class RegistroType {

    @XmlElement(name = "PaqueteInformacion", required = true)
    protected String paqueteInformacion;
    @XmlElement(name = "NumeroObligaciones")
    protected byte numeroObligaciones;
    @XmlElement(name = "TotalSaldo")
    protected int totalSaldo;
    @XmlElement(name = "ParticipacionDeuda")
    protected byte participacionDeuda;
    @XmlElement(name = "NumeroObligacionesDia")
    protected byte numeroObligacionesDia;
    @XmlElement(name = "SaldoObligacionesDia")
    protected int saldoObligacionesDia;
    @XmlElement(name = "CuotaObligacionesDia")
    protected short cuotaObligacionesDia;
    @XmlElement(name = "CantidadObligacionesMora")
    protected byte cantidadObligacionesMora;
    @XmlElement(name = "SaldoObligacionesMora")
    protected byte saldoObligacionesMora;
    @XmlElement(name = "CuotaObligacionesMora")
    protected byte cuotaObligacionesMora;
    @XmlElement(name = "ValorMora")
    protected byte valorMora;

    /**
     * Obtiene el valor de la propiedad paqueteInformacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaqueteInformacion() {
        return paqueteInformacion;
    }

    /**
     * Define el valor de la propiedad paqueteInformacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaqueteInformacion(String value) {
        this.paqueteInformacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroObligaciones.
     * 
     */
    public byte getNumeroObligaciones() {
        return numeroObligaciones;
    }

    /**
     * Define el valor de la propiedad numeroObligaciones.
     * 
     */
    public void setNumeroObligaciones(byte value) {
        this.numeroObligaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSaldo.
     * 
     */
    public int getTotalSaldo() {
        return totalSaldo;
    }

    /**
     * Define el valor de la propiedad totalSaldo.
     * 
     */
    public void setTotalSaldo(int value) {
        this.totalSaldo = value;
    }

    /**
     * Obtiene el valor de la propiedad participacionDeuda.
     * 
     */
    public byte getParticipacionDeuda() {
        return participacionDeuda;
    }

    /**
     * Define el valor de la propiedad participacionDeuda.
     * 
     */
    public void setParticipacionDeuda(byte value) {
        this.participacionDeuda = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroObligacionesDia.
     * 
     */
    public byte getNumeroObligacionesDia() {
        return numeroObligacionesDia;
    }

    /**
     * Define el valor de la propiedad numeroObligacionesDia.
     * 
     */
    public void setNumeroObligacionesDia(byte value) {
        this.numeroObligacionesDia = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoObligacionesDia.
     * 
     */
    public int getSaldoObligacionesDia() {
        return saldoObligacionesDia;
    }

    /**
     * Define el valor de la propiedad saldoObligacionesDia.
     * 
     */
    public void setSaldoObligacionesDia(int value) {
        this.saldoObligacionesDia = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaObligacionesDia.
     * 
     */
    public short getCuotaObligacionesDia() {
        return cuotaObligacionesDia;
    }

    /**
     * Define el valor de la propiedad cuotaObligacionesDia.
     * 
     */
    public void setCuotaObligacionesDia(short value) {
        this.cuotaObligacionesDia = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadObligacionesMora.
     * 
     */
    public byte getCantidadObligacionesMora() {
        return cantidadObligacionesMora;
    }

    /**
     * Define el valor de la propiedad cantidadObligacionesMora.
     * 
     */
    public void setCantidadObligacionesMora(byte value) {
        this.cantidadObligacionesMora = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoObligacionesMora.
     * 
     */
    public byte getSaldoObligacionesMora() {
        return saldoObligacionesMora;
    }

    /**
     * Define el valor de la propiedad saldoObligacionesMora.
     * 
     */
    public void setSaldoObligacionesMora(byte value) {
        this.saldoObligacionesMora = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaObligacionesMora.
     * 
     */
    public byte getCuotaObligacionesMora() {
        return cuotaObligacionesMora;
    }

    /**
     * Define el valor de la propiedad cuotaObligacionesMora.
     * 
     */
    public void setCuotaObligacionesMora(byte value) {
        this.cuotaObligacionesMora = value;
    }

    /**
     * Obtiene el valor de la propiedad valorMora.
     * 
     */
    public byte getValorMora() {
        return valorMora;
    }

    /**
     * Define el valor de la propiedad valorMora.
     * 
     */
    public void setValorMora(byte value) {
        this.valorMora = value;
    }

}

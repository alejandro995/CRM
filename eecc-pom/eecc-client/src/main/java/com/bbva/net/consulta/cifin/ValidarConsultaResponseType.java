
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para validarConsultaResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validarConsultaResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombreTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RangoEdad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoCiiu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoDepartamento" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="gastosHipotecarios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cuposTarjCredito" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}cuposTarjCreditoType"/>
 *         &lt;element name="sobregiros" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gastosComerciales" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cuposComerciales" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gastosCuotaPrestamo" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}gastosCuotaPrestamoType"/>
 *         &lt;element name="puntajeBuro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tercero" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}TerceroType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarConsultaResponseType", propOrder = {
    "nombreTitular",
    "tipoIdentificacion",
    "numeroIdentificacion",
    "lugarExpedicion",
    "fechaExpedicion",
    "estado",
    "rangoEdad",
    "codigoCiiu",
    "codigoDepartamento",
    "codigoMunicipio",
    "fecha",
    "hora",
    "gastosHipotecarios",
    "cuposTarjCredito",
    "sobregiros",
    "gastosComerciales",
    "cuposComerciales",
    "gastosCuotaPrestamo",
    "puntajeBuro",
    "tercero"
})
public class ValidarConsultaResponseType {

    @XmlElement(name = "NombreTitular", required = true)
    protected String nombreTitular;
    @XmlElement(name = "TipoIdentificacion", required = true)
    protected String tipoIdentificacion;
    @XmlElement(name = "NumeroIdentificacion")
    protected int numeroIdentificacion;
    @XmlElement(name = "LugarExpedicion", required = true)
    protected String lugarExpedicion;
    @XmlElement(name = "FechaExpedicion", required = true)
    protected String fechaExpedicion;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "RangoEdad", required = true)
    protected String rangoEdad;
    @XmlElement(name = "CodigoCiiu", required = true)
    protected String codigoCiiu;
    @XmlElement(name = "CodigoDepartamento")
    protected byte codigoDepartamento;
    @XmlElement(name = "CodigoMunicipio")
    protected byte codigoMunicipio;
    @XmlElement(name = "Fecha", required = true)
    protected String fecha;
    @XmlElement(name = "Hora", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hora;
    @XmlElement(required = true)
    protected String gastosHipotecarios;
    @XmlElement(required = true)
    protected CuposTarjCreditoType cuposTarjCredito;
    @XmlElement(required = true)
    protected String sobregiros;
    @XmlElement(required = true)
    protected String gastosComerciales;
    @XmlElement(required = true)
    protected String cuposComerciales;
    @XmlElement(required = true)
    protected GastosCuotaPrestamoType gastosCuotaPrestamo;
    @XmlElement(required = true)
    protected String puntajeBuro;
    @XmlElement(name = "Tercero", required = true)
    protected TerceroType tercero;

    /**
     * Obtiene el valor de la propiedad nombreTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Define el valor de la propiedad nombreTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTitular(String value) {
        this.nombreTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacion(String value) {
        this.tipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroIdentificacion.
     * 
     */
    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacion.
     * 
     */
    public void setNumeroIdentificacion(int value) {
        this.numeroIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarExpedicion(String value) {
        this.lugarExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoEdad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangoEdad() {
        return rangoEdad;
    }

    /**
     * Define el valor de la propiedad rangoEdad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangoEdad(String value) {
        this.rangoEdad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCiiu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCiiu() {
        return codigoCiiu;
    }

    /**
     * Define el valor de la propiedad codigoCiiu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCiiu(String value) {
        this.codigoCiiu = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDepartamento.
     * 
     */
    public byte getCodigoDepartamento() {
        return codigoDepartamento;
    }

    /**
     * Define el valor de la propiedad codigoDepartamento.
     * 
     */
    public void setCodigoDepartamento(byte value) {
        this.codigoDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMunicipio.
     * 
     */
    public byte getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Define el valor de la propiedad codigoMunicipio.
     * 
     */
    public void setCodigoMunicipio(byte value) {
        this.codigoMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad hora.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHora() {
        return hora;
    }

    /**
     * Define el valor de la propiedad hora.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHora(XMLGregorianCalendar value) {
        this.hora = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosHipotecarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGastosHipotecarios() {
        return gastosHipotecarios;
    }

    /**
     * Define el valor de la propiedad gastosHipotecarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGastosHipotecarios(String value) {
        this.gastosHipotecarios = value;
    }

    /**
     * Obtiene el valor de la propiedad cuposTarjCredito.
     * 
     * @return
     *     possible object is
     *     {@link CuposTarjCreditoType }
     *     
     */
    public CuposTarjCreditoType getCuposTarjCredito() {
        return cuposTarjCredito;
    }

    /**
     * Define el valor de la propiedad cuposTarjCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link CuposTarjCreditoType }
     *     
     */
    public void setCuposTarjCredito(CuposTarjCreditoType value) {
        this.cuposTarjCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad sobregiros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobregiros() {
        return sobregiros;
    }

    /**
     * Define el valor de la propiedad sobregiros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobregiros(String value) {
        this.sobregiros = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosComerciales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGastosComerciales() {
        return gastosComerciales;
    }

    /**
     * Define el valor de la propiedad gastosComerciales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGastosComerciales(String value) {
        this.gastosComerciales = value;
    }

    /**
     * Obtiene el valor de la propiedad cuposComerciales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuposComerciales() {
        return cuposComerciales;
    }

    /**
     * Define el valor de la propiedad cuposComerciales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuposComerciales(String value) {
        this.cuposComerciales = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosCuotaPrestamo.
     * 
     * @return
     *     possible object is
     *     {@link GastosCuotaPrestamoType }
     *     
     */
    public GastosCuotaPrestamoType getGastosCuotaPrestamo() {
        return gastosCuotaPrestamo;
    }

    /**
     * Define el valor de la propiedad gastosCuotaPrestamo.
     * 
     * @param value
     *     allowed object is
     *     {@link GastosCuotaPrestamoType }
     *     
     */
    public void setGastosCuotaPrestamo(GastosCuotaPrestamoType value) {
        this.gastosCuotaPrestamo = value;
    }

    /**
     * Obtiene el valor de la propiedad puntajeBuro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuntajeBuro() {
        return puntajeBuro;
    }

    /**
     * Define el valor de la propiedad puntajeBuro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuntajeBuro(String value) {
        this.puntajeBuro = value;
    }

    /**
     * Obtiene el valor de la propiedad tercero.
     * 
     * @return
     *     possible object is
     *     {@link TerceroType }
     *     
     */
    public TerceroType getTercero() {
        return tercero;
    }

    /**
     * Define el valor de la propiedad tercero.
     * 
     * @param value
     *     allowed object is
     *     {@link TerceroType }
     *     
     */
    public void setTercero(TerceroType value) {
        this.tercero = value;
    }

}

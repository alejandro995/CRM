
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para TerceroType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TerceroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificadorLinea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoTipoIndentificacion" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NumeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NombreTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreCiiu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroInforme" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EstadoTitular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RangoEdad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoCiiu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoDepartamento" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CodigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="Entidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RespuestaConsulta" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Consolidado" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}ConsolidadoType"/>
 *         &lt;element name="CuentasVigentes" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}CuentasVigentesType"/>
 *         &lt;element name="CuentasExtinguidas" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}CuentasExtinguidasType"/>
 *         &lt;element name="SectorFinancieroAlDia" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}SectorFinancieroAlDiaType"/>
 *         &lt;element name="SectorFinancieroExtinguidas" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}SectorFinancieroExtinguidasType"/>
 *         &lt;element name="SectorRealAlDia" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}SectorRealAlDiaType"/>
 *         &lt;element name="SectorRealExtinguidas" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}SectorRealExtinguidasType"/>
 *         &lt;element name="Endeudamiento" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}EndeudamientoType"/>
 *         &lt;element name="HuellaConsulta" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}HuellaConsultaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerceroType", propOrder = {
    "identificadorLinea",
    "tipoIdentificacion",
    "codigoTipoIndentificacion",
    "numeroIdentificacion",
    "nombreTitular",
    "nombreCiiu",
    "lugarExpedicion",
    "fechaExpedicion",
    "estado",
    "numeroInforme",
    "estadoTitular",
    "rangoEdad",
    "codigoCiiu",
    "codigoDepartamento",
    "codigoMunicipio",
    "fecha",
    "hora",
    "entidad",
    "respuestaConsulta",
    "consolidado",
    "cuentasVigentes",
    "cuentasExtinguidas",
    "sectorFinancieroAlDia",
    "sectorFinancieroExtinguidas",
    "sectorRealAlDia",
    "sectorRealExtinguidas",
    "endeudamiento",
    "huellaConsulta"
})
public class TerceroType {

    @XmlElement(name = "IdentificadorLinea")
    protected int identificadorLinea;
    @XmlElement(name = "TipoIdentificacion", required = true)
    protected String tipoIdentificacion;
    @XmlElement(name = "CodigoTipoIndentificacion")
    protected byte codigoTipoIndentificacion;
    @XmlElement(name = "NumeroIdentificacion")
    protected int numeroIdentificacion;
    @XmlElement(name = "NombreTitular", required = true)
    protected String nombreTitular;
    @XmlElement(name = "NombreCiiu", required = true)
    protected String nombreCiiu;
    @XmlElement(name = "LugarExpedicion", required = true)
    protected String lugarExpedicion;
    @XmlElement(name = "FechaExpedicion", required = true)
    protected String fechaExpedicion;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "NumeroInforme")
    protected long numeroInforme;
    @XmlElement(name = "EstadoTitular", required = true)
    protected String estadoTitular;
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
    @XmlElement(name = "Entidad", required = true)
    protected String entidad;
    @XmlElement(name = "RespuestaConsulta")
    protected byte respuestaConsulta;
    @XmlElement(name = "Consolidado", required = true)
    protected ConsolidadoType consolidado;
    @XmlElement(name = "CuentasVigentes", required = true)
    protected CuentasVigentesType cuentasVigentes;
    @XmlElement(name = "CuentasExtinguidas", required = true)
    protected CuentasExtinguidasType cuentasExtinguidas;
    @XmlElement(name = "SectorFinancieroAlDia", required = true)
    protected SectorFinancieroAlDiaType sectorFinancieroAlDia;
    @XmlElement(name = "SectorFinancieroExtinguidas", required = true)
    protected SectorFinancieroExtinguidasType sectorFinancieroExtinguidas;
    @XmlElement(name = "SectorRealAlDia", required = true)
    protected SectorRealAlDiaType sectorRealAlDia;
    @XmlElement(name = "SectorRealExtinguidas", required = true)
    protected SectorRealExtinguidasType sectorRealExtinguidas;
    @XmlElement(name = "Endeudamiento", required = true)
    protected EndeudamientoType endeudamiento;
    @XmlElement(name = "HuellaConsulta", required = true)
    protected HuellaConsultaType huellaConsulta;

    /**
     * Obtiene el valor de la propiedad identificadorLinea.
     * 
     */
    public int getIdentificadorLinea() {
        return identificadorLinea;
    }

    /**
     * Define el valor de la propiedad identificadorLinea.
     * 
     */
    public void setIdentificadorLinea(int value) {
        this.identificadorLinea = value;
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
     * Obtiene el valor de la propiedad codigoTipoIndentificacion.
     * 
     */
    public byte getCodigoTipoIndentificacion() {
        return codigoTipoIndentificacion;
    }

    /**
     * Define el valor de la propiedad codigoTipoIndentificacion.
     * 
     */
    public void setCodigoTipoIndentificacion(byte value) {
        this.codigoTipoIndentificacion = value;
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
     * Obtiene el valor de la propiedad nombreCiiu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCiiu() {
        return nombreCiiu;
    }

    /**
     * Define el valor de la propiedad nombreCiiu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCiiu(String value) {
        this.nombreCiiu = value;
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
     * Obtiene el valor de la propiedad numeroInforme.
     * 
     */
    public long getNumeroInforme() {
        return numeroInforme;
    }

    /**
     * Define el valor de la propiedad numeroInforme.
     * 
     */
    public void setNumeroInforme(long value) {
        this.numeroInforme = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoTitular() {
        return estadoTitular;
    }

    /**
     * Define el valor de la propiedad estadoTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoTitular(String value) {
        this.estadoTitular = value;
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
     * Obtiene el valor de la propiedad entidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidad(String value) {
        this.entidad = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestaConsulta.
     * 
     */
    public byte getRespuestaConsulta() {
        return respuestaConsulta;
    }

    /**
     * Define el valor de la propiedad respuestaConsulta.
     * 
     */
    public void setRespuestaConsulta(byte value) {
        this.respuestaConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad consolidado.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidadoType }
     *     
     */
    public ConsolidadoType getConsolidado() {
        return consolidado;
    }

    /**
     * Define el valor de la propiedad consolidado.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidadoType }
     *     
     */
    public void setConsolidado(ConsolidadoType value) {
        this.consolidado = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentasVigentes.
     * 
     * @return
     *     possible object is
     *     {@link CuentasVigentesType }
     *     
     */
    public CuentasVigentesType getCuentasVigentes() {
        return cuentasVigentes;
    }

    /**
     * Define el valor de la propiedad cuentasVigentes.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentasVigentesType }
     *     
     */
    public void setCuentasVigentes(CuentasVigentesType value) {
        this.cuentasVigentes = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentasExtinguidas.
     * 
     * @return
     *     possible object is
     *     {@link CuentasExtinguidasType }
     *     
     */
    public CuentasExtinguidasType getCuentasExtinguidas() {
        return cuentasExtinguidas;
    }

    /**
     * Define el valor de la propiedad cuentasExtinguidas.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentasExtinguidasType }
     *     
     */
    public void setCuentasExtinguidas(CuentasExtinguidasType value) {
        this.cuentasExtinguidas = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorFinancieroAlDia.
     * 
     * @return
     *     possible object is
     *     {@link SectorFinancieroAlDiaType }
     *     
     */
    public SectorFinancieroAlDiaType getSectorFinancieroAlDia() {
        return sectorFinancieroAlDia;
    }

    /**
     * Define el valor de la propiedad sectorFinancieroAlDia.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorFinancieroAlDiaType }
     *     
     */
    public void setSectorFinancieroAlDia(SectorFinancieroAlDiaType value) {
        this.sectorFinancieroAlDia = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorFinancieroExtinguidas.
     * 
     * @return
     *     possible object is
     *     {@link SectorFinancieroExtinguidasType }
     *     
     */
    public SectorFinancieroExtinguidasType getSectorFinancieroExtinguidas() {
        return sectorFinancieroExtinguidas;
    }

    /**
     * Define el valor de la propiedad sectorFinancieroExtinguidas.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorFinancieroExtinguidasType }
     *     
     */
    public void setSectorFinancieroExtinguidas(SectorFinancieroExtinguidasType value) {
        this.sectorFinancieroExtinguidas = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorRealAlDia.
     * 
     * @return
     *     possible object is
     *     {@link SectorRealAlDiaType }
     *     
     */
    public SectorRealAlDiaType getSectorRealAlDia() {
        return sectorRealAlDia;
    }

    /**
     * Define el valor de la propiedad sectorRealAlDia.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorRealAlDiaType }
     *     
     */
    public void setSectorRealAlDia(SectorRealAlDiaType value) {
        this.sectorRealAlDia = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorRealExtinguidas.
     * 
     * @return
     *     possible object is
     *     {@link SectorRealExtinguidasType }
     *     
     */
    public SectorRealExtinguidasType getSectorRealExtinguidas() {
        return sectorRealExtinguidas;
    }

    /**
     * Define el valor de la propiedad sectorRealExtinguidas.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorRealExtinguidasType }
     *     
     */
    public void setSectorRealExtinguidas(SectorRealExtinguidasType value) {
        this.sectorRealExtinguidas = value;
    }

    /**
     * Obtiene el valor de la propiedad endeudamiento.
     * 
     * @return
     *     possible object is
     *     {@link EndeudamientoType }
     *     
     */
    public EndeudamientoType getEndeudamiento() {
        return endeudamiento;
    }

    /**
     * Define el valor de la propiedad endeudamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link EndeudamientoType }
     *     
     */
    public void setEndeudamiento(EndeudamientoType value) {
        this.endeudamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad huellaConsulta.
     * 
     * @return
     *     possible object is
     *     {@link HuellaConsultaType }
     *     
     */
    public HuellaConsultaType getHuellaConsulta() {
        return huellaConsulta;
    }

    /**
     * Define el valor de la propiedad huellaConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link HuellaConsultaType }
     *     
     */
    public void setHuellaConsulta(HuellaConsultaType value) {
        this.huellaConsulta = value;
    }

}

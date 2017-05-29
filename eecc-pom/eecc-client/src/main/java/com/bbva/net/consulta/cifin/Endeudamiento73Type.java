
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Endeudamiento73Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Endeudamiento73Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoEntidadOriginadoraCartera" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EntidadOriginadoraCartera" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoFideicomiso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroFideicomiso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ModalidadCredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Calificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroOperadores" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ValorDeuda" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ParticipacionTotalDeudas" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CubrimientoGarantia" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TipoGarantia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaUltimoAvaluo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CuotaEsperada" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CumplimientoCuota" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Endeudamiento73Type", propOrder = {
    "tipoEntidad",
    "nombreEntidad",
    "tipoEntidadOriginadoraCartera",
    "entidadOriginadoraCartera",
    "tipoFideicomiso",
    "numeroFideicomiso",
    "modalidadCredito",
    "calificacion",
    "tipoMoneda",
    "numeroOperadores",
    "valorDeuda",
    "participacionTotalDeudas",
    "cubrimientoGarantia",
    "tipoGarantia",
    "fechaUltimoAvaluo",
    "cuotaEsperada",
    "cumplimientoCuota"
})
public class Endeudamiento73Type {

    @XmlElement(name = "TipoEntidad", required = true)
    protected String tipoEntidad;
    @XmlElement(name = "NombreEntidad", required = true)
    protected String nombreEntidad;
    @XmlElement(name = "TipoEntidadOriginadoraCartera", required = true)
    protected String tipoEntidadOriginadoraCartera;
    @XmlElement(name = "EntidadOriginadoraCartera", required = true)
    protected String entidadOriginadoraCartera;
    @XmlElement(name = "TipoFideicomiso", required = true)
    protected String tipoFideicomiso;
    @XmlElement(name = "NumeroFideicomiso", required = true)
    protected String numeroFideicomiso;
    @XmlElement(name = "ModalidadCredito", required = true)
    protected String modalidadCredito;
    @XmlElement(name = "Calificacion", required = true)
    protected String calificacion;
    @XmlElement(name = "TipoMoneda", required = true)
    protected String tipoMoneda;
    @XmlElement(name = "NumeroOperadores")
    protected byte numeroOperadores;
    @XmlElement(name = "ValorDeuda")
    protected float valorDeuda;
    @XmlElement(name = "ParticipacionTotalDeudas")
    protected float participacionTotalDeudas;
    @XmlElement(name = "CubrimientoGarantia")
    protected float cubrimientoGarantia;
    @XmlElement(name = "TipoGarantia", required = true)
    protected String tipoGarantia;
    @XmlElement(name = "FechaUltimoAvaluo", required = true)
    protected String fechaUltimoAvaluo;
    @XmlElement(name = "CuotaEsperada")
    protected short cuotaEsperada;
    @XmlElement(name = "CumplimientoCuota")
    protected float cumplimientoCuota;

    /**
     * Obtiene el valor de la propiedad tipoEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEntidad() {
        return tipoEntidad;
    }

    /**
     * Define el valor de la propiedad tipoEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEntidad(String value) {
        this.tipoEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    /**
     * Define el valor de la propiedad nombreEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidad(String value) {
        this.nombreEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEntidadOriginadoraCartera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEntidadOriginadoraCartera() {
        return tipoEntidadOriginadoraCartera;
    }

    /**
     * Define el valor de la propiedad tipoEntidadOriginadoraCartera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEntidadOriginadoraCartera(String value) {
        this.tipoEntidadOriginadoraCartera = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadOriginadoraCartera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadOriginadoraCartera() {
        return entidadOriginadoraCartera;
    }

    /**
     * Define el valor de la propiedad entidadOriginadoraCartera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadOriginadoraCartera(String value) {
        this.entidadOriginadoraCartera = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFideicomiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFideicomiso() {
        return tipoFideicomiso;
    }

    /**
     * Define el valor de la propiedad tipoFideicomiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFideicomiso(String value) {
        this.tipoFideicomiso = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroFideicomiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFideicomiso() {
        return numeroFideicomiso;
    }

    /**
     * Define el valor de la propiedad numeroFideicomiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFideicomiso(String value) {
        this.numeroFideicomiso = value;
    }

    /**
     * Obtiene el valor de la propiedad modalidadCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalidadCredito() {
        return modalidadCredito;
    }

    /**
     * Define el valor de la propiedad modalidadCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalidadCredito(String value) {
        this.modalidadCredito = value;
    }

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
     * Obtiene el valor de la propiedad numeroOperadores.
     * 
     */
    public byte getNumeroOperadores() {
        return numeroOperadores;
    }

    /**
     * Define el valor de la propiedad numeroOperadores.
     * 
     */
    public void setNumeroOperadores(byte value) {
        this.numeroOperadores = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDeuda.
     * 
     */
    public float getValorDeuda() {
        return valorDeuda;
    }

    /**
     * Define el valor de la propiedad valorDeuda.
     * 
     */
    public void setValorDeuda(float value) {
        this.valorDeuda = value;
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
     * Obtiene el valor de la propiedad cubrimientoGarantia.
     * 
     */
    public float getCubrimientoGarantia() {
        return cubrimientoGarantia;
    }

    /**
     * Define el valor de la propiedad cubrimientoGarantia.
     * 
     */
    public void setCubrimientoGarantia(float value) {
        this.cubrimientoGarantia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoGarantia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoGarantia() {
        return tipoGarantia;
    }

    /**
     * Define el valor de la propiedad tipoGarantia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoGarantia(String value) {
        this.tipoGarantia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimoAvaluo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUltimoAvaluo() {
        return fechaUltimoAvaluo;
    }

    /**
     * Define el valor de la propiedad fechaUltimoAvaluo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltimoAvaluo(String value) {
        this.fechaUltimoAvaluo = value;
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
     */
    public float getCumplimientoCuota() {
        return cumplimientoCuota;
    }

    /**
     * Define el valor de la propiedad cumplimientoCuota.
     * 
     */
    public void setCumplimientoCuota(float value) {
        this.cumplimientoCuota = value;
    }

}

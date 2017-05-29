
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FechaConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreTipoEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MotivoConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoTipoEntidad" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CodigoEntidad" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaType", propOrder = {
    "fechaConsulta",
    "nombreTipoEntidad",
    "nombreEntidad",
    "sucursal",
    "ciudad",
    "motivoConsulta",
    "codigoTipoEntidad",
    "codigoEntidad"
})
public class ConsultaType {

    @XmlElement(name = "FechaConsulta", required = true)
    protected String fechaConsulta;
    @XmlElement(name = "NombreTipoEntidad", required = true)
    protected String nombreTipoEntidad;
    @XmlElement(name = "NombreEntidad", required = true)
    protected String nombreEntidad;
    @XmlElement(name = "Sucursal", required = true)
    protected String sucursal;
    @XmlElement(name = "Ciudad", required = true)
    protected String ciudad;
    @XmlElement(name = "MotivoConsulta", required = true)
    protected String motivoConsulta;
    @XmlElement(name = "CodigoTipoEntidad")
    protected byte codigoTipoEntidad;
    @XmlElement(name = "CodigoEntidad")
    protected byte codigoEntidad;

    /**
     * Obtiene el valor de la propiedad fechaConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaConsulta() {
        return fechaConsulta;
    }

    /**
     * Define el valor de la propiedad fechaConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaConsulta(String value) {
        this.fechaConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTipoEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTipoEntidad() {
        return nombreTipoEntidad;
    }

    /**
     * Define el valor de la propiedad nombreTipoEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTipoEntidad(String value) {
        this.nombreTipoEntidad = value;
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
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucursal(String value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    /**
     * Define el valor de la propiedad motivoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoConsulta(String value) {
        this.motivoConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoEntidad.
     * 
     */
    public byte getCodigoTipoEntidad() {
        return codigoTipoEntidad;
    }

    /**
     * Define el valor de la propiedad codigoTipoEntidad.
     * 
     */
    public void setCodigoTipoEntidad(byte value) {
        this.codigoTipoEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEntidad.
     * 
     */
    public byte getCodigoEntidad() {
        return codigoEntidad;
    }

    /**
     * Define el valor de la propiedad codigoEntidad.
     * 
     */
    public void setCodigoEntidad(byte value) {
        this.codigoEntidad = value;
    }

}

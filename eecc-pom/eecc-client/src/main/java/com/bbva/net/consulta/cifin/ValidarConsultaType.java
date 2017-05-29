
package com.bbva.net.consulta.cifin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validarConsultaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validarConsultaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoInformacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="motivoConsulta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoIdentificacion" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}tipoIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarConsultaType", propOrder = {
    "codigoInformacion",
    "motivoConsulta",
    "numeroIdentificacion",
    "tipoIdentificacion"
})
public class ValidarConsultaType {

    protected Integer codigoInformacion;
    protected Integer motivoConsulta;
    protected Integer numeroIdentificacion;
    protected TipoIdType tipoIdentificacion;

    /**
     * Obtiene el valor de la propiedad codigoInformacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoInformacion() {
        return codigoInformacion;
    }

    /**
     * Define el valor de la propiedad codigoInformacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoInformacion(Integer value) {
        this.codigoInformacion = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMotivoConsulta() {
        return motivoConsulta;
    }

    /**
     * Define el valor de la propiedad motivoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMotivoConsulta(Integer value) {
        this.motivoConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroIdentificacion(Integer value) {
        this.numeroIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdType }
     *     
     */
    public TipoIdType getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdType }
     *     
     */
    public void setTipoIdentificacion(TipoIdType value) {
        this.tipoIdentificacion = value;
    }

}

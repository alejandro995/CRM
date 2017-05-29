package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for Persona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Persona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="codigoPersonaSimulacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://com.lsc.services.bbva.common/libertyTypes}Direccion"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono" type="{http://com.lsc.services.bbva.common/libertyTypes}Telefono"/>
 *         &lt;element name="tipoDocumento" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Persona", propOrder = {
    "codigo",
    "codigoPersonaSimulacion",
    "direccion",
    "numeroDocumento",
    "telefono",
    "tipoDocumento"
})
@XmlSeeAlso({
    PersonaNatural.class,
    PersonaJuridica.class
})
public class Persona {

    protected BigDecimal codigo;
    protected BigDecimal codigoPersonaSimulacion;
    @XmlElement(required = true)
    protected Direccion direccion;
    @XmlElement(required = true)
    protected String numeroDocumento;
    @XmlElement(required = true)
    protected Telefono telefono;
    @XmlElement(required = true)
    protected ElementoCodificado tipoDocumento;

    /**
     * Gets the value of the codigo property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCodigo(BigDecimal value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the codigoPersonaSimulacion property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCodigoPersonaSimulacion() {
        return codigoPersonaSimulacion;
    }

    /**
     * Sets the value of the codigoPersonaSimulacion property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCodigoPersonaSimulacion(BigDecimal value) {
        this.codigoPersonaSimulacion = value;
    }

    /**
     * Gets the value of the direccion property.
     *
     * @return
     *     possible object is
     *     {@link Direccion }
     *
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     *
     * @param value
     *     allowed object is
     *     {@link Direccion }
     *     
     */
    public void setDireccion(Direccion value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link Telefono }
     *     
     */
    public Telefono getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telefono }
     *     
     */
    public void setTelefono(Telefono value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setTipoDocumento(ElementoCodificado value) {
        this.tipoDocumento = value;
    }

}

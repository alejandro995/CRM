package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for Identificacion_type0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identificacion_type0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="color" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *         &lt;element name="kilometraje" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="motor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://com.lsc.services.bbva.common/libertyTypes}Placa"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorNuevo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tipoCampero" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado" minOccurs="0"/>
 *         &lt;element name="tipoCarroceria" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado" minOccurs="0"/>
 *         &lt;element name="tipoPintura" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado" minOccurs="0"/>
 *         &lt;element name="tipoRemolque" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado" minOccurs="0"/>
 *         &lt;element name="transportaCombustible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identificacion_type0", propOrder = {
    "chasis",
    "color",
    "kilometraje",
    "motor",
    "placa",
    "valor",
    "valorNuevo",
    "tipoCampero",
    "tipoCarroceria",
    "tipoPintura",
    "tipoRemolque",
    "transportaCombustible",
    "vin"
})
public class Identificacion_type0 {

    protected String chasis;
    @XmlElement(required = true)
    protected ElementoCodificado color;
    @XmlElement(required = true)
    protected BigDecimal kilometraje;
    protected String motor;
    @XmlElement(required = true)
    protected Placa placa;
    protected BigDecimal valor;
    protected BigDecimal valorNuevo;
    protected ElementoCodificado tipoCampero;
    protected ElementoCodificado tipoCarroceria;
    protected ElementoCodificado tipoPintura;
    protected ElementoCodificado tipoRemolque;
    protected boolean transportaCombustible;
    protected String vin;

    /**
     * Gets the value of the chasis property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChasis() {
        return chasis;
    }

    /**
     * Sets the value of the chasis property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChasis(String value) {
        this.chasis = value;
    }

    /**
     * Gets the value of the color property.
     *
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *
     */
    public ElementoCodificado getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *
     */
    public void setColor(ElementoCodificado value) {
        this.color = value;
    }

    /**
     * Gets the value of the kilometraje property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getKilometraje() {
        return kilometraje;
    }

    /**
     * Sets the value of the kilometraje property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setKilometraje(BigDecimal value) {
        this.kilometraje = value;
    }

    /**
     * Gets the value of the motor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMotor() {
        return motor;
    }

    /**
     * Sets the value of the motor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMotor(String value) {
        this.motor = value;
    }

    /**
     * Gets the value of the placa property.
     *
     * @return
     *     possible object is
     *     {@link Placa }
     *
     */
    public Placa getPlaca() {
        return placa;
    }

    /**
     * Sets the value of the placa property.
     *
     * @param value
     *     allowed object is
     *     {@link Placa }
     *
     */
    public void setPlaca(Placa value) {
        this.placa = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

    /**
     * Gets the value of the valorNuevo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorNuevo() {
        return valorNuevo;
    }

    /**
     * Sets the value of the valorNuevo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorNuevo(BigDecimal value) {
        this.valorNuevo = value;
    }

    /**
     * Gets the value of the tipoCampero property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getTipoCampero() {
        return tipoCampero;
    }

    /**
     * Sets the value of the tipoCampero property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setTipoCampero(ElementoCodificado value) {
        this.tipoCampero = value;
    }

    /**
     * Gets the value of the tipoCarroceria property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getTipoCarroceria() {
        return tipoCarroceria;
    }

    /**
     * Sets the value of the tipoCarroceria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setTipoCarroceria(ElementoCodificado value) {
        this.tipoCarroceria = value;
    }

    /**
     * Gets the value of the tipoPintura property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getTipoPintura() {
        return tipoPintura;
    }

    /**
     * Sets the value of the tipoPintura property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setTipoPintura(ElementoCodificado value) {
        this.tipoPintura = value;
    }

    /**
     * Gets the value of the tipoRemolque property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getTipoRemolque() {
        return tipoRemolque;
    }

    /**
     * Sets the value of the tipoRemolque property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setTipoRemolque(ElementoCodificado value) {
        this.tipoRemolque = value;
    }

    /**
     * Gets the value of the transportaCombustible property.
     * 
     */
    public boolean isTransportaCombustible() {
        return transportaCombustible;
    }

    /**
     * Sets the value of the transportaCombustible property.
     * 
     */
    public void setTransportaCombustible(boolean value) {
        this.transportaCombustible = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

}

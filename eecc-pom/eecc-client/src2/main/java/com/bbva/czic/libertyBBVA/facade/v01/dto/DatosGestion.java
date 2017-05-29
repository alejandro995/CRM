package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatosGestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatosGestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agente" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *         &lt;element name="duracion" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *         &lt;element name="fechaEfecto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="formaPago" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *         &lt;element name="producto" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosGestion", propOrder = {
    "agente",
    "duracion",
    "fechaEfecto",
    "formaPago",
    "producto"
})
public class DatosGestion {

    @XmlElement(required = true)
    protected ElementoCodificado agente;
    @XmlElement(required = true)
    protected ElementoCodificado duracion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEfecto;
    @XmlElement(required = true)
    protected ElementoCodificado formaPago;
    @XmlElement(required = true)
    protected ElementoCodificado producto;

    /**
     * Gets the value of the agente property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getAgente() {
        return agente;
    }

    /**
     * Sets the value of the agente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setAgente(ElementoCodificado value) {
        this.agente = value;
    }

    /**
     * Gets the value of the duracion property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getDuracion() {
        return duracion;
    }

    /**
     * Sets the value of the duracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setDuracion(ElementoCodificado value) {
        this.duracion = value;
    }

    /**
     * Gets the value of the fechaEfecto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEfecto() {
        return fechaEfecto;
    }

    /**
     * Sets the value of the fechaEfecto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEfecto(XMLGregorianCalendar value) {
        this.fechaEfecto = value;
    }

    /**
     * Gets the value of the formaPago property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getFormaPago() {
        return formaPago;
    }

    /**
     * Sets the value of the formaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setFormaPago(ElementoCodificado value) {
        this.formaPago = value;
    }

    /**
     * Gets the value of the producto property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getProducto() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setProducto(ElementoCodificado value) {
        this.producto = value;
    }

}

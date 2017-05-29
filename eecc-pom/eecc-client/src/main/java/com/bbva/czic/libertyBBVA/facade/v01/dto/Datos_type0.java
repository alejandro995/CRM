package com.bbva.czic.libertyBBVA.facade.v01.dto;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Datos_type0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Datos_type0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoFasecolda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modeloAnyo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Datos_type0", propOrder = {
    "codigoFasecolda",
    "descripcion",
    "modeloAnyo"
})
public class Datos_type0 {

    @XmlElement(required = true)
    protected String codigoFasecolda;
    protected String descripcion;
    protected int modeloAnyo;

    /**
     * Gets the value of the codigoFasecolda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFasecolda() {
        return codigoFasecolda;
    }

    /**
     * Sets the value of the codigoFasecolda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFasecolda(String value) {
        this.codigoFasecolda = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the modeloAnyo property.
     * 
     */
    public int getModeloAnyo() {
        return modeloAnyo;
    }

    /**
     * Sets the value of the modeloAnyo property.
     * 
     */
    public void setModeloAnyo(int value) {
        this.modeloAnyo = value;
    }

}

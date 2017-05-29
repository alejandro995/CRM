package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for Simulacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Simulacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="prima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formapago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urldownload" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Simulacion", propOrder = {
    "codigo",
    "prima",
    "formapago",
    "urldownload"
})
public class Simulacion {

    protected BigDecimal codigo;
    protected String prima;
    protected String formapago;
    protected String urldownload;

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
     * Gets the value of the prima property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrima() {
        return prima;
    }

    /**
     * Sets the value of the prima property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrima(String value) {
        this.prima = value;
    }

    /**
     * Gets the value of the formapago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormapago() {
        return formapago;
    }

    /**
     * Sets the value of the formapago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormapago(String value) {
        this.formapago = value;
    }

    /**
     * Gets the value of the urldownload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrldownload() {
        return urldownload;
    }

    /**
     * Sets the value of the urldownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrldownload(String value) {
        this.urldownload = value;
    }

}

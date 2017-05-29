package com.bbva.czic.libertyBBVA.facade.v01.dto;

import com.bbva.czic.libertyBBVA.facade.v01.dto.Ficheros;
import com.bbva.czic.libertyBBVA.facade.v01.dto.InfoRequest;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoRequest" type="{http://AdjuntarDocumentacion/AddDocumentation}InfoRequest"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ficheros" type="{http://AdjuntarDocumentacion/AddDocumentation}ficheros"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "infoRequest",
    "tipo",
    "codigo",
    "ficheros"
})
@XmlRootElement(name = "recepcionFicherosRq")
public class RecepcionFicherosRq {

    @XmlElement(required = true)
    protected InfoRequest infoRequest;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected Ficheros ficheros;

    /**
     * Gets the value of the infoRequest property.
     *
     * @return
     *     possible object is
     *     {@link InfoRequest }
     *
     */
    public InfoRequest getInfoRequest() {
        return infoRequest;
    }

    /**
     * Sets the value of the infoRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link InfoRequest }
     *
     */
    public void setInfoRequest(InfoRequest value) {
        this.infoRequest = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the ficheros property.
     * 
     * @return
     *     possible object is
     *     {@link Ficheros }
     *     
     */
    public Ficheros getFicheros() {
        return ficheros;
    }

    /**
     * Sets the value of the ficheros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ficheros }
     *     
     */
    public void setFicheros(Ficheros value) {
        this.ficheros = value;
    }

}

package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Coaseguro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coaseguro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoCoaseguro" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *         &lt;element name="compania" type="{http://com.lsc.services.bbva.common/libertyTypes}Compania" maxOccurs="unbounded"/>
 *         &lt;element name="porcentajeParticipacionLocal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coaseguro", propOrder = {
    "tipoCoaseguro",
    "compania",
    "porcentajeParticipacionLocal"
})

public class Coaseguro {

    @XmlElement(required = true)
    protected ElementoCodificado tipoCoaseguro;
    @XmlElement(required = true)
    protected List<Compania> compania;
    protected float porcentajeParticipacionLocal;

    /**
     * Gets the value of the tipoCoaseguro property.
     * 
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *     
     */
    public ElementoCodificado getTipoCoaseguro() {
        return tipoCoaseguro;
    }

    /**
     * Sets the value of the tipoCoaseguro property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setTipoCoaseguro(ElementoCodificado value) {
        this.tipoCoaseguro = value;
    }

    /**
     * Gets the value of the compania property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compania property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompania().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Compania }
     * 
     * 
     */
    public List<Compania> getCompania() {
        if (compania == null) {
            compania = new ArrayList<Compania>();
        }
        return this.compania;
    }

    /**
     * Gets the value of the porcentajeParticipacionLocal property.
     * 
     */
    public float getPorcentajeParticipacionLocal() {
        return porcentajeParticipacionLocal;
    }

    /**
     * Sets the value of the porcentajeParticipacionLocal property.
     * 
     */
    public void setPorcentajeParticipacionLocal(float value) {
        this.porcentajeParticipacionLocal = value;
    }

}

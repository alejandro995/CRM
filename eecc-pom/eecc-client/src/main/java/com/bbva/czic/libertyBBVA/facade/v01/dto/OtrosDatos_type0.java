package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for OtrosDatos_type0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtrosDatos_type0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accesorio" type="{http://com.lsc.services.bbva.common/libertyTypes}Accesorio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dispositivoSeguridad" type="{http://com.lsc.services.bbva.common/libertyTypes}DispositivoSeguridad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nuevo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="uso" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtrosDatos_type0", propOrder = {
    "accesorio",
    "dispositivoSeguridad",
    "nuevo",
    "uso"
})
public class OtrosDatos_type0 {

    protected List<Accesorio> accesorio;
    protected List<DispositivoSeguridad> dispositivoSeguridad;
    protected boolean nuevo;
    @XmlElement(required = true)
    protected ElementoCodificado uso;

    /**
     * Gets the value of the accesorio property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accesorio property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccesorio().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accesorio }
     *
     *
     */
    public List<Accesorio> getAccesorio() {
        if (accesorio == null) {
            accesorio = new ArrayList<Accesorio>();
        }
        return this.accesorio;
    }

    /**
     * Gets the value of the dispositivoSeguridad property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispositivoSeguridad property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispositivoSeguridad().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DispositivoSeguridad }
     *
     *
     */
    public List<DispositivoSeguridad> getDispositivoSeguridad() {
        if (dispositivoSeguridad == null) {
            dispositivoSeguridad = new ArrayList<DispositivoSeguridad>();
        }
        return this.dispositivoSeguridad;
    }

    /**
     * Gets the value of the nuevo property.
     *
     */
    public boolean isNuevo() {
        return nuevo;
    }

    /**
     * Sets the value of the nuevo property.
     *
     */
    public void setNuevo(boolean value) {
        this.nuevo = value;
    }

    /**
     * Gets the value of the uso property.
     *
     * @return
     *     possible object is
     *     {@link ElementoCodificado }
     *
     */
    public ElementoCodificado getUso() {
        return uso;
    }

    /**
     * Sets the value of the uso property.
     *
     * @param value
     *     allowed object is
     *     {@link ElementoCodificado }
     *     
     */
    public void setUso(ElementoCodificado value) {
        this.uso = value;
    }

}

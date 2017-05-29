package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.*;


/**
 * Información petición
 * 
 * <p>Java class for NotificarCambioCuentaRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificarCambioCuentaRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoRequest" type="{http://com.lsc.services.bbva.common/libertyTypes}InfoRequest"/>
 *         &lt;element name="npoliza" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ctipban" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cbancar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationAccountChange", propOrder = {
    "infoRequest",
    "npoliza",
    "ctipban",
    "cbancar"
})
@XmlRootElement(name = "NotificationAccountChange")
public class NotificationAccountChange {

    @XmlElement(required = true)
    protected InfoRequest infoRequest;
    protected long npoliza;
    protected int ctipban;
    @XmlElement(required = true)
    protected String cbancar;

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
     * Gets the value of the npoliza property.
     * 
     */
    public long getNpoliza() {
        return npoliza;
    }

    /**
     * Sets the value of the npoliza property.
     * 
     */
    public void setNpoliza(long value) {
        this.npoliza = value;
    }

    /**
     * Gets the value of the ctipban property.
     * 
     */
    public int getCtipban() {
        return ctipban;
    }

    /**
     * Sets the value of the ctipban property.
     * 
     */
    public void setCtipban(int value) {
        this.ctipban = value;
    }

    /**
     * Gets the value of the cbancar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbancar() {
        return cbancar;
    }

    /**
     * Sets the value of the cbancar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbancar(String value) {
        this.cbancar = value;
    }

}

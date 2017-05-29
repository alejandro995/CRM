package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SimulationAutomovilResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimulationAutomovilResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoResponse" type="{http://com.lsc.services.bbva.common/libertyTypes}InfoResponse"/>
 *         &lt;element name="simulacion" type="{http://com.lsc.services.bbva.common/libertyTypes}SimulacionArray" minOccurs="0"/>
 *         &lt;element name="documentacionCotizacion" type="{http://com.lsc.services.bbva.common/libertyTypes}DocumentacionCotizacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimulationAutomovilResponse", propOrder = {
    "infoResponse",
    "simulacion",
    "documentacionCotizacion"
})
@XmlRootElement(name = "SimulationAutomovilResponse")
public class SimulationAutomovilResponse {

    @XmlElement(required = true)
    protected InfoResponse infoResponse;
    protected SimulacionArray simulacion;
    protected DocumentacionCotizacion documentacionCotizacion;

    /**
     * Gets the value of the infoResponse property.
     *
     * @return
     *     possible object is
     *     {@link InfoResponse }
     *
     */
    public InfoResponse getInfoResponse() {
        return infoResponse;
    }

    /**
     * Sets the value of the infoResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link InfoResponse }
     *
     */
    public void setInfoResponse(InfoResponse value) {
        this.infoResponse = value;
    }

    /**
     * Gets the value of the simulacion property.
     *
     * @return
     *     possible object is
     *     {@link SimulacionArray }
     *
     */
    public SimulacionArray getSimulacion() {
        return simulacion;
    }

    /**
     * Sets the value of the simulacion property.
     *
     * @param value
     *     allowed object is
     *     {@link SimulacionArray }
     *
     */
    public void setSimulacion(SimulacionArray value) {
        this.simulacion = value;
    }

    /**
     * Gets the value of the documentacionCotizacion property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentacionCotizacion }
     *     
     */
    public DocumentacionCotizacion getDocumentacionCotizacion() {
        return documentacionCotizacion;
    }

    /**
     * Sets the value of the documentacionCotizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentacionCotizacion }
     *     
     */
    public void setDocumentacionCotizacion(DocumentacionCotizacion value) {
        this.documentacionCotizacion = value;
    }

}


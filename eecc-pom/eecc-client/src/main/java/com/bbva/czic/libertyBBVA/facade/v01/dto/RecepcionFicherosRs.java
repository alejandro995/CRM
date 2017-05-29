package com.bbva.czic.libertyBBVA.facade.v01.dto;


import javax.xml.bind.annotation.*;


/**
 * <p>Java class for RecepcionFicherosRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecepcionFicherosRs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoResponse" type="{http://AdjuntarDocumentacion/AddDocumentation}InfoResponse"/>
 *         &lt;element name="identificacionContratacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentacionCotizacion" type="{http://AdjuntarDocumentacion/AddDocumentation}DocumentacionCotizacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcionFicherosRs", propOrder = {
    "infoResponse",
    "identificacionContratacion",
    "documentacionCotizacion"
})
@XmlRootElement(name = "RecepcionFicherosRs")
public class RecepcionFicherosRs {

    @XmlElement(required = true)
    protected InfoResponse infoResponse;
    protected String identificacionContratacion;
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
     * Gets the value of the identificacionContratacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentificacionContratacion() {
        return identificacionContratacion;
    }

    /**
     * Sets the value of the identificacionContratacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentificacionContratacion(String value) {
        this.identificacionContratacion = value;
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

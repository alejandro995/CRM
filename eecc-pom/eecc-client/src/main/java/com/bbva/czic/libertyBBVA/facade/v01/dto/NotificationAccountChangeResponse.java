package com.bbva.czic.libertyBBVA.facade.v01.dto;



import javax.xml.bind.annotation.*;


/**
 * 
 *        Respuesta servicio
 *       
 * 
 * <p>Java class for NotificarCambioCuentaRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificarCambioCuentaRs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoResponse" type="{http://com.lsc.services.bbva.common/libertyTypes}InfoResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationAccountChangeResponse", propOrder = {
    "infoResponse"
})
@XmlRootElement(name = "NotificationAccountChangeResponse")
public class NotificationAccountChangeResponse {

    @XmlElement(required = true)
    protected InfoResponse infoResponse;

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

}

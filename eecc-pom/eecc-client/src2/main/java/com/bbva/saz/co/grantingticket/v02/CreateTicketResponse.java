
package com.bbva.saz.co.grantingticket.v02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreateTicketResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateTicketResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationResponse" type="{http://bbva.com/saz/co/grantingticket/V02}AuthenticationResponse" minOccurs="0"/>
 *         &lt;element name="backendUserResponse" type="{http://bbva.com/saz/co/grantingticket/V02}BackendUserResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTicketResponse", propOrder = {
    "authenticationResponse",
    "backendUserResponse"
})
public class CreateTicketResponse {

    protected AuthenticationResponse authenticationResponse;
    protected BackendUserResponse backendUserResponse;

    /**
     * Obtiene el valor de la propiedad authenticationResponse.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResponse }
     *     
     */
    public AuthenticationResponse getAuthenticationResponse() {
        return authenticationResponse;
    }

    /**
     * Define el valor de la propiedad authenticationResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResponse }
     *     
     */
    public void setAuthenticationResponse(AuthenticationResponse value) {
        this.authenticationResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad backendUserResponse.
     * 
     * @return
     *     possible object is
     *     {@link BackendUserResponse }
     *     
     */
    public BackendUserResponse getBackendUserResponse() {
        return backendUserResponse;
    }

    /**
     * Define el valor de la propiedad backendUserResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link BackendUserResponse }
     *     
     */
    public void setBackendUserResponse(BackendUserResponse value) {
        this.backendUserResponse = value;
    }

}

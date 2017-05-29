
package com.bbva.saz.co.grantingticket.v02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreateTicketRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateTicketRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authentication" type="{http://bbva.com/saz/co/grantingticket/V02}AuthenticationRequest" minOccurs="0"/>
 *         &lt;element name="backendUserRequest" type="{http://bbva.com/saz/co/grantingticket/V02}BackendUserRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTicketRequest", propOrder = {
    "authentication",
    "backendUserRequest"
})
public class CreateTicketRequest {

    protected AuthenticationRequest authentication;
    protected BackendUserRequest backendUserRequest;

    /**
     * Obtiene el valor de la propiedad authentication.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationRequest }
     *     
     */
    public AuthenticationRequest getAuthentication() {
        return authentication;
    }

    /**
     * Define el valor de la propiedad authentication.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationRequest }
     *     
     */
    public void setAuthentication(AuthenticationRequest value) {
        this.authentication = value;
    }

    /**
     * Obtiene el valor de la propiedad backendUserRequest.
     * 
     * @return
     *     possible object is
     *     {@link BackendUserRequest }
     *     
     */
    public BackendUserRequest getBackendUserRequest() {
        return backendUserRequest;
    }

    /**
     * Define el valor de la propiedad backendUserRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BackendUserRequest }
     *     
     */
    public void setBackendUserRequest(BackendUserRequest value) {
        this.backendUserRequest = value;
    }

}

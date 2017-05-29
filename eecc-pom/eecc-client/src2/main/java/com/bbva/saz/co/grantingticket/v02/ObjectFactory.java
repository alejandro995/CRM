
package com.bbva.saz.co.grantingticket.v02;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bbva.saz.co.grantingticket.v02 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateTicketRequest_QNAME = new QName("http://bbva.com/saz/co/grantingticket/V02", "createTicketRequest");
    private final static QName _CreateTicketResponse_QNAME = new QName("http://bbva.com/saz/co/grantingticket/V02", "createTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bbva.saz.co.grantingticket.v02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateTicketRequest }
     * 
     */
    public CreateTicketRequest createCreateTicketRequest() {
        return new CreateTicketRequest();
    }

    /**
     * Create an instance of {@link CreateTicketResponse }
     * 
     */
    public CreateTicketResponse createCreateTicketResponse() {
        return new CreateTicketResponse();
    }

    /**
     * Create an instance of {@link AuthenticationData }
     * 
     */
    public AuthenticationData createAuthenticationData() {
        return new AuthenticationData();
    }

    /**
     * Create an instance of {@link BackendUserRequest }
     * 
     */
    public BackendUserRequest createBackendUserRequest() {
        return new BackendUserRequest();
    }

    /**
     * Create an instance of {@link BackendUserResponse }
     * 
     */
    public BackendUserResponse createBackendUserResponse() {
        return new BackendUserResponse();
    }

    /**
     * Create an instance of {@link AuthenticationRequest }
     * 
     */
    public AuthenticationRequest createAuthenticationRequest() {
        return new AuthenticationRequest();
    }

    /**
     * Create an instance of {@link AuthenticationResponse }
     * 
     */
    public AuthenticationResponse createAuthenticationResponse() {
        return new AuthenticationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicketRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bbva.com/saz/co/grantingticket/V02", name = "createTicketRequest")
    public JAXBElement<CreateTicketRequest> createCreateTicketRequest(CreateTicketRequest value) {
        return new JAXBElement<CreateTicketRequest>(_CreateTicketRequest_QNAME, CreateTicketRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bbva.com/saz/co/grantingticket/V02", name = "createTicketResponse")
    public JAXBElement<CreateTicketResponse> createCreateTicketResponse(CreateTicketResponse value) {
        return new JAXBElement<CreateTicketResponse>(_CreateTicketResponse_QNAME, CreateTicketResponse.class, null, value);
    }

}

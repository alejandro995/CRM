
package com.bbva.jee.arq.spring.core.servicing.utils;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bbva.jee.arq.spring.core.servicing.utils package. 
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

    private final static QName _Pagination_QNAME = new QName("urn:com:bbva:jee:arq:spring:core:servicing:utils", "pagination");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bbva.jee.arq.spring.core.servicing.utils
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pagination }
     * 
     */
    public Pagination createPagination() {
        return new Pagination();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pagination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:jee:arq:spring:core:servicing:utils", name = "pagination")
    public JAXBElement<Pagination> createPagination(Pagination value) {
        return new JAXBElement<Pagination>(_Pagination_QNAME, Pagination.class, null, value);
    }

}

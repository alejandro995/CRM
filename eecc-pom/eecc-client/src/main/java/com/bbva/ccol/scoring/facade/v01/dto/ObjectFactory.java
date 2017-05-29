
package com.bbva.ccol.scoring.facade.v01.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bbva.ccol.scoring.facade.v01.dto package. 
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

    private final static QName _DataScoringGet_QNAME = new QName("urn:com:bbva:ccol:scoring:facade:v01:dto", "dataScoringGet");
    private final static QName _DataScoringAdd_QNAME = new QName("urn:com:bbva:ccol:scoring:facade:v01:dto", "dataScoringAdd");
    private final static QName _InScoringAdd_QNAME = new QName("urn:com:bbva:ccol:scoring:facade:v01:dto", "inScoringAdd");
    private final static QName _OutScoringGet_QNAME = new QName("urn:com:bbva:ccol:scoring:facade:v01:dto", "outScoringGet");
    private final static QName _OutScoringAdd_QNAME = new QName("urn:com:bbva:ccol:scoring:facade:v01:dto", "outScoringAdd");
    private final static QName _InScoringGet_QNAME = new QName("urn:com:bbva:ccol:scoring:facade:v01:dto", "inScoringGet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bbva.ccol.scoring.facade.v01.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataScoringAdd }
     * 
     */
    public DataScoringAdd createDataScoringAdd() {
        return new DataScoringAdd();
    }

    /**
     * Create an instance of {@link InScoringAdd }
     * 
     */
    public InScoringAdd createInScoringAdd() {
        return new InScoringAdd();
    }

    /**
     * Create an instance of {@link DataScoringGet }
     * 
     */
    public DataScoringGet createDataScoringGet() {
        return new DataScoringGet();
    }

    /**
     * Create an instance of {@link InScoringGet }
     * 
     */
    public InScoringGet createInScoringGet() {
        return new InScoringGet();
    }

    /**
     * Create an instance of {@link OutScoringGet }
     * 
     */
    public OutScoringGet createOutScoringGet() {
        return new OutScoringGet();
    }

    /**
     * Create an instance of {@link OutScoringAdd }
     * 
     */
    public OutScoringAdd createOutScoringAdd() {
        return new OutScoringAdd();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataScoringGet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:scoring:facade:v01:dto", name = "dataScoringGet")
    public JAXBElement<DataScoringGet> createDataScoringGet(DataScoringGet value) {
        return new JAXBElement<DataScoringGet>(_DataScoringGet_QNAME, DataScoringGet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataScoringAdd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:scoring:facade:v01:dto", name = "dataScoringAdd")
    public JAXBElement<DataScoringAdd> createDataScoringAdd(DataScoringAdd value) {
        return new JAXBElement<DataScoringAdd>(_DataScoringAdd_QNAME, DataScoringAdd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InScoringAdd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:scoring:facade:v01:dto", name = "inScoringAdd")
    public JAXBElement<InScoringAdd> createInScoringAdd(InScoringAdd value) {
        return new JAXBElement<InScoringAdd>(_InScoringAdd_QNAME, InScoringAdd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutScoringGet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:scoring:facade:v01:dto", name = "outScoringGet")
    public JAXBElement<OutScoringGet> createOutScoringGet(OutScoringGet value) {
        return new JAXBElement<OutScoringGet>(_OutScoringGet_QNAME, OutScoringGet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutScoringAdd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:scoring:facade:v01:dto", name = "outScoringAdd")
    public JAXBElement<OutScoringAdd> createOutScoringAdd(OutScoringAdd value) {
        return new JAXBElement<OutScoringAdd>(_OutScoringAdd_QNAME, OutScoringAdd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InScoringGet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:scoring:facade:v01:dto", name = "inScoringGet")
    public JAXBElement<InScoringGet> createInScoringGet(InScoringGet value) {
        return new JAXBElement<InScoringGet>(_InScoringGet_QNAME, InScoringGet.class, null, value);
    }

}

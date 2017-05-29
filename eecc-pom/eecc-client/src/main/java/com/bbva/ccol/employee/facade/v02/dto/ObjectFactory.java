
package com.bbva.ccol.employee.facade.v02.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bbva.ccol.employee.facade.v02.dto package. 
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

    private final static QName _PersonInCharge_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "personInCharge");
    private final static QName _CostCenter_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "costCenter");
    private final static QName _Country_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "country");
    private final static QName _Classifications_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "classifications");
    private final static QName _CurrentClassification_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "currentClassification");
    private final static QName _Department_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "department");
    private final static QName _ContactDetails_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "contactDetails");
    private final static QName _ContactType_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "contactType");
    private final static QName _Employees_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "employees");
    private final static QName _ContactDetail_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "contactDetail");
    private final static QName _DataEmployeesList_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "dataEmployeesList");
    private final static QName _WorkPlace_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "workPlace");
    private final static QName _Classification_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "classification");
    private final static QName _Address_QNAME = new QName("urn:com:bbva:ccol:employees:facade:v00:dto", "address");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bbva.ccol.employee.facade.v02.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Classifications }
     * 
     */
    public Classifications createClassifications() {
        return new Classifications();
    }

    /**
     * Create an instance of {@link CurrentClassification }
     * 
     */
    public CurrentClassification createCurrentClassification() {
        return new CurrentClassification();
    }

    /**
     * Create an instance of {@link Department }
     * 
     */
    public Department createDepartment() {
        return new Department();
    }

    /**
     * Create an instance of {@link PersonInCharge }
     * 
     */
    public PersonInCharge createPersonInCharge() {
        return new PersonInCharge();
    }

    /**
     * Create an instance of {@link CostCenter }
     * 
     */
    public CostCenter createCostCenter() {
        return new CostCenter();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link WorkPlace }
     * 
     */
    public WorkPlace createWorkPlace() {
        return new WorkPlace();
    }

    /**
     * Create an instance of {@link DataEmployeesList }
     * 
     */
    public DataEmployeesList createDataEmployeesList() {
        return new DataEmployeesList();
    }

    /**
     * Create an instance of {@link ContactDetail }
     * 
     */
    public ContactDetail createContactDetail() {
        return new ContactDetail();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Classification }
     * 
     */
    public Classification createClassification() {
        return new Classification();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link ContactDetails }
     * 
     */
    public ContactDetails createContactDetails() {
        return new ContactDetails();
    }

    /**
     * Create an instance of {@link Employees }
     * 
     */
    public Employees createEmployees() {
        return new Employees();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInCharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "personInCharge")
    public JAXBElement<PersonInCharge> createPersonInCharge(PersonInCharge value) {
        return new JAXBElement<PersonInCharge>(_PersonInCharge_QNAME, PersonInCharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostCenter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "costCenter")
    public JAXBElement<CostCenter> createCostCenter(CostCenter value) {
        return new JAXBElement<CostCenter>(_CostCenter_QNAME, CostCenter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "country")
    public JAXBElement<Country> createCountry(Country value) {
        return new JAXBElement<Country>(_Country_QNAME, Country.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Classifications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "classifications")
    public JAXBElement<Classifications> createClassifications(Classifications value) {
        return new JAXBElement<Classifications>(_Classifications_QNAME, Classifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentClassification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "currentClassification")
    public JAXBElement<CurrentClassification> createCurrentClassification(CurrentClassification value) {
        return new JAXBElement<CurrentClassification>(_CurrentClassification_QNAME, CurrentClassification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Department }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "department")
    public JAXBElement<Department> createDepartment(Department value) {
        return new JAXBElement<Department>(_Department_QNAME, Department.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "contactDetails")
    public JAXBElement<ContactDetails> createContactDetails(ContactDetails value) {
        return new JAXBElement<ContactDetails>(_ContactDetails_QNAME, ContactDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "contactType")
    public JAXBElement<ContactType> createContactType(ContactType value) {
        return new JAXBElement<ContactType>(_ContactType_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "employees")
    public JAXBElement<Employees> createEmployees(Employees value) {
        return new JAXBElement<Employees>(_Employees_QNAME, Employees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "contactDetail")
    public JAXBElement<ContactDetail> createContactDetail(ContactDetail value) {
        return new JAXBElement<ContactDetail>(_ContactDetail_QNAME, ContactDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataEmployeesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "dataEmployeesList")
    public JAXBElement<DataEmployeesList> createDataEmployeesList(DataEmployeesList value) {
        return new JAXBElement<DataEmployeesList>(_DataEmployeesList_QNAME, DataEmployeesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "workPlace")
    public JAXBElement<WorkPlace> createWorkPlace(WorkPlace value) {
        return new JAXBElement<WorkPlace>(_WorkPlace_QNAME, WorkPlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Classification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "classification")
    public JAXBElement<Classification> createClassification(Classification value) {
        return new JAXBElement<Classification>(_Classification_QNAME, Classification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:employees:facade:v00:dto", name = "address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

}

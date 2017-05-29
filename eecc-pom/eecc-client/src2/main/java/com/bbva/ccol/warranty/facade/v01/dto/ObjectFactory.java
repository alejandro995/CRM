
package com.bbva.ccol.warranty.facade.v01.dto;

import javax.xml.bind.annotation.XmlRegistry;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the warranty package. 
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
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: warranty
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link AssociatedValue }
     * 
     */
    public AssociatedValue createAssociatedValue() {
        return new AssociatedValue();
    }

    /**
     * Create an instance of {@link Features }
     * 
     */
    public Features createFeatures() {
        return new Features();
    }

    /**
     * Create an instance of {@link Appraisal }
     * 
     */
    public Appraisal createAppraisal() {
        return new Appraisal();
    }

    /**
     * Create an instance of {@link Loan }
     * 
     */
    public Loan createLoan() {
        return new Loan();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link WarrantyPlace }
     * 
     */
    public WarrantyPlace createWarrantyPlace() {
        return new WarrantyPlace();
    }

    /**
     * Create an instance of {@link Deed }
     * 
     */
    public Deed createDeed() {
        return new Deed();
    }

    /**
     * Create an instance of {@link InsuranceType }
     * 
     */
    public InsuranceType createInsuranceType() {
        return new InsuranceType();
    }

    /**
     * Create an instance of {@link Documents }
     * 
     */
    public Documents createDocuments() {
        return new Documents();
    }

    /**
     * Create an instance of {@link WarrantyType }
     * 
     */
    public WarrantyType createWarrantyType() {
        return new WarrantyType();
    }

    /**
     * Create an instance of {@link PromissoryNote }
     * 
     */
    public PromissoryNote createPromissoryNote() {
        return new PromissoryNote();
    }

    /**
     * Create an instance of {@link Warranty }
     * 
     */
    public Warranty createWarranty() {
        return new Warranty();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

}

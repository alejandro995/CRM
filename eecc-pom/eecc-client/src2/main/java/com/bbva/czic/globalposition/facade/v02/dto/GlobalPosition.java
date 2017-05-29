
package com.bbva.czic.globalposition.facade.v02.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;




@XmlRootElement(name = "globalPosition", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlType(name = "globalPosition", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class GlobalPosition
    implements Serializable
{

    public final static long serialVersionUID = 1L;

    private Person owner;

    private Person spouse;

    private List<DebtValue> ownerDebts;

    private List<DebtValue> spouseDebts;

    private List<NonPayment> nonPayments;

    private List<CreditPosition> creditPosition;

    private List<RequestOperation> annuledUnauthorisedOperations;

    private List<RequestOperation> ongoingOperations;

    private List<RequestOperation> cancelledOperations;

    private List<Guarantee> guarantees;

    private List<ValuedRelationship> valuedRelationships;

    private List<Account> payRoll;

    private List<Transaction> transactions;

    private List<Offer> offers;


    /*private List<Offer> offers;*/

    public GlobalPosition() {
        //default constructor
    }

    public Person getOwner() {
        if(owner == null)
            owner = new Person();
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getSpouse() {
        if(spouse == null)
            spouse = new Person();
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public List<DebtValue> getOwnerDebts() {
        if(ownerDebts == null)
            ownerDebts = new ArrayList<DebtValue>();

        return ownerDebts;
    }

    public void setOwnerDebts(List<DebtValue> ownerDebts) {
        this.ownerDebts = ownerDebts;
    }

    public List<DebtValue> getSpouseDebts() {
        if(spouseDebts == null)
            spouseDebts = new ArrayList<DebtValue>();

        return spouseDebts;
    }

    public void setSpouseDebts(List<DebtValue> spouseDebts) {
        this.spouseDebts = spouseDebts;
    }

    public List<NonPayment> getNonPayments() {
        if(nonPayments == null)
            nonPayments = new ArrayList<NonPayment>();
        return nonPayments;
    }

    public void setNonPayments(List<NonPayment> nonPayments) {
        this.nonPayments = nonPayments;
    }

    public List<CreditPosition> getCreditPosition() {
        if(creditPosition == null)
            creditPosition = new ArrayList<CreditPosition>();

        return creditPosition;
    }

    public void setCreditPosition(List<CreditPosition> creditPosition) {
        this.creditPosition = creditPosition;
    }

    public List<RequestOperation> getAnnuledUnauthorisedOperations() {
        if(annuledUnauthorisedOperations == null)
            annuledUnauthorisedOperations = new ArrayList<RequestOperation>();

        return annuledUnauthorisedOperations;
    }

    public void setAnnuledUnauthorisedOperations(List<RequestOperation> annuledUnauthorisedOperations) {
        this.annuledUnauthorisedOperations = annuledUnauthorisedOperations;
    }

    public List<RequestOperation> getOngoingOperations() {
        if(ongoingOperations == null)
            ongoingOperations = new ArrayList<RequestOperation>();

        return ongoingOperations;
    }

    public void setOngoingOperations(List<RequestOperation> ongoingOperations) {
        this.ongoingOperations = ongoingOperations;
    }

    public List<RequestOperation> getCancelledOperations() {
        if(cancelledOperations == null)
            cancelledOperations = new ArrayList<RequestOperation>();
        return cancelledOperations;
    }

    public void setCancelledOperations(List<RequestOperation> cancelledOperations) {
        this.cancelledOperations = cancelledOperations;
    }

    public List<Guarantee> getGuarantees() {
        if(guarantees == null)
            guarantees = new ArrayList<Guarantee>();
        return guarantees;
    }

    public void setGuarantees(List<Guarantee> guarantees) {
        this.guarantees = guarantees;
    }

    public List<ValuedRelationship> getValuedRelationships() {
        if(valuedRelationships == null)
            valuedRelationships = new ArrayList<ValuedRelationship>();
        return valuedRelationships;
    }

    public void setValuedRelationships(List<ValuedRelationship> valuedRelationships) {
        this.valuedRelationships = valuedRelationships;
    }

    public List<Account> getPayRoll() {
        if(payRoll == null)
            payRoll = new ArrayList<Account>();
        return payRoll;
    }

    public void setPayRoll(List<Account> payRoll) {
        this.payRoll = payRoll;
    }

    public List<Transaction> getTransactions() {

        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        if(offers == null)
            offers = new ArrayList<Offer>();
        this.offers = offers;
    }



}


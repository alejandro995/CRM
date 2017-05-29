
package com.bbva.czic.globalposition.facade.v02.dto;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "nonPayment", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlType(name = "nonPayment", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class NonPayment
    implements Serializable
{

    public final static long serialVersionUID = 1L;


    private OptionsList portfolioType;
    private OptionsList clientType;
    private Contract contract;
    private String expiredDate;
    private Money balanceDue;
    private String calificationDescription;
    private String indcony;
    public NonPayment() {
        //default constructor
    }

    public OptionsList getPortfolioType() {
        return portfolioType;
    }

    public void setPortfolioType(OptionsList portfolioType) {
        this.portfolioType = portfolioType;
    }

    public OptionsList getClientType() {
        return clientType;
    }

    public void setClientType(OptionsList clientType) {
        this.clientType = clientType;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Money getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(Money balanceDue) {
        this.balanceDue = balanceDue;
    }

    public String getCalificationDescription() {
        return calificationDescription;
    }

    public void setCalificationDescription(String calificationDescription) {
        this.calificationDescription = calificationDescription;
    }

    public String getIndcony() {
        return indcony;
    }

    public void setIndcony(String indcony) {
        this.indcony = indcony;
    }
}

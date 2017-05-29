
package com.bbva.czic.globalposition.facade.v02.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "valuedRelationship", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlType(name = "valuedRelationship", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class ValuedRelationship
    implements Serializable
{

    public final static long serialVersionUID = 1L;
    private Contract contract;
    private Money balance;
    private Money fee;

    public ValuedRelationship() {
        //default constructor
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

}

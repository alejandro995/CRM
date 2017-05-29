
package com.bbva.czic.globalposition.facade.v02.dto;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "transaction", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlType(name = "transaction", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Transaction
    implements Serializable
{

    public final static long serialVersionUID = 1L;

    private String id;

    private String name;

    @XmlSchemaType(name = "dateTime")

    private Calendar transactionDate;

    private Money amount;

    public Transaction() {
        //default constructor
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

}

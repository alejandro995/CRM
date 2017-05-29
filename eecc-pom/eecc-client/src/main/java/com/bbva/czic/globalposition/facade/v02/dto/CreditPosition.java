
package com.bbva.czic.globalposition.facade.v02.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditPosition", propOrder = {
        "accountType",
        "averageBalance",
        "currentBalance"
})
public class CreditPosition
    implements Serializable
{

    public final static long serialVersionUID = 1L;
    @XmlElement(namespace = "urn:com:bbva:czic:facade:v02:dto")
    private OptionsList accountType;
    @XmlElement(namespace = "urn:com:bbva:czic:facade:v02:dto")
    private Money averageBalance;
    @XmlElement(namespace = "urn:com:bbva:czic:facade:v02:dto")
    private Money currentBalance;

    public CreditPosition() {
        //default constructor
    }

    public OptionsList getAccountType() {
        return accountType;
    }

    public void setAccountType(OptionsList accountType) {
        this.accountType = accountType;
    }

    public Money getAverageBalance() {
        return averageBalance;
    }

    public void setAverageBalance(Money averageBalance) {
        this.averageBalance = averageBalance;
    }

    public Money getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Money currentBalance) {
        this.currentBalance = currentBalance;
    }

}

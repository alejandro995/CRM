
package com.bbva.czic.globalposition.facade.v02.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "debtValue", propOrder = {
        "type",
        "value"
})
public class DebtValue
    implements Serializable
{

    public final static long serialVersionUID = 1L;
    @XmlElement(namespace = "urn:com:bbva:czic:facade:v02:dto")
    private OptionsList type;
    @XmlElement(namespace = "urn:com:bbva:czic:facade:v02:dto")
    private Money value;

    public DebtValue() {
        //default constructor
    }

    public OptionsList getType() {
        return type;
    }

    public void setType(OptionsList type) {
        this.type = type;
    }

    public Money getValue() {
        return value;
    }

    public void setValue(Money value) {
        this.value = value;
    }

}


package com.bbva.czic.globalposition.facade.v02.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identityDocument", propOrder = {
        "type",
        "number"
})
public class IdentityDocument
    implements Serializable
{

    public final static long serialVersionUID = 1L;
    @XmlElement(namespace = "urn:com:bbva:czic:facade:v02:dto")
    private OptionsList type;

    private String number;

    public IdentityDocument() {
        //default constructor
    }

    public OptionsList getType() {
        return type;
    }

    public void setType(OptionsList type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}

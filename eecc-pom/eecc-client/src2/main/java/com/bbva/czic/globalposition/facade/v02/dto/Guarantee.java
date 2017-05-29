
package com.bbva.czic.globalposition.facade.v02.dto;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "guarantee", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlType(name = "guarantee", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Guarantee
    implements Serializable
{

    public final static long serialVersionUID = 1L;

    private OptionsList type;

    private Money value;

    private Contract obligation;

    @XmlSchemaType(name = "dateTime")

    private Calendar appraisalDate;

    public Guarantee() {
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

    public Contract getObligation() {
        return obligation;
    }

    public void setObligation(Contract obligation) {
        this.obligation = obligation;
    }

    public Calendar getAppraisalDate() {
        return appraisalDate;
    }

    public void setAppraisalDate(Calendar appraisalDate) {
        this.appraisalDate = appraisalDate;
    }

}

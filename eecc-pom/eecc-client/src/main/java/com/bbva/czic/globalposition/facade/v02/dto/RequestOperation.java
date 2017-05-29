
package com.bbva.czic.globalposition.facade.v02.dto;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;




@XmlRootElement(name = "requestOperation", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlType(name = "requestOperation", namespace = "urn:com:bbva:czic:globalposition:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestOperation
    implements Serializable
{

    public final static long serialVersionUID = 1L;

    private Contract associatedContract;
    private String cancellationDate;
    private String annulmentDate;
    private Money initialValue;
    private Money operationValue;
    private OptionsList status;
    private String requestDate;

    public RequestOperation() {
        //default constructor
    }

    public Contract getAssociatedContract() {
        return associatedContract;
    }

    public void setAssociatedContract(Contract associatedContract) {
        this.associatedContract = associatedContract;
    }

    public String getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getAnnulmentDate() {
        return annulmentDate;
    }

    public void setAnnulmentDate(String annulmentDate) {
        this.annulmentDate = annulmentDate;
    }

    public Money getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(Money initialValue) {
        this.initialValue = initialValue;
    }

    public Money getOperationValue() {
        return operationValue;
    }

    public void setOperationValue(Money operationValue) {
        this.operationValue = operationValue;
    }

    public OptionsList getStatus() {
        return status;
    }

    public void setStatus(OptionsList status) {
        this.status = status;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

}

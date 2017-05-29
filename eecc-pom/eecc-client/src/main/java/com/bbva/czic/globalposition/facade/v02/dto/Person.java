
package com.bbva.czic.globalposition.facade.v02.dto;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
        "identityDocument"
})
public class Person
    implements Serializable
{

    public final static long serialVersionUID = 1L;
    @XmlElement(namespace = "urn:com:bbva:czic:facade:v02:dto")
    private List<IdentityDocument> identityDocument;

    public Person() {
        //default constructor
    }

    public List<IdentityDocument> getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(List<IdentityDocument> identityDocument) {
        this.identityDocument = identityDocument;
    }

}


package com.bbva.czic.dto.non_canonical_model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bbva.czic.dto.canonical_model.Money;
import com.bbva.czic.dto.canonical_model.OptionsList;
import com.bbva.czic.dto.canonical_model.Person;


/**
 * <p>Clase Java para operation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="person" type="{urn:com:bbva:czic:dto:canonical_model}Person" minOccurs="0"/>
 *         &lt;element name="functions" type="{urn:com:bbva:czic:dto:non_canonical_model}Function" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="amount" type="{urn:com:bbva:czic:dto:canonical_model}money" minOccurs="0"/>
 *         &lt;element name="operationType" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="originReference" type="{urn:com:bbva:czic:dto:non_canonical_model}ReferenceDetail" minOccurs="0"/>
 *         &lt;element name="targetReference" type="{urn:com:bbva:czic:dto:non_canonical_model}ReferenceDetail" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{urn:com:bbva:czic:dto:non_canonical_model}operationComment" minOccurs="0"/>
 *         &lt;element name="notification" type="{urn:com:bbva:czic:dto:non_canonical_model}Notification" minOccurs="0"/>
 *         &lt;element name="sender" type="{urn:com:bbva:czic:dto:non_canonical_model}operationSenderContract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receiver" type="{urn:com:bbva:czic:dto:non_canonical_model}OperationReceiverAgreement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", propOrder = {
    "id",
    "description",
    "person",
    "functions",
    "amount",
    "operationType",
    "status",
    "originReference",
    "targetReference",
    "alias",
    "comments",
    "notification",
    "sender",
    "receiver"
})
public class Operation {

    protected String id;
    protected String description;
    protected Person person;
    @XmlElement(nillable = true)
    protected List<Function> functions;
    protected Money amount;
    protected OptionsList operationType;
    protected OptionsList status;
    protected ReferenceDetail originReference;
    protected ReferenceDetail targetReference;
    protected String alias;
    protected OperationComment comments;
    protected Notification notification;
    @XmlElement(nillable = true)
    protected List<OperationSenderContract> sender;
    @XmlElement(nillable = true)
    protected List<OperationReceiverAgreement> receiver;
	
    
    public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

    

}

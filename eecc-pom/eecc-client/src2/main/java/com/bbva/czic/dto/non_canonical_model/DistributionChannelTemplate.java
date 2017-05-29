
package com.bbva.czic.dto.non_canonical_model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bbva.czic.dto.canonical_model.Contract;
import com.bbva.czic.dto.canonical_model.OptionsList;


/**
 * <p>Clase Java para DistributionChannelTemplate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DistributionChannelTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sender" type="{urn:com:bbva:czic:dto:non_canonical_model}contractSender" minOccurs="0"/>
 *         &lt;element name="recipients" type="{urn:com:bbva:czic:dto:canonical_model}Contract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messages" type="{urn:com:bbva:czic:dto:non_canonical_model}message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="triggers" type="{urn:com:bbva:czic:dto:non_canonical_model}notificationTriggerImpl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notificationSchedule" type="{urn:com:bbva:czic:dto:non_canonical_model}NotificationSchedule" minOccurs="0"/>
 *         &lt;element name="executor" type="{urn:com:bbva:czic:dto:non_canonical_model}executor" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionChannelTemplate", propOrder = {
    "sender",
    "recipients",
    "messages",
    "triggers",
    "notificationSchedule",
    "executor",
    "enabled",
    "type"
})
public class DistributionChannelTemplate {

    protected ContractSender sender;
    @XmlElement(nillable = true)
    protected List<Contract> recipients;
    @XmlElement(nillable = true)
    protected List<Message> messages;
    @XmlElement(nillable = true)
    protected List<NotificationTriggerImpl> triggers;
    protected NotificationSchedule notificationSchedule;
    protected Executor executor;
    protected Boolean enabled;
    protected OptionsList type;

    /**
     * Obtiene el valor de la propiedad sender.
     * 
     * @return
     *     possible object is
     *     {@link ContractSender }
     *     
     */
    public ContractSender getSender() {
        return sender;
    }

    /**
     * Define el valor de la propiedad sender.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSender }
     *     
     */
    public void setSender(ContractSender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contract }
     * 
     * 
     */
    public List<Contract> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<Contract>();
        }
        return this.recipients;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getMessages() {
        if (messages == null) {
            messages = new ArrayList<Message>();
        }
        return this.messages;
    }

    /**
     * Gets the value of the triggers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the triggers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTriggers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationTriggerImpl }
     * 
     * 
     */
    public List<NotificationTriggerImpl> getTriggers() {
        if (triggers == null) {
            triggers = new ArrayList<NotificationTriggerImpl>();
        }
        return this.triggers;
    }

    /**
     * Obtiene el valor de la propiedad notificationSchedule.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSchedule }
     *     
     */
    public NotificationSchedule getNotificationSchedule() {
        return notificationSchedule;
    }

    /**
     * Define el valor de la propiedad notificationSchedule.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSchedule }
     *     
     */
    public void setNotificationSchedule(NotificationSchedule value) {
        this.notificationSchedule = value;
    }

    /**
     * Obtiene el valor de la propiedad executor.
     * 
     * @return
     *     possible object is
     *     {@link Executor }
     *     
     */
    public Executor getExecutor() {
        return executor;
    }

    /**
     * Define el valor de la propiedad executor.
     * 
     * @param value
     *     allowed object is
     *     {@link Executor }
     *     
     */
    public void setExecutor(Executor value) {
        this.executor = value;
    }

    /**
     * Obtiene el valor de la propiedad enabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Define el valor de la propiedad enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setType(OptionsList value) {
        this.type = value;
    }

}

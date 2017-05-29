
package com.bbva.czic.dto.non_canonical_model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bbva.czic.dto.canonical_model.OptionsList;
import com.bbva.czic.dto.canonical_model.Person;


/**
 * <p>Clase Java para Notification complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationSchedule" type="{urn:com:bbva:czic:dto:non_canonical_model}NotificationSchedule" minOccurs="0"/>
 *         &lt;element name="distributionChannels" type="{urn:com:bbva:czic:dto:non_canonical_model}DistributionChannelTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *         &lt;element name="person" type="{urn:com:bbva:czic:dto:canonical_model}Person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", propOrder = {
    "id",
    "notificationSchedule",
    "distributionChannels",
    "type",
    "status",
    "person"
})
public class Notification {

    protected String id;
    protected NotificationSchedule notificationSchedule;
    @XmlElement(nillable = true)
    protected List<DistributionChannelTemplate> distributionChannels;
    protected OptionsList type;
    protected OptionsList status;
    protected Person person;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the distributionChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionChannelTemplate }
     * 
     * 
     */
    public List<DistributionChannelTemplate> getDistributionChannels() {
        if (distributionChannels == null) {
            distributionChannels = new ArrayList<DistributionChannelTemplate>();
        }
        return this.distributionChannels;
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

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setStatus(OptionsList value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad person.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Define el valor de la propiedad person.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}

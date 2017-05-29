
package com.bbva.czic.dto.non_canonical_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bbva.czic.dto.canonical_model.Cron;


/**
 * <p>Clase Java para NotificationSchedule complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotificationSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frecuency" type="{urn:com:bbva:czic:dto:canonical_model}Cron" minOccurs="0"/>
 *         &lt;element name="nextNotificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationSchedule", propOrder = {
    "frecuency",
    "nextNotificationDate"
})
public class NotificationSchedule {

    protected Cron frecuency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextNotificationDate;

    /**
     * Obtiene el valor de la propiedad frecuency.
     * 
     * @return
     *     possible object is
     *     {@link Cron }
     *     
     */
    public Cron getFrecuency() {
        return frecuency;
    }

    /**
     * Define el valor de la propiedad frecuency.
     * 
     * @param value
     *     allowed object is
     *     {@link Cron }
     *     
     */
    public void setFrecuency(Cron value) {
        this.frecuency = value;
    }

    /**
     * Obtiene el valor de la propiedad nextNotificationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextNotificationDate() {
        return nextNotificationDate;
    }

    /**
     * Define el valor de la propiedad nextNotificationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextNotificationDate(XMLGregorianCalendar value) {
        this.nextNotificationDate = value;
    }

}

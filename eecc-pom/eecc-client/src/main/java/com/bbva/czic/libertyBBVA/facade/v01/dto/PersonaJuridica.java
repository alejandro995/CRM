package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonaJuridica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonaJuridica">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com.lsc.services.bbva.common/libertyTypes}Persona">
 *       &lt;sequence>
 *         &lt;element name="fechaConstitucion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaJuridica", propOrder = {
    "fechaConstitucion",
    "razonSocial"
})
public class PersonaJuridica
    extends Persona
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaConstitucion;
    @XmlElement(required = true)
    protected String razonSocial;

    /**
     * Gets the value of the fechaConstitucion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaConstitucion() {
        return fechaConstitucion;
    }

    /**
     * Sets the value of the fechaConstitucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaConstitucion(XMLGregorianCalendar value) {
        this.fechaConstitucion = value;
    }

    /**
     * Gets the value of the razonSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

}

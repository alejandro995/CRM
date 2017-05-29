package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreguntaGeneral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreguntaGeneral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pregunta" type="{http://com.lsc.services.bbva.common/libertyTypes}Pregunta"/>
 *         &lt;element name="respuesta" type="{http://com.lsc.services.bbva.common/libertyTypes}Respuesta"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreguntaGeneral", propOrder = {
    "pregunta",
    "respuesta"
})
public class PreguntaGeneral {

    @XmlElement(required = true)
    protected Pregunta pregunta;
    @XmlElement(required = true)
    protected Respuesta respuesta;

    /**
     * Gets the value of the pregunta property.
     * 
     * @return
     *     possible object is
     *     {@link Pregunta }
     *     
     */
    public Pregunta getPregunta() {
        return pregunta;
    }

    /**
     * Sets the value of the pregunta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pregunta }
     *     
     */
    public void setPregunta(Pregunta value) {
        this.pregunta = value;
    }

    /**
     * Gets the value of the respuesta property.
     * 
     * @return
     *     possible object is
     *     {@link Respuesta }
     *     
     */
    public Respuesta getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Respuesta }
     *     
     */
    public void setRespuesta(Respuesta value) {
        this.respuesta = value;
    }

}

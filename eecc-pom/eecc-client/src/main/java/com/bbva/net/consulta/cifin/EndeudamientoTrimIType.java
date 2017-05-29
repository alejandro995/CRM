
package com.bbva.net.consulta.cifin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EndeudamientoTrimIType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EndeudamientoTrimIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Endeudamiento71" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}Endeudamiento71Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Endeudamiento72" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}Endeudamiento72Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Endeudamiento73" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}Endeudamiento73Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndeudamientoTrimIType", propOrder = {
    "endeudamiento71",
    "endeudamiento72",
    "endeudamiento73"
})
public class EndeudamientoTrimIType {

    @XmlElement(name = "Endeudamiento71")
    protected List<Endeudamiento71Type> endeudamiento71;
    @XmlElement(name = "Endeudamiento72")
    protected List<Endeudamiento72Type> endeudamiento72;
    @XmlElement(name = "Endeudamiento73")
    protected List<Endeudamiento73Type> endeudamiento73;

    /**
     * Gets the value of the endeudamiento71 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endeudamiento71 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndeudamiento71().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Endeudamiento71Type }
     * 
     * 
     */
    public List<Endeudamiento71Type> getEndeudamiento71() {
        if (endeudamiento71 == null) {
            endeudamiento71 = new ArrayList<Endeudamiento71Type>();
        }
        return this.endeudamiento71;
    }

    /**
     * Gets the value of the endeudamiento72 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endeudamiento72 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndeudamiento72().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Endeudamiento72Type }
     * 
     * 
     */
    public List<Endeudamiento72Type> getEndeudamiento72() {
        if (endeudamiento72 == null) {
            endeudamiento72 = new ArrayList<Endeudamiento72Type>();
        }
        return this.endeudamiento72;
    }

    /**
     * Gets the value of the endeudamiento73 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endeudamiento73 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndeudamiento73().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Endeudamiento73Type }
     * 
     * 
     */
    public List<Endeudamiento73Type> getEndeudamiento73() {
        if (endeudamiento73 == null) {
            endeudamiento73 = new ArrayList<Endeudamiento73Type>();
        }
        return this.endeudamiento73;
    }

}

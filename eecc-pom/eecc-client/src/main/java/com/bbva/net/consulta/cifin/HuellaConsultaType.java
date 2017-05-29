
package com.bbva.net.consulta.cifin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HuellaConsultaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HuellaConsultaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Consulta" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}ConsultaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HuellaConsultaType", propOrder = {
    "consulta"
})
public class HuellaConsultaType {

    @XmlElement(name = "Consulta")
    protected List<ConsultaType> consulta;

    /**
     * Gets the value of the consulta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consulta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsulta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaType }
     * 
     * 
     */
    public List<ConsultaType> getConsulta() {
        if (consulta == null) {
            consulta = new ArrayList<ConsultaType>();
        }
        return this.consulta;
    }

}

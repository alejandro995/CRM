
package com.bbva.net.consulta.cifin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SectorFinancieroAlDiaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SectorFinancieroAlDiaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Obligacion" type="{http://www.bbvanet.com.co/ContratacionDigitalTX/}ObligacionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectorFinancieroAlDiaType", propOrder = {
    "obligacion"
})
public class SectorFinancieroAlDiaType {

    @XmlElement(name = "Obligacion")
    protected List<ObligacionType> obligacion;

    /**
     * Gets the value of the obligacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obligacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObligacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObligacionType }
     * 
     * 
     */
    public List<ObligacionType> getObligacion() {
        if (obligacion == null) {
            obligacion = new ArrayList<ObligacionType>();
        }
        return this.obligacion;
    }

}

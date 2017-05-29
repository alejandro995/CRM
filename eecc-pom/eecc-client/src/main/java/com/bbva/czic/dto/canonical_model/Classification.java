
package com.bbva.czic.dto.canonical_model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para classification complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="classification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="globalSegmentation" type="{urn:com:bbva:czic:dto:canonical_model}segment" minOccurs="0"/>
 *         &lt;element name="segments" type="{urn:com:bbva:czic:dto:canonical_model}segment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="riskStudyModel" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classification", propOrder = {
    "globalSegmentation",
    "segments",
    "riskStudyModel"
})
public class Classification {

    protected Segment globalSegmentation;
    @XmlElement(nillable = true)
    protected List<Segment> segments;
    protected OptionsList riskStudyModel;

    /**
     * Obtiene el valor de la propiedad globalSegmentation.
     * 
     * @return
     *     possible object is
     *     {@link Segment }
     *     
     */
    public Segment getGlobalSegmentation() {
        return globalSegmentation;
    }

    /**
     * Define el valor de la propiedad globalSegmentation.
     * 
     * @param value
     *     allowed object is
     *     {@link Segment }
     *     
     */
    public void setGlobalSegmentation(Segment value) {
        this.globalSegmentation = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segment }
     * 
     * 
     */
    public List<Segment> getSegments() {
        if (segments == null) {
            segments = new ArrayList<Segment>();
        }
        return this.segments;
    }

    /**
     * Obtiene el valor de la propiedad riskStudyModel.
     * 
     * @return
     *     possible object is
     *     {@link OptionsList }
     *     
     */
    public OptionsList getRiskStudyModel() {
        return riskStudyModel;
    }

    /**
     * Define el valor de la propiedad riskStudyModel.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsList }
     *     
     */
    public void setRiskStudyModel(OptionsList value) {
        this.riskStudyModel = value;
    }

}

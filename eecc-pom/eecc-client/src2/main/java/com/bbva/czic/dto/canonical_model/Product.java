
package com.bbva.czic.dto.canonical_model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Product complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencies" type="{urn:com:bbva:czic:dto:canonical_model}currency" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commercialClassifications" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="participationTypes" type="{urn:com:bbva:czic:dto:canonical_model}participationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="purposes" type="{urn:com:bbva:czic:dto:canonical_model}ProductPurpose" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="possibleAssociatedProducts" type="{urn:com:bbva:czic:dto:canonical_model}OptionsList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conditions" type="{urn:com:bbva:czic:dto:canonical_model}Condition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "id",
    "name",
    "currencies",
    "commercialClassifications",
    "participationTypes",
    "purposes",
    "possibleAssociatedProducts",
    "conditions"
})
public class Product {

    protected String id;
    protected String name;
    @XmlElement(nillable = true)
    protected List<Currency> currencies;
    @XmlElement(nillable = true)
    protected List<OptionsList> commercialClassifications;
    @XmlElement(nillable = true)
    protected List<ParticipationType> participationTypes;
    @XmlElement(nillable = true)
    protected List<ProductPurpose> purposes;
    @XmlElement(nillable = true)
    protected List<OptionsList> possibleAssociatedProducts;
    protected Condition conditions;

    /**
     * Obtiene el valor de la propiedad conditions.
     * 
     * @return
     *     possible object is
     *     {@link Condition }
     *     
     */
    public Condition getConditions() {
        return conditions;
    }

    /**
     * Define el valor de la propiedad conditions.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition }
     *     
     */
    public void setConditions(Condition value) {
        this.conditions = value;
    }

}


package com.bbva.ccol.scoring.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inScoringAdd complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inScoringAdd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dgenera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="a1enera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="da2ener" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dt1n1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt1n2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt1a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtost21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt2n2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt2a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt3n1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt3n2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt3a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt4n1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt4n2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt4a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt5n1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt5n2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtt5a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inScoringAdd", propOrder = {
    "dgenera",
    "a1enera",
    "da2ener",
    "dt1n1",
    "dtt1n2",
    "dtt1a",
    "dtost21",
    "dtt2n2",
    "dtt2a",
    "dtt3n1",
    "dtt3n2",
    "dtt3a",
    "dtt4n1",
    "dtt4n2",
    "dtt4a",
    "dtt5n1",
    "dtt5n2",
    "dtt5a"
})
public class InScoringAdd {

    protected String dgenera;
    @XmlElement(name = "a1enera")
    protected String a1enera;
    @XmlElement(name = "da2ener")
    protected String da2ener;
    @XmlElement(name = "dt1n1")
    protected String dt1n1;
    @XmlElement(name = "dtt1n2")
    protected String dtt1n2;
    @XmlElement(name = "dtt1a")
    protected String dtt1a;
    protected String dtost21;
    @XmlElement(name = "dtt2n2")
    protected String dtt2n2;
    @XmlElement(name = "dtt2a")
    protected String dtt2a;
    @XmlElement(name = "dtt3n1")
    protected String dtt3n1;
    @XmlElement(name = "dtt3n2")
    protected String dtt3n2;
    @XmlElement(name = "dtt3a")
    protected String dtt3a;
    @XmlElement(name = "dtt4n1")
    protected String dtt4n1;
    @XmlElement(name = "dtt4n2")
    protected String dtt4n2;
    @XmlElement(name = "dtt4a")
    protected String dtt4a;
    @XmlElement(name = "dtt5n1")
    protected String dtt5n1;
    @XmlElement(name = "dtt5n2")
    protected String dtt5n2;
    @XmlElement(name = "dtt5a")
    protected String dtt5a;

    /**
     * Obtiene el valor de la propiedad dgenera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDgenera() {
        return dgenera;
    }

    /**
     * Define el valor de la propiedad dgenera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDgenera(String value) {
        this.dgenera = value;
    }

    /**
     * Obtiene el valor de la propiedad a1enera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA1enera() {
        return a1enera;
    }

    /**
     * Define el valor de la propiedad a1enera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA1enera(String value) {
        this.a1enera = value;
    }

    /**
     * Obtiene el valor de la propiedad da2ener.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDa2ener() {
        return da2ener;
    }

    /**
     * Define el valor de la propiedad da2ener.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDa2ener(String value) {
        this.da2ener = value;
    }

    /**
     * Obtiene el valor de la propiedad dt1N1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDt1n1() {
        return dt1n1;
    }

    /**
     * Define el valor de la propiedad dt1N1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDt1n1(String value) {
        this.dt1n1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt1N2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt1n2() {
        return dtt1n2;
    }

    /**
     * Define el valor de la propiedad dtt1N2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt1n2(String value) {
        this.dtt1n2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt1A.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt1a() {
        return dtt1a;
    }

    /**
     * Define el valor de la propiedad dtt1A.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt1a(String value) {
        this.dtt1a = value;
    }

    /**
     * Obtiene el valor de la propiedad dtost21.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtost21() {
        return dtost21;
    }

    /**
     * Define el valor de la propiedad dtost21.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtost21(String value) {
        this.dtost21 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt2N2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt2n2() {
        return dtt2n2;
    }

    /**
     * Define el valor de la propiedad dtt2N2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt2n2(String value) {
        this.dtt2n2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt2A.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt2a() {
        return dtt2a;
    }

    /**
     * Define el valor de la propiedad dtt2A.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt2a(String value) {
        this.dtt2a = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt3N1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt3n1() {
        return dtt3n1;
    }

    /**
     * Define el valor de la propiedad dtt3N1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt3n1(String value) {
        this.dtt3n1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt3N2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt3n2() {
        return dtt3n2;
    }

    /**
     * Define el valor de la propiedad dtt3N2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt3n2(String value) {
        this.dtt3n2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt3A.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt3a() {
        return dtt3a;
    }

    /**
     * Define el valor de la propiedad dtt3A.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt3a(String value) {
        this.dtt3a = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt4N1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt4n1() {
        return dtt4n1;
    }

    /**
     * Define el valor de la propiedad dtt4N1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt4n1(String value) {
        this.dtt4n1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt4N2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt4n2() {
        return dtt4n2;
    }

    /**
     * Define el valor de la propiedad dtt4N2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt4n2(String value) {
        this.dtt4n2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt4A.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt4a() {
        return dtt4a;
    }

    /**
     * Define el valor de la propiedad dtt4A.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt4a(String value) {
        this.dtt4a = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt5N1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt5n1() {
        return dtt5n1;
    }

    /**
     * Define el valor de la propiedad dtt5N1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt5n1(String value) {
        this.dtt5n1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt5N2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt5n2() {
        return dtt5n2;
    }

    /**
     * Define el valor de la propiedad dtt5N2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt5n2(String value) {
        this.dtt5n2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtt5A.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtt5a() {
        return dtt5a;
    }

    /**
     * Define el valor de la propiedad dtt5A.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtt5a(String value) {
        this.dtt5a = value;
    }

}

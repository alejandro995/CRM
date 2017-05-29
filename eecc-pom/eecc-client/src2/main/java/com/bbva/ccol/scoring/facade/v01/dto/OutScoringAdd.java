
package com.bbva.ccol.scoring.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para outScoringAdd complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="outScoringAdd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingcons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balcaco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banekip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicfina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicbalc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dipermj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicburm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scorglo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="respues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balcaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicglt1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicburt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicpag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicperf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="morat1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moraot1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msjt1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balcaj2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicglt2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicbut2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicpat2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicpft2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="morat2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moraot2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msjt2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balcat3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diglt3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicbut3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicpat3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicpft3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="morat3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moraot3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msjt3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balcat4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicglt4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicbrt4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicpat4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicpft4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="morat4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moraot4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msjt4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balcat5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicglt5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicbut5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicpat5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicpft5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="morat5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moraot5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msjt5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outScoringAdd", propOrder = {
    "ingcons",
    "balcaco",
    "banekip",
    "dicfina",
    "dicbalc",
    "dipermj",
    "dicburm",
    "scorglo",
    "respues",
    "balcaja",
    "dicglt1",
    "dicburt",
    "dicpag1",
    "dicperf",
    "morat1",
    "moraot1",
    "msjt1",
    "balcaj2",
    "dicglt2",
    "dicbut2",
    "dicpat2",
    "dicpft2",
    "morat2",
    "moraot2",
    "msjt2",
    "balcat3",
    "diglt3",
    "dicbut3",
    "dicpat3",
    "dicpft3",
    "morat3",
    "moraot3",
    "msjt3",
    "balcat4",
    "dicglt4",
    "dicbrt4",
    "dicpat4",
    "dicpft4",
    "morat4",
    "moraot4",
    "msjt4",
    "balcat5",
    "dicglt5",
    "dicbut5",
    "dicpat5",
    "dicpft5",
    "morat5",
    "moraot5",
    "msjt5"
})
public class OutScoringAdd {

    protected String ingcons;
    protected String balcaco;
    protected String banekip;
    protected String dicfina;
    protected String dicbalc;
    protected String dipermj;
    protected String dicburm;
    protected String scorglo;
    protected String respues;
    protected String balcaja;
    protected String dicglt1;
    protected String dicburt;
    protected String dicpag1;
    protected String dicperf;
    protected String morat1;
    protected String moraot1;
    protected String msjt1;
    protected String balcaj2;
    protected String dicglt2;
    protected String dicbut2;
    protected String dicpat2;
    protected String dicpft2;
    protected String morat2;
    protected String moraot2;
    protected String msjt2;
    protected String balcat3;
    protected String diglt3;
    protected String dicbut3;
    protected String dicpat3;
    protected String dicpft3;
    protected String morat3;
    protected String moraot3;
    protected String msjt3;
    protected String balcat4;
    protected String dicglt4;
    protected String dicbrt4;
    protected String dicpat4;
    protected String dicpft4;
    protected String morat4;
    protected String moraot4;
    protected String msjt4;
    protected String balcat5;
    protected String dicglt5;
    protected String dicbut5;
    protected String dicpat5;
    protected String dicpft5;
    protected String morat5;
    protected String moraot5;
    protected String msjt5;

    /**
     * Obtiene el valor de la propiedad ingcons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngcons() {
        return ingcons;
    }

    /**
     * Define el valor de la propiedad ingcons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngcons(String value) {
        this.ingcons = value;
    }

    /**
     * Obtiene el valor de la propiedad balcaco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalcaco() {
        return balcaco;
    }

    /**
     * Define el valor de la propiedad balcaco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalcaco(String value) {
        this.balcaco = value;
    }

    /**
     * Obtiene el valor de la propiedad banekip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanekip() {
        return banekip;
    }

    /**
     * Define el valor de la propiedad banekip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanekip(String value) {
        this.banekip = value;
    }

    /**
     * Obtiene el valor de la propiedad dicfina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicfina() {
        return dicfina;
    }

    /**
     * Define el valor de la propiedad dicfina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicfina(String value) {
        this.dicfina = value;
    }

    /**
     * Obtiene el valor de la propiedad dicbalc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicbalc() {
        return dicbalc;
    }

    /**
     * Define el valor de la propiedad dicbalc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicbalc(String value) {
        this.dicbalc = value;
    }

    /**
     * Obtiene el valor de la propiedad dipermj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDipermj() {
        return dipermj;
    }

    /**
     * Define el valor de la propiedad dipermj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDipermj(String value) {
        this.dipermj = value;
    }

    /**
     * Obtiene el valor de la propiedad dicburm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicburm() {
        return dicburm;
    }

    /**
     * Define el valor de la propiedad dicburm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicburm(String value) {
        this.dicburm = value;
    }

    /**
     * Obtiene el valor de la propiedad scorglo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorglo() {
        return scorglo;
    }

    /**
     * Define el valor de la propiedad scorglo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorglo(String value) {
        this.scorglo = value;
    }

    /**
     * Obtiene el valor de la propiedad respues.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespues() {
        return respues;
    }

    /**
     * Define el valor de la propiedad respues.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespues(String value) {
        this.respues = value;
    }

    /**
     * Obtiene el valor de la propiedad balcaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalcaja() {
        return balcaja;
    }

    /**
     * Define el valor de la propiedad balcaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalcaja(String value) {
        this.balcaja = value;
    }

    /**
     * Obtiene el valor de la propiedad dicglt1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicglt1() {
        return dicglt1;
    }

    /**
     * Define el valor de la propiedad dicglt1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicglt1(String value) {
        this.dicglt1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicburt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicburt() {
        return dicburt;
    }

    /**
     * Define el valor de la propiedad dicburt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicburt(String value) {
        this.dicburt = value;
    }

    /**
     * Obtiene el valor de la propiedad dicpag1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicpag1() {
        return dicpag1;
    }

    /**
     * Define el valor de la propiedad dicpag1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicpag1(String value) {
        this.dicpag1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicperf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicperf() {
        return dicperf;
    }

    /**
     * Define el valor de la propiedad dicperf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicperf(String value) {
        this.dicperf = value;
    }

    /**
     * Obtiene el valor de la propiedad morat1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorat1() {
        return morat1;
    }

    /**
     * Define el valor de la propiedad morat1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorat1(String value) {
        this.morat1 = value;
    }

    /**
     * Obtiene el valor de la propiedad moraot1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoraot1() {
        return moraot1;
    }

    /**
     * Define el valor de la propiedad moraot1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoraot1(String value) {
        this.moraot1 = value;
    }

    /**
     * Obtiene el valor de la propiedad msjt1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsjt1() {
        return msjt1;
    }

    /**
     * Define el valor de la propiedad msjt1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsjt1(String value) {
        this.msjt1 = value;
    }

    /**
     * Obtiene el valor de la propiedad balcaj2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalcaj2() {
        return balcaj2;
    }

    /**
     * Define el valor de la propiedad balcaj2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalcaj2(String value) {
        this.balcaj2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicglt2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicglt2() {
        return dicglt2;
    }

    /**
     * Define el valor de la propiedad dicglt2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicglt2(String value) {
        this.dicglt2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicbut2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicbut2() {
        return dicbut2;
    }

    /**
     * Define el valor de la propiedad dicbut2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicbut2(String value) {
        this.dicbut2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicpat2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicpat2() {
        return dicpat2;
    }

    /**
     * Define el valor de la propiedad dicpat2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicpat2(String value) {
        this.dicpat2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicpft2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicpft2() {
        return dicpft2;
    }

    /**
     * Define el valor de la propiedad dicpft2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicpft2(String value) {
        this.dicpft2 = value;
    }

    /**
     * Obtiene el valor de la propiedad morat2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorat2() {
        return morat2;
    }

    /**
     * Define el valor de la propiedad morat2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorat2(String value) {
        this.morat2 = value;
    }

    /**
     * Obtiene el valor de la propiedad moraot2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoraot2() {
        return moraot2;
    }

    /**
     * Define el valor de la propiedad moraot2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoraot2(String value) {
        this.moraot2 = value;
    }

    /**
     * Obtiene el valor de la propiedad msjt2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsjt2() {
        return msjt2;
    }

    /**
     * Define el valor de la propiedad msjt2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsjt2(String value) {
        this.msjt2 = value;
    }

    /**
     * Obtiene el valor de la propiedad balcat3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalcat3() {
        return balcat3;
    }

    /**
     * Define el valor de la propiedad balcat3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalcat3(String value) {
        this.balcat3 = value;
    }

    /**
     * Obtiene el valor de la propiedad diglt3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiglt3() {
        return diglt3;
    }

    /**
     * Define el valor de la propiedad diglt3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiglt3(String value) {
        this.diglt3 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicbut3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicbut3() {
        return dicbut3;
    }

    /**
     * Define el valor de la propiedad dicbut3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicbut3(String value) {
        this.dicbut3 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicpat3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicpat3() {
        return dicpat3;
    }

    /**
     * Define el valor de la propiedad dicpat3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicpat3(String value) {
        this.dicpat3 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicpft3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicpft3() {
        return dicpft3;
    }

    /**
     * Define el valor de la propiedad dicpft3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicpft3(String value) {
        this.dicpft3 = value;
    }

    /**
     * Obtiene el valor de la propiedad morat3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorat3() {
        return morat3;
    }

    /**
     * Define el valor de la propiedad morat3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorat3(String value) {
        this.morat3 = value;
    }

    /**
     * Obtiene el valor de la propiedad moraot3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoraot3() {
        return moraot3;
    }

    /**
     * Define el valor de la propiedad moraot3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoraot3(String value) {
        this.moraot3 = value;
    }

    /**
     * Obtiene el valor de la propiedad msjt3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsjt3() {
        return msjt3;
    }

    /**
     * Define el valor de la propiedad msjt3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsjt3(String value) {
        this.msjt3 = value;
    }

    /**
     * Obtiene el valor de la propiedad balcat4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalcat4() {
        return balcat4;
    }

    /**
     * Define el valor de la propiedad balcat4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalcat4(String value) {
        this.balcat4 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicglt4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicglt4() {
        return dicglt4;
    }

    /**
     * Define el valor de la propiedad dicglt4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicglt4(String value) {
        this.dicglt4 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicbrt4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicbrt4() {
        return dicbrt4;
    }

    /**
     * Define el valor de la propiedad dicbrt4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicbrt4(String value) {
        this.dicbrt4 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicpat4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicpat4() {
        return dicpat4;
    }

    /**
     * Define el valor de la propiedad dicpat4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicpat4(String value) {
        this.dicpat4 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicpft4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicpft4() {
        return dicpft4;
    }

    /**
     * Define el valor de la propiedad dicpft4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicpft4(String value) {
        this.dicpft4 = value;
    }

    /**
     * Obtiene el valor de la propiedad morat4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorat4() {
        return morat4;
    }

    /**
     * Define el valor de la propiedad morat4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorat4(String value) {
        this.morat4 = value;
    }

    /**
     * Obtiene el valor de la propiedad moraot4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoraot4() {
        return moraot4;
    }

    /**
     * Define el valor de la propiedad moraot4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoraot4(String value) {
        this.moraot4 = value;
    }

    /**
     * Obtiene el valor de la propiedad msjt4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsjt4() {
        return msjt4;
    }

    /**
     * Define el valor de la propiedad msjt4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsjt4(String value) {
        this.msjt4 = value;
    }

    /**
     * Obtiene el valor de la propiedad balcat5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalcat5() {
        return balcat5;
    }

    /**
     * Define el valor de la propiedad balcat5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalcat5(String value) {
        this.balcat5 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicglt5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicglt5() {
        return dicglt5;
    }

    /**
     * Define el valor de la propiedad dicglt5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicglt5(String value) {
        this.dicglt5 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicbut5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicbut5() {
        return dicbut5;
    }

    /**
     * Define el valor de la propiedad dicbut5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicbut5(String value) {
        this.dicbut5 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicpat5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicpat5() {
        return dicpat5;
    }

    /**
     * Define el valor de la propiedad dicpat5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicpat5(String value) {
        this.dicpat5 = value;
    }

    /**
     * Obtiene el valor de la propiedad dicpft5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicpft5() {
        return dicpft5;
    }

    /**
     * Define el valor de la propiedad dicpft5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicpft5(String value) {
        this.dicpft5 = value;
    }

    /**
     * Obtiene el valor de la propiedad morat5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorat5() {
        return morat5;
    }

    /**
     * Define el valor de la propiedad morat5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorat5(String value) {
        this.morat5 = value;
    }

    /**
     * Obtiene el valor de la propiedad moraot5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoraot5() {
        return moraot5;
    }

    /**
     * Define el valor de la propiedad moraot5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoraot5(String value) {
        this.moraot5 = value;
    }

    /**
     * Obtiene el valor de la propiedad msjt5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsjt5() {
        return msjt5;
    }

    /**
     * Define el valor de la propiedad msjt5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsjt5(String value) {
        this.msjt5 = value;
    }

}

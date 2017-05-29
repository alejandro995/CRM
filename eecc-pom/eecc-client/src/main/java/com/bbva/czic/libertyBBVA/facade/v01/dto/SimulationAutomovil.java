package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SimulationAutomovil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimulationAutomovil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amparo" type="{http://com.lsc.services.bbva.common/libertyTypes}Amparo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="automovil" type="{http://com.lsc.services.bbva.common/libertyTypes}Automovil"/>
 *         &lt;element name="conductor" type="{http://com.lsc.services.bbva.common/libertyTypes}PersonaNatural"/>
 *         &lt;element name="datosGestion" type="{http://com.lsc.services.bbva.common/libertyTypes}DatosGestion" minOccurs="0"/>
 *         &lt;element name="infoRequest" type="{http://com.lsc.services.bbva.common/libertyTypes}InfoRequest"/>
 *         &lt;element name="preguntaPoliza" type="{http://com.lsc.services.bbva.common/libertyTypes}PreguntaGeneral" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preguntaRiesgo" type="{http://com.lsc.services.bbva.common/libertyTypes}PreguntaGeneral" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tomadorPersonaJuridica" type="{http://com.lsc.services.bbva.common/libertyTypes}PersonaJuridica" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tomadorPersonaNatural" type="{http://com.lsc.services.bbva.common/libertyTypes}PersonaNatural" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://com.lsc.services.bbva.common/libertyTypes}Usuario" minOccurs="0"/>
 *         &lt;element name="cbancar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctipban" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tipcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimulationAutomovil", propOrder = {
    "amparo",
    "automovil",
    "conductor",
    "datosGestion",
    "infoRequest",
    "preguntaPoliza",
    "preguntaRiesgo",
    "tomadorPersonaJuridica",
    "tomadorPersonaNatural",
    "usuario",
    "cbancar",
    "ctipban",
    "tipcc"
})
@XmlRootElement(name = "SimulationAutomovil")
public class SimulationAutomovil {

    protected List<Amparo> amparo;
    @XmlElement(required = true)
    protected Automovil automovil;
    @XmlElement(required = true)
    protected PersonaNatural conductor;
    protected DatosGestion datosGestion;
    @XmlElement(required = true)
    protected InfoRequest infoRequest;
    protected List<PreguntaGeneral> preguntaPoliza;
    protected List<PreguntaGeneral> preguntaRiesgo;
    protected List<PersonaJuridica> tomadorPersonaJuridica;
    protected List<PersonaNatural> tomadorPersonaNatural;
    protected Usuario usuario;
    protected String cbancar;
    protected BigDecimal ctipban;
    protected String tipcc;

    /**
     * Gets the value of the amparo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amparo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmparo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amparo }
     *
     *
     */
    public List<Amparo> getAmparo() {
        if (amparo == null) {
            amparo = new ArrayList<Amparo>();
        }
        return this.amparo;
    }

    /**
     * Gets the value of the automovil property.
     *
     * @return
     *     possible object is
     *     {@link Automovil }
     *
     */
    public Automovil getAutomovil() {
        return automovil;
    }

    /**
     * Sets the value of the automovil property.
     *
     * @param value
     *     allowed object is
     *     {@link Automovil }
     *
     */
    public void setAutomovil(Automovil value) {
        this.automovil = value;
    }

    /**
     * Gets the value of the conductor property.
     *
     * @return
     *     possible object is
     *     {@link PersonaNatural }
     *
     */
    public PersonaNatural getConductor() {
        return conductor;
    }

    /**
     * Sets the value of the conductor property.
     *
     * @param value
     *     allowed object is
     *     {@link PersonaNatural }
     *
     */
    public void setConductor(PersonaNatural value) {
        this.conductor = value;
    }

    /**
     * Gets the value of the datosGestion property.
     *
     * @return
     *     possible object is
     *     {@link DatosGestion }
     *
     */
    public DatosGestion getDatosGestion() {
        return datosGestion;
    }

    /**
     * Sets the value of the datosGestion property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosGestion }
     *
     */
    public void setDatosGestion(DatosGestion value) {
        this.datosGestion = value;
    }

    /**
     * Gets the value of the infoRequest property.
     *
     * @return
     *     possible object is
     *     {@link InfoRequest }
     *
     */
    public InfoRequest getInfoRequest() {
        return infoRequest;
    }

    /**
     * Sets the value of the infoRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link InfoRequest }
     *
     */
    public void setInfoRequest(InfoRequest value) {
        this.infoRequest = value;
    }

    /**
     * Gets the value of the preguntaPoliza property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preguntaPoliza property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreguntaPoliza().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreguntaGeneral }
     *
     *
     */
    public List<PreguntaGeneral> getPreguntaPoliza() {
        if (preguntaPoliza == null) {
            preguntaPoliza = new ArrayList<PreguntaGeneral>();
        }
        return this.preguntaPoliza;
    }

    /**
     * Gets the value of the preguntaRiesgo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preguntaRiesgo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreguntaRiesgo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreguntaGeneral }
     *
     *
     */
    public List<PreguntaGeneral> getPreguntaRiesgo() {
        if (preguntaRiesgo == null) {
            preguntaRiesgo = new ArrayList<PreguntaGeneral>();
        }
        return this.preguntaRiesgo;
    }

    /**
     * Gets the value of the tomadorPersonaJuridica property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tomadorPersonaJuridica property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTomadorPersonaJuridica().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonaJuridica }
     *
     *
     */
    public List<PersonaJuridica> getTomadorPersonaJuridica() {
        if (tomadorPersonaJuridica == null) {
            tomadorPersonaJuridica = new ArrayList<PersonaJuridica>();
        }
        return this.tomadorPersonaJuridica;
    }

    /**
     * Gets the value of the tomadorPersonaNatural property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tomadorPersonaNatural property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTomadorPersonaNatural().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonaNatural }
     *
     *
     */
    public List<PersonaNatural> getTomadorPersonaNatural() {
        if (tomadorPersonaNatural == null) {
            tomadorPersonaNatural = new ArrayList<PersonaNatural>();
        }
        return this.tomadorPersonaNatural;
    }

    /**
     * Gets the value of the usuario property.
     *
     * @return
     *     possible object is
     *     {@link Usuario }
     *
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     *
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the cbancar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbancar() {
        return cbancar;
    }

    /**
     * Sets the value of the cbancar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbancar(String value) {
        this.cbancar = value;
    }

    /**
     * Gets the value of the ctipban property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtipban() {
        return ctipban;
    }

    /**
     * Sets the value of the ctipban property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtipban(BigDecimal value) {
        this.ctipban = value;
    }

    /**
     * Gets the value of the tipcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipcc() {
        return tipcc;
    }

    /**
     * Sets the value of the tipcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipcc(String value) {
        this.tipcc = value;
    }

}

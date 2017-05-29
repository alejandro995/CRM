package com.bbva.czic.libertyBBVA.facade.v01.dto;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * <p>Java class for ContratacionAutomovilRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContratacionAutomovilRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simulacion" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado"/>
 *         &lt;element name="infoRequest" type="{http://com.lsc.services.bbva.common/libertyTypes}InfoRequest"/>
 *         &lt;element name="coaseguro" type="{http://com.lsc.services.bbva.common/libertyTypes}Coaseguro" minOccurs="0"/>
 *         &lt;element name="direccionTomador" type="{http://com.lsc.services.bbva.common/libertyTypes}DireccionTomador" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="beneficiarioPersonaJuridica" type="{http://com.lsc.services.bbva.common/libertyTypes}PersonaJuridica" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="beneficiarioPersonaNatural" type="{http://com.lsc.services.bbva.common/libertyTypes}PersonaNatural" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aseguradoPersonaJuridica" type="{http://com.lsc.services.bbva.common/libertyTypes}PersonaJuridica" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aseguradoPersonaNatural" type="{http://com.lsc.services.bbva.common/libertyTypes}PersonaNatural" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tomadorPersonaJuridica" type="{http://com.lsc.services.bbva.common/libertyTypes}PersonaJuridica" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tomadorPersonaNatural" type="{http://com.lsc.services.bbva.common/libertyTypes}PersonaNatural" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clausula" type="{http://com.lsc.services.bbva.common/libertyTypes}Clausula" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="automovil" type="{http://com.lsc.services.bbva.contractautomovil/libertyTypes}Automovil"/>
 *         &lt;element name="usuario" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado" minOccurs="0"/>
 *         &lt;element name="preguntaPoliza" type="{http://com.lsc.services.bbva.common/libertyTypes}PreguntaGeneral" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preguntaRiesgo" type="{http://com.lsc.services.bbva.common/libertyTypes}PreguntaGeneral" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://com.lsc.services.bbva.common/libertyTypes}ElementoCodificado" minOccurs="0"/>
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
@XmlType(name = "ContractAutomovil", propOrder = {
"simulacion",
 "infoRequest",
 "coaseguro",
  "direccionTomador",
  "beneficiarioPersonaJuridica",
        "beneficiarioPersonaNatural",
  "aseguradoPersonaJuridica",
  "aseguradoPersonaNatural",
  "tomadorPersonaJuridica",
  "tomadorPersonaNatural",
   "clausula",
  "automovil",
  "usuario",
   "preguntaPoliza",
  "preguntaRiesgo",
   "cbancar",
   "ctipban",
  "tipcc"
})
@XmlRootElement(name = "ContractAutomovil")
    public class ContractAutomovil {
    private ElementoCodificado simulacion;
    @XmlElement(required = true)
    private InfoRequest infoRequest;
    @XmlElement(required = true)
    private Coaseguro coaseguro;
    @XmlElement(required = true)
    private DireccionTomador direccionTomador;
    private List<PersonaJuridica> beneficiarioPersonaJuridica;
    private List<PersonaNatural> beneficiarioPersonaNatural;
    private List<PersonaJuridica> aseguradoPersonaJuridica;
    private List<PersonaNatural> aseguradoPersonaNatural;
    private List<PersonaJuridica> tomadorPersonaJuridica;
    private List<PersonaNatural> tomadorPersonaNatural;
    @XmlElement(required = true)
    private Clausula clausula;
    @XmlElement(required = true)
    private Automovil automovil;
    private ElementoCodificado usuario;
    private List<PreguntaGeneral> preguntaPoliza;
    private List<PreguntaGeneral> preguntaRiesgo;
    private String cbancar;
    private BigDecimal ctipban;
    private String tipcc;

    public ElementoCodificado getSimulacion() {
        return simulacion;
    }

    public void setSimulacion(ElementoCodificado simulacion) {
        this.simulacion = simulacion;
    }

    public InfoRequest getInfoRequest() {
        return infoRequest;
    }

    public void setInfoRequest(InfoRequest infoRequest) {
        this.infoRequest = infoRequest;
    }

    public Coaseguro getCoaseguro() {
        return coaseguro;
    }

    public void setCoaseguro(Coaseguro coaseguro) {
        this.coaseguro = coaseguro;
    }

    public DireccionTomador getDireccionTomador() {
        return direccionTomador;
    }

    public void setDireccionTomador(DireccionTomador direccionTomador) {
        this.direccionTomador = direccionTomador;
    }

    public List<PersonaJuridica> getBeneficiarioPersonaJuridica() {
        return beneficiarioPersonaJuridica;
    }

    public void setBeneficiarioPersonaJuridica(List<PersonaJuridica> beneficiarioPersonaJuridica) {
        this.beneficiarioPersonaJuridica = beneficiarioPersonaJuridica;
    }

    public List<PersonaNatural> getBeneficiarioPersonaNatural() {
        return beneficiarioPersonaNatural;
    }

    public void setBeneficiarioPersonaNatural(List<PersonaNatural> beneficiarioPersonaNatural) {
        this.beneficiarioPersonaNatural = beneficiarioPersonaNatural;
    }

    public List<PersonaJuridica> getAseguradoPersonaJuridica() {
        return aseguradoPersonaJuridica;
    }

    public void setAseguradoPersonaJuridica(List<PersonaJuridica> aseguradoPersonaJuridica) {
        this.aseguradoPersonaJuridica = aseguradoPersonaJuridica;
    }

    public List<PersonaNatural> getAseguradoPersonaNatural() {
        return aseguradoPersonaNatural;
    }

    public void setAseguradoPersonaNatural(List<PersonaNatural> aseguradoPersonaNatural) {
        this.aseguradoPersonaNatural = aseguradoPersonaNatural;
    }

    public List<PersonaJuridica> getTomadorPersonaJuridica() {
        return tomadorPersonaJuridica;
    }

    public void setTomadorPersonaJuridica(List<PersonaJuridica> tomadorPersonaJuridica) {
        this.tomadorPersonaJuridica = tomadorPersonaJuridica;
    }

    public List<PersonaNatural> getTomadorPersonaNatural() {
        return tomadorPersonaNatural;
    }

    public void setTomadorPersonaNatural(List<PersonaNatural> tomadorPersonaNatural) {
        this.tomadorPersonaNatural = tomadorPersonaNatural;
    }

    public Clausula getClausula() {
        return clausula;
    }

    public void setClausula(Clausula clausula) {
        this.clausula = clausula;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    public ElementoCodificado getUsuario() {
        return usuario;
    }

    public void setUsuario(ElementoCodificado usuario) {
        this.usuario = usuario;
    }

    public List<PreguntaGeneral> getPreguntaPoliza() {
        return preguntaPoliza;
    }

    public void setPreguntaPoliza(List<PreguntaGeneral> preguntaPoliza) {
        this.preguntaPoliza = preguntaPoliza;
    }

    public List<PreguntaGeneral> getPreguntaRiesgo() {
        return preguntaRiesgo;
    }

    public void setPreguntaRiesgo(List<PreguntaGeneral> preguntaRiesgo) {
        this.preguntaRiesgo = preguntaRiesgo;
    }

    public String getCbancar() {
        return cbancar;
    }

    public void setCbancar(String cbancar) {
        this.cbancar = cbancar;
    }

    public BigDecimal getCtipban() {
        return ctipban;
    }

    public void setCtipban(BigDecimal ctipban) {
        this.ctipban = ctipban;
    }

    public String getTipcc() {
        return tipcc;
    }

    public void setTipcc(String tipcc) {
        this.tipcc = tipcc;
    }
}

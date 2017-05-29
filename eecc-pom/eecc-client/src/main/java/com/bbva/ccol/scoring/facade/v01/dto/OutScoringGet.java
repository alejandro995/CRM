
package com.bbva.ccol.scoring.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para outScoringGet complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="outScoringGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numcta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numclie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naciona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descnac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decsexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmbros" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="civil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="viviend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="antgdom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="antgcli" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codrel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sitlab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsitlab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profesi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descpro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actecon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dacteco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="antgemp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nomina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patrimo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingfijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vlrvivi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingvar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gasalq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gaship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gascuot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuptarj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salmedi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deducci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dictame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descdic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balcaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicburo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diccapp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desdicp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicperf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desdipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipscor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numctacli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numcli1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipid1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numid1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="digide1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipope1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiptit1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dictam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cappag1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numcli2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipid2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numid2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="digide2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipope2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiptit2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dictam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cappag2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numcli3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipid3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numid3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="digide3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipope3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiptit3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dictam3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cappag3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numcli4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipid4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numid4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="digide4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipope4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiptit4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dictam4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cappag4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numcli5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipid5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numid5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="digide5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipope5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiptit5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dictam5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cappag5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="procede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descprod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descdes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vlrcomp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vlrcred" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descpla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descuot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pago" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pergrac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="porcent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plazacc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vlreval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plazsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dcplaso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuoteva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dictfin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingcons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balcajc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicbalc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicperff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dicburoo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coddict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dictamee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mjrtitu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intpago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mjraval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intpaga" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="limvtc1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plazvc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limvtc2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plazvc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limvtc3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plazvc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limvctj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outScoringGet", propOrder = {
    "numcta",
    "numid",
    "numclie",
    "nombre",
    "naciona",
    "descnac",
    "edad",
    "sexo",
    "decsexo",
    "nmbros",
    "civil",
    "decivil",
    "viviend",
    "antgdom",
    "cliente",
    "antgcli",
    "codrel",
    "descrel",
    "estrato",
    "sitlab",
    "dsitlab",
    "profesi",
    "descpro",
    "actecon",
    "dacteco",
    "antgemp",
    "nomina",
    "recibo",
    "patrimo",
    "ingfijo",
    "vlrvivi",
    "ingvar",
    "gasalq",
    "gaship",
    "gascuot",
    "cuptarj",
    "salmedi",
    "deducci",
    "dictame",
    "descdic",
    "balcaja",
    "dicburo",
    "diccapp",
    "desdicp",
    "dicperf",
    "desdipe",
    "tipscor",
    "numctacli",
    "numcli1",
    "tipid1",
    "numid1",
    "digide1",
    "tipope1",
    "tiptit1",
    "dictam1",
    "cappag1",
    "numcli2",
    "tipid2",
    "numid2",
    "digide2",
    "tipope2",
    "tiptit2",
    "dictam2",
    "cappag2",
    "numcli3",
    "tipid3",
    "numid3",
    "digide3",
    "tipope3",
    "tiptit3",
    "dictam3",
    "cappag3",
    "numcli4",
    "tipid4",
    "numid4",
    "digide4",
    "tipope4",
    "tiptit4",
    "dictam4",
    "cappag4",
    "numcli5",
    "tipid5",
    "numid5",
    "digide5",
    "tipope5",
    "tiptit5",
    "dictam5",
    "cappag5",
    "procede",
    "descprod",
    "destino",
    "descdes",
    "tipoart",
    "descart",
    "vlrcomp",
    "vlrcred",
    "plazo",
    "descpla",
    "cuota",
    "descuot",
    "tasa",
    "pago",
    "pergrac",
    "porcent",
    "plazacc",
    "vlreval",
    "plazsol",
    "dcplaso",
    "cuoteva",
    "dictfin",
    "ingcons",
    "balcajc",
    "dicbalc",
    "dicperff",
    "dicburoo",
    "coddict",
    "dictamee",
    "mjrtitu",
    "intpago",
    "mjraval",
    "intpaga",
    "limvtc1",
    "plazvc1",
    "limvtc2",
    "plazvc2",
    "limvtc3",
    "plazvc3",
    "limvctj"
})
public class OutScoringGet {

    protected String numcta;
    protected String numid;
    protected String numclie;
    protected String nombre;
    protected String naciona;
    protected String descnac;
    protected Integer edad;
    protected String sexo;
    protected String decsexo;
    protected Integer nmbros;
    protected String civil;
    protected String decivil;
    protected String viviend;
    protected Integer antgdom;
    protected String cliente;
    protected Integer antgcli;
    protected String codrel;
    protected String descrel;
    protected String estrato;
    protected String sitlab;
    protected String dsitlab;
    protected String profesi;
    protected String descpro;
    protected String actecon;
    protected String dacteco;
    protected Integer antgemp;
    protected String nomina;
    protected String recibo;
    protected String patrimo;
    protected String ingfijo;
    protected String vlrvivi;
    protected String ingvar;
    protected String gasalq;
    protected String gaship;
    protected String gascuot;
    protected String cuptarj;
    protected String salmedi;
    protected String deducci;
    protected String dictame;
    protected String descdic;
    protected String balcaja;
    protected String dicburo;
    protected String diccapp;
    protected String desdicp;
    protected String dicperf;
    protected String desdipe;
    protected String tipscor;
    protected String numctacli;
    protected String numcli1;
    protected String tipid1;
    protected String numid1;
    protected String digide1;
    protected String tipope1;
    protected String tiptit1;
    protected String dictam1;
    protected Integer cappag1;
    protected String numcli2;
    protected String tipid2;
    protected String numid2;
    protected String digide2;
    protected String tipope2;
    protected String tiptit2;
    protected String dictam2;
    protected Integer cappag2;
    protected String numcli3;
    protected String tipid3;
    protected String numid3;
    protected String digide3;
    protected String tipope3;
    protected String tiptit3;
    protected String dictam3;
    protected Integer cappag3;
    protected String numcli4;
    protected String tipid4;
    protected String numid4;
    protected String digide4;
    protected String tipope4;
    protected String tiptit4;
    protected String dictam4;
    protected Integer cappag4;
    protected String numcli5;
    protected String tipid5;
    protected String numid5;
    protected String digide5;
    protected String tipope5;
    protected String tiptit5;
    protected String dictam5;
    protected Integer cappag5;
    protected String procede;
    protected String descprod;
    protected String destino;
    protected String descdes;
    protected String tipoart;
    protected String descart;
    protected Long vlrcomp;
    protected Long vlrcred;
    protected String plazo;
    protected String descpla;
    protected String cuota;
    protected String descuot;
    protected Long tasa;
    protected Long pago;
    protected String pergrac;
    protected String porcent;
    protected String plazacc;
    protected String vlreval;
    protected String plazsol;
    protected String dcplaso;
    protected String cuoteva;
    protected String dictfin;
    protected String ingcons;
    protected String balcajc;
    protected String dicbalc;
    protected String dicperff;
    protected String dicburoo;
    protected String coddict;
    protected String dictamee;
    protected String mjrtitu;
    protected Integer intpago;
    protected String mjraval;
    protected Integer intpaga;
    protected Long limvtc1;
    protected String plazvc1;
    protected Long limvtc2;
    protected String plazvc2;
    protected Long limvtc3;
    protected String plazvc3;
    protected Long limvctj;

    /**
     * Obtiene el valor de la propiedad numcta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumcta() {
        return numcta;
    }

    /**
     * Define el valor de la propiedad numcta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumcta(String value) {
        this.numcta = value;
    }

    /**
     * Obtiene el valor de la propiedad numid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumid() {
        return numid;
    }

    /**
     * Define el valor de la propiedad numid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumid(String value) {
        this.numid = value;
    }

    /**
     * Obtiene el valor de la propiedad numclie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumclie() {
        return numclie;
    }

    /**
     * Define el valor de la propiedad numclie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumclie(String value) {
        this.numclie = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad naciona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaciona() {
        return naciona;
    }

    /**
     * Define el valor de la propiedad naciona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaciona(String value) {
        this.naciona = value;
    }

    /**
     * Obtiene el valor de la propiedad descnac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescnac() {
        return descnac;
    }

    /**
     * Define el valor de la propiedad descnac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescnac(String value) {
        this.descnac = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEdad(Integer value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad decsexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecsexo() {
        return decsexo;
    }

    /**
     * Define el valor de la propiedad decsexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecsexo(String value) {
        this.decsexo = value;
    }

    /**
     * Obtiene el valor de la propiedad nmbros.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNmbros() {
        return nmbros;
    }

    /**
     * Define el valor de la propiedad nmbros.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNmbros(Integer value) {
        this.nmbros = value;
    }

    /**
     * Obtiene el valor de la propiedad civil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivil() {
        return civil;
    }

    /**
     * Define el valor de la propiedad civil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivil(String value) {
        this.civil = value;
    }

    /**
     * Obtiene el valor de la propiedad decivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecivil() {
        return decivil;
    }

    /**
     * Define el valor de la propiedad decivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecivil(String value) {
        this.decivil = value;
    }

    /**
     * Obtiene el valor de la propiedad viviend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViviend() {
        return viviend;
    }

    /**
     * Define el valor de la propiedad viviend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViviend(String value) {
        this.viviend = value;
    }

    /**
     * Obtiene el valor de la propiedad antgdom.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntgdom() {
        return antgdom;
    }

    /**
     * Define el valor de la propiedad antgdom.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntgdom(Integer value) {
        this.antgdom = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad antgcli.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntgcli() {
        return antgcli;
    }

    /**
     * Define el valor de la propiedad antgcli.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntgcli(Integer value) {
        this.antgcli = value;
    }

    /**
     * Obtiene el valor de la propiedad codrel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodrel() {
        return codrel;
    }

    /**
     * Define el valor de la propiedad codrel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodrel(String value) {
        this.codrel = value;
    }

    /**
     * Obtiene el valor de la propiedad descrel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrel() {
        return descrel;
    }

    /**
     * Define el valor de la propiedad descrel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrel(String value) {
        this.descrel = value;
    }

    /**
     * Obtiene el valor de la propiedad estrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstrato() {
        return estrato;
    }

    /**
     * Define el valor de la propiedad estrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstrato(String value) {
        this.estrato = value;
    }

    /**
     * Obtiene el valor de la propiedad sitlab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitlab() {
        return sitlab;
    }

    /**
     * Define el valor de la propiedad sitlab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitlab(String value) {
        this.sitlab = value;
    }

    /**
     * Obtiene el valor de la propiedad dsitlab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsitlab() {
        return dsitlab;
    }

    /**
     * Define el valor de la propiedad dsitlab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsitlab(String value) {
        this.dsitlab = value;
    }

    /**
     * Obtiene el valor de la propiedad profesi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfesi() {
        return profesi;
    }

    /**
     * Define el valor de la propiedad profesi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfesi(String value) {
        this.profesi = value;
    }

    /**
     * Obtiene el valor de la propiedad descpro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescpro() {
        return descpro;
    }

    /**
     * Define el valor de la propiedad descpro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescpro(String value) {
        this.descpro = value;
    }

    /**
     * Obtiene el valor de la propiedad actecon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActecon() {
        return actecon;
    }

    /**
     * Define el valor de la propiedad actecon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActecon(String value) {
        this.actecon = value;
    }

    /**
     * Obtiene el valor de la propiedad dacteco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDacteco() {
        return dacteco;
    }

    /**
     * Define el valor de la propiedad dacteco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDacteco(String value) {
        this.dacteco = value;
    }

    /**
     * Obtiene el valor de la propiedad antgemp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntgemp() {
        return antgemp;
    }

    /**
     * Define el valor de la propiedad antgemp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntgemp(Integer value) {
        this.antgemp = value;
    }

    /**
     * Obtiene el valor de la propiedad nomina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomina() {
        return nomina;
    }

    /**
     * Define el valor de la propiedad nomina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomina(String value) {
        this.nomina = value;
    }

    /**
     * Obtiene el valor de la propiedad recibo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecibo() {
        return recibo;
    }

    /**
     * Define el valor de la propiedad recibo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecibo(String value) {
        this.recibo = value;
    }

    /**
     * Obtiene el valor de la propiedad patrimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatrimo() {
        return patrimo;
    }

    /**
     * Define el valor de la propiedad patrimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatrimo(String value) {
        this.patrimo = value;
    }

    /**
     * Obtiene el valor de la propiedad ingfijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngfijo() {
        return ingfijo;
    }

    /**
     * Define el valor de la propiedad ingfijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngfijo(String value) {
        this.ingfijo = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrvivi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlrvivi() {
        return vlrvivi;
    }

    /**
     * Define el valor de la propiedad vlrvivi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlrvivi(String value) {
        this.vlrvivi = value;
    }

    /**
     * Obtiene el valor de la propiedad ingvar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngvar() {
        return ingvar;
    }

    /**
     * Define el valor de la propiedad ingvar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngvar(String value) {
        this.ingvar = value;
    }

    /**
     * Obtiene el valor de la propiedad gasalq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGasalq() {
        return gasalq;
    }

    /**
     * Define el valor de la propiedad gasalq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGasalq(String value) {
        this.gasalq = value;
    }

    /**
     * Obtiene el valor de la propiedad gaship.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGaship() {
        return gaship;
    }

    /**
     * Define el valor de la propiedad gaship.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGaship(String value) {
        this.gaship = value;
    }

    /**
     * Obtiene el valor de la propiedad gascuot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGascuot() {
        return gascuot;
    }

    /**
     * Define el valor de la propiedad gascuot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGascuot(String value) {
        this.gascuot = value;
    }

    /**
     * Obtiene el valor de la propiedad cuptarj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuptarj() {
        return cuptarj;
    }

    /**
     * Define el valor de la propiedad cuptarj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuptarj(String value) {
        this.cuptarj = value;
    }

    /**
     * Obtiene el valor de la propiedad salmedi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalmedi() {
        return salmedi;
    }

    /**
     * Define el valor de la propiedad salmedi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalmedi(String value) {
        this.salmedi = value;
    }

    /**
     * Obtiene el valor de la propiedad deducci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeducci() {
        return deducci;
    }

    /**
     * Define el valor de la propiedad deducci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeducci(String value) {
        this.deducci = value;
    }

    /**
     * Obtiene el valor de la propiedad dictame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictame() {
        return dictame;
    }

    /**
     * Define el valor de la propiedad dictame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictame(String value) {
        this.dictame = value;
    }

    /**
     * Obtiene el valor de la propiedad descdic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescdic() {
        return descdic;
    }

    /**
     * Define el valor de la propiedad descdic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescdic(String value) {
        this.descdic = value;
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
     * Obtiene el valor de la propiedad dicburo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicburo() {
        return dicburo;
    }

    /**
     * Define el valor de la propiedad dicburo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicburo(String value) {
        this.dicburo = value;
    }

    /**
     * Obtiene el valor de la propiedad diccapp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiccapp() {
        return diccapp;
    }

    /**
     * Define el valor de la propiedad diccapp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiccapp(String value) {
        this.diccapp = value;
    }

    /**
     * Obtiene el valor de la propiedad desdicp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesdicp() {
        return desdicp;
    }

    /**
     * Define el valor de la propiedad desdicp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesdicp(String value) {
        this.desdicp = value;
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
     * Obtiene el valor de la propiedad desdipe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesdipe() {
        return desdipe;
    }

    /**
     * Define el valor de la propiedad desdipe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesdipe(String value) {
        this.desdipe = value;
    }

    /**
     * Obtiene el valor de la propiedad tipscor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipscor() {
        return tipscor;
    }

    /**
     * Define el valor de la propiedad tipscor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipscor(String value) {
        this.tipscor = value;
    }

    /**
     * Obtiene el valor de la propiedad numctacli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumctacli() {
        return numctacli;
    }

    /**
     * Define el valor de la propiedad numctacli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumctacli(String value) {
        this.numctacli = value;
    }

    /**
     * Obtiene el valor de la propiedad numcli1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumcli1() {
        return numcli1;
    }

    /**
     * Define el valor de la propiedad numcli1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumcli1(String value) {
        this.numcli1 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipid1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipid1() {
        return tipid1;
    }

    /**
     * Define el valor de la propiedad tipid1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipid1(String value) {
        this.tipid1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numid1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumid1() {
        return numid1;
    }

    /**
     * Define el valor de la propiedad numid1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumid1(String value) {
        this.numid1 = value;
    }

    /**
     * Obtiene el valor de la propiedad digide1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigide1() {
        return digide1;
    }

    /**
     * Define el valor de la propiedad digide1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigide1(String value) {
        this.digide1 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipope1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipope1() {
        return tipope1;
    }

    /**
     * Define el valor de la propiedad tipope1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipope1(String value) {
        this.tipope1 = value;
    }

    /**
     * Obtiene el valor de la propiedad tiptit1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiptit1() {
        return tiptit1;
    }

    /**
     * Define el valor de la propiedad tiptit1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiptit1(String value) {
        this.tiptit1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dictam1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictam1() {
        return dictam1;
    }

    /**
     * Define el valor de la propiedad dictam1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictam1(String value) {
        this.dictam1 = value;
    }

    /**
     * Obtiene el valor de la propiedad cappag1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCappag1() {
        return cappag1;
    }

    /**
     * Define el valor de la propiedad cappag1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCappag1(Integer value) {
        this.cappag1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numcli2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumcli2() {
        return numcli2;
    }

    /**
     * Define el valor de la propiedad numcli2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumcli2(String value) {
        this.numcli2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipid2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipid2() {
        return tipid2;
    }

    /**
     * Define el valor de la propiedad tipid2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipid2(String value) {
        this.tipid2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numid2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumid2() {
        return numid2;
    }

    /**
     * Define el valor de la propiedad numid2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumid2(String value) {
        this.numid2 = value;
    }

    /**
     * Obtiene el valor de la propiedad digide2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigide2() {
        return digide2;
    }

    /**
     * Define el valor de la propiedad digide2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigide2(String value) {
        this.digide2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipope2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipope2() {
        return tipope2;
    }

    /**
     * Define el valor de la propiedad tipope2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipope2(String value) {
        this.tipope2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tiptit2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiptit2() {
        return tiptit2;
    }

    /**
     * Define el valor de la propiedad tiptit2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiptit2(String value) {
        this.tiptit2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dictam2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictam2() {
        return dictam2;
    }

    /**
     * Define el valor de la propiedad dictam2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictam2(String value) {
        this.dictam2 = value;
    }

    /**
     * Obtiene el valor de la propiedad cappag2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCappag2() {
        return cappag2;
    }

    /**
     * Define el valor de la propiedad cappag2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCappag2(Integer value) {
        this.cappag2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numcli3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumcli3() {
        return numcli3;
    }

    /**
     * Define el valor de la propiedad numcli3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumcli3(String value) {
        this.numcli3 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipid3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipid3() {
        return tipid3;
    }

    /**
     * Define el valor de la propiedad tipid3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipid3(String value) {
        this.tipid3 = value;
    }

    /**
     * Obtiene el valor de la propiedad numid3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumid3() {
        return numid3;
    }

    /**
     * Define el valor de la propiedad numid3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumid3(String value) {
        this.numid3 = value;
    }

    /**
     * Obtiene el valor de la propiedad digide3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigide3() {
        return digide3;
    }

    /**
     * Define el valor de la propiedad digide3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigide3(String value) {
        this.digide3 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipope3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipope3() {
        return tipope3;
    }

    /**
     * Define el valor de la propiedad tipope3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipope3(String value) {
        this.tipope3 = value;
    }

    /**
     * Obtiene el valor de la propiedad tiptit3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiptit3() {
        return tiptit3;
    }

    /**
     * Define el valor de la propiedad tiptit3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiptit3(String value) {
        this.tiptit3 = value;
    }

    /**
     * Obtiene el valor de la propiedad dictam3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictam3() {
        return dictam3;
    }

    /**
     * Define el valor de la propiedad dictam3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictam3(String value) {
        this.dictam3 = value;
    }

    /**
     * Obtiene el valor de la propiedad cappag3.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCappag3() {
        return cappag3;
    }

    /**
     * Define el valor de la propiedad cappag3.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCappag3(Integer value) {
        this.cappag3 = value;
    }

    /**
     * Obtiene el valor de la propiedad numcli4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumcli4() {
        return numcli4;
    }

    /**
     * Define el valor de la propiedad numcli4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumcli4(String value) {
        this.numcli4 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipid4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipid4() {
        return tipid4;
    }

    /**
     * Define el valor de la propiedad tipid4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipid4(String value) {
        this.tipid4 = value;
    }

    /**
     * Obtiene el valor de la propiedad numid4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumid4() {
        return numid4;
    }

    /**
     * Define el valor de la propiedad numid4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumid4(String value) {
        this.numid4 = value;
    }

    /**
     * Obtiene el valor de la propiedad digide4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigide4() {
        return digide4;
    }

    /**
     * Define el valor de la propiedad digide4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigide4(String value) {
        this.digide4 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipope4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipope4() {
        return tipope4;
    }

    /**
     * Define el valor de la propiedad tipope4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipope4(String value) {
        this.tipope4 = value;
    }

    /**
     * Obtiene el valor de la propiedad tiptit4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiptit4() {
        return tiptit4;
    }

    /**
     * Define el valor de la propiedad tiptit4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiptit4(String value) {
        this.tiptit4 = value;
    }

    /**
     * Obtiene el valor de la propiedad dictam4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictam4() {
        return dictam4;
    }

    /**
     * Define el valor de la propiedad dictam4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictam4(String value) {
        this.dictam4 = value;
    }

    /**
     * Obtiene el valor de la propiedad cappag4.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCappag4() {
        return cappag4;
    }

    /**
     * Define el valor de la propiedad cappag4.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCappag4(Integer value) {
        this.cappag4 = value;
    }

    /**
     * Obtiene el valor de la propiedad numcli5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumcli5() {
        return numcli5;
    }

    /**
     * Define el valor de la propiedad numcli5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumcli5(String value) {
        this.numcli5 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipid5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipid5() {
        return tipid5;
    }

    /**
     * Define el valor de la propiedad tipid5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipid5(String value) {
        this.tipid5 = value;
    }

    /**
     * Obtiene el valor de la propiedad numid5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumid5() {
        return numid5;
    }

    /**
     * Define el valor de la propiedad numid5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumid5(String value) {
        this.numid5 = value;
    }

    /**
     * Obtiene el valor de la propiedad digide5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigide5() {
        return digide5;
    }

    /**
     * Define el valor de la propiedad digide5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigide5(String value) {
        this.digide5 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipope5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipope5() {
        return tipope5;
    }

    /**
     * Define el valor de la propiedad tipope5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipope5(String value) {
        this.tipope5 = value;
    }

    /**
     * Obtiene el valor de la propiedad tiptit5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiptit5() {
        return tiptit5;
    }

    /**
     * Define el valor de la propiedad tiptit5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiptit5(String value) {
        this.tiptit5 = value;
    }

    /**
     * Obtiene el valor de la propiedad dictam5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictam5() {
        return dictam5;
    }

    /**
     * Define el valor de la propiedad dictam5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictam5(String value) {
        this.dictam5 = value;
    }

    /**
     * Obtiene el valor de la propiedad cappag5.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCappag5() {
        return cappag5;
    }

    /**
     * Define el valor de la propiedad cappag5.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCappag5(Integer value) {
        this.cappag5 = value;
    }

    /**
     * Obtiene el valor de la propiedad procede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcede() {
        return procede;
    }

    /**
     * Define el valor de la propiedad procede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcede(String value) {
        this.procede = value;
    }

    /**
     * Obtiene el valor de la propiedad descprod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescprod() {
        return descprod;
    }

    /**
     * Define el valor de la propiedad descprod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescprod(String value) {
        this.descprod = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad descdes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescdes() {
        return descdes;
    }

    /**
     * Define el valor de la propiedad descdes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescdes(String value) {
        this.descdes = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoart() {
        return tipoart;
    }

    /**
     * Define el valor de la propiedad tipoart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoart(String value) {
        this.tipoart = value;
    }

    /**
     * Obtiene el valor de la propiedad descart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescart() {
        return descart;
    }

    /**
     * Define el valor de la propiedad descart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescart(String value) {
        this.descart = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrcomp.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVlrcomp() {
        return vlrcomp;
    }

    /**
     * Define el valor de la propiedad vlrcomp.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVlrcomp(Long value) {
        this.vlrcomp = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrcred.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVlrcred() {
        return vlrcred;
    }

    /**
     * Define el valor de la propiedad vlrcred.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVlrcred(Long value) {
        this.vlrcred = value;
    }

    /**
     * Obtiene el valor de la propiedad plazo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazo() {
        return plazo;
    }

    /**
     * Define el valor de la propiedad plazo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazo(String value) {
        this.plazo = value;
    }

    /**
     * Obtiene el valor de la propiedad descpla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescpla() {
        return descpla;
    }

    /**
     * Define el valor de la propiedad descpla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescpla(String value) {
        this.descpla = value;
    }

    /**
     * Obtiene el valor de la propiedad cuota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuota() {
        return cuota;
    }

    /**
     * Define el valor de la propiedad cuota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuota(String value) {
        this.cuota = value;
    }

    /**
     * Obtiene el valor de la propiedad descuot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescuot() {
        return descuot;
    }

    /**
     * Define el valor de la propiedad descuot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescuot(String value) {
        this.descuot = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTasa(Long value) {
        this.tasa = value;
    }

    /**
     * Obtiene el valor de la propiedad pago.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPago() {
        return pago;
    }

    /**
     * Define el valor de la propiedad pago.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPago(Long value) {
        this.pago = value;
    }

    /**
     * Obtiene el valor de la propiedad pergrac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPergrac() {
        return pergrac;
    }

    /**
     * Define el valor de la propiedad pergrac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPergrac(String value) {
        this.pergrac = value;
    }

    /**
     * Obtiene el valor de la propiedad porcent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcent() {
        return porcent;
    }

    /**
     * Define el valor de la propiedad porcent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcent(String value) {
        this.porcent = value;
    }

    /**
     * Obtiene el valor de la propiedad plazacc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazacc() {
        return plazacc;
    }

    /**
     * Define el valor de la propiedad plazacc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazacc(String value) {
        this.plazacc = value;
    }

    /**
     * Obtiene el valor de la propiedad vlreval.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlreval() {
        return vlreval;
    }

    /**
     * Define el valor de la propiedad vlreval.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlreval(String value) {
        this.vlreval = value;
    }

    /**
     * Obtiene el valor de la propiedad plazsol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazsol() {
        return plazsol;
    }

    /**
     * Define el valor de la propiedad plazsol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazsol(String value) {
        this.plazsol = value;
    }

    /**
     * Obtiene el valor de la propiedad dcplaso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcplaso() {
        return dcplaso;
    }

    /**
     * Define el valor de la propiedad dcplaso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcplaso(String value) {
        this.dcplaso = value;
    }

    /**
     * Obtiene el valor de la propiedad cuoteva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuoteva() {
        return cuoteva;
    }

    /**
     * Define el valor de la propiedad cuoteva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuoteva(String value) {
        this.cuoteva = value;
    }

    /**
     * Obtiene el valor de la propiedad dictfin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictfin() {
        return dictfin;
    }

    /**
     * Define el valor de la propiedad dictfin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictfin(String value) {
        this.dictfin = value;
    }

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
     * Obtiene el valor de la propiedad balcajc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalcajc() {
        return balcajc;
    }

    /**
     * Define el valor de la propiedad balcajc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalcajc(String value) {
        this.balcajc = value;
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
     * Obtiene el valor de la propiedad dicperff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicperff() {
        return dicperff;
    }

    /**
     * Define el valor de la propiedad dicperff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicperff(String value) {
        this.dicperff = value;
    }

    /**
     * Obtiene el valor de la propiedad dicburoo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDicburoo() {
        return dicburoo;
    }

    /**
     * Define el valor de la propiedad dicburoo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDicburoo(String value) {
        this.dicburoo = value;
    }

    /**
     * Obtiene el valor de la propiedad coddict.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoddict() {
        return coddict;
    }

    /**
     * Define el valor de la propiedad coddict.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoddict(String value) {
        this.coddict = value;
    }

    /**
     * Obtiene el valor de la propiedad dictamee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictamee() {
        return dictamee;
    }

    /**
     * Define el valor de la propiedad dictamee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictamee(String value) {
        this.dictamee = value;
    }

    /**
     * Obtiene el valor de la propiedad mjrtitu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMjrtitu() {
        return mjrtitu;
    }

    /**
     * Define el valor de la propiedad mjrtitu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMjrtitu(String value) {
        this.mjrtitu = value;
    }

    /**
     * Obtiene el valor de la propiedad intpago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntpago() {
        return intpago;
    }

    /**
     * Define el valor de la propiedad intpago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntpago(Integer value) {
        this.intpago = value;
    }

    /**
     * Obtiene el valor de la propiedad mjraval.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMjraval() {
        return mjraval;
    }

    /**
     * Define el valor de la propiedad mjraval.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMjraval(String value) {
        this.mjraval = value;
    }

    /**
     * Obtiene el valor de la propiedad intpaga.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntpaga() {
        return intpaga;
    }

    /**
     * Define el valor de la propiedad intpaga.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntpaga(Integer value) {
        this.intpaga = value;
    }

    /**
     * Obtiene el valor de la propiedad limvtc1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLimvtc1() {
        return limvtc1;
    }

    /**
     * Define el valor de la propiedad limvtc1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimvtc1(Long value) {
        this.limvtc1 = value;
    }

    /**
     * Obtiene el valor de la propiedad plazvc1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazvc1() {
        return plazvc1;
    }

    /**
     * Define el valor de la propiedad plazvc1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazvc1(String value) {
        this.plazvc1 = value;
    }

    /**
     * Obtiene el valor de la propiedad limvtc2.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLimvtc2() {
        return limvtc2;
    }

    /**
     * Define el valor de la propiedad limvtc2.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimvtc2(Long value) {
        this.limvtc2 = value;
    }

    /**
     * Obtiene el valor de la propiedad plazvc2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazvc2() {
        return plazvc2;
    }

    /**
     * Define el valor de la propiedad plazvc2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazvc2(String value) {
        this.plazvc2 = value;
    }

    /**
     * Obtiene el valor de la propiedad limvtc3.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLimvtc3() {
        return limvtc3;
    }

    /**
     * Define el valor de la propiedad limvtc3.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimvtc3(Long value) {
        this.limvtc3 = value;
    }

    /**
     * Obtiene el valor de la propiedad plazvc3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazvc3() {
        return plazvc3;
    }

    /**
     * Define el valor de la propiedad plazvc3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazvc3(String value) {
        this.plazvc3 = value;
    }

    /**
     * Obtiene el valor de la propiedad limvctj.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLimvctj() {
        return limvctj;
    }

    /**
     * Define el valor de la propiedad limvctj.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimvctj(Long value) {
        this.limvctj = value;
    }

}

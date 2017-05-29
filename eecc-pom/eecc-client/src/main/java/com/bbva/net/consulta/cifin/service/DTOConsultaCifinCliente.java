/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.net.consulta.cifin.service;

/**
 *
 * @author Administrator
 */
public class DTOConsultaCifinCliente {

    private String delScore;
    private String estadoC;
    private String gastHip;
    private String gastCuo;
    private String gastTTDC;
    private String cuposCom;
    private String sobregiro;
    private String gastCom;
    private String puntaje;

    public String getFeConCifin() {
        return feConCifin;
    }

    public void setFeConCifin(String feConCifin) {
        this.feConCifin = feConCifin;
    }

    private String feConCifin;
    private int valPredictor;
    private String codRetorno;
    private String descRetorno;

    public String getDelScore() {
        return delScore;
    }

    public void setDelScore(String delScore) {
        this.delScore = delScore;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }

    public String getGastHip() {
        return gastHip;
    }

    public void setGastHip(String gastHip) {
        this.gastHip = gastHip;
    }

    public String getGastCuo() {
        return gastCuo;
    }

    public void setGastCuo(String gastCuo) {
        this.gastCuo = gastCuo;
    }

    public String getGastTTDC() {
        return gastTTDC;
    }

    public void setGastTTDC(String gastTTDC) {
        this.gastTTDC = gastTTDC;
    }

    public String getCuposCom() {
        return cuposCom;
    }

    public void setCuposCom(String cuposCom) {
        this.cuposCom = cuposCom;
    }

    public String getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(String sobregiro) {
        this.sobregiro = sobregiro;
    }

    public String getGastCom() {
        return gastCom;
    }

    public void setGastCom(String gastCom) {
        this.gastCom = gastCom;
    }

    public String getCodRetorno() {
        return codRetorno;
    }

    public void setCodRetorno(String codRetorno) {
        this.codRetorno = codRetorno;
    }

    public String getDescRetorno() {
        return descRetorno;
    }

    public void setDescRetorno(String descRetorno) {
        this.descRetorno = descRetorno;
    }

    public int getValPredictor() {
        return valPredictor;
    }

    public void setValPredictor(int valPredictor) {
        this.valPredictor = valPredictor;
    }

    /**
     * @return the puntaje
     */
    public String getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }
}

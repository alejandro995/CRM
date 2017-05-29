/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * DTOPosicionGlobal.java - Listado de productos.
 *
 * @author Luis Berna
 * @version 1.0
 * @date 20/01/2017
 * @see
 */
public class DTOItem implements Serializable {

     private String nombreProducto;
    private String nombreColumna1;
    private String nombreColumna2;
    private String nombreColumna3;
    private String nombreColumna4;
    private String nombreColumna5;
    private String nombreColumna6;
    private String nombreColumna7;
    private String nombreColumna8;
    private String nombreColumna9;
    private String nombreColumna10;
    private String nombreColumna11;
    private String nombreModal;
    private List<DTODetalle> detalles;

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the nombreColumna1
     */
    public String getNombreColumna1() {
        return nombreColumna1;
    }

    /**
     * @param nombreColumna1 the nombreColumna1 to set
     */
    public void setNombreColumna1(String nombreColumna1) {
        this.nombreColumna1 = nombreColumna1;
    }

    /**
     * @return the nombreColumna2
     */
    public String getNombreColumna2() {
        return nombreColumna2;
    }

    /**
     * @param nombreColumna2 the nombreColumna2 to set
     */
    public void setNombreColumna2(String nombreColumna2) {
        this.nombreColumna2 = nombreColumna2;
    }

    /**
     * @return the nombreColumna3
     */
    public String getNombreColumna3() {
        return nombreColumna3;
    }

    /**
     * @param nombreColumna3 the nombreColumna3 to set
     */
    public void setNombreColumna3(String nombreColumna3) {
        this.nombreColumna3 = nombreColumna3;
    }

    /**
     * @return the nombreColumna4
     */
    public String getNombreColumna4() {
        return nombreColumna4;
    }

    /**
     * @param nombreColumna4 the nombreColumna4 to set
     */
    public void setNombreColumna4(String nombreColumna4) {
        this.nombreColumna4 = nombreColumna4;
    }

    /**
     * @return the detalles
     */
    public List<DTODetalle> getDetalles() {
        if (detalles == null) {
            detalles = new ArrayList<DTODetalle>();
        }
        return detalles;
    }

    /**
     * @param detalles the detalles to set
     */
    public void setDetalles(List<DTODetalle> detalles) {
        this.detalles = detalles;
    }

    /**
     * @return the nombreModal
     */
    public String getNombreModal() {
        return nombreModal;
    }

    /**
     * @param nombreModal the nombreModal to set
     */
    public void setNombreModal(String nombreModal) {
        this.nombreModal = nombreModal;
    }

    /**
     * @return the nombreColumna5
     */
    public String getNombreColumna5() {
        return nombreColumna5;
    }

    /**
     * @param nombreColumna5 the nombreColumna5 to set
     */
    public void setNombreColumna5(String nombreColumna5) {
        this.nombreColumna5 = nombreColumna5;
    }

    /**
     * @return the nombreColumna6
     */
    public String getNombreColumna6() {
        return nombreColumna6;
    }

    /**
     * @param nombreColumna6 the nombreColumna6 to set
     */
    public void setNombreColumna6(String nombreColumna6) {
        this.nombreColumna6 = nombreColumna6;
    }

    /**
     * @return the nombreColumna7
     */
    public String getNombreColumna7() {
        return nombreColumna7;
    }

    /**
     * @param nombreColumna7 the nombreColumna7 to set
     */
    public void setNombreColumna7(String nombreColumna7) {
        this.nombreColumna7 = nombreColumna7;
    }

    /**
     * @return the nombreColumna8
     */
    public String getNombreColumna8() {
        return nombreColumna8;
    }

    /**
     * @param nombreColumna8 the nombreColumna8 to set
     */
    public void setNombreColumna8(String nombreColumna8) {
        this.nombreColumna8 = nombreColumna8;
    }

    /**
     * @return the nombreColumna9
     */
    public String getNombreColumna9() {
        return nombreColumna9;
    }

    /**
     * @param nombreColumna9 the nombreColumna9 to set
     */
    public void setNombreColumna9(String nombreColumna9) {
        this.nombreColumna9 = nombreColumna9;
    }

    /**
     * @return the nombreColumna10
     */
    public String getNombreColumna10() {
        return nombreColumna10;
    }

    /**
     * @param nombreColumna10 the nombreColumna10 to set
     */
    public void setNombreColumna10(String nombreColumna10) {
        this.nombreColumna10 = nombreColumna10;
    }

    /**
     * @return the nombreColumna11
     */
    public String getNombreColumna11() {
        return nombreColumna11;
    }

    /**
     * @param nombreColumna11 the nombreColumna11 to set
     */
    public void setNombreColumna11(String nombreColumna11) {
        this.nombreColumna11 = nombreColumna11;
    }
}

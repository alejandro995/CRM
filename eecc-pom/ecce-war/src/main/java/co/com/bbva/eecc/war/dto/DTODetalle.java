/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.dto;

import java.io.Serializable;

/**
 * DTODetalle.java - Listado de detalles de un producto.
 *
 * @author Luis Berna
 * @version 1.0
 * @date 2/03/2017
 * @see
 */
public class DTODetalle implements Serializable {

       private String valorCampo1;
    private String valorCampo2;
    private String valorCampo3;
    private String valorCampo4;
    private String valorCampo5;
    private String valorCampo6;
    private String valorCampo7;
    private String valorCampo8;
    private DTOItem item;

    public DTODetalle(String valorCampo1, String valorCampo2, String valorCampo3, String valorCampo4, DTOItem item) {
        this.valorCampo1 = valorCampo1;
        this.valorCampo2 = valorCampo2;
        this.valorCampo3 = valorCampo3;
        this.valorCampo4 = valorCampo4;
        this.item = item;
    }

    public DTODetalle(String valorCampo1, String valorCampo2, String valorCampo3, String valorCampo4) {
        this.valorCampo1 = valorCampo1;
        this.valorCampo2 = valorCampo2;
        this.valorCampo3 = valorCampo3;
        this.valorCampo4 = valorCampo4;
    }

    public DTODetalle(String valorCampo1, String valorCampo2, String valorCampo3, String valorCampo4, String valorCampo5) {
        this.valorCampo1 = valorCampo1;
        this.valorCampo2 = valorCampo2;
        this.valorCampo3 = valorCampo3;
        this.valorCampo4 = valorCampo4;
        this.valorCampo5 = valorCampo5;
    }

    public DTODetalle(String valorCampo1, String valorCampo2, String valorCampo3, String valorCampo4, String valorCampo5, String valorCampo6, String valorCampo7, String valorCampo8) {
        this.valorCampo1 = valorCampo1;
        this.valorCampo2 = valorCampo2;
        this.valorCampo3 = valorCampo3;
        this.valorCampo4 = valorCampo4;
        this.valorCampo5 = valorCampo5;
        this.valorCampo6 = valorCampo6;
        this.valorCampo7 = valorCampo7;
        this.valorCampo8 = valorCampo8;
    }

    /**
     * @return the valorCampo1
     */
    public String getValorCampo1() {
        return valorCampo1;
    }

    /**
     * @param valorCampo1 the valorCampo1 to set
     */
    public void setValorCampo1(String valorCampo1) {
        this.valorCampo1 = valorCampo1;
    }

    /**
     * @return the valorCampo2
     */
    public String getValorCampo2() {
        return valorCampo2;
    }

    /**
     * @param valorCampo2 the valorCampo2 to set
     */
    public void setValorCampo2(String valorCampo2) {
        this.valorCampo2 = valorCampo2;
    }

    /**
     * @return the valorCampo3
     */
    public String getValorCampo3() {
        return valorCampo3;
    }

    /**
     * @param valorCampo3 the valorCampo3 to set
     */
    public void setValorCampo3(String valorCampo3) {
        this.valorCampo3 = valorCampo3;
    }

    /**
     * @return the valorCampo4
     */
    public String getValorCampo4() {
        return valorCampo4;
    }

    /**
     * @param valorCampo4 the valorCampo4 to set
     */
    public void setValorCampo4(String valorCampo4) {
        this.valorCampo4 = valorCampo4;
    }

    /**
     * @return the item
     */
    public DTOItem getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(DTOItem item) {
        this.item = item;
    }

    /**
     * @return the valorCampo5
     */
    public String getValorCampo5() {
        return valorCampo5;
    }

    /**
     * @param valorCampo5 the valorCampo5 to set
     */
    public void setValorCampo5(String valorCampo5) {
        this.valorCampo5 = valorCampo5;
    }

    /**
     * @return the valorCampo6
     */
    public String getValorCampo6() {
        return valorCampo6;
    }

    /**
     * @param valorCampo6 the valorCampo6 to set
     */
    public void setValorCampo6(String valorCampo6) {
        this.valorCampo6 = valorCampo6;
    }

    /**
     * @return the valorCampo7
     */
    public String getValorCampo7() {
        return valorCampo7;
    }

    /**
     * @param valorCampo7 the valorCampo7 to set
     */
    public void setValorCampo7(String valorCampo7) {
        this.valorCampo7 = valorCampo7;
    }

    /**
     * @return the valorCampo8
     */
    public String getValorCampo8() {
        return valorCampo8;
    }

    /**
     * @param valorCampo8 the valorCampo8 to set
     */
    public void setValorCampo8(String valorCampo8) {
        this.valorCampo8 = valorCampo8;
    }
}

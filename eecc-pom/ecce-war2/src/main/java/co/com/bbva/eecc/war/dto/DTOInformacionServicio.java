package co.com.bbva.eecc.war.dto;

import java.io.Serializable;

/**
 * DTOInformacionServicio.java - Información de Servicios
 *
 * @author Luis Berna
 * @version 1.0
 * @date 20/01/2017
 * @see
 */
public class DTOInformacionServicio implements Serializable {

    /**
     * @nomina - Tenencia del servicio Nomina.
     */
    private boolean nomina;
    /**
     * @tarjetaDebito - Tenencia del Tarjeta debito.
     */
    private boolean tarjetaDebito;
    /**
     * @bbvaNet - Tenencia del servicio bbva net.
     */
    private boolean bbvaNet;
    /**
     * @segurosLibres - Tenencia Seguros Libres.
     */
    private boolean segurosLibres;
    /**
     * @domiciliaciones - Tenencia de Domiciliaciones.
     */
    private boolean domiciliaciones;
    /**
     * @bbvaMovil - Tenencia del servicio BBVA Movil.
     */
    private boolean bbvaMovil;
    /**
     * @adquirencias - Tenencia de Adquirencias.
     */
    private boolean adquirencias;

    /**
     * @return the nomina
     */
    public boolean isNomina() {
        return nomina;
    }

    /**
     * @param nomina the nomina to set
     */
    public void setNomina(boolean nomina) {
        this.nomina = nomina;
    }

    /**
     * @return the tarjetaDebito
     */
    public boolean isTarjetaDebito() {
        return tarjetaDebito;
    }

    /**
     * @param tarjetaDebito the tarjetaDebito to set
     */
    public void setTarjetaDebito(boolean tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    /**
     * @return the bbvaNet
     */
    public boolean isBbvaNet() {
        return bbvaNet;
    }

    /**
     * @param bbvaNet the bbvaNet to set
     */
    public void setBbvaNet(boolean bbvaNet) {
        this.bbvaNet = bbvaNet;
    }

    /**
     * @return the segurosLibres
     */
    public boolean isSegurosLibres() {
        return segurosLibres;
    }

    /**
     * @param segurosLibres the segurosLibres to set
     */
    public void setSegurosLibres(boolean segurosLibres) {
        this.segurosLibres = segurosLibres;
    }

    /**
     * @return the domiciliaciones
     */
    public boolean isDomiciliaciones() {
        return domiciliaciones;
    }

    /**
     * @param domiciliaciones the domiciliaciones to set
     */
    public void setDomiciliaciones(boolean domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }

    /**
     * @return the bbvaMovil
     */
    public boolean isBbvaMovil() {
        return bbvaMovil;
    }

    /**
     * @param bbvaMovil the bbvaMovil to set
     */
    public void setBbvaMovil(boolean bbvaMovil) {
        this.bbvaMovil = bbvaMovil;
    }

    /**
     * @return the adquirencias
     */
    public boolean isAdquirencias() {
        return adquirencias;
    }

    /**
     * @param adquirencias the adquirencias to set
     */
    public void setAdquirencias(boolean adquirencias) {
        this.adquirencias = adquirencias;
    }

}

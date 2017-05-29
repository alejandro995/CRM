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
public class DTOPerfil implements Serializable {

    /**
     * @puntosGestion - Oficinas donde es atendido el cliente.
     */
    private String puntosGestion;
    /**
     * @limitesVentaCruzada - Limites de venta cruzada para consumo y tarjetas.
     */
    private String limitesVentaCruzada;
    /**
     * @diasMora - Dias de mora del cliente.
     */
    private String diasMora;
    /**
     * @calificacionFinanciera - Calificación financiera del cliente.
     */
    private String calificacionFinanciera;
    /**
     * @puntajeBuroCifin - Puntaje buro cifin del cliente.
     */
    private String puntajeBuroCifin;
    /**
     * @valorProvision - Valor de las provisiones del cliente.
     */
    private String valorProvision;
    /**
     * @quejasUltimoAno - Quejas abiertas en kronos .
     */
    private String quejasUltimoAno;
    /**
     * @colectivo - Colectivo de negocio al que pertenece el cliente.
     */
    private String colectivo;
    /**
     * @subColectivo - Sub Colectivo de negocio al que pertenece el cliente.
     */
    private String subColectivo;
    /**
     * @ocupacion - Ocupación del cliente, profesión.
     */
    private String ocupacion;
    /**
     * @situacionLaboral - Situación laboral del cliente.
     */
    private String situacionLaboral;
    /**
     * @numeroClienteAltamira - Numero de cliente altamira.
     */
    private String numeroClienteAltamira;
  

    /**
     * @return the puntosGestion
     */
    public String getPuntosGestion() {
        return puntosGestion;
    }

    /**
     * @param puntosGestion the puntosGestion to set
     */
    public void setPuntosGestion(String puntosGestion) {
        this.puntosGestion = puntosGestion;
    }

    /**
     * @return the limitesVentaCruzada
     */
    public String getLimitesVentaCruzada() {
        return limitesVentaCruzada;
    }

    /**
     * @param limitesVentaCruzada the limitesVentaCruzada to set
     */
    public void setLimitesVentaCruzada(String limitesVentaCruzada) {
        this.limitesVentaCruzada = limitesVentaCruzada;
    }

    /**
     * @return the diasMora
     */
    public String getDiasMora() {
        return diasMora;
    }

    /**
     * @param diasMora the diasMora to set
     */
    public void setDiasMora(String diasMora) {
        this.diasMora = diasMora;
    }

    /**
     * @return the calificacionFinanciera
     */
    public String getCalificacionFinanciera() {
        return calificacionFinanciera;
    }

    /**
     * @param calificacionFinanciera the calificacionFinanciera to set
     */
    public void setCalificacionFinanciera(String calificacionFinanciera) {
        this.calificacionFinanciera = calificacionFinanciera;
    }

    /**
     * @return the puntajeBuroCifin
     */
    public String getPuntajeBuroCifin() {
        return puntajeBuroCifin;
    }

    /**
     * @param puntajeBuroCifin the puntajeBuroCifin to set
     */
    public void setPuntajeBuroCifin(String puntajeBuroCifin) {
        this.puntajeBuroCifin = puntajeBuroCifin;
    }

    /**
     * @return the valorProvision
     */
    public String getValorProvision() {
        return valorProvision;
    }

    /**
     * @param valorProvision the valorProvision to set
     */
    public void setValorProvision(String valorProvision) {
        this.valorProvision = valorProvision;
    }

    /**
     * @return the quejasUltimoAno
     */
    public String getQuejasUltimoAno() {
        return quejasUltimoAno;
    }

    /**
     * @param quejasUltimoAno the quejasUltimoAno to set
     */
    public void setQuejasUltimoAno(String quejasUltimoAno) {
        this.quejasUltimoAno = quejasUltimoAno;
    }

    /**
     * @return the colectivo
     */
    public String getColectivo() {
        return colectivo;
    }

    /**
     * @param colectivo the colectivo to set
     */
    public void setColectivo(String colectivo) {
        this.colectivo = colectivo;
    }

    /**
     * @return the subColectivo
     */
    public String getSubColectivo() {
        return subColectivo;
    }

    /**
     * @param subColectivo the subColectivo to set
     */
    public void setSubColectivo(String subColectivo) {
        this.subColectivo = subColectivo;
    }

    /**
     * @return the ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }

    /**
     * @param ocupacion the ocupacion to set
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * @return the situacionLaboral
     */
    public String getSituacionLaboral() {
        return situacionLaboral;
    }

    /**
     * @param situacionLaboral the situacionLaboral to set
     */
    public void setSituacionLaboral(String situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    /**
     * @return the numeroClienteAltamira
     */
    public String getNumeroClienteAltamira() {
        return numeroClienteAltamira;
    }

    /**
     * @param numeroClienteAltamira the numeroClienteAltamira to set
     */
    public void setNumeroClienteAltamira(String numeroClienteAltamira) {
        this.numeroClienteAltamira = numeroClienteAltamira;
    }

}

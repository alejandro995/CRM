package co.com.bbva.eecc.war.dto;

import java.io.Serializable;

/**
 * DTOContratosPasivo.java - Active contract for the client
 *
 * @author Luis Berna
 * @version 1.0
 * @date 20/01/2017
 * @see
 */
public class DTOContratosPasivo implements Serializable {

    /**
     * @valueSavings - Valor del producto del activo - Consumo .
     */
    private String valorConsumo;
    /**
     * @valorCuentaCorriente - Valor del producto del pasivo - Cuenta Corriente.
     */
    private String valorCuentaCorriente;
    /**
     * @valorPlazo - Valor del producto del pasivo - Plazo.
     */
    private String valorPlazo;
    /**
     * @valorFondos - Valor del producto del pasivo - Fondos.
     */
    private String valorFondos;
    /**
     * @porcentagePasivo - Porcentage del total del pasivo.
     */
    private String porcentagePasivo;
    /**
     * @totalPasivos - Valor total correspondiente a los pasivos del cliente.
     */
    private String totalPasivos;

    /**
     * @return the valorConsumo
     */
    public String getValorConsumo() {
        return valorConsumo;
    }

    /**
     * @param valorConsumo the valorConsumo to set
     */
    public void setValorConsumo(String valorConsumo) {
        this.valorConsumo = valorConsumo;
    }

    /**
     * @return the valorCuentaCorriente
     */
    public String getValorCuentaCorriente() {
        return valorCuentaCorriente;
    }

    /**
     * @param valorCuentaCorriente the valorCuentaCorriente to set
     */
    public void setValorCuentaCorriente(String valorCuentaCorriente) {
        this.valorCuentaCorriente = valorCuentaCorriente;
    }

    /**
     * @return the valorPlazo
     */
    public String getValorPlazo() {
        return valorPlazo;
    }

    /**
     * @param valorPlazo the valorPlazo to set
     */
    public void setValorPlazo(String valorPlazo) {
        this.valorPlazo = valorPlazo;
    }

    /**
     * @return the valorFondos
     */
    public String getValorFondos() {
        return valorFondos;
    }

    /**
     * @param valorFondos the valorFondos to set
     */
    public void setValorFondos(String valorFondos) {
        this.valorFondos = valorFondos;
    }

    /**
     * @return the porcentagePasivo
     */
    public String getPorcentagePasivo() {
        return porcentagePasivo;
    }

    /**
     * @param porcentagePasivo the porcentagePasivo to set
     */
    public void setPorcentagePasivo(String porcentagePasivo) {
        this.porcentagePasivo = porcentagePasivo;
    }

    /**
     * @return the totalPasivos
     */
    public String getTotalPasivos() {
        return totalPasivos;
    }

    /**
     * @param totalPasivos the totalPasivos to set
     */
    public void setTotalPasivos(String totalPasivos) {
        this.totalPasivos = totalPasivos;
    }

}

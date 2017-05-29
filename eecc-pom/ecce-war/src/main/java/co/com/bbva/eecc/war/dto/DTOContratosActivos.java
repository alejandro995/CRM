package co.com.bbva.eecc.war.dto;

import java.io.Serializable;

/**
 * DTOContratosActivos.java - Active contract for the client
 *
 * @author Luis Berna
 * @version 1.0
 * @date 20/01/2017
 * @see DTOCustomer
 */
public class DTOContratosActivos implements Serializable {

    /**
     * @valorConsumo - Valor Consumo.
     */
    private String valorConsumo;
    /**
     * @valorHipotecario - Valor Hipotecario
     */
    private String valorHipotecario;
    /**
     * @valorTarjetaCreditoVisa - Valor Tarjeta de credito visa.
     */
    private String valorTarjetaCreditoVisa;
    /**
     * @valorTarjetaCreditoMaster - Valor Tarjeta de credito master.
     */
    private String valorTarjetaCreditoMaster;
    /**
     * @valorVehiculos - Valor Vehiculos.
     */
    private String valorVehiculos;
    /**
     * @valorLibranza - Valor Libranza.
     */
    private String valorLibranza;
    /**
     * @valorOtros - Valor Otros.
     */
    private String valorOtros;
    /**
     * @porcentageActivo - Porcentage del activo.
     */
    private String porcentageActivo;
    /**
     * @saldoTotalActivo - Saldo Total del Activo.
     */
    private String saldoTotalActivo;

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
     * @return the valorHipotecario
     */
    public String getValorHipotecario() {
        return valorHipotecario;
    }

    /**
     * @param valorHipotecario the valorHipotecario to set
     */
    public void setValorHipotecario(String valorHipotecario) {
        this.valorHipotecario = valorHipotecario;
    }

    /**
     * @return the valorTarjetaCreditoVisa
     */
    public String getValorTarjetaCreditoVisa() {
        return valorTarjetaCreditoVisa;
    }

    /**
     * @param valorTarjetaCreditoVisa the valorTarjetaCreditoVisa to set
     */
    public void setValorTarjetaCreditoVisa(String valorTarjetaCreditoVisa) {
        this.valorTarjetaCreditoVisa = valorTarjetaCreditoVisa;
    }

    /**
     * @return the valorTarjetaCreditoMaster
     */
    public String getValorTarjetaCreditoMaster() {
        return valorTarjetaCreditoMaster;
    }

    /**
     * @param valorTarjetaCreditoMaster the valorTarjetaCreditoMaster to set
     */
    public void setValorTarjetaCreditoMaster(String valorTarjetaCreditoMaster) {
        this.valorTarjetaCreditoMaster = valorTarjetaCreditoMaster;
    }

    /**
     * @return the valorVehiculos
     */
    public String getValorVehiculos() {
        return valorVehiculos;
    }

    /**
     * @param valorVehiculos the valorVehiculos to set
     */
    public void setValorVehiculos(String valorVehiculos) {
        this.valorVehiculos = valorVehiculos;
    }

    /**
     * @return the valorLibranza
     */
    public String getValorLibranza() {
        return valorLibranza;
    }

    /**
     * @param valorLibranza the valorLibranza to set
     */
    public void setValorLibranza(String valorLibranza) {
        this.valorLibranza = valorLibranza;
    }

    /**
     * @return the valorOtros
     */
    public String getValorOtros() {
        return valorOtros;
    }

    /**
     * @param valorOtros the valorOtros to set
     */
    public void setValorOtros(String valorOtros) {
        this.valorOtros = valorOtros;
    }

    /**
     * @return the porcentageActivo
     */
    public String getPorcentageActivo() {
        return porcentageActivo;
    }

    /**
     * @param porcentageActivo the porcentageActivo to set
     */
    public void setPorcentageActivo(String porcentageActivo) {
        this.porcentageActivo = porcentageActivo;
    }

    /**
     * @return the saldoTotalActivo
     */
    public String getSaldoTotalActivo() {
        return saldoTotalActivo;
    }

    /**
     * @param saldoTotalActivo the saldoTotalActivo to set
     */
    public void setSaldoTotalActivo(String saldoTotalActivo) {
        this.saldoTotalActivo = saldoTotalActivo;
    }

}

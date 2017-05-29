package co.com.bbva.eecc.war.dto;

import java.io.Serializable;

/**
 * DTOEvolucion.java - Items de evolucion del cliente
 *
 * @author Luis Berna
 * @version 1.0
 * @date 20/01/2017
 * @see
 */
public class DTOEvoluticionItem implements Serializable {

    /**
     * @mes - Mes de lectura.
     */
    private String mes;
    /**
     * @valor - Valor de lectura.
     */
    private double valor;

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

}

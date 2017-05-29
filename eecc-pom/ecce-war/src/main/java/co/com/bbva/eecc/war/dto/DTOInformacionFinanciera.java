package co.com.bbva.eecc.war.dto;

import java.io.Serializable;

/**
 * DTOInformacionFinanciera.java - Información financiera del cliente
 *
 * @author Luis Berna
 * @version 1.0
 * @date 20/01/2017
 * @see
 */
public class DTOInformacionFinanciera implements Serializable {

    /**
     * @estrato - Estrato socio economico del cliente.
     */
    private String estrato;
    /**
     * @totalPatrimonio - Valor total del patrimonio del cliente.
     */
    private String totalPatrimonio;
    /**
     * @totalActivos- Valor total del activo del cliente.
     */
    private String totalActivos;
    /**
     * @totalPasivos - Valor total del pasivo del cliente.
     */
    private String totalPasivos;
    /**
     * @declaraRenta - Indicador de si declara renta o no
     */
    private boolean declaraRenta;
    /**
     * @totalIngresos - Total ingresos del cliente
     */
    private String totalIngresos;

    /**
     * @return the estrato
     */
    public String getEstrato() {
        return estrato;
    }

    /**
     * @param estrato the estrato to set
     */
    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    /**
     * @return the totalPatrimonio
     */
    public String getTotalPatrimonio() {
        return totalPatrimonio;
    }

    /**
     * @param totalPatrimonio the totalPatrimonio to set
     */
    public void setTotalPatrimonio(String totalPatrimonio) {
        this.totalPatrimonio = totalPatrimonio;
    }

    /**
     * @return the totalActivos
     */
    public String getTotalActivos() {
        return totalActivos;
    }

    /**
     * @param totalActivos the totalActivos to set
     */
    public void setTotalActivos(String totalActivos) {
        this.totalActivos = totalActivos;
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

    /**
     * @return the declaraRenta
     */
    public boolean isDeclaraRenta() {
        return declaraRenta;
    }

    /**
     * @param declaraRenta the declaraRenta to set
     */
    public void setDeclaraRenta(boolean declaraRenta) {
        this.declaraRenta = declaraRenta;
    }

    /**
     * @return the totalIngresos
     */
    public String getTotalIngresos() {
        return totalIngresos;
    }

    /**
     * @param totalIngresos the totalIngresos to set
     */
    public void setTotalIngresos(String totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

}

package co.com.bbva.eecc.war.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTOInformacionEvolucion.java - Información de evolucion del cliente
 *
 * @author Luis Berna
 * @version 1.0
 * @date 20/01/2017
 * @see
 */
public class DTOInformacionEvolucion implements Serializable {

    /**
     * @evoluciones - Listado de evoluciones del cliente.
     */
    private List<DTOEvolucion> evoluciones;

    /**
     * @return the evoluciones
     */
    public List<DTOEvolucion> getEvoluciones() {
        return evoluciones;
    }

    /**
     * @param evoluciones the evoluciones to set
     */
    public void setEvoluciones(List<DTOEvolucion> evoluciones) {
        this.evoluciones = evoluciones;
    }

}

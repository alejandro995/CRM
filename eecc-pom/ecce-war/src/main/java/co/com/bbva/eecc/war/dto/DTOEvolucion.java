package co.com.bbva.eecc.war.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTOEvolucion.java - Registro de evolucion del cliente
 *
 * @author Luis Berna
 * @version 1.0
 * @date 20/01/2017
 * @see
 */
public class DTOEvolucion implements Serializable {

    /**
     * @items - Listado de items.
     */
    private List<DTOEvoluticionItem> items;

    /**
     * @return the item
     */
    public List<DTOEvoluticionItem> getItems() {
        return items;
    }

    /**
     * @param items the item to set
     */
    public void setItems(List<DTOEvoluticionItem> items) {
        this.items = items;
    }
}

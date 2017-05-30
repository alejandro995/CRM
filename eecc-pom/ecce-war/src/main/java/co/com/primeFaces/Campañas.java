package co.com.primeFaces;

import java.io.Serializable;

/**
 * Created by alejo on 30/05/2017.
 */
public class Campañas implements Serializable {

    private String campaña;
    private String estado;
    private String gestor;
    private String acciones;


    public Campañas(String campaña, String estado, String gestor, String acciones){
        this.campaña = campaña;
        this.estado = estado;
        this.gestor = gestor;
        this.acciones = acciones;

    }

    public String getCampaña() {
        return campaña;
    }

    public void setCampaña(String campaña) {
        this.campaña = campaña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    public String getAcciones() {
        return acciones;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }
}

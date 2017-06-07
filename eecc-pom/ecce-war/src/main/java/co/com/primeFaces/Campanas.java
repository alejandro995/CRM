package co.com.primeFaces;

import java.io.Serializable;

/**
 * Created by alejo on 30/05/2017.
 */
public class Campanas implements Serializable {

    private String campana;
    private String estado;
    private String gestor;
    private String acciones;


    public Campanas(String campana, String estado, String gestor, String acciones){
        this.campana = campana;
        this.estado = estado;
        this.gestor = gestor;
        this.acciones = acciones;

    }

    public String getCampana() {
        return campana;
    }

    public void setCampana(String campana) {
        this.campana = campana;
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

package co.com.primeFaces;

import java.io.Serializable;

public class Preaprobados implements Serializable{
    private String oportunidad;
    private String asignado;
    private String planificado;
    public Preaprobados(String oportunidad, String asignado, String planificado){
        this.oportunidad = oportunidad;
        this.asignado = asignado;
        this.planificado = planificado;
    }
    public String getOportunidad() {
        return oportunidad;
    }
    public String getAsignado() {
        return asignado;
    }
    public String getPlanificado() {
        return planificado;
    }
}
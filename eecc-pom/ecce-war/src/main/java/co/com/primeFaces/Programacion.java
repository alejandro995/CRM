package co.com.primeFaces;

import java.io.Serializable;

public class Programacion implements Serializable{
    private String hora;
    private String titulo;
    public Programacion(String hora, String titulo){
        this.hora = hora;
        this.titulo = titulo;
    }
    public String getHora() {
        return hora;
    }
    public String getTitulo() {
        return titulo;
    }
}
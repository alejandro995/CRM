package co.com.primeFaces;

import java.io.Serializable;

public class SaldosInternos implements Serializable{
    private String fechaoperacion;
    private String fechavalor;
    private String concepto;
    private String valor;
    public SaldosInternos(String fechaoperacion, String fechavalor, String concepto, String valor){
        this.fechaoperacion = fechaoperacion;
        this.fechavalor = fechavalor;
        this.concepto = concepto;
        this.valor = valor;
    }
    public String getFechaoperacion() {
        return fechaoperacion;
    }
    public String getFechavalor() {
        return fechavalor;
    }
    public String getConcepto() {
        return concepto;
    }

    public String getValor() {
        return valor;
    }
}

package co.com.primeFaces;

import java.io.Serializable;

public class Saldos implements Serializable{
    private String numerodeproducto;
    private String tipo;
    private String saldototal;
    private String saldodisponible;
    public Saldos(String numerodeproducto, String tipo, String saldototal, String saldodisponible){
        this.numerodeproducto = numerodeproducto;
        this.tipo = tipo;
        this.saldototal = saldototal;
        this.saldodisponible = saldodisponible;
    }

    public String getNumerodeproducto() {
        return numerodeproducto;
    }
    public String getTipo() {
        return tipo;
    }
    public String getSaldototal() {
        return saldototal;
    }
    public String getSaldodisponible() {
        return saldodisponible;
    }

  }

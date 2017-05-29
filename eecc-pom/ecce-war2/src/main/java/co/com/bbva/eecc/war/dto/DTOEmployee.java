/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.dto;

import com.bbva.net.consulta.cifin.TipoIdType;
import java.io.Serializable;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Administrator
 */
public class DTOEmployee implements Serializable {

    private String nombre;
    private String tipoEmpleado;

    /**
     * Trae el tipo de empleado (Gestor o Gerente);
     */
    private DTOTipoEmployee tipoEmployee;

    /**
     * Constructor por defecto
     */
    public DTOEmployee() {
    }

    public DTOTipoEmployee getTipoEmployee() {
        return tipoEmployee == null ? tipoEmployee = new DTOTipoEmployee() : tipoEmployee;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public String getTipoEmpleado (){
       return tipoEmpleado;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTipoEmpleado(String tipoEmpleado){
        this.tipoEmpleado = tipoEmpleado;
    }
}

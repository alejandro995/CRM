/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.dto;

import co.com.bbva.eecc.war.service.Prueba;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 * DTOCliente.java - DTO con toda la información del cliente
 *
 * @author Luis Berna
 * @version 1.0
 * @date 23/01/2017
 * @see
 */
public class DTOCliente implements Serializable {

    public DTOCliente() {
        createLineModels();
    }
    private List<Prueba> hotels;
    /**
     * @datosBasicos - Datos basicos del cliente.
     */
    private DTODatosBasicos datosBasicos;
    /**
     * @informacionPersonal - Información personal del cliente.
     */
    private DTOInformacionPersonal informacionPersonal;
    /**
     * @datosContacto - Información de contacto del cliente.
     */
    private DTODatosContacto datosContacto;
    /**
     * @perfil - Información de perfil del cliente.
     */
    private DTOPerfil perfil;
    /**
     * @informacionFinanciera - Información de financiera del cliente.
     */
    private DTOInformacionFinanciera informacionFinanciera;
    /**
     * @contratosActivos - Información de contratos activos del cliente.
     */
    private DTOContratosActivos contratosActivos;
    /**
     * @contratosPasivos - Información de contratos pasivos del cliente.
     */
    private DTOContratosPasivo contratosPasivos;
    /**
     * @informacionServicio - Información de servicios del cliente.
     */
    private DTOInformacionServicio informacionServicio;
    /**
     * @informacionEvolucion - Información de evolucion del cliente.
     */
    private DTOInformacionEvolucion informacionEvolucion;
    /**
     * @informacionContratosActivos - Permite ver los saldos en linea de los
     * contratos activos del cliente.
     */
    private DTOInformacionContratosActivos informacionContratosActivos;

    /**
     * @campanas - Permite ver el listado de campañas que tiene el cliente
     */
    private List<DTOCampanas> campanas;

    /**
     * @productos - Permite ver el listado de productos de un cliente
     */
    private List<DTOItem> productos;

    /**
     * @productos - Esto es momenaneo hay que quitarlo
     */
    private DTOItem producto;
    private DTOItem producto1;
    private DTOItem producto2;
    private DTOItem producto3;

    /**
     * @return the datosBasicos
     */
    public DTODatosBasicos getDatosBasicos() {
        if (datosBasicos == null) {
            datosBasicos = new DTODatosBasicos();
        }
        return datosBasicos;
    }

    /**
     * @param datosBasicos the datosBasicos to set
     */
    public void setDatosBasicos(DTODatosBasicos datosBasicos) {
        this.datosBasicos = datosBasicos;
    }

    /**
     * @return the informacionPersonal
     */
    public DTOInformacionPersonal getInformacionPersonal() {
        if (informacionPersonal == null) {
            informacionPersonal = new DTOInformacionPersonal();
        }
        return informacionPersonal;
    }

    /**
     * @param informacionPersonal the informacionPersonal to set
     */
    public void setInformacionPersonal(DTOInformacionPersonal informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }

    /**
     * @return the datosContacto
     */
    public DTODatosContacto getDatosContacto() {
        if (datosContacto == null) {
            datosContacto = new DTODatosContacto();
        }
        return datosContacto;
    }

    /**
     * @param datosContacto the datosContacto to set
     */
    public void setDatosContacto(DTODatosContacto datosContacto) {
        this.datosContacto = datosContacto;
    }

    /**
     * @return the perfil
     */
    public DTOPerfil getPerfil() {
        if (perfil == null) {
            perfil = new DTOPerfil();
        }
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(DTOPerfil perfil) {
        this.perfil = perfil;
    }

    /**
     * @return the informacionFinanciera
     */
    public DTOInformacionFinanciera getInformacionFinanciera() {
        if (informacionFinanciera == null) {
            informacionFinanciera = new DTOInformacionFinanciera();
        }
        return informacionFinanciera;
    }

    /**
     * @param informacionFinanciera the informacionFinanciera to set
     */
    public void setInformacionFinanciera(DTOInformacionFinanciera informacionFinanciera) {
        this.informacionFinanciera = informacionFinanciera;
    }

    /**
     * @return the contratosActivos
     */
    public DTOContratosActivos getContratosActivos() {
        if (contratosActivos == null) {
            contratosActivos = new DTOContratosActivos();
        }
        return contratosActivos;
    }

    /**
     * @param contratosActivos the contratosActivos to set
     */
    public void setContratosActivos(DTOContratosActivos contratosActivos) {
        this.contratosActivos = contratosActivos;
    }

    /**
     * @return the contratosPasivos
     */
    public DTOContratosPasivo getContratosPasivos() {

        return contratosPasivos;
    }

    /**
     * @param contratosPasivos the contratosPasivos to set
     */
    public void setContratosPasivos(DTOContratosPasivo contratosPasivos) {
        this.contratosPasivos = contratosPasivos;
    }

    /**
     * @return the informacionServicio
     */
    public DTOInformacionServicio getInformacionServicio() {
        return informacionServicio;
    }

    /**
     * @param informacionServicio the informacionServicio to set
     */
    public void setInformacionServicio(DTOInformacionServicio informacionServicio) {
        this.informacionServicio = informacionServicio;
    }

    /**
     * @return the informacionEvolucion
     */
    public DTOInformacionEvolucion getInformacionEvolucion() {
        return informacionEvolucion;
    }

    /**
     * @param informacionEvolucion the informacionEvolucion to set
     */
    public void setInformacionEvolucion(DTOInformacionEvolucion informacionEvolucion) {
        this.informacionEvolucion = informacionEvolucion;
    }

    /**
     * @return the informacionContratosActivos
     */
    public DTOInformacionContratosActivos getInformacionContratosActivos() {
        return informacionContratosActivos;
    }

    /**
     * @param informacionContratosActivos the informacionContratosActivos to set
     */
    public void setInformacionContratosActivos(DTOInformacionContratosActivos informacionContratosActivos) {
        this.informacionContratosActivos = informacionContratosActivos;
    }
    private LineChartModel lineModel1;
    private LineChartModel lineModel2;

    public LineChartModel getLineModel1() {
        return lineModel1;
    }

    public LineChartModel getLineModel2() {
        return lineModel2;
    }

    //<editor-fold defaultstate="collapsed" desc="Datos de prueba">
    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Linear Chart");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);

        lineModel2 = initCategoryModel();
        lineModel2.setTitle("Category Chart");
        lineModel2.setLegendPosition("e");
        lineModel2.setShowPointLabels(true);
        lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Years"));
        yAxis = lineModel2.getAxis(AxisType.Y);
        yAxis.setLabel("Births");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");

        series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);

        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");

        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 7);
        series2.set(5, 9);

        model.addSeries(series1);
        model.addSeries(series2);

        return model;
    }

    private LineChartModel initCategoryModel() {
        LineChartModel model = new LineChartModel();

        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);

        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 90);
        girls.set("2008", 120);

        model.addSeries(boys);
        model.addSeries(girls);

        return model;
    }

    /**
     * @return the listaString
     */
    public List<Prueba> getListaString() {
        return hotels;
    }

    /**
     * @param listaString the listaString to set
     */
    public void setListaString(List<Prueba> listaString) {
        this.hotels = listaString;
    }

//</editor-fold>
    /**
     * @return the campanas
     */
    public List<DTOCampanas> getCampanas() {
        if (campanas == null) {
            campanas = new ArrayList<DTOCampanas>();
        }
        return campanas;
    }

    /**
     * @param campanas the campanas to set
     */
    public void setCampanas(List<DTOCampanas> campanas) {
        this.campanas = campanas;
    }

    /**
     * @return the productos
     */
    public List<DTOItem> getProductos() {
        if (productos == null) {
            productos = new ArrayList<DTOItem>();
        }
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<DTOItem> productos) {
        this.productos = productos;
    }

    /**
     * @return the producto
     */
    public DTOItem getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(DTOItem producto) {
        this.producto = producto;
    }

    /**
     * @return the producto1
     */
    public DTOItem getProducto1() {
        return producto1;
    }

    /**
     * @param producto1 the producto1 to set
     */
    public void setProducto1(DTOItem producto1) {
        this.producto1 = producto1;
    }

    /**
     * @return the producto2
     */
    public DTOItem getProducto2() {
        return producto2;
    }

    /**
     * @param producto2 the producto2 to set
     */
    public void setProducto2(DTOItem producto2) {
        this.producto2 = producto2;
    }

    /**
     * @return the producto3
     */
    public DTOItem getProducto3() {
        return producto3;
    }

    /**
     * @param producto3 the producto3 to set
     */
    public void setProducto3(DTOItem producto3) {
        this.producto3 = producto3;
    }
}

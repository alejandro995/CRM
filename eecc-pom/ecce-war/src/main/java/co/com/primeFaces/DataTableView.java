package co.com.primeFaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.*;

@ManagedBean(name = "dataTableView")
@ViewScoped
public class DataTableView implements Serializable {
    private static final long serialVersionUID = 1L;

    private LineChartModel lineModel1;
    private PieChartModel pieModel1;
    private PieChartModel pieModel2;
    private  List<Programacion> programacionList = new ArrayList<Programacion>();

    private List<Preaprobados> preaprobadosList = new ArrayList<Preaprobados>();

    private List<Campanas> campanasList = new ArrayList<Campanas>();

    private List<Saldos> cuentaspersonales = new ArrayList<Saldos>();
    private List<Saldos> fondodeinversion = new ArrayList<Saldos>();
    private List<Saldos> prestamos = new ArrayList<Saldos>();
    private List<Saldos> tarjetadecredito = new ArrayList<Saldos>();

    private List<SaldosInternos> detalledetransacciones = new ArrayList<SaldosInternos>();




    @PostConstruct
    public void init() {

        createPieModels();



        cuentaspersonales.add(new Saldos("0313-0042-00-0201712345","AH","674.00","94.075.18"));
        cuentaspersonales.add(new Saldos("0313-0042-00-0201712345","AH","94.075.18","94.075.18"));
        cuentaspersonales.add(new Saldos("0313-0042-00-0201712345","AH","94.075.18","94.075.18"));
        cuentaspersonales.add(new Saldos("0313-0042-00-0201712345","AH","94.075.18","94.075.18"));

        fondodeinversion.add(new Saldos("0313-0042-00-0201712345","BF","2'178.000.00","2'178.000.00"));

        prestamos.add(new Saldos("0313-0042-00-0201712345","CS","2'178.000.00","2'178.000.00"));
        prestamos.add(new Saldos("0313-0042-00-0201712345","CS","2'178.000.00","2'178.000.00"));

        tarjetadecredito.add(new Saldos("0313-0042-00-0201712345","CS","2'178.000.00","2'178.000.00"));

        detalledetransacciones.add(new SaldosInternos("03-02-2017","03-02-2017" , "Retiro cajero1", "-$200.000"));
        detalledetransacciones.add(new SaldosInternos("03-02-2017","03-02-2017" , "Retiro cajero2", "-$200.000"));
        detalledetransacciones.add(new SaldosInternos("03-02-2017","03-02-2017" , "Retiro cajero3", "-$200.000"));

        campanasList.add(new Campanas("Vencimiento CDT" , "Sin planificar", "Sandra Maria Suarez", "icono"));
        campanasList.add(new Campanas("Preaprobado nómina" , "Gestionada", "Isabel Rodriguez", "icono"));
        campanasList.add(new Campanas("Seguro Vehículo" , "Planificada", "Jose Granados", "icono"));
        campanasList.add(new Campanas("Cumpleaños" , "Sin asignar", "", "icono"));
        campanasList.add(new Campanas("Tarjeta de Crédito" , "Gestionada", "Andrea Maldonado", "icono"));
        campanasList.add(new Campanas("Vencimiento CDT" , "Sin planificar", "Sandra Maria Suarez", "icono"));
        campanasList.add(new Campanas("Preaprobado nómina" , "Gestionada", "Isabel Rodriguez", "icono"));
        campanasList.add(new Campanas("Seguro Vehículo" , "Planificada", "Jose Granados", "icono"));
        campanasList.add(new Campanas("Cumpleaños" , "Sin asignar", "", "icono"));
        campanasList.add(new Campanas("Tarjeta de Crédito" , "Gestionada", "Andrea Maldonado", "icono"));
        campanasList.add(new Campanas("Vencimiento CDT" , "Sin planificar", "Sandra Maria Suarez", "icono"));
        campanasList.add(new Campanas("Preaprobado nómina" , "Gestionada", "Isabel Rodriguez", "icono"));
        campanasList.add(new Campanas("Seguro Vehículo" , "Planificada", "Jose Granados", "icono"));
        campanasList.add(new Campanas("Cumpleaños" , "Sin asignar", "", "icono"));
        campanasList.add(new Campanas("Tarjeta de Crédito" , "Gestionada", "Andrea Maldonado", "icono"));

        //add students
        programacionList.add(new Programacion("8:00",  "8:30 a 9:00         "+"\n"+"Titulo del Evento"));
        programacionList.add(new Programacion("8:00", " "));
        programacionList.add(new Programacion("9:00",  "9:00 a 9:30         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("9:00",  "9:30 a 10:00         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("10:00", "10:00 a 10:30         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("10:00", "10:30 a 11:00         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("11:00", "11:00 a 11:30         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("11:00", "11:30 a 12:00         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("12:00", "12:00 a 12:30         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("12:00", "12:30 a 13:00         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("13:00", "13:00 a 13:30         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("13:00", "13:30 a 14:00         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("14:00", "14:00 a 14:00         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("14:00", "14:30 a 15:00         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("15:00", "15:00 a 15:30         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("15:00", "15:30 a 16:00         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("16:00", "16:00 a 16:30         "+"\n"+" Titulo del Evento"));
        programacionList.add(new Programacion("16:00", "16:30 a 17:00         "+"\n"+" Titulo del Evento"));

        preaprobadosList.add(new Preaprobados("Preaprobados","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Preaprobados","Sin planificar 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Informativas","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Informativas","Sin planificar 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Onboarding","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Onboarding","Sin planificar 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Preaprobados2","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Preaprobados2","Sin planificar 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Informativas2","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Informativas2","Sin planificar 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Onboarding2","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Onboarding2","Sin planificar 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Preaprobados3","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Preaprobados3","Sin planificar 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Informativas4","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Informativas4","Sin planificar 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Onboarding5","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Onboarding5","Sin planificar 40","Gestionada 0"));

        createLineModels();



    }

    public List<Saldos> getCuentaspersonales() {
        return cuentaspersonales;
    }


    public List<Saldos> getFondodeinversion() {
        return fondodeinversion;
    }

    public List<Saldos> getPrestamos() {
        return prestamos;
    }

    public List<Saldos> getTarjetadecredito() {
        return tarjetadecredito;
    }

    public List<SaldosInternos> getDetalledetransacciones() {
        return detalledetransacciones;
    }

    public List<Campanas> getCampanasList() {
        return campanasList;
    }

    public List<Programacion> getprogramacionList() {
        return programacionList;
    }

    public List<Preaprobados> getPreaprobadosList() {
        return  preaprobadosList;
    }

    private void createPieModels() {
        createPieModel1();

        createPieModel2();
    }

    public LineChartModel getLineModel1() {
        return lineModel1;
    }

    public PieChartModel getPieModel1() {
        return pieModel1;
    }

    private void createPieModel1() {
        pieModel1 = new PieChartModel();
        pieModel1.set("Clientes", 199);
        pieModel1.setFill(false);
        pieModel1.setDiameter(150);
        pieModel1.setSeriesColors("ff0000");
        pieModel1.setShadow(false);

    }

    private void createLineModels() {
        lineModel1 = initLinearModel();
        Axis xAxis = lineModel1.getAxis(AxisType.X);

        Calendar cal = Calendar.getInstance();



        int month =  cal.get(Calendar.MONTH);
        System.out.println("mes de hoy" + month);



        xAxis.setMin(month+1);


        cal.add(Calendar.MONTH, 11);



        int monthmax =  cal.get(Calendar.MONTH);

        System.out.println("mes de final" + monthmax);


        xAxis.setMax(monthmax+12);
        xAxis.setTickFormat("%d");
        xAxis.setLabel("Ultimos 12 meses");
        lineModel1.getAxes().put(AxisType.X, xAxis);

        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(1000000);
        yAxis.setTickFormat("%d");
        lineModel1.getAxes().put(AxisType.Y, yAxis);



        lineModel1.setShadow(false);

    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");

        series1.set(1, 100000);
        series1.set(2, 80000);
        series1.set(3, 90000);
        series1.set(4, 100000);
        series1.set(5, 100000);
        series1.set(6, 90000);
        series1.set(7, 80000);
        series1.set(8, 150000);
        series1.set(9, 300000);
        series1.set(10, 500000);
        series1.set(11, 800000);
        series1.set(12, 200000);


        model.addSeries(series1);

        return model;
    }

    public PieChartModel getPieModel2() {
        return pieModel2;
    }

    private void createPieModel2() {
        pieModel2 = new PieChartModel();

        pieModel2.set("Consumo", 20000000);
        pieModel2.set("Hipoteca", 10000000);
        pieModel2.set("TC. VIS", 8000000);
        pieModel2.set("TC. MAS", 8000000);
        pieModel2.set("Vehiculo", 30000000);
        pieModel2.set("Libranza", 2000000);
        pieModel2.set("Otros", 7000000);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(150);
        pieModel2.setShadow(false);
    }


}

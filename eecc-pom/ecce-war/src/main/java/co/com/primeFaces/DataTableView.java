package co.com.primeFaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean(name = "dataTableView")
@ViewScoped
public class DataTableView implements Serializable {
    private static final long serialVersionUID = 1L;

    private PieChartModel pieModel1;
    private  List<Programacion> programacionList = new ArrayList<Programacion>();

    private List<Preaprobados> preaprobadosList = new ArrayList<Preaprobados>();

    @PostConstruct
    public void init() {

        createPieModels();
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
        preaprobadosList.add(new Preaprobados("Preaprobados","Asignados 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Informativas","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Informativas","Asignados 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Onboarding","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Onboarding","Asignados 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Preaprobados2","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Preaprobados2","Asignados 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Informativas2","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Informativas2","Asignados 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Onboarding2","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Onboarding2","Asignados 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Preaprobados3","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Preaprobados3","Asignados 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Informativas4","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Informativas4","Asignados 40","Gestionada 0"));

        preaprobadosList.add(new Preaprobados("Onboarding5","Sin asignar 20","Planificado 10"));
        preaprobadosList.add(new Preaprobados("Onboarding5","Asignados 40","Gestionada 0"));

    }
    public List<Programacion> getprogramacionList() {
        return programacionList;
    }

    public List<Preaprobados> getPreaprobadosList() {
        return  preaprobadosList;
    }

    private void createPieModels() {
        createPieModel1();
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


}
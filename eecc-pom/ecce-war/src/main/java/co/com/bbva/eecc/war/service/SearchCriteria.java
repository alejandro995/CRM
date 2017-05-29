package co.com.bbva.eecc.war.service;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.LegendPlacement;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.PieChartModel;

/**
 * A backing bean for the main hotel search form. Encapsulates the criteria
 * needed to perform a hotel search.
 */
public class SearchCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer secondGraphic;

    /**
     * The user-provided search criteria for finding Hotels.
     */
    private String searchString = "";

    /**
     * The maximum page size of the Hotel result list
     */
    private int pageSize = 5;

    /**
     * The page the user is currently on.
     */
    private int currentPage = 1;

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "[Search Criteria searchString = '" + searchString + "'";
    }

    private PieChartModel pieModel1;
    private PieChartModel pieModel2;

    @PostConstruct
    public void init() {
        createPieModels();
    }

    public Object getPieModel1() {
        return pieModel1;
    }

    public PieChartModel getPieModel2() {
        return pieModel2;
    }

    private void createPieModels() {
        createPieModel1();
        createPieModel2();
    }

    private void createPieModel1() {
        pieModel1 = new PieChartModel();
//        pieModel1.setTitle("Activos");
        pieModel1.set("(2) - CONSUMO $110.852.00", 110852);
        pieModel1.set("(0) - HIPOTEC $0.00", 0);
        pieModel1.set("(1) - T.C VIS $23.587.00", 23587);
        pieModel1.set("(0) - T.C MAS $0.00", 0);
        pieModel1.set("(0) - VEHICUL $0.00", 0);
        pieModel1.set("(0) - LIBRANZ $0.00", 0);
        pieModel1.set("(0) - OTROS $0.00", 0);

        //pieModel1.setTitle("Simple Pie");
        pieModel1.setLegendPosition("w");
        pieModel1.setShowDataLabels(true);
    }

    private void createPieModel2() {
        pieModel2 = new PieChartModel();
//        pieModel2.setTitle("Pasivos");
        pieModel2.set("(3) - AHORROS $5.000.00", 5000);
        pieModel2.set("(5) - CTA COR $200.00", 200);
        pieModel2.set("(1) - PLAZO $19.00", 19);

        //pieModel1.setTitle("Simple Pie");
        pieModel2.setLegendPosition("w");
        pieModel2.setShowDataLabels(true);
    }

    //<editor-fold defaultstate="collapsed" desc="Old cahart">
    private Integer activo;
    private LineChartModel lineModel1;
    private LineChartModel lineModel2;
    private LineChartModel lineModel3;
    private BarChartModel barPasivo;
    private BarChartModel barModelActivo;
    private BarChartModel barModel;
    private HorizontalBarChartModel horizontalBarModel;

    @PostConstruct
    public void init1() {
        createLineModels();
        createBarModels();
    }

    public LineChartModel getLineModel1() {
        return lineModel1;
    }

    public LineChartModel getLineModel2() {
        return lineModel2;
    }

    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Saldos medios (Activo)");
        lineModel1.setLegendPosition("e");
        lineModel1.getAxes().put(AxisType.X, new CategoryAxis("Mes"));
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(300);

        lineModel2 = initCategoryModel();
        lineModel2.setTitle("Saldos medios (Pasivo)");
        lineModel2.setLegendPosition("e");
        lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Mes"));
        yAxis = lineModel2.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(300);

        lineModel3 = initCategoryModel1();
        lineModel3.setTitle("Rentabilidad ");
        lineModel3.setLegendPosition("e");
        lineModel3.getAxes().put(AxisType.X, new CategoryAxis("Mes"));
        yAxis = lineModel3.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(300);
    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
        model.setShowPointLabels(false);
        
        ChartSeries boys = new ChartSeries();
        model.setDatatipFormat("<span style=\\\"display:none;\\\">%s</span><span>%s</span>");
        model.setLegendPlacement(LegendPlacement.OUTSIDEGRID);
        boys.setLabel("Activo");
        boys.set("01", 120);
        boys.set("02", 100);
        boys.set("03", 44);
        boys.set("04", 150);
        boys.set("05", 25);
        boys.set("06", 250);
        boys.set("07", 200);
        boys.set("08", 190);
        boys.set("09", 180);
        boys.set("10", 170);
        boys.set("11", 160);
        boys.set("12", 150);
        model.addSeries(boys);
        return model;
    }

    private LineChartModel initCategoryModel() {
        LineChartModel model = new LineChartModel();
        model.setShowPointLabels(false);
        model.setDatatipFormat("<span style=\\\"display:none;\\\">%s</span><span>%s</span>");
        model.setLegendPlacement(LegendPlacement.OUTSIDEGRID);
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Pasivo");
        boys.set("01", 110);
        boys.set("02", 101);
        boys.set("03", 49);
        boys.set("04", 155);
        boys.set("05", 20);
        boys.set("06", 30);
        boys.set("07", 40);
        boys.set("08", 50);
        boys.set("09", 30);
        boys.set("10", 34);
        boys.set("11", 30);
        boys.set("12", 30);
        model.addSeries(boys);
        return model;
    }

    private LineChartModel initCategoryModel1() {
        LineChartModel model = new LineChartModel();
        model.setShowPointLabels(false);
        model.setDatatipFormat("<span style=\\\"display:none;\\\">%s</span><span>%s</span>");
        model.setLegendPlacement(LegendPlacement.OUTSIDEGRID);
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Rentabilidad");
        boys.set("01", 140);
        boys.set("02", 100);
        boys.set("03", 120);
        boys.set("04", 110);
        boys.set("05", 130);
        boys.set("06", 139);
        boys.set("07", 140);
        boys.set("08", 160);
        boys.set("09", 120);
        boys.set("10", 100);
        boys.set("11", 90);
        boys.set("12", 120);
        model.addSeries(boys);
        return model;
    }

    public BarChartModel getBarModel() {
        return barModel;
    }

    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }

    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();

        ChartSeries pasivo = new ChartSeries();
        pasivo.setLabel("Activo");
        pasivo.set("Hipot", 52000);
        pasivo.set("T.C.V", 60000);
        pasivo.set("T.C.M", 110000);
        pasivo.set("Vehi", 135000);
        pasivo.set("Libr", 120000);
        pasivo.set("Otros", 120000);

        model.addSeries(pasivo);
        return model;
    }

    private void createBarModels() {
        createBarModel();
        createHorizontalBarModel();
        createBarModelActivo();
    }

    private void createBarModel() {
        setBarModelActivo(initBarModel());

        getBarModelActivo().setTitle("Grafica");
        getBarModelActivo().setLegendPosition("ne");

        Axis xAxisActiv = getBarModelActivo().getAxis(AxisType.X);
        xAxisActiv.setLabel("Gender");

        Axis yAxisActive = getBarModelActivo().getAxis(AxisType.Y);
        yAxisActive.setLabel("Valor");
        yAxisActive.setMin(0);
        yAxisActive.setMax(200000);
        //
        barModel = initBarModel();

        barModel.setTitle("Grafica");
        barModel.setLegendPosition("ne");
        barModel.setExtender("ext");

        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Gender");

        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Valor");
        yAxis.setMin(0);
        yAxis.setMax(200000);
        //bar pasivo        
        barPasivo = initBarModel();
        barPasivo.setAnimate(true);
        barPasivo.setSeriesColors("3dbfbf");

        barPasivo.setTitle("Saldos medios mes anterior");
        barPasivo.setLegendPosition("ne");

        Axis xAxisPasivo = barPasivo.getAxis(AxisType.X);

        Axis yAxisPasivo = barPasivo.getAxis(AxisType.Y);
        yAxisPasivo.setLabel("Valor");
        yAxisPasivo.setMin(0);
        yAxisPasivo.setMax(200000);

    }

    private void createBarModelActivo() {
        setBarModelActivo(initBarModel());

        getBarModelActivo().setTitle("Grafica");
        getBarModelActivo().setLegendPosition("ne");

        Axis xAxisActiv = getBarModelActivo().getAxis(AxisType.X);
        xAxisActiv.setLabel("Gender");

        Axis yAxisActive = getBarModelActivo().getAxis(AxisType.Y);
        yAxisActive.setLabel("Valor");
        yAxisActive.setMin(0);
        yAxisActive.setMax(200000);
        //
        barModel = initBarModel();

        barModel.setTitle("Saldos medios mes anterior");
        barModel.setLegendPosition("ne");
        barModel.setAnimate(true);

        Axis xAxis = barModel.getAxis(AxisType.X);

        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Valor");
        yAxis.setMin(0);
        yAxis.setMax(200000);
        //bar pasivo        
        barPasivo = initBarModel();
        barPasivo.setAnimate(true);
        barPasivo.setSeriesColors("3dbfbf");

        barPasivo.setTitle("Saldos medios mes anterior");
        barPasivo.setLegendPosition("ne");

        Axis xAxisPasivo = barPasivo.getAxis(AxisType.X);

        Axis yAxisPasivo = barPasivo.getAxis(AxisType.Y);
        yAxisPasivo.setLabel("Valor");
        yAxisPasivo.setMin(0);
        yAxisPasivo.setMax(200000);

    }

    private void createHorizontalBarModel() {
        setHorizontalBarModel(new HorizontalBarChartModel());

        ChartSeries boys = new ChartSeries();
        boys.setLabel("Grafica");
        boys.set("2004", 50);
        boys.set("2005", 96);
        boys.set("2006", 44);
        boys.set("2007", 55);
        boys.set("2008", 25);

        ChartSeries girls = new ChartSeries();
        girls.setLabel("Grafica");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 82);
        girls.set("2007", 35);
        girls.set("2008", 120);

        getHorizontalBarModel().addSeries(boys);
        getHorizontalBarModel().addSeries(girls);

        getHorizontalBarModel().setTitle("Horizontal and Stacked");
        getHorizontalBarModel().setLegendPosition("e");
        getHorizontalBarModel().setStacked(true);

        Axis xAxis = getHorizontalBarModel().getAxis(AxisType.X);
        xAxis.setLabel("Births");
        xAxis.setMin(0);
        xAxis.setMax(2000000);

        Axis yAxis = getHorizontalBarModel().getAxis(AxisType.Y);
        yAxis.setLabel("Gender");
    }

    public void changeGraphic6() {
        setSecondGraphic(6);
    }

    public void changeGraphic3() {
        setActivo(3);
    }

    public void changeGraphic4() {
        setActivo(4);
    }

    public void changeGraphic5() {
        setActivo(5);
    }

    public void changeGraphic2() {
        setActivo(2);
    }

    public void changeGraphic1() {
        setActivo(1);
    }

    public void changeGraphic7() {
        setSecondGraphic(7);
    }

    public void changeGraphic8() {
        setSecondGraphic(8);
    }

    public void changeGraphic9() {
        setActivo(9);
    }

    /**
     * @return the activo
     */
    public Integer getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    /**
     * @param horizontalBarModel the horizontalBarModel to set
     */
    public void setHorizontalBarModel(HorizontalBarChartModel horizontalBarModel) {
        this.horizontalBarModel = horizontalBarModel;
    }

    /**
     * @return the barPasivo
     */
    public BarChartModel getBarPasivo() {
        return barPasivo;
    }

    /**
     * @param barPasivo the barPasivo to set
     */
    public void setBarPasivo(BarChartModel barPasivo) {
        this.barPasivo = barPasivo;
    }

    /**
     * @return the barModelActivo
     */
    public BarChartModel getBarModelActivo() {
        return barModelActivo;
    }

    /**
     * @param barModelActivo the barModelActivo to set
     */
    public void setBarModelActivo(BarChartModel barModelActivo) {
        this.barModelActivo = barModelActivo;
    }

//</editor-fold>
    /**
     * @return the secondGraphic
     */
    public Integer getSecondGraphic() {
        return secondGraphic;
    }

    /**
     * @param secondGraphic the secondGraphic to set
     */
    public void setSecondGraphic(Integer secondGraphic) {
        this.secondGraphic = secondGraphic;
    }

    /**
     * @return the lineModel3
     */
    public LineChartModel getLineModel3() {
        return lineModel3;
    }

    /**
     * @param lineModel3 the lineModel3 to set
     */
    public void setLineModel3(LineChartModel lineModel3) {
        this.lineModel3 = lineModel3;
    }
}

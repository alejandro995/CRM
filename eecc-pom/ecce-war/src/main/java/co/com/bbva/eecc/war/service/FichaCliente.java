/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package co.com.bbva.eecc.war.service;

import co.com.bbva.eecc.war.dto.DTOCampanas;
import co.com.bbva.eecc.war.dto.DTOCliente;
import co.com.bbva.eecc.war.dto.DTOContratosActivos;
import co.com.bbva.eecc.war.dto.DTOContratosPasivo;
import co.com.bbva.eecc.war.dto.DTODatosBasicos;
import co.com.bbva.eecc.war.dto.DTODatosContacto;
import co.com.bbva.eecc.war.dto.DTODetalle;
import co.com.bbva.eecc.war.dto.DTOInformacionContratosActivos;
import co.com.bbva.eecc.war.dto.DTOInformacionFinanciera;
import co.com.bbva.eecc.war.dto.DTOInformacionPersonal;
import co.com.bbva.eecc.war.dto.DTOInformacionServicio;
import co.com.bbva.eecc.war.dto.DTOPerfil;
import co.com.bbva.eecc.war.dto.DTOItem;
import co.com.bbva.eecc.war.dto.mapping.OpConsultaInfoCliente;
import com.bbva.ccol.customers.facade.v02.dto.DataCustomer;
import com.bbva.ccol.customers.facade.v02.dto.IdentityDocuments;
import com.bbva.ccol.financialinformation.facade.v01.dto.Balance;
import com.bbva.ccol.financialinformation.facade.v01.dto.Data;
import com.bbva.ccol.financialinformation.facade.v01.dto.Indicators;
import com.bbva.ekip.arq.clients.CustomersClient;
import com.bbva.ekip.arq.clients.FinancialInformationClient;
import com.bbva.ekip.arq.clients.tipos.ExcepcionClienteRest;
import com.bbva.net.consulta.cifin.service.DTOConsultaCifinCliente;
import com.bbva.net.consulta.cifin.service.OpConsultaCifinClienteImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.webflow.execution.RequestContext;

/**
 *
 * @author luis.berna
 */
@Service("fichaClienteService")
public class FichaCliente extends BaseService implements FichaClienteService, Serializable {

    @Autowired
    private CustomersClient cliente;

    @Autowired                                                          
    private FinancialInformationClient opFinal;

    final static Logger logger = LoggerFactory.getLogger(FichaCliente.class);

    @Override
    public String buscarCliente(SearchCriteria criteria, RequestContext context) {

        DTOCliente dTOClientecliente = new DTOCliente();
        if (criteria != null && !criteria.getSearchString().isEmpty()) {
            try {
                HashMap<String, String> headers = extraerHeaders(context);
                dTOClientecliente = consultarInfoCliente(criteria.getSearchString(), headers);
//                cargarInformacionCustomer(cliente, dataCustomer, dataFinancial);
                context.getFlowScope().put("fichaCliente", dTOClientecliente);
                return "success";
            } catch (Exception e) {
                String mensaje = e.getLocalizedMessage() == null ? "Error en servicio" : e.getLocalizedMessage();
                if (e instanceof ExcepcionClienteRest) {
                    ExcepcionClienteRest clienteRest = (ExcepcionClienteRest) e;
                    mensaje = clienteRest.getErrorMessage();
                }
                context.getMessageContext().addMessage(
                        new MessageBuilder().error().defaultText(mensaje).build());
                return "error";
            }
        } else {
            context.getMessageContext().addMessage(
                    new MessageBuilder().warning().defaultText("Por favor digite un número de documento correcto").build());
            return "error";
        }
    }

    //<editor-fold defaultstate="collapsed" desc="Datos de ejemplo">
    private void cargarInformacionCustomer(DTOCliente cliente, DataCustomer dataCustomer, Data dataFinancial) {
        DTODatosBasicos basicos = new DTODatosBasicos();
        basicos.setPrimerNombre(dataCustomer.getData().getFirstName());
        basicos.setApellidos(dataCustomer.getData().getLastName());
//        basicos.setTipoDocumento(dataCustomer.getData().getIdentityDocuments());
        basicos.setAntiguedadCliente("02/03/2013");//Falta por completar del servicio de customer V3
        basicos.setCuadrante("01");
        basicos.setDeudaVencida("$20.000.00");
        basicos.setEdad(dataCustomer.getData().getBirthDate());
        basicos.setEmpresaLabora(dataCustomer.getData().getEmploymentInformation().getPurpouseCompany().getName());
        basicos.setGestorPrincipal("EDUARDO RIVAS");
        basicos.setNumeroClienteAltamira(dataCustomer.getData().getCustomerId());
        for (IdentityDocuments identityDocument : dataCustomer.getData().getIdentityDocuments()) {
            if (identityDocument.getDocumentType().getName().equals("CEDULA DE CIUDADANIA")) {
                basicos.setNumeroDocumento(identityDocument.getDocumentNumber());
                basicos.setTipoDocumento(identityDocument.getDocumentType().getName());
            }
        }
        basicos.setOficinaPrincipal("PRIMERO DE MAYO");
        basicos.setSegmento("PREMIUM");
        basicos.setTelefonoPrincipal("(310)342-0012");

        basicos.setTotalIngresos("$5.000.000.00");
        cliente.setDatosBasicos(basicos);
        DTODatosContacto datosContacto = new DTODatosContacto();
        datosContacto.setCasaCobranza("Casa de cobranza tu casa es mia");
        datosContacto.setCorreoElectronico("ted@ted.com");
        datosContacto.setDireccionPrincipal("CALLE 170 # 29-23");
        datosContacto.setNumeroCelular("(000) 000-00");
        datosContacto.setNumeroTelefono1("(031) 000-00");
        datosContacto.setNumeroTelefono2("(032) 000-00");
        datosContacto.setReferencia("(033) 000-00");
        cliente.setDatosContacto(datosContacto);
        DTOInformacionPersonal informacionPersonal = new DTOInformacionPersonal();
        informacionPersonal.setAntiguedadEmpleado("5");
        informacionPersonal.setEstadoCivil("CASADO");
        informacionPersonal.setFechaNacimiento("12/06/1984");
        informacionPersonal.setNacionalidad("COLOMBIA");
        informacionPersonal.setNumeroPersonasAcargo("4");
        informacionPersonal.setSexo("MASCULINO");
        informacionPersonal.setValorRentabilidad("$20.000");
        cliente.setInformacionPersonal(informacionPersonal);
        DTOInformacionFinanciera informacionFinanciera = new DTOInformacionFinanciera();
        informacionFinanciera.setDeclaraRenta(true);
        informacionFinanciera.setEstrato("3");
        informacionFinanciera.setTotalActivos("$3.000.000.00");
        informacionFinanciera.setTotalIngresos("$3.000.000.00");
        informacionFinanciera.setTotalPasivos("$3.000.000.00");
        informacionFinanciera.setTotalPatrimonio("$3.000.000.00");
        cliente.setInformacionFinanciera(informacionFinanciera);
        DTOInformacionServicio informacionServicio = new DTOInformacionServicio();
        informacionServicio.setAdquirencias(true);
        informacionServicio.setBbvaMovil(false);
        informacionServicio.setDomiciliaciones(false);
        informacionServicio.setNomina(false);
        informacionServicio.setNomina(false);
        informacionServicio.setSegurosLibres(true);
        informacionServicio.setTarjetaDebito(false);
        cliente.setInformacionServicio(informacionServicio);
        DTOPerfil perfil = new DTOPerfil();
        perfil.setCalificacionFinanciera("AAA");
        perfil.setColectivo("03");
        perfil.setDiasMora("22");
        perfil.setLimitesVentaCruzada("$3.000.000.00");
        perfil.setOcupacion("INGENIERO");
        perfil.setPuntajeBuroCifin("230");
        perfil.setPuntosGestion("$3.000.000.00");
        perfil.setQuejasUltimoAno("30");
        perfil.setSubColectivo("01");
        perfil.setValorProvision("$300.00");
        cliente.setPerfil(perfil);
        DTOContratosActivos contratosActivos = new DTOContratosActivos();
        contratosActivos.setPorcentageActivo("34");
        contratosActivos.setSaldoTotalActivo("$3.000.000.00");
        contratosActivos.setValorConsumo("$3.000.000.00");
        contratosActivos.setValorHipotecario("$3.000.000.00");
        contratosActivos.setValorLibranza("$3.000.000.00");
        contratosActivos.setValorOtros("$3.000.000.00");
        contratosActivos.setValorTarjetaCreditoMaster("$3.000.000.00");
        contratosActivos.setValorTarjetaCreditoVisa("$3.000.000.00");
        contratosActivos.setValorVehiculos("$3.000.000.00");
        cliente.setContratosActivos(contratosActivos);
        DTOContratosPasivo contratosPasivo = new DTOContratosPasivo();
        contratosPasivo.setPorcentagePasivo("39%");
        contratosPasivo.setTotalPasivos("$3.000.000.00");
        contratosPasivo.setValorConsumo("$3.000.000.00");
        contratosPasivo.setValorCuentaCorriente("$3.000.000.00");
        contratosPasivo.setValorFondos("$3.000.000.00");
        contratosPasivo.setValorPlazo("$3.000.000.00");
        cliente.setContratosPasivos(contratosPasivo);
        DTOInformacionContratosActivos informacionContratosActivos = new DTOInformacionContratosActivos();
        informacionContratosActivos.setContactoIc("CONTACTO IC");
        informacionContratosActivos.setEmisorNomina("BANCOLOMBIA");
        cliente.setInformacionContratosActivos(informacionContratosActivos);
//
        List<Prueba> hotels = new ArrayList<Prueba>();
        Prueba prueba = new Prueba();
        prueba.setAddress("test");
        prueba.setName("test");
        hotels.add(prueba);

        cliente.getCampanas().add(new DTOCampanas("Vencimiento CDT", "Sin planificar", "Alberto", ""));
        cliente.getCampanas().add(new DTOCampanas("Preaprobado nómina", "Gestionada", "Damian", ""));
        cliente.getCampanas().add(new DTOCampanas("Seguro Vehículo", "Planificada", "Roberto", ""));
        cliente.getCampanas().add(new DTOCampanas("Cumpleaños", "Sin asignar", "Dairo", ""));
        cliente.getCampanas().add(new DTOCampanas("Tarjeta de Crédito", "Gestionada", "Rodrigo", ""));
        cliente.getCampanas().add(new DTOCampanas("Seguro Vida", "Gestionada", "Albeiro", ""));
        cargarDetalle(cliente);
    }

    private void cargarInformacion2(DTOCliente cliente) {
        DTODatosBasicos basicos = new DTODatosBasicos();
        basicos.setPrimerNombre("CARLOS");
        basicos.setApellidos("RIVERA");
        basicos.setAntiguedadCliente("7");
        basicos.setCuadrante("05");
        basicos.setDeudaVencida("$20.000.00");
        basicos.setEdad("40");
        basicos.setEmpresaLabora("BBVA");
        basicos.setGestorPrincipal("EDUARDO RIVAS");
        basicos.setNumeroClienteAltamira("123423");
        basicos.setNumeroDocumento("1.082.849");
        basicos.setOficinaPrincipal("PRIMERO DE MAYO");
        basicos.setSegmento("PREMIUM");
        basicos.setTelefonoPrincipal("(000)000-00");
        basicos.setTipoDocumento("C.C");
        basicos.setTotalIngresos("$3.000.000.00");
        cliente.setDatosBasicos(basicos);
    }

    private LineChartModel lineModel1;
    private LineChartModel lineModel2;

    @PostConstruct
    public void init() {
        createLineModels();
    }

    public LineChartModel getLineModel1() {
        return lineModel1;
    }

    public LineChartModel getLineModel2() {
        return lineModel2;
    }

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
        series1.set(4, 9);
        series1.set(5, 8);

        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");

        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 10);
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
        girls.setLabel("Grafica");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 90);
        girls.set("2008", 120);

        model.addSeries(boys);
        model.addSeries(girls);

        return model;
    }

//</editor-fold>
    public DTOCliente consultarInfoCliente(String numeroIdentificacion, Map<String, String> headers) throws Exception {
        String prefijo = "";
        String numeroTelefono = "";
        String exTelefono = "";
        String prefijoR = "";
        String numeroTelefonoR = "";
        String exTelefonoR = "";
        String tipoTelefonoR = "";
        String nombreR = "";

        DataCustomer respSrv = cliente.getCustomer("1" + ceros(numeroIdentificacion), headers);
        Data respServData = opFinal.getFinancialInformation(ceros(numeroIdentificacion), "1", "1", "1", headers);
        OpConsultaCifinClienteImpl opConsultaCifinCliente = new OpConsultaCifinClienteImpl();
//        DTOConsultaCifinCliente consultaCifinCliente = opConsultaCifinCliente.solicitudCifin(ceros(numeroIdentificacion), "CC", "CC99999", "");

        DTOCliente oCliente = new DTOCliente();     

        oCliente.getDatosBasicos().setSegmento("PREMIUM");
        oCliente.getDatosBasicos().setCuadrante("01");
        oCliente.getDatosBasicos().setOficinaPrincipal("Primero de mayo");
        oCliente.getPerfil().setColectivo("02");
        oCliente.getPerfil().setSubColectivo("04");
//        oCliente.getPerfil().setCalificacionFinanciera(consultaCifinCliente.getEstadoC());
        oCliente.getPerfil().setCalificacionFinanciera("20");
        oCliente.getPerfil().setLimitesVentaCruzada("$2.000.000");

        for (IdentityDocuments identityDocument : respSrv.getData().getIdentityDocuments()) {
            if (identityDocument.getDocumentType().getName().equals("CEDULA DE CIUDADANIA")) {
                oCliente.getDatosBasicos().setNumeroDocumento(identityDocument.getDocumentNumber());
                oCliente.getDatosBasicos().setTipoDocumento(identityDocument.getDocumentType().getName());
            }
        }

//        cargarBalances(respServData);
//        oCliente.getPerfil().setPuntajeBuroCifin(consultaCifinCliente.getPuntaje());
        oCliente.getPerfil().setPuntajeBuroCifin("30");
        oCliente.getPerfil().setNumeroClienteAltamira(respSrv.getData().getCustomerId());

//        for (Indicators indicators : respServData.getData().getIndicators()) {
//            if (indicators.getId().equals("JOB_SITUAT")) {
//                oCliente.getPerfil().setSituacionLaboral(indicators.getName());
//
//            }
//        }
        for (int indice = 0; indice < respSrv.getData().getContactDetails().size(); indice++) {
            if ((respSrv.getData().getContactDetails().get(indice).getContactType().getId()).equals("EMAIL")) {
                oCliente.getDatosContacto().setCorreoElectronico(respSrv.getData().getContactDetails().get(indice).getContact());
            }
            if ((respSrv.getData().getContactDetails().get(indice).getContactType().getId()).equals("PHONE_NMBR")) {
                for (int pos = 0; pos < respSrv.getData().getContactDetails().get(indice).getContact().length(); pos++) {
                    if (pos > 6 && pos < 14) {
                        numeroTelefono += String.valueOf(respSrv.getData().getContactDetails().get(indice).getContact().charAt(pos));
                    }
                }
                oCliente.getDatosContacto().setNumeroTelefono1(numeroTelefono);
            }

            if ((respSrv.getData().getContactDetails().get(indice).getContactType().getId()).equals("REFERENCE")) {
                for (int posR = 0; posR <= respSrv.getData().getContactDetails().get(indice).getContact().length(); posR++) {
                    if (posR >= 68 && posR <= 74) {
                        numeroTelefonoR += String.valueOf(respSrv.getData().getContactDetails().get(indice).getContact().charAt(posR));
                    }
                }
                oCliente.getDatosContacto().setReferencia(numeroTelefonoR);
            }
        }
        //Campo no definido    resp.setAntiguedadCliente(respSrv.getData().getEmploymentInformation().getYearsAntiguaty().toString());
        oCliente.getInformacionPersonal().setAntiguedadEmpleado(respSrv.getData().getEmploymentInformation().getYearsAntiguaty().toString());
//        oCliente.getPerfil().setOcupacion(respSrv.getData().getEmploymentInformation().getTypeEmployee());
        if (respSrv.getData().getLegalAddresses() != null && !respSrv.getData().getLegalAddresses().isEmpty()) {
            oCliente.getDatosContacto().setDireccionPrincipal(respSrv.getData().getLegalAddresses().get(0).getAddressName());
            oCliente.getInformacionPersonal().setNacionalidad(respSrv.getData().getLegalAddresses().get(0).getCountry().getId());
        }

        oCliente.getInformacionPersonal().setCiudadNacimiento(respSrv.getData().getLevelStudy().getCity());
        oCliente.getInformacionPersonal().setEstadoCivil("1".equals(respSrv.getData().getMaritalStatus()) ? "Casado/a" : respSrv.getData().getMaritalStatus());
        oCliente.getInformacionFinanciera().setEstrato(respSrv.getData().getLivingPlace().getLivingLevel().toString());
        oCliente.getInformacionPersonal().setFechaNacimiento(respSrv.getData().getBirthDate());
        oCliente.getDatosBasicos().setGestorPrincipal(respSrv.getData().getBankingRelationship().getManager());
        oCliente.getPerfil().setOcupacion(respSrv.getData().getEmploymentInformation().getJobTittle());
        oCliente.getInformacionPersonal().setSexo(respSrv.getData().getGender().equals("M") ? "Masculino" : "Femenino");
        oCliente.getDatosBasicos().setApellidos(respSrv.getData().getLastName());

        oCliente.getDatosBasicos().setPrimerNombre(respSrv.getData().getFirstName());
        if (respSrv.getData().getNationalities() != null && !respSrv.getData().getNationalities().isEmpty()) {
            oCliente.getInformacionPersonal().setNacionalidad(respSrv.getData().getNationalities().get(0).getId());
        }

        oCliente.getDatosBasicos().setEmpresaLabora(respSrv.getData().getEmploymentInformation().getPurpouseCompany().getName());

        oCliente.getInformacionPersonal().setNumeroPersonasAcargo(respSrv.getData().getNumberPersonAssociated());
        cargarBalances(respServData, oCliente);
        cargarDetalle(oCliente);
        return oCliente;

    }

    private void cargarBalances(Data respServData, DTOCliente oCliente) {
        for (Balance balance : respServData.getData().getBalance()) {
//            if (balance.getId().equals("INCOME")) {
//                resp.setIngresos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("VARIABLE_INCOME")) {
//                resp.setIngresosVariables(balance.getValue().getAmount());
//            } else if (balance.getId().equals("OTHER_INCOME")) {
//                resp.setOtrosIngresos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("TOTAL_INCOME")) {
//                resp.setTotalIngresos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("ROSTER_DEDUCTIONS")) {
//                resp.setDeduccionesNomina(balance.getValue().getAmount());
//            } else if (balance.getId().equals("MORTGAGE_SHARE")) {
//                resp.setCuotaHipotecaria(balance.getValue().getAmount());
//            } else if (balance.getId().equals("RENT")) {
//                resp.setArriendo(balance.getValue().getAmount());
//            } else if (balance.getId().equals("OTHER_LOAN_SHARE")) {
//                resp.setCuotasOtrosCreditos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("OTHER_EXPENSE")) {
//                resp.setOtrosEgresos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("TOTAL_EXPENSE")) {
//                resp.setTotalEgresos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("AVERAGE_BALANCE")) {
//                resp.setSaldoMedio(balance.getValue().getAmount());
//            } else if (balance.getId().equals("BANKS_BALANCE")) {
//                resp.setSaldoBancos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("HOUSE_VALUE")) {
//                resp.setValorVivienda(balance.getValue().getAmount());
//            } else if (balance.getId().equals("CAR_VALUE")) {
//                resp.setValorVehiculo(balance.getValue().getAmount());
//            } else if (balance.getId().equals("OTHER_ASSETS")) {
//                resp.setOtrosActivos(balance.getValue().getAmount());
//            } else 
            if (balance.getId().equals("TOTAL_ASSETS")) {
                oCliente.getInformacionFinanciera().setTotalActivos(balance.getValue().getAmount().toString());
            }
//else if (balance.getId().equals("MORTGAGE")) {
//                resp.setBancos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("CARDS_LIMIT")) {
//                resp.setCupoTotal(balance.getValue().getAmount());
//            } else if (balance.getId().equals("OTHER_DEBTS")) {
//                resp.setOtrasObligaciones(balance.getValue().getAmount());
//            } else if (balance.getId().equals("INTAKE_LOANS")) {
//                resp.setCreditosConsumo(balance.getValue().getAmount());
//                // resp.setCuotasOtrosCreditos(balance.getValue().getAmount());
//            } else 
            if (balance.getId().equals("TOTAL_LIABILITIES")) {
                oCliente.getInformacionFinanciera().setTotalPasivos(balance.getValue().getAmount().toString());
            }
//else 
            if (balance.getId().equals("HERITAGE")) {
                oCliente.getInformacionFinanciera().setTotalPatrimonio(balance.getValue().getAmount().toString());
            }
        }
    }

    @Override
    public List<DTOCliente> buscarClientes() {
        List<DTOCliente> clientes = new ArrayList<DTOCliente>();
        for (int i = 0; i < 10; i++) {
            DTOCliente dTOCliente = new DTOCliente();
            dTOCliente.setDatosBasicos(new DTODatosBasicos("Nombre " + i, "Apellido " + i, "Segmento " + i, "Caracter " + i));
            clientes.add(dTOCliente);
        }
        return clientes;
    }

    private void cargarDetalle(DTOCliente cliente) {
        DTOItem cuentaPersonal = new DTOItem();
        cuentaPersonal.setNombreProducto("Cuentas personales");
        cuentaPersonal.setNombreColumna1("Número cuenta");
        cuentaPersonal.setNombreColumna2("Tipo");
        cuentaPersonal.setNombreColumna3("Saldo total");
        cuentaPersonal.setNombreColumna4("Saldo disponible");
        cuentaPersonal.setNombreModal("modalInfoFinan2");
        cuentaPersonal.getDetalles().add(new DTODetalle("0013-0043-00-0200268904", "AH", "$674.00", "$674.00"));
        cuentaPersonal.getDetalles().add(new DTODetalle("0013-0073-00-0200224214", "AH", "$94,055.18", "$94,055.18"));
        cuentaPersonal.getDetalles().add(new DTODetalle("0013-0073-00-0200224214", "AH", "$94,055.18", "$94,055.18"));
        cuentaPersonal.getDetalles().add(new DTODetalle("0013-0073-00-0200224214", "AH", "$94,055.18", "$94,055.18"));
        cliente.getProductos().add(cuentaPersonal);
        DTOItem fondoInversion = new DTOItem();
        fondoInversion.setNombreProducto("Fondo de inversión");
        fondoInversion.setNombreColumna1("Número fondo");
        fondoInversion.setNombreColumna2("Tipo");
        fondoInversion.setNombreColumna3("Saldo total");
        fondoInversion.setNombreColumna4("Saldo disponible a reembolsar");
        fondoInversion.setNombreModal("modalInfoFinan3");
        fondoInversion.getDetalles().add(new DTODetalle("0013-0043-00-7000005449", "BF", "$2,149,678", "$2,149,678"));
        cliente.getProductos().add(fondoInversion);
        DTOItem prestamos = new DTOItem();
        prestamos.setNombreProducto("Préstamos");
        prestamos.setNombreColumna1("Número préstamo");
        prestamos.setNombreColumna2("Tipo");
        prestamos.setNombreColumna3("Total adeudado");
        prestamos.setNombreColumna4("Total vencido");
        prestamos.setNombreModal("modalInfoFinan4");
        prestamos.getDetalles().add(new DTODetalle("0013-0043-00-7000005449", "CS", "$2,149,678.00", "$2,149,678.00"));
        prestamos.getDetalles().add(new DTODetalle("0013-0043-00-7000005449", "CS", "$2,149,678.00", "$2,149,678.000"));
        cliente.getProductos().add(prestamos);
        DTOItem tarjetaCredito = new DTOItem();
        tarjetaCredito.setNombreProducto("Tarjeta de credito");
        tarjetaCredito.setNombreColumna1("Número tarjeta");
        tarjetaCredito.setNombreColumna2("Tipo");
        tarjetaCredito.setNombreColumna3("Cupo total");
        tarjetaCredito.setNombreColumna4("Cupo dispoonible");
        tarjetaCredito.setNombreModal("modalInfoFinan5");
        tarjetaCredito.getDetalles().add(new DTODetalle("0013-0043-00-7000005449", "CS", "$2,149,678.00", "$2,149,678.00"));
        cliente.getProductos().add(tarjetaCredito);
        cliente.setProducto(cargarItemDetalleCuenta());
        cliente.setProducto1(cargarItemDetalleInversion());
        cliente.setProducto2(cargarItemDetallePrestamo());
        cliente.setProducto3(cargarItemDetalleTarjeta());
    }

    private DTOItem cargarItemDetalleCuenta() {
        DTOItem detalle = new DTOItem();
        detalle.setNombreProducto("Detalle de la cuenta");
        detalle.setNombreColumna1("Fecha Operación");
        detalle.setNombreColumna2("Fecha valor");
        detalle.setNombreColumna3("Concepto");
        detalle.setNombreColumna4("Valor");
        detalle.getDetalles().add(new DTODetalle("03/02/17", "03/02/17", "RETIRO CAJERO 1", "$200.000.00"));
        detalle.getDetalles().add(new DTODetalle("03/02/17", "03/02/17", "RETIRO CAJERO 2", "$200.000.00"));
        detalle.getDetalles().add(new DTODetalle("03/02/17", "03/02/17", "RETIRO CAJERO 3", "$200.000.00"));
        return detalle;
    }

    private DTOItem cargarItemDetalleInversion() {
        DTOItem detalle = new DTOItem();
        detalle.setNombreProducto("");
        detalle.setNombreColumna1("Fecha Operación");
        detalle.setNombreColumna2("Fecha Valor");
        detalle.setNombreColumna3("Concepto");
        detalle.setNombreColumna4("Valor");
        detalle.setNombreColumna5("Saldo");
        detalle.getDetalles().add(new DTODetalle("03/02/17", "03/02/17", "INVERSION 1", "$200.000.00", "$200.000.00"));
        detalle.getDetalles().add(new DTODetalle("03/02/17", "03/02/17", "INVERSION 1", "$200.000.00", "$200.000.00"));
        detalle.getDetalles().add(new DTODetalle("03/02/17", "03/02/17", "INVERSION 1", "$200.000.00", "$200.000.00"));
        detalle.getDetalles().add(new DTODetalle("03/02/17", "03/02/17", "INVERSION 1", "$200.000.00", "$200.000.00"));
        return detalle;
    }

    private DTOItem cargarItemDetallePrestamo() {
        DTOItem detalle = new DTOItem();
        detalle.setNombreProducto("Prestamo");
        detalle.setNombreColumna1("Fecha");
        detalle.setNombreColumna2("Abono capital");
        detalle.setNombreColumna3("Intereses corrientes");
        detalle.setNombreColumna4("Intereses mora");
        detalle.setNombreColumna5("Ajuste Reliquid.");
        detalle.setNombreColumna6("Otros gastos");
        detalle.setNombreColumna7("Total pagado");
        detalle.setNombreColumna8("Saldo capital");
        detalle.getDetalles().add(new DTODetalle("03/02/17", "231233", "300", "$8.000.00", "$300.00", "$899.00", "$899.00", "$899.00"));
        detalle.getDetalles().add(new DTODetalle("03/02/17", "231233", "300", "$8.000.00", "$300.00", "$899.00", "$899.00", "$899.00"));
        detalle.getDetalles().add(new DTODetalle("03/02/17", "231233", "300", "$8.000.00", "$300.00", "$899.00", "$899.00", "$899.00"));
        return detalle;
    }

    private DTOItem cargarItemDetalleTarjeta() {
        DTOItem detalle = new DTOItem();
        detalle.setNombreProducto("Tarjeta Credito");
        detalle.setNombreColumna1("Fecha");
        detalle.setNombreColumna2("Comprobante");
        detalle.setNombreColumna3("Concepto");
        detalle.setNombreColumna4("Valor");
        detalle.getDetalles().add(new DTODetalle("03/02/17", "12321423", "COMPRA CON TC 1", "$200.000.00"));
        detalle.getDetalles().add(new DTODetalle("03/02/17", "12321423", "COMPRA CON TC 2", "$200.000.00"));
        detalle.getDetalles().add(new DTODetalle("03/02/17", "12321423", "COMPRA CON TC 3", "$200.000.00"));
        return detalle;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.dto.mapping.impl;

import co.com.bbva.eecc.war.dto.DTOCliente;
import co.com.bbva.eecc.war.dto.mapping.OpConsultaInfoCliente;
import com.bbva.ccol.customers.facade.v02.dto.DataCustomer;
import com.bbva.ccol.financialinformation.facade.v01.dto.Data;
import com.bbva.ccol.financialinformation.facade.v01.dto.Indicators;
import com.bbva.ekip.arq.clients.CustomersClient;
import com.bbva.ekip.arq.clients.FinancialInformationClient;
import com.bbva.net.consulta.cifin.service.DTOConsultaCifinCliente;
import com.bbva.net.consulta.cifin.service.OpConsultaCifinClienteImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Luis Berna on 23/03/2017.
 */
@Component
public class OpConsultaInfoClienteImpl implements OpConsultaInfoCliente {

    //Consulta del indicador Sarlaft del conyuge - INICIO
    private final String POR_DEFECTO_SARLAFT = "N";
    //Consulta del indicador Sarlaft del conyuge - FIN

    @Autowired
    private CustomersClient cliente;

    @Autowired
    private FinancialInformationClient opFinal;

    @Override
    public DTOCliente consultarInfoCliente(String numeroIdentificacion, Map<String, String> headers) throws Exception {
        String prefijo = "";
        String numeroTelefono = "";
        String exTelefono = "";
        String prefijoR = "";
        String numeroTelefonoR = "";
        String exTelefonoR = "";
        String tipoTelefonoR = "";
        String nombreR = "";
        DataCustomer respSrv = cliente.getCustomer(numeroIdentificacion, headers);
        Data respServData = opFinal.getFinancialInformation(numeroIdentificacion, "1", "1", "1", headers);
        OpConsultaCifinClienteImpl opConsultaCifinCliente = new OpConsultaCifinClienteImpl();
        DTOConsultaCifinCliente consultaCifinCliente = opConsultaCifinCliente.solicitudCifin(numeroIdentificacion, "CC", "CC99999", "");

        DTOCliente oCliente = new DTOCliente();

        cargarBalances(respServData);

        oCliente.getPerfil().setSituacionLaboral(exTelefonoR);
        for (Indicators indicators : respServData.getData().getIndicators()) {
            if (indicators.getId().equals("JOB_SITUAT")) {
                oCliente.getPerfil().setSituacionLaboral(indicators.getName());
                oCliente.getPerfil().setPuntajeBuroCifin(consultaCifinCliente.getPuntaje());
            }
        }

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
        oCliente.getPerfil().setOcupacion(respSrv.getData().getEmploymentInformation().getTypeEmployee());
        if (respSrv.getData().getLegalAddresses() != null && !respSrv.getData().getLegalAddresses().isEmpty()) {
            oCliente.getDatosContacto().setDireccionPrincipal(respSrv.getData().getLegalAddresses().get(0).getAddressName());
            oCliente.getInformacionPersonal().setNacionalidad(respSrv.getData().getLegalAddresses().get(0).getCountry().getId());
        }

        oCliente.getInformacionPersonal().setCiudadNacimiento(respSrv.getData().getLevelStudy().getCity());
        oCliente.getInformacionPersonal().setEstadoCivil(respSrv.getData().getMaritalStatus());
        oCliente.getInformacionFinanciera().setEstrato(respSrv.getData().getLivingPlace().getLivingLevel().toString());
        oCliente.getInformacionPersonal().setFechaNacimiento(respSrv.getData().getBirthDate());
        oCliente.getDatosBasicos().setGestorPrincipal(respSrv.getData().getBankingRelationship().getManager());
        oCliente.getPerfil().setOcupacion(respSrv.getData().getEmploymentInformation().getJobTittle());
        oCliente.getInformacionPersonal().setSexo(respSrv.getData().getGender());
        oCliente.getDatosBasicos().setApellidos(respSrv.getData().getLastName());

        oCliente.getDatosBasicos().setPrimerNombre(respSrv.getData().getFirstName());
        if (respSrv.getData().getNationalities() != null && !respSrv.getData().getNationalities().isEmpty()) {
            oCliente.getInformacionPersonal().setNacionalidad(respSrv.getData().getNationalities().get(0).getId());
        }

        oCliente.getDatosBasicos().setEmpresaLabora(respSrv.getData().getEmploymentInformation().getPurpouseCompany().getName());

        oCliente.getInformacionPersonal().setNumeroPersonasAcargo(respSrv.getData().getNumberPersonAssociated());

        return null;

    }

    private void cargarBalances(Data respServData) {
//        for (Balance balance : respServData.getData().getBalance()) {
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
//            } else if (balance.getId().equals("TOTAL_ASSETS")) {
//                resp.setTotalActivos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("MORTGAGE")) {
//                resp.setBancos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("CARDS_LIMIT")) {
//                resp.setCupoTotal(balance.getValue().getAmount());
//            } else if (balance.getId().equals("OTHER_DEBTS")) {
//                resp.setOtrasObligaciones(balance.getValue().getAmount());
//            } else if (balance.getId().equals("INTAKE_LOANS")) {
//                resp.setCreditosConsumo(balance.getValue().getAmount());
//                // resp.setCuotasOtrosCreditos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("TOTAL_LIABILITIES")) {
//                resp.setTotalPasivos(balance.getValue().getAmount());
//            } else if (balance.getId().equals("HERITAGE")) {
//                resp.setTotalPatrimonio(balance.getValue().getAmount());
//            }
//
//        }

    }
}

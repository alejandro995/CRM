/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.net.consulta.cifin.service;

import com.bbva.net.consulta.cifin.ContratacionDigitalTX;
import com.bbva.net.consulta.cifin.ContratacionDigitalTX_Service;
import com.bbva.net.consulta.cifin.TipoIdType;
import com.bbva.net.consulta.cifin.ValidarConsultaResponseType;
import com.bbva.net.consulta.cifin.ValidarConsultaType;
import javax.xml.ws.BindingProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class OpConsultaCifinClienteImpl implements OpConsultaCifinCliente {

//    @Value(value = "${consultaCifin.url}")
    private String URL_SERVICE = "http://172.17.93.51:6658/services/ContratacionDigitalTX";

    @Override
    public DTOConsultaCifinCliente solicitudCifin(String numIden, String tipoIden, String usuarioEkip, String sessionEKIP) throws Exception {
        DTOConsultaCifinCliente cifinCliente = new DTOConsultaCifinCliente();
        ContratacionDigitalTX_Service defServicio = new ContratacionDigitalTX_Service();
        ContratacionDigitalTX servicio = defServicio.getContratacionDigitalTXSOAP();

        BindingProvider bp = (BindingProvider) servicio;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, URL_SERVICE);

        ValidarConsultaType peticion = new ValidarConsultaType();

        peticion.setNumeroIdentificacion(Integer.parseInt(numIden.split("-")[0]));

        peticion.setTipoIdentificacion(TipoIdType.fromValue(tipoIden));

        peticion.setCodigoInformacion(154);

        peticion.setMotivoConsulta(1);

        ValidarConsultaResponseType respuestaCifin = servicio.consultaComercial(peticion);
        if (respuestaCifin.getPuntajeBuro().equals("")) {
            respuestaCifin.setPuntajeBuro("0");
        }
        cifinCliente.setPuntaje(respuestaCifin.getPuntajeBuro());
        int puntajeBuro = new Integer(respuestaCifin.getPuntajeBuro());
        if (puntajeBuro < 540 && respuestaCifin.getEstado().equalsIgnoreCase("Cancelada por doble intento de cedulación")) {
            cifinCliente.setEstadoC(respuestaCifin.getEstado());
        } else if (puntajeBuro < 540 && respuestaCifin.getEstado().equalsIgnoreCase("Suspensión por derechos políticos")) {
            cifinCliente.setEstadoC(respuestaCifin.getEstado());
        } else if (puntajeBuro < 540 && respuestaCifin.getEstado().equalsIgnoreCase("Falsa identidad")) {
            cifinCliente.setEstadoC(respuestaCifin.getEstado());
        } else if (puntajeBuro < 540 && respuestaCifin.getEstado().equalsIgnoreCase("Muerte del titular")) {
            cifinCliente.setEstadoC(respuestaCifin.getEstado());
        } else if (puntajeBuro < 540 && respuestaCifin.getEstado().equalsIgnoreCase("Interdicción judicial por demencia")) {
            cifinCliente.setEstadoC(respuestaCifin.getEstado());
        } else if (puntajeBuro < 540 && respuestaCifin.getEstado().equalsIgnoreCase("Cancelada por muerte - No expedida")) {
            cifinCliente.setEstadoC(respuestaCifin.getEstado());
        }
        cifinCliente.setEstadoC(respuestaCifin.getEstado());
        if (respuestaCifin.getGastosHipotecarios() != null) {
            cifinCliente.setGastHip(respuestaCifin.getGastosHipotecarios());
        }
        if (respuestaCifin.getGastosHipotecarios() != null && respuestaCifin.getGastosCuotaPrestamo().getObligacion().size() > 0) {

            if (respuestaCifin.getGastosCuotaPrestamo().getObligacion().get(0).getPaqueteInformacionOrIdentificadorLineaOrTipoContrato().get(0).getValue().toString() != null) {
                cifinCliente.setGastCuo(respuestaCifin.getGastosCuotaPrestamo().getObligacion().get(0).getPaqueteInformacionOrIdentificadorLineaOrTipoContrato().get(0).getValue().toString());
            }
        }
        if (respuestaCifin.getCuposTarjCredito() != null && respuestaCifin.getCuposTarjCredito().getObligacion() != null && respuestaCifin.getCuposTarjCredito().getObligacion().getPaqueteInformacionOrIdentificadorLineaOrTipoContrato().size() > 0) {
            if (respuestaCifin.getCuposTarjCredito().getObligacion().getPaqueteInformacionOrIdentificadorLineaOrTipoContrato().get(0).getValue().toString() != null) {
                cifinCliente.setGastTTDC(respuestaCifin.getCuposTarjCredito().getObligacion().getPaqueteInformacionOrIdentificadorLineaOrTipoContrato().get(0).getValue().toString());
            }
        }
        if (respuestaCifin.getCuposComerciales() != null) {
            cifinCliente.setCuposCom(respuestaCifin.getCuposComerciales());
        }
        if (respuestaCifin.getFecha() != null) {
            cifinCliente.setFeConCifin(respuestaCifin.getFecha());
        }

        if (respuestaCifin.getTipoIdentificacion().equals("C-C")) {
            respuestaCifin.setTipoIdentificacion("1");
            System.out.println("tipo de documento es CC:" + respuestaCifin.getTipoIdentificacion());
        } else if (respuestaCifin.getTipoIdentificacion().equals("NE")) {
            respuestaCifin.setTipoIdentificacion("6");
        } else if (respuestaCifin.getTipoIdentificacion().equals("CD")) {
            respuestaCifin.setTipoIdentificacion("A");
        } else if (respuestaCifin.getTipoIdentificacion().equals("PP")) {
            respuestaCifin.setTipoIdentificacion("5");
        } else if (respuestaCifin.getTipoIdentificacion().equals("CE")) {
            respuestaCifin.setTipoIdentificacion("2");
        }

        return cifinCliente;
    }

}

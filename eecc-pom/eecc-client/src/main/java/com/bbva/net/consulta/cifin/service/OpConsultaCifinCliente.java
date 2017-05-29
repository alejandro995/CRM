/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.net.consulta.cifin.service;


/**
 *
 * @author Administrator
 */
public interface OpConsultaCifinCliente {
    DTOConsultaCifinCliente solicitudCifin(String numIden, String tipoIden, String usuarioEkip , String sessionEKIP) throws Exception;

}


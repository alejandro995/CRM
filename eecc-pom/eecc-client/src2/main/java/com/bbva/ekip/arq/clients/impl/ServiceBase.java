package com.bbva.ekip.arq.clients.impl;

import com.bbva.ekip.arq.clients.tipos.ExcepcionClienteRest;
import com.bbva.jee.arq.spring.core.servicing.gce.xml.instance.ErrorInstance;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by jquijano82 on 8/06/16.
 */
public abstract class ServiceBase {

    protected static final Logger LOG = Logger.getLogger(ServiceBase.class);

    @Resource(name="factoryBean")
    protected JAXRSClientFactoryBean clientFactory;

    protected Object getClient(String url, Class clase)  throws Exception{
        clientFactory.setAddress(url);
        return JAXRSClientFactory.fromClient(clientFactory.createWebClient(),clase);
    }

    protected void evaluateResponse(Response res) throws Exception{
        /*Si la respuesta no coincide con el rango de los 200 de acuerdo de acuerdo
        al rfc2616 entonces se considera error */
        if(res.getStatus() < 200 || res.getStatus() > 299){
            //Se valida si es un error controlado por la arquitectura
            if(res.hasEntity()){
                BufferedReader entrada = new BufferedReader(new InputStreamReader((InputStream)res.readEntity(InputStream.class)));

                //Hay problemas con la libreria del la arquitectura de servicios que mapea el error.
                ErrorInstance se = ErrorInstance.fromJsonToErrorInstance(entrada.readLine());
                entrada.close();
                throw new ExcepcionClienteRest("Fallo llamado servicio",se.getHttpStatus(),se.getSeverity().value(),se.getVersion(),se.getErrorCode(),se.getErrorMessage(),se.getConsumerRequestId(),se.getSystemErrorCode(),se.getSystemErrorDescription());

            } else {
                LOG.error("Error al interpretar repuesta de la arquitectura de servicios: Respuesta HTTP " + res.getStatus());
                throw new Exception("Servicio no disponible");
            }
        }
    }
}

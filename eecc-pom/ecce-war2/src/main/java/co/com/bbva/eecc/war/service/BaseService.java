/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.service;

import co.com.bbva.eecc.war.conf.User;
import com.bbva.ekip.arq.util.HeaderVars;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.webflow.execution.RequestContext;

/**
 *
 * @author Administrator
 */
public class BaseService {

    protected HashMap<String, String> extraerHeaders(RequestContext context) throws Exception {
        try {
            HttpSession session = ((HttpServletRequest) context.getExternalContext().getNativeRequest()).getSession();
            HashMap<String, String> headers = new HashMap<String, String>();
            User user = (User) session.getAttribute("USER_LOGIN");
            headers.put(HeaderVars.EKIP_USER, user.getUserID());
            headers.put(HeaderVars.IV_TICKETSERVICE, user.getIvTicketService());
            return headers;
        } catch (Exception e) {
            throw e;
        }
    }

    public static String ceros(String cedula) {
        int ceros = 15 - cedula.length();
        for (int i = 0; i < ceros; i++) {
            cedula = "0" + cedula;
        }
        System.out.println(cedula);
        return cedula;
    }

    public static int estraerEdad(Date fechaInicial, Date fechaFinal) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }
        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
        }

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
        dias = dias / 365;
        return ((int) dias);
    }

}

package com.bbva.ekip.arq.interceptors;

import com.bbva.ekip.arq.clients.GrantingTicket;
import com.bbva.ekip.arq.util.HeaderVars;
import com.bbva.saz.co.grantingticket.v02.AuthenticationData;
import com.bbva.saz.co.grantingticket.v02.AuthenticationRequest;
import com.bbva.saz.co.grantingticket.v02.BackendUserRequest;
import com.bbva.saz.co.grantingticket.v02.CreateTicketRequest;
import org.apache.cxf.interceptor.AbstractInDatabindingInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by jquijano82 on 8/06/16.
 */
public class RequestInterceptor extends AbstractInDatabindingInterceptor {

    private final static Logger LOG = Logger.getLogger(RequestInterceptor.class);
    private static final String KEY_AUTH_GT = "iv_ticketService";
    private static final String AUTH_TYPE_GT = "00";
    private final String EXPREG_INTERNOS = "^[C]\\d{6}";
    private final String EXPREG_EXTERNOS = "^[C][CE]\\d{5}";

    @Value(value = "${grantingTicket.url}")
    private String GT_URL;

    @Value(value = "${codigo.aap.interno}")
    private String CODIGO_AAP_INTERNO;

    @Value(value = "${codigo.aap.externo}")
    private String CODIGO_AAP_EXTERNO;

    @Autowired
    private GrantingTicket servicioGT;

    public RequestInterceptor() {
        super(Phase.SEND);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        //Si no es peticion de GT - org.apache.cxf.request.uri
        if (!((String) message.get("org.apache.cxf.request.uri")).contains(GT_URL)) {
            Map<String, ArrayList<String>> headers = (Map<String, ArrayList<String>>) message.get(Message.PROTOCOL_HEADERS);

            String userID = null;
            String aap = null;
            String ivTicket = null;

            userID = ((List) headers.get(HeaderVars.EKIP_USER)).get(0).toString();
            ivTicket = ((List) headers.get(HeaderVars.IV_TICKETSERVICE)).get(0).toString();

            headers.remove(HeaderVars.EKIP_USER);
            headers.remove(HeaderVars.IV_TICKETSERVICE);

            if (userID != null) {
                /**
                 * Selección del AAP a utilizar a partir del código de usuario
                 * recibido
                 */
                if (userID.matches(EXPREG_EXTERNOS)) {
                    aap = CODIGO_AAP_EXTERNO;
                } else if (userID.matches(EXPREG_INTERNOS)) {
                    aap = CODIGO_AAP_INTERNO;
                }
                if (aap != null) {
                    try {
                        String tsec = llamarGT(aap, userID, ivTicket);

                        ArrayList<String> ltsec = new ArrayList<String>();
                        ltsec.add(tsec);

                        headers.put("tsec", ltsec);

                    } catch (Exception e) {
                        LOG.error(e);
                    }
                } else {
                    LOG.error("Formato de usuario no v\u00e1lido");
                }
            } else {
                LOG.error("Para utilizar un SMC debe incluir las cabeceras 'ekip-user', 'ekip-sesion' y 'iv_TicketService' en el llamado.");
            }
        }
    }

    private String llamarGT(String aap, String usuario, String ivticket) throws Exception {
        String tsec = "";

        CreateTicketRequest peticionCrearGT = new CreateTicketRequest();

        //definicion authentication - INICIO
        AuthenticationRequest peticionAutenticacionGT = new AuthenticationRequest();
        AuthenticationData dataAutenticacion = new AuthenticationData();
        peticionAutenticacionGT.setAuthenticationType(AUTH_TYPE_GT);
        peticionAutenticacionGT.setConsumerID(aap);
        peticionAutenticacionGT.setUserID(usuario);
        dataAutenticacion.setIdAuthenticationData(KEY_AUTH_GT);
        dataAutenticacion.getAuthenticationData().add(ivticket);
        peticionAutenticacionGT.getAuthenticationData().add(dataAutenticacion);
        //definicion authentication - FIN

        //definicion backendUserRequest - INICIO
        BackendUserRequest peticionUsuarioBack = new BackendUserRequest();
        peticionUsuarioBack.setAccessCode("");
        peticionUsuarioBack.setDialogId("");
        peticionUsuarioBack.setUserId("");
        //definicion backendUserRequest - FIN

        peticionCrearGT.setAuthentication(peticionAutenticacionGT);
        peticionCrearGT.setBackendUserRequest(peticionUsuarioBack);

        try {
            tsec = servicioGT.createTicket(peticionCrearGT);

        } catch (Exception e) {
            throw e;
        }
        return tsec;
    }

}

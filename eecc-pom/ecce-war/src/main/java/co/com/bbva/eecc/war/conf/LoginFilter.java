/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.conf;

import co.com.bbva.eecc.war.service.EmployeeService;
import com.bbva.ekip.arq.util.HeaderVars;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 * @author luis.berna
 */
@WebFilter("/app/*")
public class LoginFilter implements Filter {

    @Autowired
    EmployeeService employeeService;

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest servletRequest = (HttpServletRequest) req;

        if (servletRequest.getSession(false) == null) {
            HttpSession session = servletRequest.getSession(true);
            User user = crearUser(servletRequest);
            session.setAttribute("USER_LOGIN", user);
            System.out.println("Sesion creada con exito ");
        }
        chain.doFilter(req, res); // So, just continue request.
    }

    @Override
    public void init(FilterConfig fc) throws ServletException {
//        WebApplicationContextUtils
//                .getRequiredWebApplicationContext(fc.getServletContext())
//                .getAutowireCapableBeanFactory()
//                .autowireBean(this);
       // SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
         //       fc.getServletContext());
    }

    @Override
    public void destroy() {
    }

    private boolean verificarHeader(HttpServletRequest servletRequest) {
        String ivTicketService = servletRequest.getHeader("iv_ticketService");
        String consumerID = servletRequest.getHeader("consumerID");
        String userID = servletRequest.getHeader("userID");
        if (ivTicketService == null || ivTicketService.isEmpty()) {
            return false;
        }
        if (consumerID == null || consumerID.isEmpty()) {
            return false;
        }
        return !(userID == null || userID.isEmpty());
    }

    private User crearUser(HttpServletRequest servletRequest) {
        String ivTicketService = "SWhLXx9IytLJSyk+18pnwNj8+jdvk+hr0JzAc2ygjD8=";//servletRequest.getHeader("iv_ticketService");
        String consumerID = "12000007";
        servletRequest.getHeader("consumerID");
        String userID = "CC99999";
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put(HeaderVars.EKIP_USER, userID);
        headers.put(HeaderVars.IV_TICKETSERVICE, ivTicketService);

        //employeeService.buscarEmployee(userID, headers);
        servletRequest.getHeader("userID");
        //
        return new User(ivTicketService, consumerID, userID);
    }
}

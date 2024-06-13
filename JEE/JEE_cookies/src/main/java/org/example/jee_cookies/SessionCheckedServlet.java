package org.example.jee_cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "sessionchecked", value = "/sessionchecked")
public class SessionCheckedServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<body><html>");

        HttpSession httpSession = req.getSession();

        boolean logged = (httpSession.getAttribute("isLogged")!= null ) ? (boolean) httpSession.getAttribute("isLogged") : false;

        if (!logged){
            writer.println("<h2> Pas connecté</h2>");
        }else {
            writer.println("<h2> Connecté</h2>");
        }

        long creationTime = httpSession.getCreationTime();
        long lat = httpSession.getLastAccessedTime();
        long inaction = httpSession.getMaxInactiveInterval();

        long sessionDuration = ((System.currentTimeMillis()) - creationTime) / 1000;
        long expirationTime = lat + (inaction * 1000);
        Date expirationDate = new Date(expirationTime);

//        httpSession.removeAttribute("isLogged");

        writer.println("<p>"+ httpSession.getId() + "</p>");
        writer.println("<p> Date de création : "+ new Date(creationTime) + "</p>");
        writer.println("<p> Date d'expiration : "+ expirationDate + "</p>");
        writer.println("<p> Durée de la session : "+ sessionDuration + "</p>");
        writer.println("<p> Temps d'expiration :"+ expirationTime + "</p>");
        writer.println("<p> Temps d'inaction : "+ inaction + "</p>");
        writer.println("</body></html>");
    }
}

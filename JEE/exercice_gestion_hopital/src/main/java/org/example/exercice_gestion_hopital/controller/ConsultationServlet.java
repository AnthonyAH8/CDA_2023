package org.example.exercice_gestion_hopital.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.exercice_gestion_hopital.model.Consultation;
import org.example.exercice_gestion_hopital.service.ConsultationService;

import java.io.IOException;

@WebServlet(name = "consultationServlet", value = "/consultation/*")
public class ConsultationServlet extends HttpServlet {

    private ConsultationService consultationService;

    @Override
    public void init() throws ServletException {
        consultationService = new ConsultationService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        boolean isLogged = httpSession.getAttribute("isLogged") != null && (boolean) httpSession.getAttribute("isLogged");

        if (isLogged){
            String choice = req.getPathInfo();

            switch (choice){
                case "/addconsultation":
                    break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private void addConsultation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        if (request.getParameter("id") != null){
            request.setAttribute("consultation", consultationService.findById(Integer.parseInt(request.getParameter("id"))));
        }else{
            request.setAttribute("consultation", new Consultation());
        }
        request.getRequestDispatcher("/WEB-INF/addConsultation.jsp").forward(request, response);
    }
}

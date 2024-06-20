package org.example.exercice_gestion_hopital.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.exercice_gestion_hopital.model.Patient;
import org.example.exercice_gestion_hopital.service.PatientService;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "patientServlet", value = "/patient/*")
public class PatientServlet extends HttpServlet {
    private PatientService patientService;

    @Override
    public void init() throws ServletException {
        patientService = new PatientService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();

        switch (pathInfo){
            case "/pagesignup":
                pageSignUp(req, resp);
                break;
            case "/pagesignin":
                pageSignin(req, resp);
                break;
            case "/signup":
                try {
                    signUp(req, resp);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "signin":
                signIn(req, resp);
                break;
            default:
                resp.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private void pageSignUp(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/pagesignup.jsp").forward(req, resp);
    }

    private void pageSignin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/pagesignin.jsp").forward(req, resp);
    }

    private void signUp(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ParseException {
        String lastname = req.getParameter("lastname");
        String firstname = req.getParameter("firstname");
        String password = req.getParameter("password");
        String dateString = req.getParameter("dateOfBirth");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateOfBirth = dateFormat.parse(dateString);
        String profilePic = req.getParameter("profilePic");

        patientService.signUp(lastname, firstname, password, dateOfBirth, profilePic);
        resp.sendRedirect("pagesignin");

    }

    private void signIn(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String lastname = req.getParameter("lastname");
        String password = req.getParameter("password");

        Patient patient = patientService.signIn(lastname, password);
        if (patient != null){
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("isLogged", true);
            httpSession.setAttribute("patient", patient);

            //TODO send redirect
        }else{
            resp.sendRedirect("index.jsp");
        }
    }
}


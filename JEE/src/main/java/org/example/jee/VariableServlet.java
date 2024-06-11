package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "VariableServlet", value = "/variableservlet")
public class VariableServlet extends HttpServlet {
    private String prenom;

    private String nom;
    private List<String> prenoms;

    @Override
    public void init() throws ServletException {
        prenom = "Toto";
        nom = "Doe";
        prenoms = new ArrayList<>();
        prenoms.add("Titi");
        prenoms.add("Tata");
        prenoms.add("Jean-Kévin");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("prenom", prenom);
        req.setAttribute("prenoms", prenoms);
        req.setAttribute("nom", nom);
        getServletContext().getRequestDispatcher("/variable.jsp").forward(req, resp);
    }
}

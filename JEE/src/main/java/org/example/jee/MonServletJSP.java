package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "monServletJSP", value = "/monServlet-jsp")
public class MonServletJSP extends HttpServlet {

    private String prenom;
    private String nom;

    @Override
    public void init() throws ServletException {
        prenom = "Jane";
        nom = "Doe";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("prenom", prenom);
        req.setAttribute("nom", nom);
        getServletContext().getRequestDispatcher("/firstPage.jsp").forward(req, resp);
    }
}

package main.java.org.example.exercice_gestion_produits.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;

@WebServlet(name = "connexion", value = "/connexion")
public class ConnexionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");


        if ("user".equals(username) && "password".equals(password)) {
            HttpSession session = req.getSession();
            session.setAttribute("authenticatedUser", username);
            session.setAttribute("isLogged", true);

            resp.sendRedirect(req.getContextPath() + "/products.jsp");
        } else {

            HttpSession session = req.getSession();
            session.setAttribute("isLogged", false);

            resp.sendRedirect(req.getContextPath() + "/connexion.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/connexion.jsp").forward(req, resp);
    }
}

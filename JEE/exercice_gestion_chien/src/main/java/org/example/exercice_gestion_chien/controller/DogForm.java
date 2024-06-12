package org.example.exercice_gestion_chien.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice_gestion_chien.entity.Dogs;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@WebServlet(name = "dogForm", value = "/dogform")
public class DogForm extends HttpServlet {

    private List<Dogs> dogs;

    @Override
    public void init() throws ServletException {
        dogs = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("dogs", dogs);
        getServletContext().getRequestDispatcher("/WEB-INF/dogForm.jsp").forward(req, resp);
        resp.sendRedirect("/dog");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UUID uuid = UUID.randomUUID();
        String name = req.getParameter("name");
        String race = req.getParameter("race");
        LocalDate birthdate = LocalDate.parse(req.getParameter("birthdate"));

        dogs.add(new Dogs(name, race, birthdate));
        req.setAttribute("dogs", dogs);
        getServletContext().getRequestDispatcher("/WEB-INF/dogForm.jsp").forward(req, resp);

    }
}

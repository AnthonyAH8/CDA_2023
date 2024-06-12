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

@WebServlet(name = "DogServlet", value = "/dog")
public class DogServlet extends HttpServlet {
    private static final java.util.UUID UUID = java.util.UUID.randomUUID();
    private List <Dogs> dog;

    @Override
    public void init() throws ServletException {
        dog = new ArrayList<>();
        UUID uuid = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        LocalDate dob = LocalDate.of(2020, 3, 12);
        LocalDate dob2 = LocalDate.of(2018, 12, 4);
        dog.add(new Dogs(uuid, "Milou", "bichon", dob));
        dog.add(new Dogs(uuid2, "Clifford", "gros chien", dob2));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("dogs", dog);
        getServletContext().getRequestDispatcher("/WEB-INF/dogsJSP.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "personne", value = "/personne")
public class Personne extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("toto", "titi", 30));
        persons.add(new Person("tata", "titi", 25));
        persons.add(new Person("john", "doe", 33));
        req.setAttribute("persons", persons);
        getServletContext().getRequestDispatcher("/personne.jsp").forward(req, resp);
    }
}

package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "multiRoutesServlet", value = {"/multiroutesservlet", "/multi-routes", "/multi/*"})
public class MultiRoutesServlet extends HttpServlet {
    private List<String> prenoms;

    @Override
    public void init() throws ServletException {
        prenoms = new ArrayList<>();
        prenoms.add("Kéké");
        prenoms.add("Jean-Kévin");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pathInfo = (req.getPathInfo() != null && !req.getPathInfo().isEmpty() ? req.getPathInfo() : " ");

        req.setAttribute("prenoms", "toto");
            req.setAttribute("pathInfo", "pathInfo");
        req.getRequestDispatcher("/multi.jsp").forward(req, resp);
    }
}

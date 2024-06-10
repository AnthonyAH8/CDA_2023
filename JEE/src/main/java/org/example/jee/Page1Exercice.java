package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( name = "page1", value = "/page1")
public class Page1Exercice extends HttpServlet {

    private String message;
    @Override
    public void init() throws ServletException {
        message = "Page 1";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");

        PrintWriter writer = resp.getWriter();
        writer.println(message);
    }

    @Override
    public void destroy() {

    }
}

package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Page4", value = "/page4")
public class Page4 extends HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException {
        message = "Page 4";

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("message", message);

        getServletContext().getRequestDispatcher("/page4.jsp").forward(req, resp);


    }
}

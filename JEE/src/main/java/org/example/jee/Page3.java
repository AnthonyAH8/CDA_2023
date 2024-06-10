package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Page3", value = "/page3")
public class Page3 extends HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException {
        message = "Page 3";

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/page3.jsp").forward(req, resp);
    }
}

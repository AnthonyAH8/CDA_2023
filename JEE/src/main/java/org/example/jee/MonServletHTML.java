package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "monServletHTML", value = "/monServlet-html")
public class MonServletHTML extends HttpServlet {

    private String prenom;

    @Override
    public void init() throws ServletException {
        prenom = "John";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<p> Le prénom est : " + prenom + "</p>");
        writer.println("</body></html>");
    }

    @Override
    public void destroy() {

    }
}

package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Page2", value = "/page2")
public class Page2 extends HttpServlet {

    private String message;


    @Override
    public void init() throws ServletException {
        message = "Page 2";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<ul>");
        writer.println("<li>" + message + "</li>");
        writer.println("<li>" + message + "</li>");
        writer.println("<li>" + message + "</li>");
        writer.println("</ul>");
        writer.println("</body></html>");
    }

    @Override
    public void destroy() {

    }
}

package org.example.jee_cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "session", value = "/session")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("isLogged", true);


        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<body><html>");
        writer.println("<h1> Votre session </h1>");
            writer.println("</body></html>");
    }
}

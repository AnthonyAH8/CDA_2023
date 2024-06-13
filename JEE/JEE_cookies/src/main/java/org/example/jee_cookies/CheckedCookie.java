package org.example.jee_cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "checkedcookie", value = "/checkedcookie")
public class CheckedCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<body><html>");
        boolean logged = false;

        Cookie[] cookies = req.getCookies();

        for (Cookie c : cookies){
            if (c.getName().equals("isLogged") && c.getValue().equals("true")){
                writer.println("<h1> Vous êtres bien connecté</h1>");
                logged = true;
                break;
            }
        }
        if (!logged){
            writer.println("<h2> Pas connecté</h2>");
        }
        writer.println("<p> Vous avez " + cookies.length + " cookies</p>");
        writer.println("</body></html>");
    }
}

package org.example.jee_cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cookie", value = "/cookie")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("isLogged", "true");
        Cookie cookie2 = new Cookie("isLogged2", "true");

        cookie.setMaxAge(60);
        cookie2.setMaxAge(60*60);

        resp.addCookie(cookie);
        resp.addCookie(cookie2);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<body><html>");
        writer.println("<h1> Votre cookie</h1>");
        writer.println("</body></html>");
    }
}

package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "formServlet", value = "/formservlet")
public class FormServlet extends HttpServlet {

    private String myinitparam;
    @Override
    public void init() throws ServletException {
        myinitparam = getServletContext().getInitParameter("initparam");
        System.out.println(myinitparam);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mode = req.getParameter("mode");
        System.out.println(mode);
        req.setAttribute("mode", mode);
        getServletContext().getRequestDispatcher("/WEB-INF/addPerson.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        Double age = Double.parseDouble(req.getParameter("age"));

        System.out.println(firstname + " " + lastname + " " + age);
    }
}

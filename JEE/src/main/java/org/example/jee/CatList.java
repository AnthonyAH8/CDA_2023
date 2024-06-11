package org.example.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "catList", value = "/catlist")
public class CatList extends HttpServlet {

    private List<CatClass> catClassList;

    @Override
    public void init() throws ServletException {
        catClassList = new ArrayList<>();
        LocalDate dob = LocalDate.of(2022, 12, 12);
        LocalDate dob2 = LocalDate.of(2021, 8, 7);
        catClassList.add(new CatClass("garfield", "mainecoon", "lasagnes", dob));
        catClassList.add(new CatClass("tigrou", "chat de gouttière", "croquettes", dob2));
        catClassList.add(new CatClass("félix", "tuxedo", "fish", dob));
        catClassList.add(new CatClass("Tom", "british shorthair", "pâtée", dob2));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("catClass", catClassList);
        getServletContext().getRequestDispatcher("/WEB-INF/catsJSP.jsp").forward(req, resp);
        resp.sendRedirect("/catlist");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String race = req.getParameter("race");
        String favouriteMeal = req.getParameter("favouriteMeal");
        LocalDate birthdate = LocalDate.parse(req.getParameter("birthdate"));
        System.out.println(name + race + favouriteMeal + birthdate);

        catClassList.add(new CatClass(name, race, favouriteMeal, birthdate));

        req.setAttribute("catClass", catClassList);
        getServletContext().getRequestDispatcher("/WEB-INF/catsJSP.jsp").forward(req, resp);

    }
}

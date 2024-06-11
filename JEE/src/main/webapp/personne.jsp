<%@ page import="org.example.jee.Person" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personnes</title>
    <%@include file="WEB-INF/bootstrap.min.css.html"%>
</head>
<body>
    <h1>Liste de personnes </h1>
    <div>
        <%
            Iterable<Person> persons = (Iterable<Person>) request.getAttribute("persons");
            for (Person p : persons){ %>
            <li> <%= p.getPrenom() %> <%= p.getNom() %> <%= p.getAge() %></li>
        <% } %>
    </div>
</body>
</html>

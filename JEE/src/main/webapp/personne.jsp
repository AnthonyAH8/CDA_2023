<%@ page import="org.example.jee.Person" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personnes</title>
    <%@include file="WEB-INF/bootstrap.min.css.html"%>
</head>
<body>
    <h1>Liste de personnes </h1>
    <table class="table">
        <thead>
        <tr>
        <th scope="col">Prénom</th>
        <th scope="col">Nom</th>
        <th scope="col">Age</th>
        </tr>
        </thead>
        <tbody>
            <%
            Iterable<Person> persons = (Iterable<Person>) request.getAttribute("persons");
            if (persons != null) {
                for (Person p : persons) {
        %>
        <tr>
            <td><%= p.getPrenom() %></td>
            <td><%= p.getNom() %></td>
            <td><%= p.getAge() %></td>
        </tr>
            <%
                }
            }
        %>

        </tbody>
    </table>
</body>
</html>

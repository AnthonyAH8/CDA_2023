<%@ page import="org.example.exercice_gestion_chien.entity.Dogs" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="boostrap.html"%>
</head>
<body>

<main class="container bg-dark my-4">
        <div class="d-flex flex-column">
    <h1 class="text-white">Liste de chiens</h1>
    <hr class="text-white">
<table class="table table-dark text-center align-middle">
    <div class="text-bg-dark rounded p-3">
        <thead class="table-header">
        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Race</th>
            <th>Date de naissance</th>
        </tr>
    </thead>
    <tbody>
    <%
        Iterable<Dogs> dogs = (Iterable<Dogs>) request.getAttribute("dogs");
        if (dogs != null){
            for (Dogs dog : dogs){
    %>
    <tr>
        <td><%= dog.getUuid() %></td>
        <td><%= dog.getName() %></td>
        <td><%= dog.getRace() %></td>
        <td><%= dog.getBirthdate() %></td>
    </tr>
    <%
            }
        }
    %>
        </div>
    </tbody>
</table>
    </div>
</main>
</body>
</html>

<%@ page import="org.example.jee.CatClass" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <%@include file="bootstrap.min.css.html"%>
</head>
<body>
    <h1>Liste des chats</h1>
    <table class="table">
        <thead class="table-header">
        <tr>
            <th scope="col">Nom</th>
            <th scope="col">Race</th>
            <th scope="col">Plat favori</th>
            <th scope="col">Date de naissance</th>
        </tr>
        </thead>
        <tbody>
        <%
            Iterable<CatClass> cats = (Iterable<CatClass>) request.getAttribute("catClass");
        if (cats != null){
            for (CatClass cat : cats){
        %>
        <tr>
            <td><%= cat.getName() %></td>
            <td><%= cat.getRace() %></td>
            <td><%= cat.getFavouriteMeal() %></td>
            <td><%= cat.getBirthdate() %></td>
        </tr>
        <%
            }
        }
        %>
        </tbody>
    </table>

    <form method="post" action="catlist">
        <div>
            <label for="name">Prénom : </label>
            <input type="text" name="name" id="name">
        </div>
        <div>
            <label for="race">Race : </label>
            <input type="text" name="race" id="race">
        </div>
        <div>
            <label for="favouriteMeal">Plat favori : </label>
            <input type="text" name="favouriteMeal" id="favouriteMeal">
        </div>
        <div>
            <label for="birthdate">Date de naissance</label>
            <input type="date" name="birthdate" id="birthdate">
        </div>
        <button>Ajouter un chat</button>
    </form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 12/06/2024
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un chien</title>
    <%@include file="boostrap.html"%>
</head>
<body class="container">
<form action="dog" method="post" class="bg-dark text-white text-justify p-3 ">
    <h1 class="text-white">Ajouter un chien</h1>
    <br>
    <div class="my-3">
        <label for="name">Nom du chien</label>
        <input type="text" name="name" id="name">
    </div>
    <div class="my-3">
        <label for="race">Race : </label>
        <input type="text" name="race" id="race">
    </div>
    <div class="my-3">
        <label for="birthdate">Date de naissance</label>
        <input type="date" name="birthdate" id="birthdate">
    </div>
    <button class="align-end">Ajouter un chien</button>
</form>
</body>
</html>

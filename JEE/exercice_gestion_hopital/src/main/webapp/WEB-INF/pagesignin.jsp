<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 20/06/2024
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Se connecter</title>
    <%@include file="bootstrap.html" %>
</head>
<body>
<h2>Se connecter</h2>
<div class="container d-flex flex-column justify-content-center h-100 w-50">
    <form action="pagesignin" method="post">
        <div class="mb-3">
            <label for="lastname" class="form-label">Nom de famille :</label>
            <input type="text" class="form-control" id="lastname" name="lastname">
        </div>

        <div class="mb-3">
            <label for="password" class="form-label">Mot de passe :</label>
            <input type="password" class="form-control" id="password" name="password">
        </div>

        <button type="submit" class="btn btn-primary">Se connecter</button>
    </form>
</div>
</body>
</html>

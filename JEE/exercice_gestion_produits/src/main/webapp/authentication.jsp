<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 13/06/2024
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authentification</title>
</head>
<body>
<main>
    <div>
        <h1>S'authentifier</h1>
        <form action="authentication" method="post">
            <div>
                <label for="username">Nom utilisateur</label>
                <input type="text" name="username" id="username">
            </div>
            <div>
                <label for="password">Mot de passe</label>
                <input type="text" name="password" id="password">
            </div>
            <div>
                <label for="mail">Email</label>
                <input type="text" name="mail" id="mail">
            </div>
            <button>Valider</button>
        </form>
    </div>
</main>
</body>
</html>

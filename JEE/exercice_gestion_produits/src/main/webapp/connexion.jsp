<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 13/06/2024
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="WEB-INF/bootstrap.html"%>
<html>
<head>
    <title>Connexion</title>
</head>
<body>

    <main>
        <div>
            <h1>Se connecter</h1>
            <form action="authentication" method="post">
                <div>
                    <label for="username">Nom utilisateur</label>
                    <input type="text" name="username" id="username">
                </div>
                <div>
                    <label for="password">Mot de passe</label>
                    <input type="text" name="password" id="password">
                </div>
                <button>Valider</button>
            </form>
        </div>
    </main>
</body>
</html>

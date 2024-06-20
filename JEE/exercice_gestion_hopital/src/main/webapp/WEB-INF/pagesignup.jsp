<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>S'inscrire</title>
    <%@include file="bootstrap.html"%>
</head>
<body>

    <div class="container d-flex flex-column justify-content-center h-100 w-50">
        <h1>Création de votre compte</h1>
        <form action="pagesignup" method="post">
            <div class="mb-3">
                <label for="lastname" class="form-label">Nom</label>
                <input type="text" class="form-control" id="lastname" name="lastname">
            </div>

            <div class="mb-3">
                <label for="firstname" class="form-label">Prénom</label>
                <input type="text" class="form-control" id="firstname" name="firstname">
            </div>

            <div class="mb-3">
                <label for="dateofbirth" class="form-label">Date de naissance</label>
                <input type="date" class="form-control" id="dateofbirth" name="dateofbirth">
            </div>

            <div class="mb-3">
                <label for="password" class="form-label">Mot de passe</label>
                <input type="password" class="form-control" id="password" name="password">
            </div>

            <div class="mb-3">
                <label for="profilePic" class="form-label">Photo de profil</label>
                <input type="file" class="form-control" id="profilePic" name="profilePic" accept="image/png, image/jpeg">
            </div>


            <button type="submit" class="btn btn-primary">S'inscrire</button>

            <p><a href="${pageContext.request.contextPath}/patient/pagesignin">Déjà inscrit</a></p>

        </form>
    </div>
</body>
</html>

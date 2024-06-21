<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 20/06/2024
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="consultation" type="org.example.exercice_gestion_hopital.model.Consultation" scope="request"/>
<html>
<head>
    <title>Nouvelle consultation</title>
    <%@include file="bootstrap.html"%>
</head>
<body>
<main>
    <div class="container d-flex flex-column justify-content-center h-100 w-50">
        <form action="addConsultation" method="post">
            <div class="mb-3">
                <label for="consultationDate" class="form-label">Date :</label>
                <input type="date" class="form-control" id="consultationDate" name="consultationDate">
            </div>

            <div class="mb-3">
                <label for="doctor" class="form-label">Nom du docteur :</label>
                <input type="text" class="form-control" id="doctor" name="doctor">
            </div>

            <button type="submit" class="btn btn-primary">Ajouter</button>
        </form>
</main>
</body>
</html>

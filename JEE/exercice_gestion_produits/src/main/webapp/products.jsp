<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 13/06/2024
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Produits</title>
    <%@include file="WEB-INF/bootstrap.html"%>
</head>
<body>
    <h1>Liste des produits</h1>
<main>
    <form action="post" method="products">
        <div class="container">
            <div>
                <label for="brand">Marque : </label>
                <input type="text" name="brand" id="brand">
            </div>
            <div>
                <label for="reference">Référence : </label>
                <input type="text" name="reference" id="reference">
            </div>
            <div>
                <label for="purchase">Date d'achat : </label>
                <input type="text" name="purchase" id="purchase">
            </div>
            <div>
                <label for="price">Prix : </label>
                <input type="number" name="price" id="price">
            </div>
            <div>
                <label for="stock">Stock : </label>
                <input type="number" name="stock" id="stock">
            </div>
        </div>
    </form>
</main>
</body>
</html>

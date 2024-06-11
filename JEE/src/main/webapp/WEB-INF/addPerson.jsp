
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="mode" scope="request" type="java.lang.String"/>
<html>
<head>
    <title>Title</title>
    <%@include file="bootstrap.min.css.html"%>
</head>
<body class="container">
    <form method="post" action="formservlet">
        <div>
            <label for="firstname">Prénom</label>
            <input type="text" name="firstname" id="firstname">
        </div>
        <div>
            <label for="lastname">Nom</label>
            <input type="text" name="lastname" id="lastname">
        </div>
        <div>
            <label for="age">Âge</label>
            <input type="number" name="age" id="age" min="0" max="100">
        </div>
        <% if (mode.equals("modif")){ %>
            <button>Modifier</button>
        <%} else { %>
            <button>Ajouter</button>
        <% }    %>

    </form>
</body>
</html>

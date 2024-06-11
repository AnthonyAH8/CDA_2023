<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2024
  Time: 09:49
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="prenom" type="java.lang.String" scope="request"/>
<jsp:useBean id="prenoms" type="java.util.ArrayList<java.lang.String>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mes variables</title>
    <%@include file="WEB-INF/bootstrap.min.css.html"%>
</head>
<body>
    <h1>Affichage des noms</h1>

<%--    Expression Language EL--%>
<%--<p>Bonjour, ${prenom}</p>--%>

<%--    usebeans--%>
<%--<p>Bonjour, ${prenom.toUpperCase()}</p>--%>

<%--    Scriplet JSP--%>
    <% for (String p : prenoms){ %>
        <p> Bonjour <%= p %> ${nom} </p>
    <%  } %>
    <p><%= new Date() %> </p>

</body>
</html>

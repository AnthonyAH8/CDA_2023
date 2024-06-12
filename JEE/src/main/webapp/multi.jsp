<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 12/06/2024
  Time: 09:09
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="prenoms" type="java.lang.String" scope="request"/>
<jsp:useBean id="pathInfo" type="java.lang.String"  scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="./WEB-INF/bootstrap.min.css.html"%>
</head>
<body>
    <h1>Multi-Routes</h1>
    <p>Le pathInfo est <%= pathInfo%></p>
    <p>Le prénom est <%= prenoms %></p>
</body>
</html>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/style.css">
<%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">--%>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>
<a href="page1">Page 1</a>
<br/>
<a href="page2">Page 2</a>
<br/>
<a href="page3">Page 3</a>
<br/>
<a href="page4">Page 4</a>
<br/>
<a href="page5">Page 5</a>
<br>
<a href="variableservlet">Variable</a>
</body>
</html>
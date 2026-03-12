<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Lista de libros</title>
</head>
<body>
<h2>Lista de libros</h2>
<ul>
    <% 
        List<String> libros = (List<String>) request.getAttribute("libros");
        for(String libro : libros) { 
    %>
        <li><%= libro %></li>
    <% } %>
</ul>
</body>
</html>
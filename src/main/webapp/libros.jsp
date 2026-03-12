<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Listado de libros</h2>

<table border="1">
<tr>
    <th>Título</th>
    <th>Autor</th>
    <th>Disponible</th>
    <th>Acción</th>
</tr>

<c:forEach var="l" items="${libros}">
<tr>
    <td>${l.titulo}</td>
    <td>${l.autor}</td>
    <td>${l.disponible}</td>
    <td>
        <c:if test="${l.disponible}">
            <form action="PrestamoServlet" method="post">
                <input type="hidden" name="libroId" value="${l.id}">
                <button type="submit">Prestar</button>
            </form>
        </c:if>
    </td>
</tr>
</c:forEach>

</table>

</body>
</html>
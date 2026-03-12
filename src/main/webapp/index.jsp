<%@ taglib uri="jakarta.tags.core" prefix="c" %>


<html>
<body>
<h2>Login Biblioteca Digital</h2>

<form action="LoginServlet" method="post">
    Usuario: <input type="text" name="email"><br><br>
    Clave: <input type="password" name="password"><br><br>
    <button type="submit">Ingresar</button>
</form>

<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>

</body>
</html>
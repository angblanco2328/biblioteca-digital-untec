Biblioteca Digital UNTEC
Aplicación web desarrollada en Java que permite gestionar una biblioteca digital: administración de libros, usuarios y préstamos. El proyecto utiliza Servlets, JSP, Maven, Tomcat y MariaDB, siguiendo una arquitectura MVC simple y clara.

---

 Tecnologías utilizadas

- **Java 17**
- **Maven**
- **Apache Tomcat 10/11**
- **Jakarta EE 10 (Servlets y JSP)**
- **MariaDB**
- **JDBC**
- **HTML, CSS y Bootstrap**

---

 Arquitectura del proyecto

El proyecto sigue una estructura MVC:

- **Modelo** — Clases Java que representan entidades (Libro, Usuario, Préstamo).
- **Controladores** — Servlets que manejan la lógica de negocio.
- **Vista** — JSP para la interfaz web.
- **Persistencia** — Conexión a MariaDB mediante JDBC.

Estructura principal:
Base de datos

El proyecto utiliza **MariaDB**.  
Incluye tablas para:

- `usuarios`
- `libros`
- `prestamos`

Cada tabla está diseñada para soportar operaciones CRUD y relaciones básicas.

---

Funcionalidades principales

- Registro e inicio de sesión de usuarios.
- Gestión completa de libros (crear, listar, editar, eliminar).
- Gestión de préstamos.
- Interfaz web con JSP y Bootstrap.
- Conexión estable a MariaDB mediante JDBC.
- Validaciones básicas en formularios.

---


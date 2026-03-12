package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.*; // Para usar List

@WebServlet("/LibroServlet")
public class LibroServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Crear lista de libros de ejemplo
        List<String> listaLibros = new ArrayList<>();
        listaLibros.add("Cien años de soledad");
        listaLibros.add("Don Quijote de la Mancha");
        listaLibros.add("La sombra del viento");

        // Enviar la lista al JSP
        request.setAttribute("libros", listaLibros);

        // Redirigir a listaLibros.jsp
        request.getRequestDispatcher("listaLibros.jsp").forward(request, response);
    }
}
package controller;

import dao.PrestamoDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class PrestamoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int libroId = Integer.parseInt(req.getParameter("libroId"));
        int usuarioId = ((model.Usuario) req.getSession().getAttribute("usuario")).getId();

        PrestamoDAO dao = new PrestamoDAO();
        dao.registrarPrestamo(usuarioId, libroId);

        resp.sendRedirect("LibroServlet");
    }
}
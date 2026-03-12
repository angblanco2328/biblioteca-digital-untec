package controller;

import dao.UsuarioDAO;
import model.Usuario;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String email = req.getParameter("email");
        String pass = req.getParameter("password");

        System.out.println("EMAIL RECIBIDO: " + email);
        System.out.println("PASSWORD RECIBIDO: " + pass);

        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.login(email, pass);

        if (u != null) {

            HttpSession session = req.getSession();
            session.setAttribute("usuario", u);

            resp.sendRedirect("home.jsp");

        } else {

            req.setAttribute("error", "Credenciales incorrectas");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}
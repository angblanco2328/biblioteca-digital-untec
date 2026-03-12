package dao;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    public Usuario login(String email, String password) {

        try {

            System.out.println("DAO RECIBIÓ EMAIL: [" + email + "]");
            System.out.println("DAO RECIBIÓ PASS: [" + password + "]");

            Connection conn = Conexion.getConexion();

            // 🔎 PRUEBA: mostrar todos los usuarios de la BD
            PreparedStatement psTest = conn.prepareStatement(
                    "SELECT * FROM usuario"
            );

            ResultSet rsTest = psTest.executeQuery();

            while (rsTest.next()) {
                System.out.println("USUARIO BD: "
                        + rsTest.getString("email") + " "
                        + rsTest.getString("password"));
            }

            // consulta normal del login
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM usuario WHERE email=? AND password=?"
            );

            ps.setString(1, email.trim());
            ps.setString(2, password.trim());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Usuario(
                        rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("password")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
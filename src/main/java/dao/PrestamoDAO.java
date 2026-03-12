package dao;

import model.Prestamo;
import java.sql.*;
import java.util.*;

public class PrestamoDAO {

    public void registrarPrestamo(int usuarioId, int libroId) {
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO prestamo(usuario_id, libro_id, fecha) VALUES (?, ?, CURDATE())"
            );
            ps.setInt(1, usuarioId);
            ps.setInt(2, libroId);
            ps.executeUpdate();

            PreparedStatement ps2 = conn.prepareStatement(
                "UPDATE libro SET disponible=FALSE WHERE id=?"
            );
            ps2.setInt(1, libroId);
            ps2.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
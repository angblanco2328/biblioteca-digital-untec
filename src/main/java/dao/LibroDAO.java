package dao;

import model.Libro;
import java.sql.*;
import java.util.*;

public class LibroDAO {

    public List<Libro> listar() {
        List<Libro> lista = new ArrayList<>();
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM libro");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Libro(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getBoolean("disponible")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
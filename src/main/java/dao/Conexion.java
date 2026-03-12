package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	private static Connection conn = null;

	private static final String URL = "jdbc:mariadb://localhost:3306/biblioteca_untec";
	private static final String USER = "biblioteca";
	private static final String PASS = "1234";

	private Conexion() {}

	public static Connection getConexion() {
	    try {
	        if (conn == null) {
	            Class.forName("org.mariadb.jdbc.Driver");
	            conn = DriverManager.getConnection(URL, USER, PASS);
	            System.out.println("CONEXION EXITOSA A LA BD");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
}
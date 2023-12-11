package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Conexion() {
        // Constructor
    }

    public static Connection EstablecerConexion() {

        String url = "jdbc:mysql://localhost:3306/odontodomm?useSSL=false&serverTimezone=UTC";
        String usuario = "root"; 
        String contraseña = "conexion123"; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            return DriverManager.getConnection(url, usuario, contraseña);

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); 
            return null;
        }
    }
}


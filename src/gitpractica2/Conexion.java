/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gitpractica2;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conect() {
        Connection con;
        String url = "jdbc:mysql://localhost:3306/bdregistronotas";
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "";

        con = null;
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if (con != null) {
//                System.out.println("CONECTADO");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se conectó porque: " + e);
        }
        return con;
    }

}

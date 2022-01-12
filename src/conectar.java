//importar librerias

import java.sql.*;
import javax.swing.*;

//creacion de clase
public class conectar {

    Connection conect = null;

    /*
    solicitamos la conexion con la base de datos, 
    si ocurre algun error este se le indica al usuario
     */
    public Connection conexion() {
        try {
            //Cargamos el Driver MySQL
            Class.forName("com.mysql.jdbc.Driver");            
            conect = DriverManager.getConnection("jdbc:mysql://localhost/bdrestaurante", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e);
        }
        return conect;
    }
}

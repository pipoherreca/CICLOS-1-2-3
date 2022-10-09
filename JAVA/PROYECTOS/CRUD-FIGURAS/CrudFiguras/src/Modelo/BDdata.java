
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDdata {
    //Mysql puerto 3306  MariaDB 3307
    private final String URL = "jdbc:mysql://localhost:3307/bdfiguras";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String USER = "root";
    private final String PASS = "";    
    
    //creamos una funci�n que retorne la conexi�n
    public Connection conexionBD() throws SQLException {
        Connection conexion = null;
        try {
           Class.forName(DRIVER).newInstance();
           conexion = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | IllegalAccessException | 
                 InstantiationException | SQLException e) {
           throw new SQLException (e.getMessage());
        }
        return conexion;
    }

    public String getURL() {
        return URL;
    }

    public String getDRIVER() {
        return DRIVER;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASS() {
        return PASS;
    }
    
    
}

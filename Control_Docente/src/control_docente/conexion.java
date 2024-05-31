
package control_docente;
import java.sql.*;
import javax.swing.JOptionPane;


public class conexion {
    Connection conectar=null;
    public Connection conectar(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_Control_Ingreso","root","");
            JOptionPane.showMessageDialog(null,"Conexión Exitosa", "Conexión", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Conexión Faliida"+ e, "Conexión", JOptionPane.ERROR_MESSAGE);
        }
        return conectar;
    }
    
}

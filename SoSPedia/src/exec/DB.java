
package exec;

import java.sql.*;
import javax.swing.JOptionPane;

public class DB {
    
    String url ="d:/sql/aplicacion.sqlite";
    
    Connection connect;
    
    
    public void connect () {
        
        try {
            
            connect = DriverManager.getConnection("jdbc:sqlite:"+url);
            if (connect!=null){
                
                JOptionPane.showMessageDialog(null,"Te has conectado correctamente a la base de datos");
                
            }
            
        } catch (SQLException ex){
            
            JOptionPane.showMessageDialog(null,"No se ha podido conectar a la base de datos");
            
        }
        
    }
    
    public void close (){
        
        try {
            
            connect.close();
            
            JOptionPane.showMessageDialog(null,"Te has desconectado correctamente de la base de datos");
            
        } catch (SQLException ex){
            
            JOptionPane.showMessageDialog(null,"No se ha desconectado correctamente de la base de datos");
            
        }
        
    }
    
    
}

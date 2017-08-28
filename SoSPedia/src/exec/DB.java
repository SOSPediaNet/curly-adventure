
package exec;

import java.sql.*;

public class DB {
    
    String url ="/home/superlewis/Documents/NetBeansProjects/SoSPedia/aplicacion.sqlite";
    
    Connection connect;
    
    
    public void connect () {
        
        try {
            
            connect = DriverManager.getConnection("jdbc:sqlite:"+url);
            if (connect!=null){
                System.out.println("Conectado");
            }
            
        } catch (SQLException ex){
            
            System.out.println("No se ha podido conectar");
            
        }
        
    }
    
    public void close (){
        
        try {
            
            connect.close();
            
        } catch (SQLException ex){
            
            System.out.println("No se ha cerrado correctamente");
            
        }
        
    }
    
    
}

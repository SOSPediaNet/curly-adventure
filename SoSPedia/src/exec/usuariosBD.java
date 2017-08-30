
package exec;

import java.sql.*;

public class usuariosBD extends DB{
    
    public int alta(usuarios u) {
        
        String cadenaSQL="INSERT INTO usuarios VALUES(NULL,'"+u.getServicio()+"','"+u.getUsuario()+"','"+u.getPass()+"')";
        
        try {
            
            PreparedStatement st = connect.prepareStatement(cadenaSQL);
            
	} catch (SQLException ex) {
            
            System.err.println(ex.getMessage());
            
        }
        
        return -1;
        
    }

   
   
   public int baixa(int id) {
       
     String cadenaSQL="DELETE FROM usuarios WHERE id="+id;
     
     try {
         
            PreparedStatement st = connect.prepareStatement(cadenaSQL);
        
	} catch (SQLException ex) {
	
            System.err.println(ex.getMessage());
     }
     
        return -1;
     
   }
   
   public int modificacio(usuarios u) {
       
    String cadenaSQL="UPDATE usuarios SET servicio='"+u.getServicio()+
		  "', usuario='"+u.getUsuario()
  		+ "' WHERE pass="+u.getPass();
    //JOptionPane.showMessageDialog(null,cadenaSQL);
    
    try {
        
            PreparedStatement st = connect.prepareStatement(cadenaSQL);
        
	} catch (SQLException ex) {
            
            System.err.println(ex.getMessage());
        
	
	}
    
        return -1;
    
   }
    
}

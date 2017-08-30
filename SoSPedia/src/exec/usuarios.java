
package exec;


public class usuarios {
    
    private int id;
    
    private String servicio, usuario, pass;
    
    public void setId (int id){
        
        this.id=id;
        
    }
    
    public int getId () {
    
    return id;
    
    }
    
    public void setServicio (String servicio) {
        
        this.servicio=servicio;
        
    }
    
    public String getServicio () {
        
        return servicio;
        
    }
    
    public void setUsuario (String usuario) {
        
        this.usuario=usuario;
        
    }
    
    public String getUsuario () {
        
        return usuario;
        
    }
    
    public void setPass (String pass) {
        
        this.pass=pass;
          
    }
    
    public String getPass () {
        
        return pass;
        
    }
    
}

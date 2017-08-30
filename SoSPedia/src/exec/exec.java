
package exec;

public class exec {

    public static void main(String[] args) {
       
        DB base = new DB();
        
        base.connect();
        
        base.close();
        
    }
    
}

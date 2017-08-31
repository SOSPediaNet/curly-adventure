
package exec;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class window extends JFrame{
    
    private windowusers paneluser;
    private JLabel ltitulo;
    private Font gran=new Font("Arial",1,32);
    private Font normal=new Font("Arial",1,20);
    

    public window (){
        
        this.setTitle("Gestión de usuarios");
        this.initGraficos();
        
    }
 
    public void initGraficos(){
        
        this.setLayout(new FlowLayout());
        this.setLocation(200,200);
        ltitulo=new JLabel("Gestión de Usuarios");
        ltitulo.setFont(gran);
        this.add(ltitulo);
        paneluser = new windowusers();
        this.add(paneluser);
        this.setSize(1000,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}


package exec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class windowlogin extends JPanel{
    
    private usuarios u=null;
    private usuariosBD ubd=null;
    private Font gran=new Font("Arial",1,32);
    private Font normal=new Font("Arial",1,20);
    private JLabel ltitol, lservicio, lusuario, lpass;
    private JPanel panel1, panel2, panel3;
    private JTextField tservicio, tusuario, tpass;
    private JButton botonlogin;
    private int files=0;
    
        class EscucharBoton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            
            if(event.getActionCommand().equals("Login")) {
                
                ubd.connect();
                u = new usuarios();
                u.setServicio(tservicio.getText());
                u.setUsuario(tusuario.getText());
                u.setPass(tpass.getText());
                files = ubd.alta(u);
                
                    if(files==1) {
                        
                        JOptionPane.showMessageDialog(null,"Logeado con éxito");
                        
                    } else {
                        
                        JOptionPane.showMessageDialog(null,"Imposible logear");
                        
                    }
                    
                    ubd.close();
 
            }
        }
    }
    
    public windowlogin (){
        
        this.initDades();
        this.initGrafics();
        
    }
    
        public void initDades (){
        
        ubd = new usuariosBD();
        
    }
    
    public void initGrafics(){
        
        this.setLayout(new BorderLayout());
        this.setLocation (200,200);
        ltitol = new JLabel("  ");
        ltitol.setFont(gran);
        initPanel1();
        initPanel2();
        initPanel3();
        this.add(ltitol, BorderLayout.NORTH);
        this.add(panel1, BorderLayout.WEST);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);
        
    }
    
    public void initPanel1(){
        
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(6,1));
        lservicio =new JLabel("Servicio:  ");lservicio.setFont(normal);
        lusuario = new JLabel("Usuario  ");lusuario.setFont(normal);
        lpass = new JLabel("Pass:  ");lpass.setFont(normal);
        
        panel1.add(lservicio);panel1.add(new JLabel(""));
        panel1.add(lusuario);panel1.add(new JLabel(""));
        panel1.add(lpass);panel1.add(new JLabel(""));
        
    }
    
    public void initPanel2(){
        
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(6,1));
        tservicio= new JTextField(5);tservicio.setFont(normal);
        tusuario = new JTextField(25);tusuario.setFont(normal);
        tpass = new JTextField(25);tpass.setFont(normal);
        
        panel2.add(tservicio);panel2.add(new JLabel(""));
        panel2.add(tusuario);panel2.add(new JLabel(""));
        panel2.add(tpass);panel2.add(new JLabel(""));
        
    }
    
    public void initPanel3(){
        
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        botonlogin = new JButton("Login");botonlogin.setFont(normal);
        botonlogin.addActionListener(new windowlogin.EscucharBoton());
        panel3.add(botonlogin);
        
    }
        
}

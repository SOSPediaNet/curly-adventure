
package exec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class windowusers extends JPanel{
    
    private usuarios u=null;
    private usuariosBD ubd=null;
    private Font gran=new Font("Arial",1,32);
    private Font normal=new Font("Arial",1,20);
    private JLabel ltitol, lid, lservicio, lusuario, lpass;
    private JPanel panel1, panel2, panel3;
    private JTextField tid, tservicio, tusuario, tpass;
    private JButton botonalta, botonbaja, botonmodificar;
    
    
    public windowusers (){
        
        this.initDades();
        this.initGrafics();
        
    }
    
    public void initDades (){
        
        ubd = new usuariosBD();
        
    }
    
    public void initGrafics(){
        
        this.setLayout(new BorderLayout());
        this.setLocation (200,200);
        ltitol = new JLabel("Administración de Usuarios");
        ltitol.setFont(gran);
        this.add(ltitol, BorderLayout.NORTH);
        this.add(panel1,BorderLayout.WEST);
        this.add(panel2,BorderLayout.CENTER);
        this.add(panel3,BorderLayout.SOUTH);
        
    }
    
    public void initPanel1(){
        
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(8,1));
        lid =new JLabel("Id: ");lid.setFont(normal);
        lservicio =new JLabel("Servicio:  ");lservicio.setFont(normal);
        lusuario = new JLabel("Usuario  ");lusuario.setFont(normal);
        lpass = new JLabel("Pass:  ");lpass.setFont(normal);
        
        panel1.add(lid);panel1.add(new JLabel(""));
        panel1.add(lservicio);panel1.add(new JLabel(""));
        panel1.add(lusuario);panel1.add(new JLabel(""));
        panel1.add(lpass);panel1.add(new JLabel(""));
        
    }
    
    public void initPanel2(){
        
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(8,1));
        tid= new JTextField(5);tid.setFont(normal);
        tservicio = new JTextField(25);tid.setFont(normal);
        tusuario = new JTextField(25);tusuario.setFont(normal);
        tpass = new JTextField(25);tpass.setFont(normal);
        
        panel2.add(tid);panel2.add(new JLabel(""));
        panel2.add(tservicio);panel2.add(new JLabel(""));
        panel2.add(tusuario);panel2.add(new JLabel(""));
        panel2.add(tpass);panel2.add(new JLabel(""));
        
    }
    
    public void initPanel3(){
        
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        botonalta = new JButton("Alta");botonalta.setFont(normal);
        //botonalta.addActionListener(new EscucharBoton());
        panel3.add(botonalta);
        botonbaja = new JButton("Baja");botonbaja.setFont(normal);
        //botonbaja.addActionListener(new EscucharBoton());
        panel3.add(botonbaja);
        botonmodificar = new JButton("Modificar");botonmodificar.setFont(normal);
        //botonmodificar.addActionListener(new EscucharBoton());
        panel3.add(botonmodificar);
        
    }
    
}

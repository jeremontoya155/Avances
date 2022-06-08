
package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class testDos {
    public static void main(String[] args) {
        
        Marcos m1=new Marcos();
        
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        m1.setVisible(true);
        
    }
    
}

class Marcos extends JFrame{

    public Marcos(){
    
        Toolkit pantalla=Toolkit.getDefaultToolkit();
        Dimension dim=pantalla.getScreenSize();
        
        setBounds((dim.width/4),(dim.height/4),(dim.width/2),(dim.height/2));
        
        
        
       
        
        Image icono=pantalla.getImage("icono.jpg");
        
        setIconImage(icono);
        
        setTitle("Aplicacion con interaccion de color");
        
    
        Paneles p=new Paneles();
        
         p.setBackground(Color.PINK);
         
         p.setForeground(Color.GRAY);
        
        add(p);
        
       
        
        
    }
    


}


class Paneles extends JPanel{

    
    public void paintComponent(Graphics g){
    
    
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g ;
        
        
        //Sintaxis
        //Font nombreFuente =new Font("nombre",Font.constante,tamaño)
        
        Font miFuente=new Font("Arial",Font.BOLD,26);
        
        g2.setFont(miFuente);
        
        g2.drawString("Juan", 100, 100);
        
    }



}

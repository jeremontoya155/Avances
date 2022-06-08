
package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class testUno {
    public static void main(String[] args) {
        
        Marco m1=new Marco();
        
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        m1.setVisible(true);
        
    }
    
}

class Marco extends JFrame{

    public Marco(){
    
        Toolkit pantalla=Toolkit.getDefaultToolkit();
        Dimension dim=pantalla.getScreenSize();
        
        setBounds((dim.width/4),(dim.height/4),(dim.width/2),(dim.height/2));
        
        
        
       
        
        Image icono=pantalla.getImage("icono.jpg");
        
        setIconImage(icono);
        
        setTitle("Aplicacion con interaccion de color");
        
    
        Panel p=new Panel();
        
         p.setBackground(Color.PINK);
        
        add(p);
        
       
        
        
    }
    


}


class Panel extends JPanel{

    
    public void paintComponent(Graphics g){
    
    
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g ;
        
        Rectangle2D r=new Rectangle2D.Double(50,50,150,100);
                
        g2.setPaint(Color.RED);
        
        g2.fill(r);
        g2.setPaint(Color.BLACK);
        
        Ellipse2D e1=new Ellipse2D.Double();
        
        g2.setPaint(Color.BLUE);
        
        
        e1.setFrame(r);
        g2.fill(e1);
        g2.setPaint(Color.BLACK);

        g2.draw(r);
        g2.draw(e1);
        
    }



}

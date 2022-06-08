
package test.incluyendo_imagenes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class testUno {
    
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
        
        
        
       
        
        
        
        setTitle("Aplicacion con imagenes");
        
    
        Paneles p=new Paneles();
        
       
        
        add(p);
        
       
        
        
    }
    


}


class Paneles extends JPanel{

    private Image imagen;
    
    public void paintComponent(Graphics g){
    
    
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g ;
      
        File f=new File("icono.jpg");
        try {
            imagen = ImageIO.read(f);
            
        } catch (IOException ex) {
            
            System.out.println("Error en la busqueda de la imagen ");
        }
     
        g.drawImage(imagen, 100, 100,null);
        
        
    }


    
}

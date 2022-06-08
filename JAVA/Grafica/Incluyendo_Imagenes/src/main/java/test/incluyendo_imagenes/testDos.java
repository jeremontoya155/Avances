
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


public class testDos {
    
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
        
        //setSize(300,200);
        //setLocation(500,500);
        
        
       
        
        
        
        setTitle("Aplicacion con imagenes");
        
    
        Panel p=new Panel();
        
       
        
        add(p);
        
       
        
        
    }
    


}


class Panel extends JPanel{

    private Image imagen;
    
    public void paintComponent(Graphics g){
    
    
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g ;
      
        File f=new File("iconoDos.jpg");
        try {
            imagen = ImageIO.read(f);
            
        } catch (IOException ex) {
            
            System.out.println("Error en la busqueda de la imagen ");
        }
     
        
        
        int anchoImagen=imagen.getWidth(this);
        int altoImagen=imagen.getHeight(this);
        
        g.drawImage(imagen, 0, 0,null);
        
        //Sintaxis
        //g.copyArea(inicioX,inicioY,ancho,alto,destinoX,destinoY);
        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 200; j++) {
                g.copyArea(100,100,anchoImagen,altoImagen,anchoImagen*i,altoImagen*j);
                //Piense que hace el recorrido recto y luego hace el recorruido de todo a lo
                //Largo siguiendo el i 
                
            }
        }
        

        
        
    }


    
}

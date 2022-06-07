
package test.aplicacionesgraficas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EscribiendoEnMarcoDos {
    public static void main(String[] args) {
        
        
        marcoEscrituras m1=new marcoEscrituras();
        
        m1.setVisible(true);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
        
        
    }
}

class marcoEscrituras extends JFrame{


    marcoEscrituras(){
    
       Toolkit pantalla=Toolkit.getDefaultToolkit();
       Dimension dim=pantalla.getScreenSize();
       
       setBounds((dim.width/4),(dim.height/4),(dim.width/2),(dim.height/2));
       
       setTitle("Notas");
       
       Image icono=pantalla.getImage("icono.jpg");
       
       setIconImage(icono);
       
       
       laminas panel=new laminas();
       
       add(panel);
               
       
        
    }    
    
}


//Con el archivo ya creado como en casos anteriores 
//Formamos un panel 
//En el debemos crear un paint component
class laminas extends JPanel{

    public void paintComponent(Graphics g){
        
        //LLamamos primero al super para que escriba sobre el mismo componente 
        super.paintComponent(g);
        
        //Podemos dibujar lineas con los parametros que indiquemos
        
        //La sintaxis
       //drawRect(x,y,width,height)
        //g.drawRect(50,50, 120,120);
    
        //Dibujar linea
        
        //g.drawLine(100, 100, 120, 200);
        //ESTAS USADAS IGUAL SE MANTIENEN DESCATULIZADO
        
        
        //Primero entonces para este caso vamos a hacer un ejemplo del tipo Graphics 2d
        
        Graphics2D g2=(Graphics2D) g;
        
        //Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
        
            //Luego solo tenemos que dibujarlo
            
            //g2.draw(rectangulo);
            
            //Ellipse2D elipse=new Ellipse2D.Double();
            //Le enviamos el espacio en donde va a estar ubicada 
            //elipse.setFrame(rectangulo);
            
            //g2.draw(elipse);
            
            //Lo ultimo conforma el hacer una linea, la manera es la mas directa posible en la cual basta con 
            //Enviar un en el mismo draw la linea 
        
            ///g2.draw(new Line2D.Double(100,200,300,500));
            
            Rectangle2D c1= new Rectangle2D.Double(50,50,100,100);
            
            Ellipse2D e1= new Ellipse2D.Double();
            
            e1.setFrame(c1);
            
            //Ahora si quisieramos que un circulo lo englobe
            //Tomamos primero el eje
            
            double cx=c1.getCenterX();
            double cy=c1.getCenterY();
            double radio=100;
            
            Ellipse2D circ1=new Ellipse2D.Double();
            //Ahora cuando construyo le envio la ubicacion 
            
            circ1.setFrame(cx,cy,cx+radio,cy+radio);
            
            
            g2.draw(circ1);
            g2.draw(c1);
            g2.draw(e1);
            g2.draw(new Line2D.Double(50,50,100,100));
            
            
            
    }


}

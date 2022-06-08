
package test.aplicacionesgraficas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EscribiendoEnMarco {
    public static void main(String[] args) {
        
        
        marcoEscritura m1=new marcoEscritura();
        
        m1.setVisible(true);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
        
        
    }
}

class marcoEscritura extends JFrame{


    marcoEscritura(){
    
       Toolkit pantalla=Toolkit.getDefaultToolkit();
       Dimension dim=pantalla.getScreenSize();
       
       setBounds((dim.width/4),(dim.height/4),(dim.width/2),(dim.height/2));
       
       setTitle("Notas");
       
       Image icono=pantalla.getImage("icono.jpg");
       
       setIconImage(icono);
       
       
       lamina panel=new lamina();
       
       add(panel);
               
       
        
    }    
    
}


//Con el archivo ya creado como en casos anteriores 
//Formamos un panel 
//En el debemos crear un paint component
class lamina extends JPanel{

    public void paintComponent(Graphics g){
        
        //LLamamos primero al super para que escriba sobre el mismo componente 
        super.paintComponent(g);
        
        //g.drawString(TOOL_TIP_TEXT_KEY, WIDTH, WIDTH);
        g.drawString("Texto de notas", 100, 100);
    
    }


}

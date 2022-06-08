
package test.aplicacionesgraficas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class testDos {
    
    public static void main(String[] args) {
        
        
        miMarcoDos marco=new miMarcoDos();
        
        
        marco.setVisible(true);
        
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        
        
        
    }
    
    
    
    
    
    
}

class miMarcoDos extends  JFrame{
    
    
    public miMarcoDos(){
        
//Generamos una seccion de toolkits

            
        //setSize(550,400);
        
        //setLocation(500,300);
        
        //setTitle("Feliz cumple bicho");
        
        Toolkit miPantalla= Toolkit.getDefaultToolkit();
        
        Dimension dim=miPantalla.getScreenSize();
        
        //Teniendo esto podemos enviarle la locacion para que se genere en el centro y que ocupe un cuarto
        
        setSize((dim.width/2),(dim.height/2));
        
        setLocation((dim.width/4),(dim.height/4));

        setTitle("El bicho");
        
        //Para cambiar el icono tengo que seguir usando el toolkit
        
        Image icono= miPantalla.getImage("icono.jpg");
        //Recibe icono como gif jpg y png 
        
        setIconImage(icono);
        
    
    }
    
    

}

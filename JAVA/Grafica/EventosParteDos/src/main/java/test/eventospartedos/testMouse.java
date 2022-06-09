package test.eventospartedos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class testMouse {
    public static void main(String[] args) {
        
                Marcos m=new Marcos();
                m.setVisible(true);
                m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
                
    }
}

class Marcos extends JFrame{
    
    Toolkit pantalla = Toolkit.getDefaultToolkit();
    
    Dimension dim=pantalla.getScreenSize();
    
    public Marcos(){

            
        setBounds((dim.width/4),(dim.height/4),(dim.width/2),(dim.height/2));

        Panel p=new Panel();
        p.setBackground(Color.PINK);
        
        add(p);
        
        //Creamos el evento y lo agregamos 
        EventoRaton evento=new EventoRaton();
        
        
        addMouseListener(evento);
        
        
}
    

    

}


class Aux implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


class EventoRaton extends MouseAdapter{

  //  @Override
 //   public void mouseClicked(MouseEvent e) {
        
//        System.out.println("Haz  hecho un click");
        
        //Podemos encontrar el lugar en donde hicimos el click
//        System.out.println("x:"+e.getX());
//        System.out.println("y:"+e.getY());
        
        //Podemos contar tambien los click
        
//        System.out.println("Click"+e.getClickCount());

      //  System.out.println(e.getModifiersEx());
   // }
   
//      @Override
//    public void mouseEntered(MouseEvent e) {
//          System.out.println("Paso el mouse por aca");
//    }
    
        @Override
    public void mousePressed(MouseEvent e) {
        
           // System.out.println(e.getModifiersEx());
            
            //Vemos 1024 click izquierdo
            //4096 click derecho
            //2048 rueda
           
            if (e.getModifiersEx()==1024) {
                
                System.out.println("Click izquierdo");
            } else if(e.getModifiersEx()==4096) {
                System.out.println("Click derecho");
            }else{
                System.out.println("rueda");
            }
         
            
    }

    
}


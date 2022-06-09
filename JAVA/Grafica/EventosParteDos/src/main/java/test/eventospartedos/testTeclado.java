package test.eventospartedos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class testTeclado {
    public static void main(String[] args) {
        
                Marco m=new Marco();
                m.setVisible(true);
                m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
                
    }
}

class Marco extends JFrame{
    
    Toolkit pantalla = Toolkit.getDefaultToolkit();
    
    Dimension dim=pantalla.getScreenSize();
    
    public Marco(){

            
        setBounds((dim.width/4),(dim.height/4),(dim.width/2),(dim.height/2));

        Panel p=new Panel();
        p.setBackground(Color.PINK);
        
        add(p);
        
        //Creamos el evento y lo agregamos 
        //EventoTeclado evento=new EventoTeclado();
        prueba evento=new prueba();
        
        addKeyListener(evento);
        
        
}
    

    

}

class Panel extends JPanel{

    
    
    

}

class EventoTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        //Si queremos ver en especifico la letra que escribio
        char caracter=e.getKeyChar();
        System.out.print(caracter);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Sintaxis int nombreAScci=evento.getKeyCode();
        
        int codigo=e.getKeyCode();
        System.out.print("");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.print("");
    }
}


class prueba extends KeyAdapter{

    @Override
    public void keyTyped(KeyEvent e){
        
        char tecla=e.getKeyChar();
        System.out.print(tecla);
    
    }

}

package test.eventosdeventana;




import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class testDos {
    
        public static void main(String[] args) {
        
        Marcos m1=new Marcos();
        
        Marcos m2=new Marcos();
        
        m2.setVisible(true);
        
        //Esta instruccion nos indica que cuando se cierra una se cierran ambas y no es la idea 
        m2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m2.setTitle("Aplicacion Dos");
        m2.setLocation(200, 500);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        m1.setVisible(true);
        
        double pickle=2;
        int jar=(int) pickle;
        
        
    }
    
}

class Marcos extends JFrame{

    public Marcos(){
    
        Toolkit pantalla=Toolkit.getDefaultToolkit();
        Dimension dim=pantalla.getScreenSize();
        
        setBounds((dim.width/4),(dim.height/4),(dim.width/2),(dim.height/2));
        
        
        setTitle("Aplicacion con eventos");
        
    
        Paneles p=new Paneles();
        
        p.setBackground(Color.PINK);
       
        M_Ventanas marcoVentana=new M_Ventanas();
        
        addWindowListener(marcoVentana);
        
        add(p);
        
       
        
        
    }
    


}


class Paneles extends JPanel{

    
}

class M_Ventanas extends WindowAdapter{

 

    //Minimizar la ventana 
    @Override
    public void windowIconified(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Se minimizo");
    }

    //Maximizar la ventana
    @Override
    public void windowDeiconified(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Se maximizo");
    }

  
        

}






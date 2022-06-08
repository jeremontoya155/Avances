
package test.eventos;




import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class testUno {
    
        public static void main(String[] args) {
        
        Marcos m1=new Marcos();
        
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
        
        
        
       
        
        
        
        setTitle("Aplicacion con imagenes");
        
    
        Paneles p=new Paneles();
        
        p.setBackground(Color.PINK);
       
        
        add(p);
        
       
        
        
    }
    


}


class Paneles extends JPanel implements ActionListener{

    //Creamos primero el boton correspondiente 
    
    //Sintaxis
    //JButton nombreBoton=new JButton("nombre Visialuzacion");
    
    JButton btnAzul=new JButton("Azul");
    JButton btnRojo=new JButton("Rojo");
    JButton btnAmarillo=new JButton("Amarillo");
    
    //Hacemos creacion del constructor 
    
    public Paneles(){
        
        add(btnAzul);
        add(btnRojo);
        add(btnAmarillo);
        
        btnAzul.addActionListener(this);

        btnRojo.addActionListener(this);
        btnAmarillo.addActionListener(this);    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //objetc nombreReceptor=e.getSource();
        //Nos da el boton que esta interaccionando en este momento
        Object btnPulsado=e.getSource();
        
        if (btnPulsado==btnAzul) {
            this.setBackground(Color.BLUE);
            
        }else if(btnPulsado==btnRojo) {
        
            this.setBackground(Color.RED);
        }
        else {
            this.setBackground(Color.YELLOW);
        }
        
        
    }
    
   

    
}





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


public class testDos {
    
        public static void main(String[] args) {
        
        Marco m1=new Marco();
        
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        m1.setVisible(true);
        
        double pickle=2;
        int jar=(int) pickle;
        
        
    }
    
}

class Marco extends JFrame{

    public Marco(){
    
        Toolkit pantalla=Toolkit.getDefaultToolkit();
        Dimension dim=pantalla.getScreenSize();
        
        setBounds((dim.width/4),(dim.height/4),(dim.width/2),(dim.height/2));
        
        
        
       
        
        
        
        setTitle("Aplicacion con imagenes");
        
    
        Panel p=new Panel();
        
        p.setBackground(Color.PINK);
       
        
        add(p);
        
       
        
        
    }
    


}


class Panel extends JPanel{

    //Creamos primero el boton correspondiente 
    
    //Sintaxis
    //JButton nombreBoton=new JButton("nombre Visialuzacion");
    
    JButton btnAzul=new JButton("Azul");
    JButton btnRojo=new JButton("Rojo");
    JButton btnAmarillo=new JButton("Amarillo");
    JButton btnVerde=new JButton("Verde");
    JButton btnRosa=new JButton("Rosa");
    
    //Hacemos creacion del constructor 
    
    public Panel(){
        
        add(btnAzul);
        add(btnRojo);
        add(btnAmarillo);
        add(btnRosa);
        add(btnVerde);
        
        ColorFondo Am=new ColorFondo(Color.YELLOW);
        ColorFondo Az=new ColorFondo(Color.BLUE);
        ColorFondo Ro=new ColorFondo(Color.RED);        
        ColorFondo Rosa=new ColorFondo(Color.PINK);        
        ColorFondo Ver=new ColorFondo(Color.GREEN);        
        btnAzul.addActionListener(Az);
        btnRosa.addActionListener(Rosa);
        btnVerde.addActionListener(Ver);
        btnRojo.addActionListener(Ro);
        btnAmarillo.addActionListener(Am);    }


    
   
    private class ColorFondo implements ActionListener{

    private Color colorDeFondo;
    public ColorFondo(Color c){
    
        colorDeFondo=c;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        setBackground(colorDeFondo);
        
    }


    }
    
}






package test.eventosdefoci;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testFocoUno {
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
        
       
        
        
}
    

    
    
    
    

}

class Panel extends JPanel{
    //Declaro como campos los jTextField a los que leugo quiza acceda
    
    private JTextField cuadroUno;
    private JTextField cuadroDos;


    public void paintComponent(Graphics g){
        
        
        
        super.paintComponent(g);
        //Tenemos que invalidar primero el Layout para que no lo ponga por defecto como 
        //hace el posicionamiento java 
        
        setLayout(null);
        
        //Seguiriamos creando dos areas de texto
        
        cuadroUno=new JTextField();
        cuadroDos=new JTextField();
        
        
        //Luego debemos enviarle las ubicaciones 
        
        //(x,y,ancho,alto)
        cuadroUno.setBounds(50,50,150,30);
        cuadroDos.setBounds(50,100,150,30);
        
        LanzaFoco foco=new LanzaFoco();
        
        cuadroUno.addFocusListener(foco);
        
        
        add(cuadroUno);
        
        add(cuadroDos);
    
    }

    
    class LanzaFoco extends FocusAdapter{
    
    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("Gano el foco");
    }
    
    @Override
    public void focusLost(FocusEvent e) {
        //Este metodo nos permite que podemos traer el contenido que encontramos en un cuadro de texto
        String retorno=cuadroUno.getText();
    
        boolean comprobacion=false;
        
        for (int i = 0; i <retorno.length(); i++) {
            if (retorno.contains("@")) {
                
                comprobacion=true;
                
            }
        }
        
        if (comprobacion) {
            
            JOptionPane.showMessageDialog(null,"Email Correcto");
        }else{
        
            JOptionPane.showMessageDialog(null,"Email Incorrecto");
        }
    }
    


}
    
    
    
}

class aux implements FocusListener{

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


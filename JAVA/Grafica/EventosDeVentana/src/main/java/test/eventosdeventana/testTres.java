
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
import java.awt.event.WindowStateListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class testTres {
    
        public static void main(String[] args) {
        
        MarcoEstado m1=new MarcoEstado();
        
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

class MarcoEstado extends JFrame{

    public MarcoEstado(){
    
        Toolkit pantalla=Toolkit.getDefaultToolkit();
        Dimension dim=pantalla.getScreenSize();
        
        setBounds((dim.width/4),(dim.height/4),(dim.width/2),(dim.height/2));
        
        
        setTitle("Aplicacion con eventos");
        
    
      
        
     
        M_VentanaEstado marcoVentana=new M_VentanaEstado();
        
        //Cambiamos el metodo por un StateListener
        addWindowStateListener(marcoVentana);
        
        //Podemos usar los metodos anteriores para ver cada accion que se realize sobre la ventana 
        
        //getNewState tenemos para que tome los casos de minimizado maximizado etc
        //En la constante de api podemos ver todos los estados como 
        //valores finales
        
      
  
        
       
        
        
    }
    


}




class M_VentanaEstado implements WindowStateListener{

    
    
    //Recibe el objeto que va a tener su determinado cambio de estado
    
    @Override
    public void windowStateChanged(WindowEvent e) {
        

        
        
           
    
            //Puedo jugar cone sto veo que 
            //0 es estado clasico
            //1  minimizada
            //6 estado completo
            //Si en vez de comparar el numero quisira ver como comparar 
            //usaria getNewState==Frame.Constante
            if (e.getNewState()==6) {

                
                        JOptionPane.showMessageDialog(null, "Cambio de estado ocurrio");
        }
    }

 

   
  
        

}






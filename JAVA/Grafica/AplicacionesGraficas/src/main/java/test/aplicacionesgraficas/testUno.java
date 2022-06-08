
package test.aplicacionesgraficas;

import javax.swing.JFrame;


public class testUno {
    
    public static void main(String[] args) {
        
        
        miMarco marco=new miMarco();
        
        //Le damos visibilidad 
        
        marco.setVisible(true);
        
        
        //Le damos la opcion de cierre
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Si cambiaramos el exit on close por un hide on close es lo que deberiamos 
        //Hacer para ocultar en el caso de tener varias ventanas abiertas al mismo tiempo 
        
        
        
        
    }
    
    
    
    
    
    
}

class miMarco extends  JFrame{
    
    
    public miMarco(){
        
        //setSize(500,400);
    
        //Cambiar la ubicacion
        //Maneja el x y 
        //NO ES ESTE EL EJE DE LA PANTALLA
        //setLocation(0,0);
        
        //setLocation(500,300);
        
        //Puedeo usar el setBound y olvuidarnos de ambas
    
        
   //     setBounds(500,320,250,250);
    
        //setResizable(false);
        
        //Para que se genere en tamaño completo
        
        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setSize(550,400);
        setLocation(500,300);
        
        setTitle("Feliz cumple bicho");
        
    
    }
    
    

}

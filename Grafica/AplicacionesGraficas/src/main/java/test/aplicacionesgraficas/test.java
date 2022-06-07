
package test.aplicacionesgraficas;

import javax.swing.JFrame;

public class test {

    public static void main(String[] args) {
        
        //Instanciamos el marco
        
        marcos m1=new marcos();
        
        //Lo hacemos visible 
        m1.setVisible(true);
        
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}


class marcos extends JFrame{
    
    //Hacemos su constructor 
    
    public marcos(){
    
        //Enviamos el tamaño teniendo en cuenta el alto y ancho
        setSize(1000,300);
        
        
        
    }
    
}
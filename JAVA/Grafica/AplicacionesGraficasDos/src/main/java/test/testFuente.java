
package test;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;


public class testFuente {
    public static void main(String[] args) {
        
        String fuente=JOptionPane.showInputDialog("Ingrese la fuente que quiere buscar");
        
        String[] nombreFuente =GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        for (String f: nombreFuente) {
            
            if (f.equals(fuente)) {
                
                JOptionPane.showMessageDialog(null, "Si se encuentra la fuente:"+fuente);
                
            }
            
        }
        
        
    }
}

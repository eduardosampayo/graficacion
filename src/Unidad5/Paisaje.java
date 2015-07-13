
package Unidad5;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class Paisaje extends JPanel {
    
    private ImageIcon fondo; 
    
    public Paisaje() {
        setSize(950,712);
        setLocation(0,0);
        fondo = new ImageIcon(getClass().getResource("../img/fondoJuego.jpg" ) );                    
    }
       
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
    }

    int gety() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}

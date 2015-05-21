
package Unidad2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class TituloEduardo extends JPanel {
    
    public TituloEduardo() {
        setBackground(Color.DARK_GRAY);
        setLocation(0, 0); //ubicacion del panel
        setSize(820, 660); //tamaño del panel       
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);        
    }       
}



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
        setSize(820, 660);
        setLocation(0, 0);
        setBackground(Color.DARK_GRAY);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);        
    }       
}


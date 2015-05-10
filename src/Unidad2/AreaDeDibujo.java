
package Unidad2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class AreaDeDibujo extends JPanel {
    
    public AreaDeDibujo() {
        setSize(500, 400);
        setLocation(20, 20);
        setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //lineas en el eje de las x's
        for (int x=10; x<=390; x=x+10) {
            g.setColor(Color.BLUE);
            g.drawLine(10, x, 490, x);
        }
        
        //lineas en el eje de las y's        
        for (int y=10; y<=490; y=y+10) {
            g.setColor(Color.BLUE);
            g.drawLine(y, 10, y, 390); 
        }         
    }    
         
}


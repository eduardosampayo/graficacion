
package Unidad2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class PanelEduardo extends JPanel {
    
    public PanelEduardo() {
        setBackground(Color.WHITE);
        setLocation(10, 40);
        setSize(1213, 610);
        setLayout(null);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics g2d = (Graphics2D) g;
        
        g2d.setColor(Color.GRAY);       
        //dibujar la cuadricula
        for(int i = 0; i<=1210; i+=10){
            g2d.drawLine(0,i,1210,i);//lineas horizontales
            g2d.drawLine(i,0,i,610);//lineas verticales            
        }
    }
}

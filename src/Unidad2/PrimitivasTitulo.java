
package Unidad2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class PrimitivasTitulo extends JPanel {
    
    public PrimitivasTitulo() {
        setBackground(Color.LIGHT_GRAY);
        setLocation(0, 0); //ubicacion del panel
        setSize(820, 660); //tamaño del panel       
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics g2d = (Graphics2D)g;
        
        Font mifuente = new Font("Segoe UI", Font.PLAIN, 15); //fuente creada
        g2d.setFont(mifuente); //parametro pasado a setFont
        g2d.setColor(Color.white);
        g.drawString("Eduardo Sampayo Santiago", 10, 30); 
    }       
}


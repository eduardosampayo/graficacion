
package Unidad3;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class ActividadesJPanel extends JPanel { 
    
    public ActividadesJPanel() {
        setBackground(new Color(0x87CEEB));
        setLocation(10, 10);
        setSize(1165, 200);
        setLayout(null);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        /*============================================================
            actividad degradados
          ============================================================*/        
        // dibuja un elipse en 2D, relleno con un gradiente color verde-rojo
        g2d.setPaint( new GradientPaint( 30, 180, Color.green, 180, 30,
        Color.red, true ) );
        g2d.fill( new Rectangle2D.Double( 30, 30, 150, 150 ) );
        
        // dibuja un elipse en 2D, relleno con un gradiente color amarillo-rojo
        g2d.setPaint( new GradientPaint( 210, 30, Color.yellow, 360, 180,
        Color.red, true ) );
        g2d.fill( new Rectangle2D.Double( 210, 30, 150, 150 ) );
        
        // dibuja un elipse en 2D, relleno con un gradiente color verde-blanco
        g2d.setPaint( new GradientPaint( 465, 30, Color.green, 465, 180,
        Color.white, true ) );
        g2d.fill( new Rectangle2D.Double( 390, 30, 150, 150 ) );
        
        // dibuja un elipse en 2D, relleno con un gradiente color azul-magneta
        g2d.setPaint( new GradientPaint( 570, 105, Color.blue, 720,  105,
        Color.magenta, true ) );
        g2d.fill( new Rectangle2D.Double( 570, 30, 150, 150 ) );
        
        
        /*============================================================
            actividad patron de textura
          ============================================================*/
        
    }
    
    
}

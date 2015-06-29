
package Unidad4;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class Act_RellenosJPanel extends JPanel { 
    
    public Act_RellenosJPanel() {
        setBackground(new Color(0xF08080));
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
        Font fuente = new Font("Seoge UI", Font.ITALIC, 17);
        g2d.setFont(fuente);
        g2d.setColor(new Color(0x330019));
        g2d.drawString("Rellenos degradados", 300, 15);        
        
        // dibuja un rectangulo en 2D, relleno con un gradiente color verde-rojo
        g2d.setPaint( new GradientPaint( 30, 180, Color.green, 180, 30,
        Color.red, true ) );
        g2d.fill( new Rectangle2D.Double( 30, 30, 150, 150 ) );
        
        // dibuja un rectangulo en 2D, relleno con un gradiente color amarillo-rojo
        g2d.setPaint( new GradientPaint( 210, 30, Color.yellow, 360, 180,
        Color.red, true ) );
        g2d.fill( new Rectangle2D.Double( 210, 30, 150, 150 ) );
        
        // dibuja un rectangulo en 2D, relleno con un gradiente color verde-blanco
        g2d.setPaint( new GradientPaint( 465, 30, Color.green, 465, 180,
        Color.white, true ) );
        g2d.fill( new Rectangle2D.Double( 390, 30, 150, 150 ) );
        
        // dibuja un rectangulo en 2D, relleno con un gradiente color azul-magneta
        g2d.setPaint( new GradientPaint( 570, 105, Color.blue, 720,  105,
        Color.magenta, true ) );
        g2d.fill( new Rectangle2D.Double( 570, 30, 150, 150 ) );
        
        
        /*============================================================
            actividad patron de textura
          ============================================================*/
        g2d.setColor(new Color(0x330019));
        g2d.drawString("Rellenos con patron", 870, 15);
        
        BufferedImage imgbufer = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
        Graphics2D ip = imgbufer.createGraphics();
        
        ip.setColor(new Color(0x5F9EA0)); //color de fondo
        ip.fillRect(0, 0, 50, 50); //rectangulo relleno a cada 50x50
        ip.setColor(Color.black);
        ip.drawRect(2, 2, 44, 44); //rectangulo dentro del relleno
        
        // puntos poligono relleno
        int prx[]={24,17,24};
        int pry[]={24,12,2};
        // puntos poligono 
        int pvx[]={24,31,24};
        int pvy[]={24,12,2};
        
        for (int i = 0; i <= 4; i++) {
            ip.setColor(new Color(0xD2691E));
            ip.fillPolygon(prx, pry, 3);
            ip.setColor(new Color(0x9400D3));
            ip.drawPolygon(pvx, pvy, 3);
            ip.rotate(Math.toRadians(90), 24, 24);
        }
        
        g2d.setPaint(new TexturePaint(imgbufer, new Rectangle(50, 50)));
        g2d.fillOval(800, 30, 300, 150);        
    }   
    
}

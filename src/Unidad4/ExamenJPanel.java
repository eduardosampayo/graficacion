
package Unidad4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class ExamenJPanel extends JPanel {
    
    public ExamenJPanel() {
        setBackground(new Color(0xF08080));
        setLocation(10, 10);
        setSize(1165, 480);
        setLayout(null);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        /*============================================================
            logo BMW
          ============================================================*/
        g2d.setColor(Color.blue);
        g2d.fillOval(40, 40, 320, 320);
        g2d.setColor(Color.black);
        g2d.fillOval(50, 50, 300, 300);
        g2d.setColor(Color.lightGray);
        g2d.fillOval(100, 100, 200, 200);
        g2d.setColor(Color.blue);
        g2d.fillArc(100, 100, 200, 200, 90, 90);
        g2d.fillArc(100, 100, 200, 200, 270, 90);
        
        Font fuente = new Font("Seoge UI", Font.PLAIN, 60);
        g2d.setFont(fuente);
        g2d.setColor(Color.white);
        g2d.rotate(Math.toRadians(-30),200,200); //rotar
        g2d.drawString("B", 175, 100);
        g2d.rotate(Math.toRadians(30),200,200); //rotar
        g2d.drawString("M", 175, 100);
        g2d.rotate(Math.toRadians(30),200,200); //rotar
        g2d.drawString("W", 175, 100);
        g2d.rotate(Math.toRadians(-30),200,200); //rotar
        
        /*============================================================
            logo BMW
          ============================================================*/
        g2d.setColor(Color.lightGray);
        g2d.setStroke(new BasicStroke(15)); //grosor de linea
        g2d.drawOval(400, 40, 200, 200);
        g2d.drawOval(550, 40, 200, 200);
        g2d.drawOval(700, 40, 200, 200);
        g2d.drawOval(850, 40, 200, 200);
        
        Font fuente2 = new Font("Seoge UI", Font.PLAIN, 80);
        g2d.setFont(fuente2);
        g2d.setColor(Color.white);
        g2d.drawString("Audi", 600, 350);
    }
}

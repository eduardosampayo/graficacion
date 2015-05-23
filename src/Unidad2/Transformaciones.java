
package Unidad2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class Transformaciones extends JPanel{
    public Transformaciones() {
        setBackground(Color.WHITE);
        setLocation(50, 40);
        setSize(500, 500);
        setLayout(null);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;       
        
        g2d.setColor(Color.GRAY);       
        //dibujar la cuadricula
        for(int i = 0; i<=500; i+=50){
            g2d.drawLine(0,i,500,i);//lineas horizontales
            g2d.drawLine(i,0,i,500);//lineas verticales            
        }
        
        g2d.setColor(new Color(255,0,0));
        g2d.setStroke(new BasicStroke(3)); //grosor de linea
//        g2d.drawLine(100, 100, 300, 100); //linea antes de rotar        
//        g2d.rotate(Math.toRadians(-45),100,100); //rotar 45 grados con paramaetros de centro
//        g2d.drawLine(100, 100, 300, 100);
        
//        g2d.drawRect(150, 200, 100, 100); //cuadro 
//        g2d.rotate(Math.toRadians(30),200,250); // rotar sobre el centro
//        g2d.drawRect(150, 200, 100, 100); //cuadro rotado
        
//        g2d.setColor(Color.blue);
//        g2d.drawRect(200, 200, 100, 100); //cuadro original
//        g2d.translate(150, 150); //trasladar
//        g2d.drawRect(200, 200, 100, 100); //cuadro rotado
        
        g2d.drawRect(50, 50, 100, 100); //cuadro original
        g2d.rotate(Math.toRadians(30),150,150); //rotar
        g2d.translate(-50, -50); //trasladar
        g2d.scale(2, 2); //scalacion            
        g2d.drawRect(50, 50, 100, 100); //cuadro escalado
    }
}

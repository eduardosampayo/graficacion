//En un area de dibujo de 500X500 (JPanel), dibujar mediante lineas una cuadricula con cuadros
//de 10X10 unidades,
package Unidad2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
public class Cuadricula extends JPanel{
    public Cuadricula() {
        setBackground(Color.WHITE);
        setLocation(50, 40);
        setSize(500, 500);
        setLayout(null);
    }    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;  
        
        
        /*============================================================
            cuadricula para poder trabajar sobre las coordenadas
          ============================================================*/        
        g2d.setColor(Color.GRAY); //color de lineas       
        for(int i = 0; i<=500; i+=50){
            g2d.drawLine(0,i,500,i);//lineas horizontales
            g2d.drawLine(i,0,i,500);//lineas verticales            
        }   
        
        
        /*============================================================
            ejemplos de figuras geometricas
          ============================================================*/                    
//        g2d.setColor(Color.BLACK);
//        g2d.drawLine(50, 150, 100, 250);
//            
//        g2d.setColor(Color.CYAN);
//        g2d.drawLine(250, 250, 400, 100);
//            
//        g2d.setColor(Color.BLUE);            
//        g2d.drawLine(150, 300, 250, 300);
//        g2d.drawLine(250, 300, 250, 400);
//        g2d.drawLine(150, 400, 250, 400);
//        g2d.drawLine(150, 300, 150, 400);
        
//        g2d.setColor(Color.BLACK);
//        g2d.setStroke(new BasicStroke(1.0f));
////        g2d.draw3DRect(150, 100, 200, 200, true);        
//        g2d.fillRect(150, 100, 200, 200);
//        
//        g2d.setColor(Color.BLUE);

////        g2d.draw3DRect(200, 150, 100, 100, true);
//        g2d.fillRect(200, 150, 100, 100);
                
//        g2d.clearRect(155, 155, 200, 100); 
        
//        g2d.setColor(Color.BLUE);
//        g2d.fillRoundRect(50, 200, 200, 150, 50, 50);
//        
//        g2d.setColor(Color.BLACK);
//        g2d.fillRoundRect(300, 250, 200, 200, 200, 200);        
        
//        g2d.setColor(Color.BLACK);
//        g2d.fillOval(250, 250, 100, 100);
//        
//        g2d.setColor(Color.GREEN);
//        g2d.fillOval(150, 250, 100, 100);  
//        
//        g2d.setColor(Color.BLUE);
//        g2d.fillOval(200, 200, 100, 100);
        
//        g2d.setColor(Color.YELLOW);
//        g2d.fillArc(150, 150, 200, 200, 45, 270);
//        
//        g2d.setColor(Color.BLACK);
//        g2d.fillArc(50, 300, 150, 150, 180, 180);
        
//        int puntosX[] = {250,450,50};
//        int puntosY[] = {50,450,450};
//        g2d.fillPolygon(puntosX, puntosY, 3);
        
        
        /*============================================================
            ejemplos de transformaciones
          ============================================================*/
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
        
//        g2d.drawRect(50, 50, 100, 100); //cuadro original
//        g2d.rotate(Math.toRadians(30),150,150); //rotar
//        g2d.translate(-50, -50); //trasladar
//        g2d.scale(2, 2); //scalacion            
//        g2d.drawRect(50, 50, 100, 100); //cuadro escalado

    }    
}

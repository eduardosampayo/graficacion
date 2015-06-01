
package Unidad2;

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
public class Transformaciones extends JPanel {
    
    public Transformaciones() { //constructor
        setBackground(Color.white); //color de fondo
        setLocation(50, 40); //posicion de del panel
        setSize(500, 500); //tamaño del panel
        setLayout(null);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;       
        
        /*============================================================
            cuadricula para poder trabajar sobre las coordenadas
          ============================================================*/
        g2d.setColor(Color.gray); 
        for(int i = 0; i<=500; i+=50){
            g2d.drawLine(0,i,500,i);//lineas horizontales
            g2d.drawLine(i,0,i,500);//lineas verticales            
        }
        
        /*============================================================
            dibujo del reloj
          ============================================================*/        
        g2d.setColor(new Color(255,0,0)); //color rgb
        g2d.setStroke(new BasicStroke(4)); //grosor de linea
        g2d.drawOval(50, 50, 400, 400); //circulo de reloj 
        
        g2d.setStroke(new BasicStroke(3)); 
        Font mifuente = new Font("Arial", Font.BOLD, 20); //fuente creada
        g2d.setFont(mifuente); //parametro pasado a setFont
        
        for(int i=12; i>=1; i--) {            
            g2d.drawLine(250, 50, 250, 65); //lineas indicadoras
            g.drawString("" + i , 245, 90); //numeros del reloj
            g2d.rotate(Math.toRadians(-30),250,250); //rotar
        } 
        
        g2d.fillOval(240, 240, 20, 20); //centro de manecillas  
        
        /*============================================================
            dibujo y movimiento de manecillas
          ============================================================*/ 
//        for (int m=0; m<60; m++) {
//            g2d.setStroke(new BasicStroke(5)); 
//            g2d.setColor(new Color(0,204,204));
//            g2d.drawLine(250, 250, 250, 120); //minutos
//            g2d.rotate(Math.toRadians(-6),250,250); //rotar
//            
//            for(int s=0; s<60; s++) {
//                g2d.setStroke(new BasicStroke(3));
//                g2d.setColor(new Color(255,102,102));
//                g2d.drawLine(250, 250, 250, 120); //segundos
//                g2d.rotate(Math.toRadians(-6),250,250); //rotar
//                
//            }
//        }
        
       
        
//        g2d.setStroke(new BasicStroke(8)); 
//        g2d.setColor(new Color(255,255,255));
//        g2d.drawLine(250, 250, 250, 150); //horas
//        g2d.setStroke(new BasicStroke(5)); 
//        g2d.setColor(new Color(0,204,204));
//        g2d.drawLine(250, 250, 250, 120); //minutos
//        g2d.setStroke(new BasicStroke(3));
//        g2d.setColor(new Color(255,102,102));
//        g2d.drawLine(250, 250, 250, 120); //segundos
        
    }
    
}

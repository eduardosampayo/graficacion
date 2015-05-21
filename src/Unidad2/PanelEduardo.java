
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
        setBackground(Color.WHITE); //color del panel
        setLocation(10, 40); //posicion del panel
        setSize(800, 610); //tamaño del panel
        setLayout(null);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics g2d = (Graphics2D) g;
                   
        /*============================================================
            cuadricula para poder trabajar sobre las coordenadas
          ============================================================*/
        //dibujar la cuadricula, cuadro pequeño a cada 19px
        g2d.setColor(Color.LIGHT_GRAY);
        for(int j = 0; j<=1210; j+=19){
            g2d.drawLine(0,j,1210,j); //lineas horizontales
            g2d.drawLine(j,0,j,610); //lineas verticales            
        }
        
        //dibujar la cuadricula, cuadro grande a cada 76px
        g2d.setColor(Color.BLUE);     
        for(int i = 0; i<=1210; i+=76){
            g2d.drawLine(0,i,1210,i); //lineas horizontales
            g2d.drawLine(i,0,i,610); //lineas verticales 
        }
        
        
        /*============================================================
            figuras geometricas rellenas
          ============================================================*/        
        g2d.setColor(Color.yellow);
        g2d.fillOval(76, 57, 76, 76); //sol      
                
        g2d.setColor(Color.BLACK);
        g2d.drawLine(304, 356, 800, 356); //linea base de casa, pinos y cesped
        
        g2d.setColor(Color.gray);
        g2d.fillRect(342, 294, 19, 62); //base de pino izquierdo
        g2d.fillRect(437, 294, 19, 62); //base de pino derecho
                
        g2d.setColor(Color.GREEN);
        int px1[]={323,380,352};
        int py1[]={294,294,143};
        g2d.fillPolygon(px1, py1, 3); //pino izquierdo
        
        int px2[]={418,475,447};
        int py2[]={294,294,143};
        g2d.fillPolygon(px2, py2, 3); //pino derecho        
        
        g2d.setColor(Color.yellow);
        g2d.fillRect(551, 228, 228, 128); //paredes de casa        
        g2d.setColor(Color.black);
        g2d.drawLine(627, 228, 627, 356); //pared que divide la casa        
        g2d.setColor(Color.gray);
        g2d.fillRect(573, 285, 33, 71); //puerta        
        g2d.setColor(Color.white);
        g2d.fillRect(655, 256, 95, 48); //ventana  
        g2d.setColor(Color.black);
        g2d.drawLine(655, 280, 750, 280); //linea vertical de ventana
        g2d.drawLine(702, 256, 702, 304); //linea horizontal de ventana        
        int ptx[]={551,779,665};
        int pty[]={228,228,143};
        g2d.setColor(Color.orange);
        g2d.fillPolygon(ptx, pty, 3); //techo de casa
                
        g2d.setColor(Color.pink);
        g2d.fillOval(57, 356, 47, 47); //cabeza del papa
        g2d.setColor(Color.white);
        g2d.fillOval(68, 370, 8, 8); //ojo izquierdo
        g2d.fillOval(86, 370, 8, 8); //ojo derecho
        g2d.setColor(Color.black);
        g2d.drawArc(67, 380, 27, 10, 180, 180); //boca
        g2d.setColor(Color.blue);
        g2d.fillRect(57, 409, 47, 78); //torso del papa
        g2d.fillRect(10, 409, 47, 16); //brazo izquierdo papa
        g2d.fillRect(104, 409, 47, 16); //brazo derecho papa
        g2d.fillRect(57, 487, 23, 70); //pierna izquierda papa
        g2d.fillRect(81, 487, 23, 70); //pierna derecha papa
        g2d.setColor(Color.black);
        g2d.fillOval(57, 557, 25, 22); //pie izquierdo papa
        g2d.fillOval(81, 557, 25, 22); //pie derecho papa
                
        g2d.setColor(Color.pink);
        g2d.fillOval(195, 383, 47, 43); //cabeza de la mama
        g2d.setColor(Color.white);
        g2d.fillOval(205, 396, 8, 8); //ojo izquierdo
        g2d.fillOval(223, 396, 8, 8); //ojo derecho
        g2d.setColor(Color.black);
        g2d.drawArc(205, 405, 27, 12, 180, 180); //boca
        g2d.setColor(Color.magenta);
        int pxm[]={218,265,171};
        int pym[]={426,532,532};
        g2d.fillPolygon(pxm, pym, 3); //torso mama
        g2d.setColor(Color.pink);
        g2d.fillRect(168, 437, 38, 16); //brazo izquierdo mama
        g2d.fillRect(229, 437, 38, 16); //brazo derecho mama
        g2d.fillRect(198, 533, 16, 25); //pierna izquierda mama
        g2d.fillRect(225, 533, 11, 25); //pierna derecha mama                
        g2d.setColor(Color.black);
        g2d.fillOval(188, 557, 25, 22); //pie izquierdo mama
        g2d.fillOval(218, 557, 25, 22); //pie derecho mama
        
//        g2d.setColor(new Color(180,255,180)); //establece colores rgb
//        Color bColor = Color.decode("FF0096"); //establece color hexadecimal
        g2d.setColor(new Color(0xFDFD06)); // otra manera de establecer color hexadecimal
        g2d.fillOval(315, 435, 38, 35); //cabeza de la niña
        g2d.setColor(Color.red);
        int pcx [] ={334,362,306};
        int pcy [] ={470,524,524};
        g2d.fillPolygon(pcx, pcy, 3); //torso niña
        g2d.setColor(Color.pink);
        g2d.setColor(Color.pink);
        g2d.fillRect(291, 477, 32, 12); //brazo izquierdo niña
        g2d.fillRect(345, 477, 32, 12); //brazo derecho niña
        int ppx [] ={306,362,334};
        int ppy [] ={524,524,566};
        g2d.fillPolygon(ppx, ppy, 3); //piernas niña
        

        
        
        /*============================================================
            perimetros de todas las figuras realizadas
          ============================================================*/
        g2d.setColor(Color.black);
        g2d.drawOval(76, 57, 76, 76); //sol        
        g2d.drawRect(342, 294, 19, 62); //base pino izquierdo
        g2d.drawRect(437, 294, 19, 62); //base pino derecho
        g2d.drawPolygon(px1, py1, 3); //pino izquierdo
        g2d.drawPolygon(px2, py2, 3); //pino derecho
        g2d.drawRect(551, 228, 228, 128); //casa
        g2d.drawRect(573, 285, 33, 71); //puerta
        g2d.drawRect(655, 256, 95, 48); //ventana
        g2d.drawPolygon(ptx, pty, 3); //techo de casa        
        g2d.drawOval(57, 356, 47, 47); //cabeza papa
        g2d.drawOval(68, 370, 8, 8); //ojo izquierdo del papa
        g2d.drawOval(86, 370, 8, 8); //ojo derecho del papa
        g2d.drawRect(57, 409, 47, 78); //torso papa
        g2d.drawRect(10, 409, 47, 16); //brazo izquierdo papa
        g2d.drawRect(104, 409, 47, 16); //brazo derecho papa
        g2d.drawRect(57, 487, 23, 70); //pierna izquierda papa       
        g2d.drawRect(81, 487, 23, 70); //pierna derecha papa       
        g2d.drawOval(57, 557, 25, 22); //pie izquierdo papa
        g2d.drawOval(81, 557, 25, 22); //pie derecho papa
        g2d.drawOval(195, 383, 47, 43); //cabeza de la mama
        g2d.drawOval(205, 396, 8, 8); //ojo izquierdo de la mama
        g2d.drawOval(223, 396, 8, 8); //ojo derecho de la mama
        g2d.drawPolygon(pxm, pym, 3); //torso mama
        g2d.drawRect(168, 437, 38, 16); //brazo izquierdo mama
        g2d.drawRect(229, 437, 38, 16); //brazo derecho mama
        g2d.drawRect(198, 533, 16, 25); //pierna izquierda mama 
        g2d.drawRect(225, 533, 11, 25); //pierna derecha mama
        g2d.drawOval(315, 435, 38, 35); //cabeza de la niña
        g2d.drawPolygon(pcx, pcy, 3); //torso niña
        g2d.drawRect(291, 477, 32, 12); //brazo izquierdo niña
        g2d.drawRect(345, 477, 32, 12); //brazo derecho niña
        g2d.drawPolygon(ppx, ppy, 3); //piernas niña
        g2d.drawLine(334, 524, 334, 566); //linea que divide las piernas
         
    }
}

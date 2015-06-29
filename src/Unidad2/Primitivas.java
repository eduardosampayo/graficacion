
package Unidad2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class Primitivas extends JPanel {
    
    public Primitivas() {
//        setBackground(Color.WHITE); //color del panel
        setLocation(10, 40); //posicion del panel
        setSize(800, 610); //tamaño del panel
        setLayout(null);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
                  
        /*============================================================
            cuadricula para poder trabajar sobre las coordenadas
          ============================================================*/
//        //dibujar la cuadricula, cuadro pequeño a cada 19px
//        g2d.setColor(Color.LIGHT_GRAY);
//        for(int j = 0; j<=1210; j+=19){
//            g2d.drawLine(0,j,1210,j); //lineas horizontales
//            g2d.drawLine(j,0,j,610); //lineas verticales            
//        }
//        
//        //dibujar la cuadricula, cuadro grande a cada 76px
//        g2d.setColor(Color.BLUE);     
//        for(int i = 0; i<=1210; i+=76){
//            g2d.drawLine(0,i,1210,i); //lineas horizontales
//            g2d.drawLine(i,0,i,610); //lineas verticales 
//        }
        
//        g2d.setColor(new Color(180,255,180)); //establece colores rgb
//        Color bColor = Color.decode("FF0096"); //establece color hexadecimal
//        g2d.setColor(new Color(0xFABE8F)); // tambien establece color hexadecimal
        
        /*============================================================
            figuras geometricas rellenas
          ============================================================*/        
        g2d.setColor(new Color(0xFDFD06));
        g2d.fillOval(76, 60, 76, 70); //sol 
        int prx[]={100,114,128};
        int pry[]={52,22,52};
               
        for(int i=0; i<=8; i++) {            
            g2d.fillPolygon(prx, pry, 3); //rayo de sol
            g2d.setColor(Color.black); //color del borde
            g2d.drawPolygon(prx, pry, 3); //borde de rayo
            g2d.rotate(Math.toRadians(45),114,95); //rotar los rayo
            g2d.setColor(new Color(0xFDFD06)); //color del rayo
        }        
               
        g2d.rotate(Math.toRadians(-45),114,95); //rotar toda las figuras
        
        g2d.setColor(new Color(0x8EC752));
        int ppnx6[]={24,34,44};
        int ppny6[]={358,334,358};        
        g2d.fillPolygon(ppnx6, ppny6, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx6, ppny6, 3); //cesped
        
        g2d.setColor(new Color(0x09A250));
        int ppnx7[]={0,10,20};
        int ppny7[]={346,322,346};        
        g2d.fillPolygon(ppnx7, ppny7, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx7, ppny7, 3); //cesped
        
        g2d.setColor(new Color(0x09A250));
        int ppnx8[]={40,50,60};
        int ppny8[]={346,322,346};        
        g2d.fillPolygon(ppnx8, ppny8, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx8, ppny8, 3); //cesped
        
         g2d.setColor(new Color(0x09A250));
        int ppnx9[]={70,80,90};
        int ppny9[]={346,322,346};        
        g2d.fillPolygon(ppnx9, ppny9, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx9, ppny9, 3); //cesped
        
        g2d.setColor(new Color(0x09A250));
        int ppnx10[]={100,110,120};
        int ppny10[]={346,322,346};        
        g2d.fillPolygon(ppnx10, ppny10, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx10, ppny10, 3); //cesped
        
        g2d.setColor(new Color(0x09A250));
        int ppnx11[]={145,155,165};
        int ppny11[]={346,322,346};        
        g2d.fillPolygon(ppnx11, ppny11, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx11, ppny11, 3); //cesped
        
        g2d.setColor(new Color(0x09A250));
        int ppnx12[]={185,195,205};
        int ppny12[]={346,322,346};        
        g2d.fillPolygon(ppnx12, ppny12, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx12, ppny12, 3); //cesped
        
        g2d.setColor(new Color(0x09A250));
        int ppnx13[]={225,235,245};
        int ppny13[]={346,322,346};        
        g2d.fillPolygon(ppnx13, ppny13, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx13, ppny13, 3); //cesped
        
        g2d.setColor(new Color(0x09A250));
        int ppnx14[]={265,275,285};
        int ppny14[]={346,322,346};        
        g2d.fillPolygon(ppnx14, ppny14, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx14, ppny14, 3); //cesped
                
        g2d.setColor(new Color(0x8EC752));
        int ppnx[]={284,294,304};
        int ppny[]={358,334,358};        
        g2d.fillPolygon(ppnx, ppny, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx, ppny, 3); //cesped
       
        g2d.setColor(new Color(0x8EC752));
        int ppnx2[]={244,254,264};
        int ppny2[]={358,334,358};        
        g2d.fillPolygon(ppnx2, ppny2, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx2, ppny2, 3); //cesped
        
        g2d.setColor(new Color(0x8EC752));
        int ppnx3[]={204,214,224};
        int ppny3[]={358,334,358};        
        g2d.fillPolygon(ppnx3, ppny3, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx3, ppny3, 3); //cesped
        
        g2d.setColor(new Color(0x8EC752));
        int ppnx4[]={164,174,184};
        int ppny4[]={358,334,358};        
        g2d.fillPolygon(ppnx4, ppny4, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx4, ppny4, 3); //cesped
        
        g2d.setColor(new Color(0x8EC752));
        int ppnx5[]={124,134,144};
        int ppny5[]={358,334,358};        
        g2d.fillPolygon(ppnx5, ppny5, 3); //cesped
        g2d.setColor(Color.black); //color del borde
        g2d.drawPolygon(ppnx5, ppny5, 3); //cesped        
       
        g2d.setColor(new Color(0x964804));
        g2d.fillRect(342, 294, 19, 62); //base de pino izquierdo
        g2d.fillRect(418, 294, 19, 62); //base de pino derecho
                
        g2d.setColor(new Color(0x8EC752));
        int px1[]={323,380,352};
        int py1[]={294,294,143};
        g2d.fillPolygon(px1, py1, 3); //pino izquierdo
        g2d.setColor(new Color(0x09A250));        
        int px2[]={399,456,428};
        int py2[]={294,294,143};
        g2d.fillPolygon(px2, py2, 3); //pino derecho        
        
        g2d.setColor(new Color(0xFABE8F));
        g2d.fillRect(551, 228, 228, 128); //paredes de casa                      
        g2d.setColor(new Color(0xD26815));
        g2d.fillRect(573, 285, 33, 71); //puerta        
        g2d.setColor(Color.white);
        g2d.fillRect(655, 256, 95, 48); //ventana               
        int ptx[]={551,779,665};
        int pty[]={228,228,143};
        g2d.setColor(new Color(0xD26815));
        g2d.fillPolygon(ptx, pty, 3); //techo de casa
                
        g2d.setColor(new Color(0xFABE8F));
        g2d.fillOval(57, 356, 47, 47); //cabeza del papa
        g2d.setColor(Color.white);
        g2d.fillOval(68, 370, 8, 8); //ojo izquierdo
        g2d.fillOval(86, 370, 8, 8); //ojo derecho      
        g2d.setColor(new Color(0x2A4D73));
        g2d.fillRect(57, 409, 47, 78); //torso del papa
        g2d.setColor(new Color(0x375E8C));
        g2d.fillRect(10, 409, 47, 16); //brazo izquierdo papa
        g2d.fillRect(104, 409, 47, 16); //brazo derecho papa
        g2d.setColor(new Color(0xB6B652));
        g2d.fillRect(57, 487, 23, 70); //pierna izquierda papa
        g2d.fillRect(81, 487, 23, 70); //pierna derecha papa
        g2d.setColor(Color.black);
        g2d.fillOval(57, 557, 25, 22); //pie izquierdo papa
        g2d.fillOval(81, 557, 25, 22); //pie derecho papa
                
        g2d.setColor(new Color(0xFABE8F));
        g2d.fillOval(195, 383, 47, 43); //cabeza de la mama
        g2d.setColor(Color.white);
        g2d.fillOval(205, 396, 8, 8); //ojo izquierdo
        g2d.fillOval(223, 396, 8, 8); //ojo derecho      
        g2d.setColor(new Color(0x62308A));
        int pxm[]={218,265,171};
        int pym[]={426,532,532};
        g2d.fillPolygon(pxm, pym, 3); //torso mama
        g2d.setColor(new Color(0xFABE8F));
        g2d.fillRect(168, 437, 38, 16); //brazo izquierdo mama
        g2d.fillRect(229, 437, 38, 16); //brazo derecho mama
        g2d.fillRect(198, 533, 16, 25); //pierna izquierda mama
        g2d.fillRect(225, 533, 11, 25); //pierna derecha mama                
        g2d.setColor(Color.black);
        g2d.fillOval(188, 557, 25, 22); //pie izquierdo mama
        g2d.fillOval(218, 557, 25, 22); //pie derecho mama
        
        g2d.setColor(new Color(0xFABE8F)); // color hexadecimal
        g2d.fillOval(315, 435, 38, 35); //cabeza de la niña
        g2d.setColor(Color.white);
        g2d.fillOval(325, 444, 6, 6); //ojo izquierdo niña
        g2d.fillOval(337, 444, 6, 6); //ojo derecho niña      
        g2d.setColor(new Color(0xEF0506));
        int pcx [] ={334,362,306};
        int pcy [] ={470,524,524};
        g2d.fillPolygon(pcx, pcy, 3); //torso niña
        g2d.setColor(new Color(0xFABE8F));
        g2d.fillRect(291, 477, 32, 12); //brazo izquierdo niña
        g2d.fillRect(345, 477, 32, 12); //brazo derecho niña
        int ppx [] ={308,359,334};
        int ppy [] ={524,524,566};
        g2d.fillPolygon(ppx, ppy, 3); //piernas niña
        g2d.setColor(Color.black);
        g2d.fillOval(316, 562, 18, 12); //pie izquierdo mama
        g2d.fillOval(335, 562, 18, 12); //pie derecho mama
        
        g2d.setColor(new Color(0x98A496));
        int pfx [] ={440,455,423};
        int pfy [] ={508,545,545};
        g2d.fillPolygon(pfx, pfy, 3); //cabeza firulais
        g2d.setColor(Color.black);
        g2d.drawPolygon(pfx, pfy, 3); //cabeza firulais
        g2d.setColor(Color.white);
        g2d.fillOval(430, 520, 7, 7); //ojo izquierdo firulais
        g2d.fillOval(437, 520, 7, 7); //ojo derecho firulais
        g2d.setColor(new Color(0x98A496));
        int pfoix [] ={427,437,417};
        int pfoiy [] ={509,517,517};
        g2d.fillPolygon(pfoix, pfoiy, 3); //oreja izquierda firulais
        int pfodx [] ={456,466,446};
        int pfody [] ={517,525,525};
        g2d.fillPolygon(pfodx, pfody, 3); //oreja derecha firulais
        g2d.fillRect(455, 545, 57, 29); //cuerpo firulais
        g2d.fillRect(455, 574, 8, 15); //pata izquierda firulais
        g2d.fillRect(504, 574, 8, 15); //pata derecha firulais
        int pfcx [] ={512,524,536};
        int pfcy [] ={560,545,560};
        g2d.fillPolygon(pfcx, pfcy, 3); //cola firulais
        
        g2d.setColor(new Color(0xFDFD06));
        g2d.fillOval(608, 465, 17, 12); //centro de flor
        g2d.setColor(Color.black);
        g2d.drawOval(608, 465, 17, 12); //centro de flor        
        g2d.setColor(new Color(0xFABE8F));
        g2d.fillOval(583, 449, 27, 24); //flore izquierda
        g2d.fillOval(591, 472, 27, 24); //flore izquierda
        g2d.fillOval(618, 472, 27, 24); //flore izquierda        
        g2d.setColor(Color.black);
        g2d.drawOval(618, 472, 27, 24); //flore izquierda
        g2d.setColor(new Color(0xFABE8F));
        g2d.fillOval(623, 454, 27, 24); //flore izquierda
        g2d.setColor(Color.black);
        g2d.drawOval(623, 454, 27, 24); //flore izquierda
        g2d.setColor(new Color(0xFABE8F));
        g2d.fillOval(609, 439, 27, 24); //flore izquierda        
        g2d.setColor(Color.black);
        g2d.drawOval(609, 439, 27, 24); //flore izquierda
        
        g2d.setColor(new Color(0xFABE8F));
        g2d.fillOval(685, 465, 17, 12); //centro de flor
        g2d.setColor(Color.black);
        g2d.drawOval(685, 465, 17, 12); //centro de flor        
        g2d.setColor(new Color(0xFDFD06));
        g2d.fillOval(660, 449, 27, 24); //flore derecha
        g2d.fillOval(668, 472, 27, 24); //flore derecha
        g2d.fillOval(695, 472, 27, 24); //flore derecha
        g2d.setColor(Color.black);
        g2d.drawOval(695, 472, 27, 24); //flore derecha
        g2d.setColor(new Color(0xFDFD06));
        g2d.fillOval(700, 454, 27, 24); //flore derecha
        g2d.setColor(Color.black);
        g2d.drawOval(700, 454, 27, 24); //flore derecha
        g2d.setColor(new Color(0xFDFD06));
        g2d.fillOval(686, 439, 27, 24); //flore derecha
        g2d.setColor(Color.black);
        g2d.drawOval(686, 439, 27, 24); //flore derecha   
        
        g2d.setColor(Color.black);
        g2d.drawLine(640, 496, 662, 560); //tallo izquierdo
        g2d.drawLine(690, 496, 670, 560); //tallo derecho
        
        g2d.setColor(new Color(0x8EC752));
        int ppfx [] ={656,666,676};
        int ppfy [] ={580,550,580};
        g2d.fillPolygon(ppfx, ppfy, 3); //cesped de flor
        
        g2d.setColor(new Color(0x809F73));
        int ppix [] ={640,651,662};
        int ppiy [] ={564,531,564};
        g2d.fillPolygon(ppix, ppiy, 3); //cesped de izquirdo      
               
        g2d.setColor(new Color(0x09A250));
        int ppdx [] ={671,682,693};
        int ppdy [] ={564,531,564};
        g2d.fillPolygon(ppdx, ppdy, 3); //cesped derecho
        
        g2d.setColor(new Color(0x6A8B4A));
        int ppsx [] ={616,626,636};
        int ppsy [] ={580,550,580};
        g2d.fillPolygon(ppsx, ppsy, 3); //cesped solo       
        
        
         
        /*============================================================
            perimetros de todas las figuras realizadas
          ============================================================*/
        g2d.setColor(Color.black);
        g2d.drawOval(76, 60, 76, 70); //sol    
        g2d.drawLine(304, 356, 800, 356); //linea base de casa, pinos y cesped
        g2d.drawRect(342, 294, 19, 62); //base pino izquierdo
        g2d.drawRect(418, 294, 19, 62); //base pino derecho
        g2d.drawPolygon(px1, py1, 3); //pino izquierdo
        g2d.drawPolygon(px2, py2, 3); //pino derecho
        g2d.drawRect(551, 228, 228, 128); //casa
        g2d.drawLine(627, 228, 627, 356); //pared que divide la casa
        g2d.drawRect(573, 285, 33, 71); //puerta
        g2d.drawRect(655, 256, 95, 48); //ventana
        g2d.drawLine(655, 280, 750, 280); //linea vertical de ventana
        g2d.drawLine(702, 256, 702, 304); //linea horizontal de ventana 
        g2d.drawPolygon(ptx, pty, 3); //techo de casa        
        g2d.drawOval(57, 356, 47, 47); //cabeza papa
        g2d.drawOval(68, 370, 8, 8); //ojo izquierdo del papa
        g2d.drawOval(86, 370, 8, 8); //ojo derecho del papa
        g2d.drawArc(67, 380, 27, 10, 180, 180); //boca
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
        g2d.drawArc(205, 405, 27, 12, 180, 180); //boca
        g2d.drawPolygon(pxm, pym, 3); //torso mama
        g2d.drawRect(168, 437, 38, 16); //brazo izquierdo mama
        g2d.drawRect(229, 437, 38, 16); //brazo derecho mama
        g2d.drawRect(198, 533, 16, 25); //pierna izquierda mama 
        g2d.drawRect(225, 533, 11, 25); //pierna derecha mama
        g2d.drawOval(315, 435, 38, 35); //cabeza de la niña
        g2d.drawOval(325, 444, 6, 6); //ojo izquierdo niña
        g2d.drawOval(337, 444, 6, 6); //ojo derecho niña
        g2d.drawArc(325, 451, 19, 10, 180, 180); //boca niña
        g2d.drawPolygon(pcx, pcy, 3); //torso niña
        g2d.drawRect(291, 477, 32, 12); //brazo izquierdo niña
        g2d.drawRect(345, 477, 32, 12); //brazo derecho niña
        g2d.drawPolygon(ppx, ppy, 3); //piernas niña
        g2d.drawLine(334, 524, 334, 566); //linea que divide las piernas        
        g2d.drawOval(430, 520, 7, 7); //ojo izquierdo firulais
        g2d.drawOval(437, 520, 7, 7); //ojo derecho firulais
        g2d.drawPolygon(pfoix, pfoiy, 3); //oreja izquierda firulais
        g2d.drawPolygon(pfodx, pfody, 3); //oreja derecha firulais
        g2d.drawRect(455, 545, 57, 29); //cuerpo firulais  
        g2d.drawRect(455, 574, 8, 15); //pata izquierda firulais
        g2d.drawRect(504, 574, 8, 15); //pata derecha firulais
        g2d.drawPolygon(pfcx, pfcy, 3); //cola firulais
        g2d.drawOval(583, 449, 27, 24); //flore izquierda
        g2d.drawOval(591, 472, 27, 24); //flore izquierda
        g2d.drawOval(660, 449, 27, 24); //flore derecha
        g2d.drawOval(668, 472, 27, 24); //flore derecha 
        g2d.drawPolygon(ppfx, ppfy, 3); //cesped de flor
        g2d.drawPolygon(ppix, ppiy, 3); //cesped de izquirdo
        g2d.drawPolygon(ppdx, ppdy, 3); //cesped derecho
        g2d.drawPolygon(ppsx, ppsy, 3); //cesped solo
    }
}

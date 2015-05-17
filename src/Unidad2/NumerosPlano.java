//Muestra la numeracion de la cuadricula
package Unidad2;

import java.awt.Graphics;
import javax.swing.JPanel;

public class NumerosPlano extends JPanel {
    public NumerosPlano() {
        //setBackground(Color.RED);
        setLocation(0,0);
        setSize(600, 600);        
    } //AQUI TODO LO NECESARIO PARA GRAFICAR
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for(int i = 45; i<=550; i+=50) {
            g.drawString("" + (i-45) , i, 30);//texto horizontal
            g.drawString("" + (i-45), 10, i+5);//texto vertical
        }
    }    
}

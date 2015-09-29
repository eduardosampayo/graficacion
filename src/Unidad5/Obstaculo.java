package Unidad5;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class Obstaculo extends JPanel {
    
    private ImageIcon fondo;
    
    public Obstaculo()
    {
        super();
        this.setOpaque(false);
        setSize(115, 150);
        setLocation(500, 500);
        fondo=new ImageIcon(getClass().getResource("../img/obstaculo.png"));
    }
    @Override
    public void paint (Graphics g)
    {
        super.paint(g);
        g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);  
    }
}

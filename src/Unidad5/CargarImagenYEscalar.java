
package Unidad5;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

/**
 *
 * @author Eduardo
 */
public class CargarImagenYEscalar extends JApplet {
    
    private Image imagen1; // crea un objeto Image
    private ImageIcon imagen2; // crea un objeto ImageIcon

    // carga la imagen cuando se carga el applet
    @Override
    public void init() {
    imagen1 = getImage( getDocumentBase(), "perfil.jpg" );
    imagen2 = new ImageIcon( "perfil.jpg" );
    } // fin del método init

    // muestra la imagen
    public void paint( Graphics g )
        {
    super.paint( g );

    g.drawImage( imagen1, 0, 0, this ); // dibuja la imagen original
    
    // dibuja la imagen para que se ajuste a la anchura y altura menos 120 píxeles
    g.drawImage( imagen1, 0, 120, getWidth(), getHeight() - 120, this );

    // dibuja un icono, usando su método paintIcon
    imagen2.paintIcon( this, g, 180, 0 );
    } // fin del método paint
} // fin de la clase CargarImagenYEscalar

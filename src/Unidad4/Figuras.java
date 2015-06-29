
package Unidad4;

import javax.swing.JFrame;

/**
 *
 * @author Eduardo
 */
public class Figuras {

    public static void main(String[] args) {
        
        // crea marco para objeto FigurasJPanel
        JFrame marco = new JFrame( "Dibujo de figuras en 2D" );
        marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 
        // crea objeto FigurasJPanel
        FigurasJpanel figurasJPanel = new FigurasJpanel();
 
        marco.add( figurasJPanel );  // agrega figurasJPanel to marco
        marco.setSize( 450, 200 ); // establece el tamaño del marco
        marco.setVisible( true ); // muestra el marco
    }
    
}

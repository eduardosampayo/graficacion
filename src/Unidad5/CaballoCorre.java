
package Unidad5;

import javax.swing.JFrame;

/**
 *
 * @author Eduardo
 */
public class CaballoCorre {
    
    // ejecuta la animación en un objeto JFrame   
    public static void main(String[] args) {
        
        CaballoCorreJPanel corre = new CaballoCorreJPanel();
//        CaballoSaltaJPanel corre = new CaballoSaltaJPanel();

        JFrame miVentana = new JFrame( "Animacion Caballo Corre" ); // establece la ventana
        miVentana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        miVentana.add( corre ); // agrega el panel al marco

        miVentana.pack(); // hace la ventana lo suficientemente grande para su GUI
        miVentana.setVisible( true ); // muestra la ventana

        corre.iniciarAnimacion(); // inicia la animación
    } // fin de main
} // fin de la clase AnimadorLogo

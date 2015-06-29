
package Unidad5;

import javax.swing.JFrame;

/**
 *
 * @author Eduardo
 */
public class AnimadorLogo {
    
    // ejecuta la animación en un objeto JFrame   
    public static void main(String[] args) {
        
        AnimadorLogoJPanel animacion = new AnimadorLogoJPanel();

        JFrame ventana = new JFrame( "Prueba de Animador" ); // establece la ventana
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ventana.add( animacion ); // agrega el panel al marco

        ventana.pack(); // hace la ventana lo suficientemente grande para su GUI
        ventana.setVisible( true ); // muestra la ventana

        animacion.iniciarAnimacion(); // inicia la animación
    } // fin de main
} // fin de la clase AnimadorLogo

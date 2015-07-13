package Unidad5;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Eduardo
 */
public class CaballoSalta extends JPanel {
    private final static String NOMBRE_IMAGEN = "Carrera"; // nombre de la imagen base
    protected ImageIcon imagenes[]; // arreglo de imágenes
    private final int TOTAL_IMAGENES = 5; // número de imágenes
    private int imagenActual = 0; // índice de la imagen actual
    private final int RETRASO_ANIMACION = 150; // retraso en milisegundos
    private int anchura; // anchura de la imagen
    private int altura; // altura de la imagen
    private Timer temporizadorAnimacion; // objeto Timer que controla la animación
    
    // el constructor inicializa el objeto CaballoSalta, cargando las imágenes
    public CaballoSalta() {
        imagenes = new ImageIcon[ TOTAL_IMAGENES ];
        // carga 5 imágenes
        for ( int cuenta = 0; cuenta < imagenes.length; cuenta++ )
        imagenes[ cuenta ] = new ImageIcon( getClass().getResource("../img/" + NOMBRE_IMAGEN + cuenta + ".png" ) );
        
        // este ejemplo supone que todas las imágenes tienen la misma anchura y altura
        anchura = imagenes[ 0 ].getIconWidth(); // obtiene la anchura del icono
        altura = imagenes[ 0 ].getIconHeight(); // obtiene la altura del icono
    } // fin del constructor de AnimadorLogoJPanel
    
    // muestra la imagen actual
    public void paintComponent( Graphics g ) {
        super.paintComponent( g ); // llama al método paintComponent de la superclase
        this.setOpaque(false);
        imagenes[ imagenActual ].paintIcon( this, g, 0, 0 );
        // establece la siguiente imagen a dibujar, sólo si el temporizador está funcionando
        if ( temporizadorAnimacion.isRunning() )
            imagenActual = ( imagenActual + 1 ) % TOTAL_IMAGENES;
    } // fin del método paintComponent
    
    // inicia la animación, o la reinicia si se vuelve a mostrar la ventana
    public void iniciarAnimacion() {
        if ( temporizadorAnimacion == null ) {
            imagenActual = 0; // muestra la primera imagen
            // crea temporizador
            temporizadorAnimacion = new Timer( RETRASO_ANIMACION, new ManejadorTimer() );
            temporizadorAnimacion.start(); // inicia el objeto Timer
        } // fin de if
        else {// temporizadorAnimacion ya existe; reinicia la animación
            if ( ! temporizadorAnimacion.isRunning() )
            temporizadorAnimacion.restart();
        } // fin de else
    } // fin del método iniciarAnimacion

    // detiene el temporizador de la animación
    public void detenerAnimacion() {
        temporizadorAnimacion.stop();
    } // fin del método detenerAnimacion
 
    // devuelve el tamaño mínimo de la animación
    public Dimension getMinimumSize() {
        return getPreferredSize();
    } // fin del método getMinimumSize
 
    // devuelve el tamaño preferido de la animación
    public Dimension getPreferredSize() {
        return new Dimension( anchura, altura );
    } // fin del método getPreferredSize
 
    // clase interna para manejar los eventos de acción del objeto Timer
    private class ManejadorTimer implements ActionListener {
        // responde a un evento del objeto Timer
        public void actionPerformed( ActionEvent actionEvent ) {
            repaint(); // vuelve a dibujar la animación
        }
    }
}
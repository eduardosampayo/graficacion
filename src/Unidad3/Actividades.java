
package Unidad3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Eduardo
 */
public class Actividades extends javax.swing.JFrame implements KeyListener {
    
    public Actividades(){
        initComponents();
        
        Act_RellenosJPanel actRellenos = new Act_RellenosJPanel();
        add(actRellenos);
        
        setLocationRelativeTo(null);
//        actRellenos.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividades");
        getContentPane().setLayout(null);
        setBounds(0, 0, 1200, 255);      
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Actividades().setVisible(true);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

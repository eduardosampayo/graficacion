
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
        
        ActividadesJPanel actjpanel = new ActividadesJPanel();
        add(actjpanel);
        
        setLocationRelativeTo(null);
        actjpanel.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividades");
        getContentPane().setLayout(null);
        setBounds(0, 0, 1200, 660);      
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

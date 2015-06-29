
package Unidad4;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Eduardo
 */
public class Examen extends javax.swing.JFrame implements KeyListener {
    
    public Examen() {
        initComponents();
        
        ExamenJPanel exa = new ExamenJPanel();
        add(exa);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Examen");
        getContentPane().setLayout(null);
        setBounds(0, 0, 1200, 550);      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Examen().setVisible(true);
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

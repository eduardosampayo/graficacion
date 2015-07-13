package Unidad2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Prueba extends javax.swing.JFrame implements KeyListener {
    
    public Prueba() {
        initComponents();
//        Cuadricula panel = new Cuadricula();
//        add(panel);
//        Transformaciones trans = new Transformaciones();
//        add(trans);
//        NumerosPlano panelNumeros = new NumerosPlano(); 
//        add(panelNumeros);
        Primitivas primitivas = new Primitivas();
        add(primitivas);
        PrimitivasTitulo primitivastitulo = new PrimitivasTitulo();
        add(primitivastitulo);
                        
        setLocationRelativeTo(null); 
        //addKeyListener(this);
//        panel.requestFocus(); //panel cuadricula
//        trans.requestFocus(); //panel tranformaciones
        primitivas.requestFocus(); //panel Primtivas
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graficación");
        getContentPane().setLayout(null);

//        setBounds(0, 0, 616, 619); //tamaño panel cuadricula y transformaciones
        setBounds(0, 0, 837, 700); //tamaño panel Primitivas
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
            new Prueba().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("tiped");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("released");
    }
}

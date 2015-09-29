package Unidad5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Eduardo
 */
public class PruebaCaballo extends JFrame implements ActionListener {
    private Timer temporizador;
    Paisaje p1,p2;
    Obstaculo obstaculo;
    CaballoSalta caballoSalta;
    
    public PruebaCaballo() {
        initComponents();
        p1 = new Paisaje(); 
        p2 = new Paisaje();
        caballoSalta = new CaballoSalta();
        caballoSalta.setLocation(0,500);
        caballoSalta.setSize(200, 150);
        caballoSalta.setVisible(true);
        caballoSalta.iniciarAnimacion();
        obstaculo= new Obstaculo();
        this.add(caballoSalta);      
        this.add(obstaculo);
        this.add(p1);
        this.add(p2);
        temporizador= new Timer (100, this);
        temporizador.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caballito");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_UP) {
           if (caballoSalta.getY()==500) {
               for (int i = 20; i <= 80; i+=20) {
                   caballoSalta.setLocation(caballoSalta.getX(), caballoSalta.getY()-i);   
                }
            }               
       }
        if (evt.getKeyCode()==KeyEvent.VK_DOWN) {
           if (caballoSalta.getY()==300) {
               for (int i = 20; i <= 80; i+=20) {
                    caballoSalta.setLocation(caballoSalta.getX(), caballoSalta.getY()+i);   
                }
            }
        }
        
        if (evt.getKeyCode()==KeyEvent.VK_SPACE) {
            this.setVisible(false);
            
            PruebaCaballo pdd = new PruebaCaballo();
            pdd.setVisible(true);
            pdd.setSize(950,732);
            pdd.setDefaultCloseOperation(EXIT_ON_CLOSE);     
        }    
    }//GEN-LAST:event_formKeyPressed
    
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
      
       
    }//GEN-LAST:event_formKeyReleased
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PruebaCaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaCaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaCaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaCaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               PruebaCaballo pd = new PruebaCaballo();
                pd.setVisible(true);
                pd.setSize(950,732);
                pd.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
    }
  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println();
        
        if(p1.getX()>=-800){  
            p1.setLocation(p1.getX()-10, p1.getY());
            p2.setLocation(p1.getX()+800,p1.getY());
            obstaculo.setLocation(obstaculo.getX()-10, obstaculo.getY());
        }
        
        if(p2.getX()<0 && p2.getX()>=-800) {
            p2.setLocation(-800,0);
            p2.setLocation(p2.getX()-10, p2.getY());
            p1.setLocation(p2.getX()+800,p2.getY());
            obstaculo.setLocation(obstaculo.getX()-10, obstaculo.getY());
        }
     
        if ((caballoSalta.getX()+140==obstaculo.getX()||caballoSalta.getX()+130==obstaculo.getX()||caballoSalta.getX()+120==obstaculo.getX()||caballoSalta.getX()+110==obstaculo.getX()|| caballoSalta.getX()+100==obstaculo.getX()|| caballoSalta.getX()+90==obstaculo.getX()||caballoSalta.getX()+80==obstaculo.getX()|| caballoSalta.getX()+70==obstaculo.getX()|| caballoSalta.getX()+60==obstaculo.getX()|| caballoSalta.getX()+50==obstaculo.getX()|| caballoSalta.getX()+40==obstaculo.getX()|| caballoSalta.getX()+30==obstaculo.getX()|| caballoSalta.getX()+20==obstaculo.getX()|| caballoSalta.getX()+10==obstaculo.getX()|| caballoSalta.getX()==obstaculo.getX())&&caballoSalta.getY()==500) {
            temporizador.stop(); // se para el juego
        }
    }
}

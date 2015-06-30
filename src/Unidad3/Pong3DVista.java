
package Unidad3;

import com.sun.j3d.utils.universe.SimpleUniverse;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3d;

/**
 *
 * @author Eduardo
 */
public class Pong3DVista extends Applet implements Runnable{

    Pong3DModelo modelo=new Pong3DModelo();
    TransformGroup tgGeneral=new TransformGroup();
    TransformGroup tgContrario, tgBola, tgWin, tgLose;
    
    /** Creates a new instance of Pong3DSPVista */
    public Pong3DVista() {
        setLayout(new BorderLayout());
        GraphicsConfiguration config=SimpleUniverse.getPreferredConfiguration();
        Canvas3D c=new Canvas3D(config);
        add("Center", c);
        SimpleUniverse u = new SimpleUniverse(c);
        u.getViewingPlatform().setNominalViewingTransform();
        u.addBranchGraph(crearEscena());
        
        c.addKeyListener(  
                new KeyAdapter() {
                    public void keyPressed(KeyEvent keyEvent){
                        if (keyEvent.getKeyCode()==KeyEvent.VK_ENTER)
                            modelo.empezarPartida();
                        else
                            accionTecla(keyEvent.getKeyCode(),true);
                    }
                    public void keyReleased(KeyEvent keyEvent){
                        accionTecla(keyEvent.getKeyCode(),false);
                    }
                    private void accionTecla(int tecla, boolean bValor){
                        switch(tecla){
                            case KeyEvent.VK_LEFT:
                                modelo.setTecla(modelo.IZQUIERDA, bValor);
                                break;
                            case KeyEvent.VK_RIGHT:
                                modelo.setTecla(modelo.DERECHA, bValor);
                                break;
                            case KeyEvent.VK_UP:
                                modelo.setTecla(modelo.ARRIBA, bValor);
                                break;
                            case KeyEvent.VK_DOWN:
                                modelo.setTecla(modelo.ABAJO, bValor);
                                break;
                        }
                    }
            
                }
        );
        modelo.empezarPartida();
        Thread hilo=new Thread(this);
        hilo.start();
    }
    
    public BranchGroup crearEscena(){
        BranchGroup bg=new BranchGroup();
        
        tgGeneral.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        bg.addChild(tgGeneral);
        
        tgGeneral.addChild(figura.getCampo());
        tgGeneral.addChild(tgContrario=figura.getContrario());
        tgGeneral.addChild(tgBola=figura.getBola());
        tgGeneral.addChild(figura.getLuz());
        bg.addChild(tgWin=figura.getTexto("YOU WIN"));
        bg.addChild(tgLose=figura.getTexto("YOU LOSE"));
        return bg;
    }
    
    private void posicionar(){
        //Posicionamiento general
        double dGeneral[]={-modelo.getXJugador(), -modelo.getYJugador(), 0};
        Transform3D tGeneral=new Transform3D();
        tGeneral.set(new Vector3d(dGeneral));
        tgGeneral.setTransform(tGeneral);
        //Posicionamiento contrario
        double dContrario[]={modelo.getXContrario(), modelo.getYContrario(), -8};
        Transform3D tContrario=new Transform3D();
        tContrario.set(new Vector3d(dContrario));
        tgContrario.setTransform(tContrario);
        //Posicionamiento bola
        double dBola[]={modelo.getXBola(), modelo.getYBola(), modelo.getZBola()*5-3};
        Transform3D tBola=new Transform3D();
        tBola.set(new Vector3d(dBola));
        tgBola.setTransform(tBola);
        
        //Mostrar textos
        int nEstado=modelo.getEstado();
        Vector3d v;
        Transform3D t=new Transform3D();
        //Gana
        if (nEstado==1) v=new Vector3d(-0.3f,0,1f);
        else v=new Vector3d(0,100,0);
        t.set(v);
        tgWin.setTransform(t);
        //Lose
        if (nEstado==2) v=new Vector3d(-0.3f,0,1f);
        else v=new Vector3d(0,100,0);
        t.set(v);
        tgLose.setTransform(t);
    }
    
    public void run(){
        while(true){
            try{
                Thread.sleep(100);
                modelo.mover();
                posicionar();
            }catch(Exception e){}
        }
    }

}
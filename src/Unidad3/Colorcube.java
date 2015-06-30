
package Unidad3;

import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.geometry.Text2D;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Vector3f;

public class Colorcube 
{

    public Colorcube()
    {
        Frame frame = new Frame("U3_Sampayo_Santiago_Eduardo.CarasDelCubo"); 
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration(); 
        Canvas3D canvas = new Canvas3D(config); 
        canvas.setSize(600, 650);
       
         SimpleUniverse universe = new SimpleUniverse(canvas);
       
        BranchGroup group = new BranchGroup();  
        
//        cara frontal del cubo          
            Transform3D transform1 = new Transform3D();
            Vector3f vector = new Vector3f(-.5f, .5f, .0f);
            transform1.setTranslation(vector);
            TransformGroup grupo1 = new TransformGroup(transform1);
            ColorCube cubo1 = new ColorCube(0.1);
            grupo1.addChild(cubo1);
            group.addChild(grupo1);
        //cara superior del cubo
        Transform3D transform2 = new Transform3D();        
        Vector3f vector2 = new Vector3f(0f, .5f, .0f); 
        transform2.rotX(1.57); 
        transform2.setTranslation(vector2);         
        TransformGroup grupo2 = new TransformGroup(transform2); 
        ColorCube cubo2 = new ColorCube(0.15);
        grupo2.addChild(cubo2);
        group.addChild(grupo2);
        //cara posterior del cubo
        Transform3D transform3 = new Transform3D();
        Vector3f vector3 = new Vector3f(0.5f, .5f, .0f);
        transform3.rotX(3.14);
        transform3.setTranslation(vector3);
        TransformGroup grupo3 = new TransformGroup(transform3);
        ColorCube cubo3 = new ColorCube(0.15);
        grupo3.addChild(cubo3);
        group.addChild(grupo3);
        //cara inferior del cubo
        Transform3D transform4 = new Transform3D();
        Vector3f vector4 = new Vector3f(-.5f, -.45f, .0f);
        transform4.rotX(-1.57);
        transform4.setTranslation(vector4);
        TransformGroup grupo4 = new TransformGroup(transform4);
        ColorCube cubo4 = new ColorCube(0.15);
        grupo4.addChild(cubo4);
        group.addChild(grupo4);
        //Cara izquierda del cubo
        Transform3D transform5 = new Transform3D();
        Vector3f vector5 = new Vector3f(0f, -.45f, .0f);
        transform5.rotY(1.57);
        transform5.setTranslation(vector5);
        TransformGroup grupo5 = new TransformGroup(transform5);
        ColorCube cubo5 = new ColorCube(0.15);
        grupo5.addChild(cubo5);
        group.addChild(grupo5);
        //Cara derecha del cubo
        Transform3D transform6 = new Transform3D();
        Vector3f vector6 = new Vector3f(0.5f, -.45f, .0f);
        transform6.rotY(-1.57);
        transform6.setTranslation(vector6);
        TransformGroup grupo6 = new TransformGroup(transform6);
        ColorCube cubo6 = new ColorCube(0.15);
        grupo6.addChild(cubo6);
        group.addChild(grupo6);
        
        //Textos
        Transform3D texto = new Transform3D();
        Vector3f posicion_de_texto_1 = new Vector3f(-.95f, .9f, .0f);
        texto.setTranslation(posicion_de_texto_1);
        TransformGroup tg = new TransformGroup(texto);
        tg.addChild(new Text2D("I n s t i t u t o   T e c n o l o g i c o   S u p e r i o r   d e", new Color3f(0, 1, 0), "Times", 20, 0));
        group.addChild(tg);
        
        Transform3D texto2 = new Transform3D();
        Vector3f posicion_de_texto_2 = new Vector3f(-.55f, -.9f, .0f);
        texto2.setTranslation(posicion_de_texto_2);
        TransformGroup tg2 = new TransformGroup(texto2);
        tg2.addChild(new Text2D("M a r t i n e z  D e  L a  T o r r e ", new Color3f(0, 1, 0), "Times", 20, 0));
        group.addChild(tg2);
        
        Transform3D texto3 = new Transform3D();
        Vector3f posicion_de_texto_3 = new Vector3f(-.6f, .15f, .0f);
        texto3.setTranslation(posicion_de_texto_3);
        TransformGroup tg3 = new TransformGroup(texto3);
        tg3.addChild(new Text2D("Frontal             Superior            Posterior ", new Color3f(1, 0, 0), "Times", 18, 0));
        group.addChild(tg3);
        
        Transform3D texto4 = new Transform3D();
        Vector3f posicion_de_texto_4 = new Vector3f(-.6f, -.15f, .0f);
        texto4.setTranslation(posicion_de_texto_4);
        TransformGroup tg4 = new TransformGroup(texto4);
        tg4.addChild(new Text2D("Inferior             Izquierda            Derecha ", new Color3f(1, 0, 0), "Times", 18, 0));
        group.addChild(tg4);
        
        universe.getViewingPlatform().setNominalViewingTransform();
        universe.addBranchGraph(group);        
        frame.addWindowListener(new WindowAdapter() { 
        public void windowClosing(WindowEvent winEvent) { 
        System.exit(0); 
       } 
    }); 
        
        frame.add(canvas);   
        frame.pack(); 
        frame.show();
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Colorcube(); 
    }   
}
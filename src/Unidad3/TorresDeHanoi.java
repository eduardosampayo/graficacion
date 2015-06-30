
package Unidad3;

import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import java.awt.Graphics;
import javax.media.j3d.*;
import javax.vecmath.*;


public class TorresDeHanoi {

  public TorresDeHanoi() {
    SimpleUniverse universe = new SimpleUniverse();
    BranchGroup group = new BranchGroup();
    
   
        ColoringAttributes ca=new ColoringAttributes();
        ca.setColor(1.0f, 0.0f, 0.0f);        
        Appearance app=new Appearance ();
        app.setColoringAttributes (ca);
        Box tabla=new Box(0.8f,0.1f,0.4f,new Appearance());
        TransformGroup BOX = new TransformGroup();
        Transform3D transformG = new Transform3D();
        Vector3f vector1 = new Vector3f( 0.0f, -0.5f, 0.0f);
        transformG.setTranslation(vector1);
        BOX.setTransform(transformG);
        BOX.addChild(tabla);
        tabla.getShape(0).setAppearance(app);
        group.addChild(BOX);
       
        ColoringAttributes c2=new ColoringAttributes();
        c2.setColor(0.234f, 0.234f, 0.234f);
        Appearance appp1=new Appearance ();
        appp1.setColoringAttributes (c2);
        TransformGroup tg = new TransformGroup();
        Transform3D transform = new Transform3D();
        Cylinder cylinder1 = new Cylinder(0.1f, 0.9f,appp1);
        Vector3f vector = new Vector3f(-0.5f, 0.0f, 0.0f);
        transform.setTranslation(vector);
        tg.setTransform(transform);
        tg.addChild(cylinder1);
        group.addChild(tg);
        
        ColoringAttributes c3=new ColoringAttributes();
        c3.setColor(0.234f, 0.234f, 0.234f);
        Appearance appp2=new Appearance ();
        appp2.setColoringAttributes (c3);
        TransformGroup tg2 = new TransformGroup();
        Transform3D transform2 = new Transform3D();
        Cylinder cylinder2 = new Cylinder(0.1f, 0.9f,appp2);
        Vector3f vector2 = new Vector3f(0.0f, 0.0f, 0.0f);
        transform2.setTranslation(vector2);
        tg2.setTransform(transform2);
        tg2.addChild(cylinder2);
        group.addChild(tg2);
        
        ColoringAttributes c4=new ColoringAttributes();
        c4.setColor(0.234f, 0.234f, 0.234f);
        Appearance appp3=new Appearance ();
        appp3.setColoringAttributes (c4);
        TransformGroup tg3 = new TransformGroup();
        Transform3D transform3 = new Transform3D();
        Cylinder cylinder3 = new Cylinder(0.1f, 0.9f,appp3);
        Vector3f vector3 = new Vector3f(0.5f, 0.0f, 0.0f);
        transform3.setTranslation(vector3);
        tg3.setTransform(transform3);
        tg3.addChild(cylinder3);
        group.addChild(tg3); 
        
        ColoringAttributes c1=new ColoringAttributes();
        c1.setColor(0.0f, 1.0f, 1.0f);
        Appearance app1=new Appearance ();
        app1.setColoringAttributes (c1);
        TransformGroup tg4 = new TransformGroup();
        Transform3D transform4 = new Transform3D();
        Cylinder cylinder4 = new Cylinder(0.35f, 0.15f,app1);
        Vector3f vector4 = new Vector3f(0.0f, -0.3f, 0.0f);
        transform4.setTranslation(vector4);
        tg4.setTransform(transform4);
        tg4.addChild(cylinder4);
        group.addChild(tg4);  
        
        ColoringAttributes ca2=new ColoringAttributes();
        ca2.setColor(0.0f, 1.0f, 0.0f);
        Appearance app2=new Appearance ();
        app2.setColoringAttributes (ca2);
        TransformGroup tg5 = new TransformGroup();
        Transform3D transform5 = new Transform3D();
        Cylinder cylinder5 = new Cylinder(0.30f, 0.15f,app2);
        Vector3f vector5 = new Vector3f(0.0f, -0.15f, 0.0f);
        transform5.setTranslation(vector5);
        tg5.setTransform(transform5);
        tg5.addChild(cylinder5);
        group.addChild(tg5);  
        
        ColoringAttributes ca3=new ColoringAttributes();
        ca3.setColor(1.0f, 1.0f, 0.0f);
        Appearance app3=new Appearance ();
        app3.setColoringAttributes (ca3);
        TransformGroup tg6 = new TransformGroup();
        Transform3D transform6 = new Transform3D();
        Cylinder cylinder6 = new Cylinder(0.25f, 0.15f,app3);
        Vector3f vector6 = new Vector3f(0.0f, 0.0f, 0.0f);
        transform6.setTranslation(vector6);
        tg6.setTransform(transform6);
        tg6.addChild(cylinder6);
        group.addChild(tg6); 
        
        ColoringAttributes ca4=new ColoringAttributes();
        ca4.setColor(1.0f, 0.153f, 0.0f);
        Appearance app4=new Appearance ();
        app4.setColoringAttributes (ca4);
        TransformGroup tg7 = new TransformGroup();
        Transform3D transform7 = new Transform3D();
        Cylinder cylinder7 = new Cylinder(0.20f, 0.15f,app4);
        Vector3f vector7 = new Vector3f(0.0f, 0.15f, 0.0f);
        transform7.setTranslation(vector7);
        tg7.setTransform(transform7);
        tg7.addChild(cylinder7);
        group.addChild(tg7); 
        
        ColoringAttributes ca5=new ColoringAttributes();
        ca5.setColor(1.0f, 0.0f, 0.0f);
        Appearance app5=new Appearance ();
        app5.setColoringAttributes (ca5);
        TransformGroup tg8 = new TransformGroup();
        Transform3D transform8 = new Transform3D();
        Cylinder cylinder8 = new Cylinder(0.15f, 0.15f, app5);
        Vector3f vector8 = new Vector3f(0.0f, 0.30f, 0.0f);
        transform8.setTranslation(vector8);
        tg8.setTransform(transform8);
        tg8.addChild(cylinder8);
        group.addChild(tg8);
        
        
        
//        
//        TransformGroup tgc = new TransformGroup();
//        Transform3D transformC = new Transform3D();
//        Cone cone1 = new Cone(0.10f, 0.20f);
//        Vector3f vector1 = new Vector3f(-0.5f, 0.5f, .0f);
//        transformC.setTranslation(vector1);
//        tgc.setTransform(transformC);
//        tgc.addChild(cone1);
//        group.addChild(tgc);
//        
//        
//        Sphere sphere = new Sphere(.1f);
//        TransformGroup tge = new TransformGroup();
//        Transform3D transformE = new Transform3D();
//        Vector3f vector2 = new Vector3f( -0.5F, -0.5f, .0f);
//        transformE.setTranslation(vector2);
//        tge.setTransform(transformE);
//        tge.addChild(sphere);
//        group.addChild(tge);
//        
//        
//        
        
        
        
            
     
    Color3f light1Color = new Color3f(.1f, 1.4f, .1f); // green light
    BoundingSphere bounds =
	    new BoundingSphere(new Point3d(0.0,0.0,0.0), 100.0);
    Vector3f light1Direction  = new Vector3f(4.0f, -7.0f, -12.0f);
    DirectionalLight light1
      = new DirectionalLight(light1Color, light1Direction);
    light1.setInfluencingBounds(bounds);
    group.addChild(light1);
    universe.getViewingPlatform().setNominalViewingTransform();

    // add the group of objects to the Universe
    universe.addBranchGraph(group);
}
  public static void main(String[] args) {
    new TorresDeHanoi();
  }
}


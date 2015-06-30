
package Unidad3;

import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;

public class Position {

  public Position() {
    SimpleUniverse universe = new SimpleUniverse();
    BranchGroup group = new BranchGroup();
    // X axis made of spheres
    for (float x = -0.9f; x <= 0.0f; x = x + 0.2f)
    {
        Sphere sphere = new Sphere(.1f);
        TransformGroup tg = new TransformGroup();
        Transform3D transform = new Transform3D();
        Vector3f vector = new Vector3f( x, .0f, .0f);
        transform.setTranslation(vector);
        tg.setTransform(transform);
        tg.addChild(sphere);
        group.addChild(tg);
    }    
//    // Y axis made of cones
    for (float y = -1.0f; y <= 1.0f; y = y + 0.22f)
    {
        TransformGroup tg = new TransformGroup();
        Transform3D transform = new Transform3D();
        Cone cone = new Cone(0.10f, 0.20f);
        Vector3f vector = new Vector3f(.0f, y, .0f);
        transform.setTranslation(vector);
        tg.setTransform(transform);
        tg.addChild(cone);
        group.addChild(tg);
    }      
//    // Z axis made of cylinders
    for (float z = -1.0f; z <= 1.0f; z = z+ 0.1f)
    {        
        TransformGroup tg = new TransformGroup();
        Transform3D transform = new Transform3D();
        Cylinder cylinder = new Cylinder(0.05f, 0.1f);
        Vector3f vector = new Vector3f(.0f, .0f, z);
        transform.setTranslation(vector);
        tg.setTransform(transform);
        tg.addChild(cylinder);
        group.addChild(tg);
    } 
           
        TransformGroup tg = new TransformGroup();
        Transform3D transform = new Transform3D();
        
        Cylinder cylinder = new Cylinder(0.05f, 0.1f);
        Vector3f vector = new Vector3f(.5f, .5f, 0.0f);
        transform.setTranslation(vector);
        tg.setTransform(transform);
        tg.addChild(cylinder);
        group.addChild(tg);
        
        
        TransformGroup tgc = new TransformGroup();
        Transform3D transformC = new Transform3D();
        Cone cone1 = new Cone(0.10f, 0.20f);
        Vector3f vector1 = new Vector3f(-0.5f, 0.5f, .0f);
        transformC.setTranslation(vector1);
        tgc.setTransform(transformC);
        tgc.addChild(cone1);
        group.addChild(tgc);
        
        
        Sphere sphere = new Sphere(.1f);
        TransformGroup tge = new TransformGroup();
        Transform3D transformE = new Transform3D();
        Vector3f vector2 = new Vector3f( -0.5F, -0.5f, .0f);
        transformE.setTranslation(vector2);
        tge.setTransform(transformE);
        tge.addChild(sphere);
        group.addChild(tge);
        
        
        
        
        ColoringAttributes ca=new ColoringAttributes();
        ca.setColor(1.0f, 0.0f, 0.0f);
        Appearance app=new Appearance ();
        app.setColoringAttributes (ca);
        Box cubo=new Box(0.10f,0.10f,0.20f,app);
        TransformGroup BOX = new TransformGroup();
        Transform3D transformG = new Transform3D();
        Vector3f vector3 = new Vector3f( 0.5F, -0.5f, .0f);
        transformG.setTranslation(vector3);
        BOX.setTransform(transformG);
        BOX.addChild(cubo);
        group.addChild(BOX);
        
            
     
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
    new Position();
  }
}



package Unidad3;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.BranchGroup;

/**
 *
 * @author Eduardo
 */
public class Hello3D {
    
    public Hello3D()
{
    SimpleUniverse universe = new SimpleUniverse();
    BranchGroup group = new BranchGroup();
    group.addChild(new ColorCube(0.3));
    universe.getViewingPlatform().setNominalViewingTransform();
    universe.addBranchGraph(group);   
}

    public static void main(String[] args) {
        // TODO code application logic here
        new Hello3D();
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinates;

/**
 *
 * @author Sundar
 */
//class instance variables for the three coordinates
public class Point3 {
    public int x;
    public int y;
    public int z;
    
    //toString method
    public String toString() {
        return ("(" + x + "," + y + "," + z + ")");
    }
    // coordinates to zeros
    public void zeroOut() {
        x = 0;
        y = 0;
        z = 0;
    }
    public void manhattanOrigin() {
        System.out.println(x + y + z);
    }
    public void manhattanGoal() {
        System.out.println(100 - x + 100 - y + 100 - z);
    }
// extra credit
    public void manhattan(Point3 otherpoint){
    System.out.println(otherpoint.x-x + otherpoint.y-y + otherpoint.z-z);
    }
}
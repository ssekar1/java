/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package heroandmonster;

/**
 *
 * @author ssekar1
 */
public class Kangaroo {
// instance variables
    public String name;
    public int jumps;
public void dojumps ()  {
        System.out.println(name + " is jumping on cars");
        jumps++;
    }
public void eat() {
    System.out.println(name + " is eating leaves");

}
public String toString() {
    return name + "lives in mountains";
}
}

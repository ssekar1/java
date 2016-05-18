/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package zoo;

/**
 *
 * @author ssekar1
 */
public class Camel extends ZooAnimal{
    public Camel() {
        super("Don", "Black"); // call Monster constructor
    }
     public String toString() {
        return "Camel (" + super.toString() + ")";
}
     public void dance() {
          System.out.println("Camel dancing with ");
     }
}

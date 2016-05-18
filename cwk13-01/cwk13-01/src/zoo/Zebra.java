/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package zoo;

/**
 *
 * @author ssekar1
 */
public class Zebra extends ZooAnimal{
    public Zebra() {
        super("Mony", "Pink"); // call Monster constructor
    }
 public String toString() {
        return "Zebra (" + super.toString() + ")";
}
 public void eat () {
    System.out.println(" Eating people is my job");
}
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package zoo;

/**
 *
 * @author ssekar1
 */
public class Elephant extends ZooAnimal{
    private int kill;

    public Elephant() {
        super("John", "Blue"); // call Monster constructor
    }
     public String toString() {
        return "Elephant (" + super.toString() + ")";
}

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

}

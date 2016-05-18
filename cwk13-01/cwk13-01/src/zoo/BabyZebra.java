/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package zoo;

/**
 *
 * @author ssekar1
 */
public class BabyZebra extends Zebra{
 private int drink;

    public int getDrink() {
        return drink;
    }

    public void setDrink(int drink) {
        this.drink = drink;
    }

    public BabyZebra(int drink) {
        this.drink = drink;
    }

    public String toString() {
        return "BabyZebra{" + "drink=" + drink + '}';
    }

}

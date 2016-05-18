/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk1501;

/**
 *
 * @author apatel15
 */
public abstract class RandomPickupItem extends GameItem {

    public boolean pickup() {
        if (Math.random() < 0.5) {
            System.out.println("Successfully picked up");
            return true;
        }
        System.out.println("you have not picked up");
        return false;

    }
}

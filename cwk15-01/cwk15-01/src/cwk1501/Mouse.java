/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1501;

/**
 *
 * @author apatel15
 */
public class Mouse extends RandomPickupItem {
    public boolean putdown() {
        if (Math.random() < 0.5) {
            System.out.println("Successfully putdown the mouse");
            return true;
        }
        System.out.println("you have not putdown the mouse");
        return false;

    }
    }


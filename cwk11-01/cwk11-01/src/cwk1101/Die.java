/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk1101;

/**
 *
 * @author apatel15
 */
public class Die {

    private int side;
    private static int faces;

    static {
        faces = 6;
    }

    public int getside() {
        return side;
    }

    public static int getFaces() {
        return faces;
    }

    public static void setFaces(int faces) {
        Die.faces = faces;
    }

    public void roll() {
        side = (int) (Math.random() * faces + 1);
    }

    public String toString() {
        return "[" + side + "]";
    }

    public static boolean threeSame(Die die1, Die die2, Die die3) {
        if (die1.side == die2.side && die2.side == die3.side) {

            return true;
        }
        return false;
    }

public static boolean twoSame(Die die1, Die die2, Die die3) {
        if((die1.side == die2.side || die2.side == die3.side || die1.side==die3.side) &&!threeSame(die1, die2,die3)) {

            return true;
        }
        return false;
    }
}

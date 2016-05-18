/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk2401;

/**
 *
 * @author ssekar1
 */
import java.awt.Color;

public class AniMoveShape implements AniStrategy {

    private int dx; // change in x
    private int max = 360;

    // constructor
    public AniMoveShape(int dx) {
        this.dx = dx;

    }

    // update the shape by changing its x and y position
    public void update(AShape a) {
        a.setXpos(a.getXpos() + dx);
        if (a.getXpos() > max) {
            a.setXpos(0);
        }

    }

    // accessors and mutators --------------------
    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }
}

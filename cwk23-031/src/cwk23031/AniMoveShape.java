/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk23031;

import java.awt.Color;

public class AniMoveShape implements AniStrategy {

    private int dx; // change in x
    private int dy; // change in y

    // constructor
    public AniMoveShape(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    // update the shape by changing its x and y position
    public void update(AShape a) {
        a.setXpos(a.getXpos() + dx);
        a.setYpos(a.getYpos() + dy);
    }

    // accessors and mutators --------------------
    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }
}
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
import java.awt.Graphics;

public class AShape {
    // position

    private int xpos;
    private int ypos;
    // size
    private int width;
    private int height;
    // color
    private Color col;
    // how it is animated
    private AniStrategy anim;

    // constructors -------------------------------------
    public AShape() {
        this(0, 0, 25, 25, Color.BLACK, null);
    }

    public AShape(int xpos, int ypos, int width, int height, Color col, AniStrategy anim) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.width = width;
        this.height = height;
        this.col = col;
        this.anim = anim;
    }

    // update the shape for the next frame of animation
    // using the animation strategy
    public void update() {
        // if it is null, the shape is unanimated
        if (anim != null) {
            anim.update(this);
        }
    }

    // given a graphics object, draw the shape as a rectangle
    public void drawSelf(Graphics g) {
        g.setColor(col);
        g.fillRect(xpos, ypos, width, height);
    }

    // accessors and mutators --------------------------
    public Color getCol() {
        return col;
    }

    public void setCol(Color col) {
        this.col = col;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public AniStrategy getAnim() {
        return anim;
    }

    public void setAnim(AniStrategy anim) {
        this.anim = anim;
    }
}
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
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class DrawAniPanel extends JPanel {

    // shape that will move
    private AShape[] shapes;
    private static final int NUMSHAPES = 10;
    private boolean moving;
    // to reduce flicker, we draw in the buffer and then put it in place when finished
    private BufferedImage mybuffer;


    // setting up the panel
    public DrawAniPanel() {
        shapes = new AShape[NUMSHAPES];
        moving = true;

        int x;
        int y;
        Color c;
        Color d;
        AniStrategy st;
        // set up all the snapes at random positions, colors, and animation directions
        for (int i = 0; i < NUMSHAPES; i++) {
            x = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            c= Color.GREEN;
            st = new AniMoveShape((int)(Math.random()*5)-2);
            shapes[i] = new AShape(x, y, 10, 10, c, st);
             c= Color.pink;
        }
    }


    // method called when JPanel is drawn
    public void paintComponent(Graphics g) {
        // width and height not set until the panel is rendered
        // so wait until first run of this method
        // to create the buffer
        if (mybuffer == null ) {
                mybuffer = (BufferedImage)createImage(getWidth(), getHeight());
        }
        // buffer has a graphics object we can draw on
        Graphics buffG = mybuffer.getGraphics();
        buffG.setColor(Color.WHITE);
        buffG.fillRect(0, 0, getWidth(), getHeight());
        for (int i = 0; i < NUMSHAPES; i++) {
            // tell the shape to do its animation task
            shapes[i].update();
            // tell the shape to draw itself using the graphics from the buffer
            shapes[i].drawSelf(buffG);
        }

        // finally, copy the image from the buffer to the actual graphics object
        // for the panel
        g.drawImage(mybuffer, 0, 0, this);
    }

    // change animation style for all shapes
    public void changeAnimation(AniStrategy strat) {

        for (int i = 0; i < NUMSHAPES; i++) {
            shapes[i].setAnim(strat);
        }


    }

    // accessors and mutators -------------------------------------
    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }
}
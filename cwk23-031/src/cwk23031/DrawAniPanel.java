/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk23031;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawAniPanel extends JPanel {

    // shape that will move
    private AShape shape;
    private AShape shape1;

    // setting up the panel
    public DrawAniPanel() {
        shape = new AShape();
        // assume the shape starts with move animation
        shape.setAnim(new AniMoveShape(1, 2));
        shape1= new AShape();
         // assume the shape starts with move animation
        shape1.setAnim(new AniMoveShape(2, 3));
        shape1.setDrawStrat(new OvalShapeDrawStrategy());
        shape1.setXpos(50);
        

    }

    // method called when JPanel is drawn
    public void paintComponent(Graphics g) {
        // let JPanel do its own drawing work
        super.paintComponent(g);
        // fill in background color
        setBackground(Color.WHITE);

        // tell the shape to do its animation task
        shape.update();
        shape1.update();
        // tell the shape to draw itself using this graphics
        shape.drawSelf(g);
        shape1.drawSelf(g);
    }

    // accessors and mutators -------------------------------------
    public AShape getShape() {
        return shape;
    }

    public void setShape(AShape shape) {
        this.shape = shape;
    }

    public AShape getShape1() {
        return shape1;
    }

    public void setShape1(AShape shape1) {
        this.shape1 = shape1;
    }

}
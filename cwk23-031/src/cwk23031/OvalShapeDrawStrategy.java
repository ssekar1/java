/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk23031;

import java.awt.Graphics;

/**
 *
 * @author apatel15
 */
public class OvalShapeDrawStrategy implements ShapeDrawStrategy {

      public void ShapeDraw(AShape x, Graphics y) {

        // set the color we are using to a new color (R, G, B)
        y.setColor( x.getCol());
        // draw a filled rectangle in the current color
        y.fillOval(x.getXpos(), x.getYpos(),x.getWidth(),x.getHeight());




        
    }
}

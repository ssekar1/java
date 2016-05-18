/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk2401;

/**
 *
 * @author ssekar1
 */
public class AniRandomMoveShape implements AniStrategy{
  // update the shape by changing its x and y position
    public void update(AShape a) {
        // between -3 and +3
        int dx = (int)(Math.random() * 7)-3;
        int dy = (int)(Math.random() * 7)-3;
        a.setXpos(a.getXpos() + dx);
        a.setYpos(a.getYpos() + dy);
    }

}

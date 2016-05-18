/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk23031;

/**
 *
 * @author apatel15
 */
public class AniMoveSizeShape implements AniStrategy{
    protected AniMoveShape shapemove;
    protected AniSizeShape shapesize;

    public AniMoveSizeShape(AniMoveShape shapemove, AniSizeShape shapesize) {
        this.shapemove = shapemove;
        this.shapesize = shapesize;
    }

    public AniMoveShape getShapemove() {
        return shapemove;
    }

    public void setShapemove(AniMoveShape shapemove) {
        this.shapemove = shapemove;
    }

    public AniSizeShape getShapesize() {
        return shapesize;
    }

    public void setShapesize(AniSizeShape shapesize) {
        this.shapesize = shapesize;
    }

 public void update(AShape b) {
     shapemove.update(b);
     shapesize.update(b);
       
    }
}

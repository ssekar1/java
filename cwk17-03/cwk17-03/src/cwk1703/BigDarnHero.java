/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk1703;

/**
 *
 * @author apatel15
 */
public class BigDarnHero extends GameElt {

    @Override
    public String toString() {
        return name + pos;
    }

    public BigDarnHero(int x, int y, String name) {

        super(x, y, name);
        moveStrat = new WalkMoveStrategy();
    }

    public BigDarnHero() {
        super();
    }

    public void speedUp() {
        
    }
     public MoveStrategy getMoveStrat() {
        return moveStrat;
    }

    public void setMoveStrat(MoveStrategy moveStrat) {
        this.moveStrat = moveStrat;
    }
}

}

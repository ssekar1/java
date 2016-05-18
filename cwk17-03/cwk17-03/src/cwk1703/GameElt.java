/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk1703;

/**
 *
 * @author apatel15
 */
public abstract class GameElt {

    protected String name;
    protected int health;
    protected Position pos;
    protected MoveStrategy moveStrat;
    public void move(char direction){
        moveStrat.move(pos, direction);
      if ( moveStrat.chanceToFall()){
        System.out.println("you fell");
        health-= 5;
    }
    }
    public MoveStrategy getMoveStrat() {
        return moveStrat;
    }

    public void setMoveStrat(MoveStrategy moveStrat) {
        this.moveStrat = moveStrat;
    }

    public GameElt() {
        pos = new Position(0, 0);

    }

    public GameElt(int x, int y, String name) {
        this.name = name;
        pos = new Position(x, y);
        health = 100;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100) {
            this.health = health;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "GameElt{" + "name=" + name + "health=" + health + "pos=" + pos + '}';
    }
}

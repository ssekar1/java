/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1703;

/**
 *
 * @author apatel15
 */
public class RunMoveStrategy implements MoveStrategy {
     public void move(Position p, char direction) {
        System.out.println("Running from  " + p + "to");
        switch (direction) {
            case 'N':
                p.setY(p.getY() + 5);
                break;
            case 'S':
                p.setY(p.getY() - 5);
                break;
            case 'E':
                p.setX(p.getX() + 5);
                break;
            case 'W':
                p.setX(p.getX() - 5);
                break;

        }
        System.out.println(p);
    }

    public boolean chanceToFall() {
        if ((int) (Math.random() * 10) == 5) {
            return true;

        }
        return false;

    }

}



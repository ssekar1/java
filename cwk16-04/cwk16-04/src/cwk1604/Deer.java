/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk1604;

/**
 *
 * @author ssekar1
 */
public class Deer implements Prey , Run{

    private int kill;
    public void gorun(){
    System.out.println("Deer runs faster");
}
    public int nutrition() {
        return 120;
    }

    public Deer(int kill) {
        this.kill = kill;
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

    @Override
    public String toString() {
        return "Deer{" + " total number of times killed= " + kill + '}';
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk10sundar;

/**
 *
 * @author ssekar1
 */
public class Harness {

    public static void main(String[] args) {
        TicTac y = new TicTac();
        Player p = new Player("Tom", "X", y);
        System.out.println(y);
    }
}

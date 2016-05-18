/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1703;

/**
 *
 * @author apatel15
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigDarnHero mike= new BigDarnHero(5,3,"Mighty Thog");
        System.out.println(mike);
        mike.move('N');
        mike.move('N');
        mike.move('N');
        mike.move('W');
        System.out.println(mike);
        

    }

}

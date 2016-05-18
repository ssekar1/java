/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk0901;

/**
 *
 * @author apatel15
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BunnyFarmer[] mnList = new BunnyFarmer[3];
        mnList[0]= new BunnyFarmer();
        Bunny[] mylist= {new Bunny(),new Bunny(),new Bunny(),new Bunny()};
        mnList[1]= new BunnyFarmer("bob",mylist);
        mnList[2]= new BunnyFarmer("bob",mylist);
        mnList[1].addBunny(new Bunny());
        mnList[1].chooseFavorite();
        System.out.println(mnList[0]);
        System.out.println(mnList[1]);
        System.out.println(mnList[2]);
    }

}

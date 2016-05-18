/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk1501;

/**
 *
 * @author apatel15
 */
public class Main {

    public static void main(String[] args) {
        int count=0;
        GameItem[] allItems = new GameItem[6];
        allItems[0] = new Weapons("Killer knife", "007 Knife", 5);
        allItems[1] = new Weapons("Killer gun", "007 gun", 7);
        allItems[2] = new Weapons("Killer riffle", "007 riffle", 9);
        allItems[3] = new Gold("Gold Bar ", "007 Candy", 15);
        allItems[4] = new Shoes("Killer Shoes", "007 Shoes", 20);
        allItems[5]= new Mouse();
        GameItem[] myStuff = new GameItem[6];
        for (int i = 0; i < allItems.length; i++) {
            if (allItems[i].pickup() == true) {
                myStuff[i] = allItems[i];
            }
        }
        for (int i = 0; i < myStuff.length; i++) {
            if (myStuff[i]!=null && myStuff[i].putdown() == true) {
                myStuff[i] = null;
            }
        }
        for (int i=0; i<myStuff.length; i++){
            if (myStuff[i]!=null){
                System.out.println(myStuff[i]);
                count +=myStuff[i].getValue();
            }
        }
        System.out.println(" Total value of the itmes unable to put down "+count);
    }
}

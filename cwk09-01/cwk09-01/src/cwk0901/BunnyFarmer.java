/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk0901;

/**
 *
 * @author apatel15
 */
public class BunnyFarmer {

    private String name;
    private Bunny[] hutch;
    private int firstEmptyIndex;

    public BunnyFarmer() {
        name = "bob";
        hutch = new Bunny[10];
        firstEmptyIndex = 0;
    }

    public String toString() {
        String temp = "farmer" + name + "Bunny  hutch";

        for (Bunny elt : hutch) {
            temp = temp + elt + "\n";
        }
        return temp;

    }

    public void addBunny(Bunny x) {
        if (firstEmptyIndex < hutch.length - 1) {
            hutch[firstEmptyIndex] = x;
            firstEmptyIndex++;

        }
    }

    public Bunny chooseFavorite() {
        int x = (int) (Math.random() * firstEmptyIndex);
        return hutch[x];
    }

    public BunnyFarmer(String namex, Bunny[] nam) {
        hutch = new Bunny[nam.length * 2];
        name=namex;
        System.arraycopy(nam, 0, hutch,0, nam.length);

    }


    }


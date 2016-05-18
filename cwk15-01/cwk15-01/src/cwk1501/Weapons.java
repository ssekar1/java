/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1501;

/**
 *
 * @author apatel15
 */
public class Weapons extends GameItem{
    protected int weight;

    public Weapons(String description, String name, int value) {
        super(description, name,value);
        weight=100;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean pickup(){
        System.out.println("Weapon is too heavy to pickup");
        return false;
    }
    public boolean putdown() {
           System.out.println("Superman picked up the weapon for you!!");
        return true;
    }
}

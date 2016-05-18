/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1501;

/**
 *
 * @author apatel15
 */
public class Shoes extends GameItem{

    public Shoes(String description, String name, int value) {
        super(description, name,value);
    }

    public boolean pickup(){
        System.out.println("Shoe is easy to pickup");
        return true;
    }
    public boolean putdown() {
           System.out.println("Shoe is  glued to your foot");
        return false;
    }
    public boolean throwthing() {
        System.out.println("Shoe is eaiser to throw at the enemy");
        return true;
    }
}


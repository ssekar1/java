/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1501;

/**
 *
 * @author apatel15
 */
public class Gold extends GameItem {

 public Gold(String description, String name, int value) {
        super(description, name,value);
    }

    public boolean pickup(){
        System.out.println("Gold is  very light to pickup");
        return true;
    }
    public boolean putdown() {
           System.out.println("Gold is not glued to your body");
        return true;
    }

}

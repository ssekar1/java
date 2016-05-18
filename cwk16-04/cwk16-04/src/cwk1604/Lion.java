/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk1604;

/**
 *
 * @author ssekar1
 */
public class Lion implements Predator {

    private String color;

    public void eat(Prey Y) {
        System.out.println("Lion like to eat animal " + Y);
    }

    public boolean hunt(Prey x) {
        if (Math.random() < .5) {
           return true;
        }
        return false;
    }

    public Lion(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lion{" + " change of color after eating= " + color + '}';
    }
}

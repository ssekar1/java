/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package zoo;

/**
 *
 * @author ssekar1
 */
public class ZooAnimal {
protected String name;
protected String color;

public void eat () {
    System.out.println(" Eating people");
}
public void sleep () {
    System.out.println(" Going to sleep after eating peple");

    }

    public ZooAnimal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String toString() {
        return "ZooAnimal{" + "name=" + name + "color=" + color + '}';
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk04.ssekar1;

/**
 *
 * @author Sundar
 */
public class Cat {
    // Instance Variables

    public String name;
    public String color;
    
    // extra credit Start
    // Instance Variables, Accessors, Mutators
    public Gorilla ape;

    public Gorilla getApe() {
        return ape;
    }

    public void setApe(Gorilla newape) {
        ape = newape;
    }
    // extra credit ends

    // accessors
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;

    }
    // mutators

    public void setName(String newname) {
        name = newname;
    }

    public void setColor(String newcolor) {
        color = newcolor;
    }
    // no parameter constructor

    public Cat() {
        name = "Unnamed Cat";
        color = "no color";
    }
    // parameterized constructors

    public Cat(String newName, String newColor) {
        setName(newName);
        setColor(newColor);
    }

    public Cat(String newName) {
        setName(newName);

    }
    // to string

    public String toString() {
        return getName() + "is " + getColor() + " in color";

    }
}

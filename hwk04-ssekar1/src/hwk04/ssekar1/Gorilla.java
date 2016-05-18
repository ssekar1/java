/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk04.ssekar1;

/**
 *
 * @author Sundar
 */
public class Gorilla {
    // Instance variables

    public String name;
    public int weight;
    public Cat pet;
    // Accessors

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;

    }
    // Accessors for Pet

    public Cat getPet() {
        return pet;
    }
    // Mutators

    public void setName(String newname) {
        name = newname;
    }

    public void setWeight(int newweight) {
        if (newweight >= 0) {
            weight = newweight;
        }

    }
    // Mutators for pet

    public void setPet(Cat newpet) {
        pet = newpet;
    }
    // no parameter constructor

    public Gorilla() {
        name = "Unnamed Gorilla";
        weight = 0;
    }
    //parameterized constructor

    public Gorilla(String newName, int newWeight) {
        setName(newName);
        setWeight(newWeight);

    }
    // Start of extra credit: parameterized constructor

    public Gorilla(String name, Cat nicePet) {
        setName(name);
        setPet(nicePet);
    }

    public Gorilla(String gorillaName, String catName) {
        Cat meow = new Cat(catName);
        setName(gorillaName);
        setPet(meow);

    }
    // end of Extra credit

    // toString
    public String toString() {
        return getName() + ", a Gorilla that weighs " + getWeight() + " lbs";

    }
}

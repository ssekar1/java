/*
Bunny.java example code
AC Chapin

 */
package cwrk08;

// a class representing a Bunny rabbit
public class Bunny {

    private String name;
    private int carrotCount;  // how many carrots

    // default constructor
    public Bunny() {
        name = "Unnamed Bunny";
        carrotCount = 0;
    }

    // parameterized constructor (all instance vars)
    public Bunny(String nameVal, int carrotVal) {
        this();
        setName(nameVal);
        setCarrotCount(carrotVal);
    }

    // name accessor
    public String getName() {
        return name;
    }

    // name mutator
    public void setName(String val) {
        name = val;
    }

    // carrotCount accessor
    public int getCarrotCount() {
        return carrotCount;
    }

    // carrotCount mutator -- 0 or positive vals
    public void setCarrotCount(int val) {
        if (val >= 0) {
            carrotCount = val;
        }
    }

    // print a greeting
    public void sayHi() {
        System.out.println("My name is " + getName());
    }

    // increase the number of carrots
    public void feed(int numcarrots) {
        setCarrotCount(getCarrotCount() + numcarrots);
        System.out.println("Thanks!  I now have "
                + getCarrotCount() + " nummy carrots!");
    }

    // the height bunnies hop
    // is determined by how many carrots they ate
    public void hop() {
        int height = getCarrotCount() / 2;
        System.out.println(getName() + " just hopped "
                + height + " feet in the air!");
    }

    // toString
    public String toString() {
        return "Bunny " + getName() + " (" + getCarrotCount() + " carrots)";
    }
}
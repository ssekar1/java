/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package heroandmonster;

public class Hero {

    // instance variables -- each Hero all of these, and will have values for them
    // instance variables are initialized to 0, false, or null
    public String name;         // my name
    public int hit_points;      // how much life I have
    public Monster enemy;       // my mortal foe
    public Hero ally;           // my buddy


    // the hero runs, which decreases health
    public void run() {
        // the name variable is our instance variable from above
        // it will have different values for different heroes
        System.out.println(name + " is running, and getting tired");
        hit_points--;
    }

    // resting replenishes health
    public void rest() {
        System.out.println(name + " is resting");
        hit_points++;
    }

    // fighting the hero's sworn enemy
    public void fight() {
        // if enemy is null, this will explode!
        System.out.println(name + " is fighting the monster " + enemy.myName);
    }

    // join forces with another hero -- so they become the ally
    public void joinForces(Hero otherHero) {
        // if this is called as hero1.joinForces(hero2) then name is hero1's name, and otherHero is hero2
        // if this is called as hero2.joinForces(hero1) then name is hero2's name, and otherHero is hero1
        System.out.println(name + " is joining forces with " + otherHero.name);
        ally = otherHero;
    }

    // toString is called whenever a Hero is cast to a String (e.g. by println)
    // it does not print, but returns so the String can be used elsewhere
    public String toString() {
        return "The Hero " + name;
    }

}
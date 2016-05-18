package heroandmonster;

public class Monster {
    // instance variables
    public String myName;       // the monster's name
    public int peopleEaten;     // how many people the monster has eaten


    // a monster attacks!
    public void attack() {
        System.out.println(myName + " is attacking");
    }

    // when a monster eats a hero, the hero's health drops to zero and the hero becomes a zombie
    // also the monster's count of people eaten increases.
    public void eat(Hero victim) {
        System.out.println(myName + " eats " + victim.name);
        victim.hit_points = 0;
        victim.name = "ZOMBIE HERO";
        peopleEaten++;
    }

    // toString returns a string representing this monster
    public String toString() {
        return  myName + " the monster (who has eaten " + peopleEaten + "people)";
    }

}
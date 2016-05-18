/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk04.ssekar1;

/**
 *
 * @author Sundar
 */
public class GorillaCatHarness {

    public static void main(String[] args) {
        // For Gorilla
        // Gorilla created using default parameterized constructor
        Gorilla monkey = new Gorilla();
        System.out.println("first : ["
                + monkey.getName() + "] , a Gorilla that weighs ["
                + monkey.getWeight() + "] lbs.");

        // accessors and mutators
        monkey.setName("King Kong Caesar");
        monkey.setWeight(640);
        System.out.println("later : ["
                + monkey.getName() + "] ,a grown up Gorilla that weighs ["
                + monkey.getWeight() + "] lbs.");

        // Gorilla created using parameterized constructor
        Gorilla chimp = new Gorilla("Chimp Gorilla", 240);
        System.out.println("first : ["
                + chimp.getName() + "] , a Gorilla that weighs ["
                + chimp.getWeight() + "] lbs.");

        // accessors and mutators
        chimp.setName("Chimp Gorilla");
        chimp.setWeight(940);
        System.out.println("later : ["
                + chimp.getName() + "] ,a grown up Gorilla that weighs ["
                + chimp.getWeight() + "] lbs.");

        // For Cat
        // Cat created using default parameterized constructor
        Cat animal = new Cat();
        System.out.println("first : ["
                + animal.getName() + "] who has ["
                + animal.getColor() + "]  is a new born cat.");

        // accessors and mutators
        animal.setName("Tom");
        animal.setColor("Grey");
        System.out.println("later : ["
                + animal.getName() + "] ,a grown up cat whose color is  ["
                + animal.getColor() + "] is the star of Tom and Jerry show.");

        // Cat created using parameterized constructor
        Cat meow = new Cat("Paris Cat", "Red");
        System.out.println("first : ["
                + meow.getName() + "] who has ["
                + meow.getColor() + "] color is a new born cat.");

        // accessors and mutators
        meow.setName("Paris Cat");
        meow.setColor("Red");
        System.out.println("later : ["
                + meow.getName() + "] ,a grown up cat whose color is  ["
                + meow.getColor() + "] is the star of Tom and Jerry Kids show.");

        // For pet
        monkey.setPet(animal);
        System.out.println(monkey.getPet().getName());

        // Extra Credit start
        animal.setApe(monkey);
        System.out.println(animal.getApe().getName());

    }
}

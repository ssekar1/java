/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import zoo.*;
/**
 *
 * @author ssekar1
 */
public class animalharness {

  public static void main(String[] args) {
      System.out.println("---------------Elephant");
        Elephant e = new Elephant();
        e.setKill(5);
        e.eat();
        e.sleep();
        System.out.println(e);
        System.out.println(e.getKill());

        System.out.println("---------------Camel");
        Camel v = new Camel();

        v.eat();
        v.dance();
        v.sleep();
        System.out.println(v);


        System.out.println("---------------Zebra");
        Zebra z = new Zebra();
        z.eat();
        z.sleep();
        System.out.println(z);

        System.out.println("---------------ZooAnimal");
        ZooAnimal a = new ZooAnimal("Bud ", "Red");
        a.eat();
        a.sleep();
        System.out.println(a);

        System.out.println("---------------BabyZebra");
        BabyZebra b = new BabyZebra(4);
        b.eat();
        b.sleep();
        b.setDrink(4);
        System.out.println(b);
        System.out.println(b.getDrink());
    }
}

     


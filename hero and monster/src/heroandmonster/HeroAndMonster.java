/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package heroandmonster;

/**
 *
 * @author ssekar1
 */
public class HeroAndMonster {

 public static void main(String[] args) {
     Hero flashkid = new Hero ();
          // setting instance variables
        flashkid.name = "superboy";
        flashkid.hit_points=95;
        flashkid.rest();
        flashkid.run ();


     Monster darkseid = new Monster ();
               // setting instance variables
        darkseid.myName = "bane";
        darkseid.attack();
        flashkid.enemy= darkseid;
        System.out.println (flashkid.enemy.myName);
        darkseid.eat(flashkid);
        System.out.println (flashkid.name);
        System.out.println (flashkid.hit_points);

     Kangaroo buny= new Kangaroo ();
     buny.name = "sunny";
     buny.eat();
     buny.dojumps ();
 }
}

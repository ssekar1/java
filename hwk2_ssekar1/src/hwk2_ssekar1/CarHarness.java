/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hwk2_ssekar1;

/**
 *
 * @author ssekar1
 */
public class CarHarness {
public static void main(String[] args) {
//setting instance var
     RaceCar honda= new RaceCar();
     honda.color= "red";
     // input speed here
     InventoryCar toyota= new InventoryCar ();
     toyota.name="prius";
     // input price here
// calling methods racecar
     honda.jump();
     System.out.println("honda's speed after jumping: "  +honda.speed + "MPH" );
// calling method inventorycar
     toyota.nitro();
     System.out.println("toyota's price after going fast: " + "$"+ toyota.price);
     
    
}
}

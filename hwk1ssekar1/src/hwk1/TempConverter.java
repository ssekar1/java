/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk1;

import java.util.Scanner;
/**
 *
 * @author sundar
 */
public class TempConverter {
       	public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your Name");
            String name = scan.next();
            System.out.println(name + " Please enter a temperature in farenheit");
            double ctemp ;
            double ftemp = scan.nextDouble();
            ctemp = (ftemp-32.0)* (5.0/9.0);
            System.out.println(name  + " your " + ftemp +" degrees farenheit would be "+ ctemp + " degree celsius");
            System.out.println(name + " Please enter a temperature in celsius");
            double celctemp = scan.nextDouble();
            ftemp = (celctemp*9.0/5.0)+ (32.0);
            System.out.println(name  + " your " + celctemp +" degrees celsius would be "+ ftemp + " degree farenheit");
                                 
        }
}
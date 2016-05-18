/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk06.sundar;

import java.util.Scanner;

/**
 *
 * @author Sundar
 */
public class CalendarInterface {

    public static void main(String[] args) {
        // scan is a Scanner, which will let us read from the user
        Scanner scan = new Scanner(System.in);
        String month;
        int day;
        int start;
        // read values in, using Scanner
        System.out.println("Give me a month");
        month = scan.next();
        System.out.println("Give me number of days");
        day = scan.nextInt();
        System.out.println("Give me a number for what day of the week the month starts on");
        start = scan.nextInt();

        // printing , just an extra, not required in the aasignment, 
        // testing for me, also output the result, please dont consider this
        System.out.println("Your month name was " + month);
        // int and double automatically cast to String
        System.out.println("Your number of days was " + day);
        System.out.println("Your starting day of the week is " + start);

        
        Calendar create = new Calendar( month , day, start);
       create.print();
    }
}

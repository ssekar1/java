/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinates;

/**
 *
 * @author Sundar
 */
public class Point3Harness {
    public static void main(String[] args) {
       Point3 one= new Point3();
       one.x=10;
       one.y=20;
       one.z=30;
       System.out.println(one);
       Point3 two= new Point3();
       two.x=40;
       two.y=50;
       two.z=60;
       System.out.println(two);
       // print using zero out      
       one.zeroOut();          
       System.out.println(one);
       
       
       //the rest below is for testing the code
       // just checking if they work or not
       two.manhattanOrigin();
       one.manhattanGoal(); 
       //checking extra credit
       one.manhattan(two);
                   
       
       }
     }

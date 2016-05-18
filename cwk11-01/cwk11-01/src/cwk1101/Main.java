/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1101;

/**
 *
 * @author apatel15
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int choice= (int)(Math.random()*11);

       for(int i=0; i<=choice; i++){
           Sardine mysar=new Sardine ();
           System.out.println(mysar);

       }
       System.out.println(Sardine.getSardineCount());
       

    }

}

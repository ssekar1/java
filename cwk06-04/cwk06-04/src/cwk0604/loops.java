/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk0604;

/**
 *
 * @author ssekar1
 */
public class loops {

    public static void main(String[] args) {
        for (int x = 0; x <= 100; ++x) {
            if (x % 5 == 0 || x % 2 == 0 && x % 3 == 0) {
                System.out.println(x);
            }

        }
        int rows = 0;
        int cols = 5;
        int i, j;
        System.out.println("  0 1 2 3 4 5");
        System.out.println("--------------");
        for (i = 0; i <= cols; i++) {
           System.out.print(i+"|");
            for (j = 0; j <= cols; j++) {
                System.out.print(i + j + " ");

            }

            System.out.println();

        }
        for (int z = 1; z <= 25; ++z) {
                  System.out.print(z+" ");
             if (z%5==0)  {
                System.out.println( );
             }
 
    }
          
    }
    }




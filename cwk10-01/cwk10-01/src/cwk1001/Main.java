/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk1001;

/**
 *
 * @author apatel15
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(totalSum(new int[][]{{1, 2, 3, 4}, {5}, {6, 7, 8}, {9, 10}}));
        print2D(makeMultTable(7));
        print2D(makerows(4, "cat", "dog", "antelope"));
         print2D(makerows(5, "cat", "dog"));
          print2D(makerows(6,new String[]{ "cat", "dog", "antelope"}));



    }

    public static void print2D(int[][] grid) {
        // outer loop for rows - length of array of arrays
        for (int[] row : grid) {
            // inner loop for cols - length of individual array
            for (int elt : row) {
                System.out.print(elt + " ");
            }
            System.out.println(); // newline after row
        }

    }

    public static void print2D(String[][] grid) {
        // outer loop for rows - length of array of arrays
        for (int i = 0; i < grid.length; i++) {
            // inner loop for cols - length of individual array
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // newline after row
        }
    }

    public static int totalSum(int[][] grid) {
        int Sum = 0;
        for (int[] row : grid) {
            for (int elt : row) {
                Sum = Sum + elt;




            }



        }
        return Sum;

    }

    public static int[][] makeMultTable(int highest) {
        int[][] table = new int[highest + 1][highest + 1];
        for (int i = 0; i < highest + 1; i++) {
            for (int j = 0; j < highest + 1; j++) {


                table[i][j] = i * j;
            }


        }
        return table;
    }

    public static String[][] makerows(int howmany, String... list) {
        String[][] list1 = new String[howmany][list.length];
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                list1[i][j] = list[j];
            }
        }
        return list1;


    }
}

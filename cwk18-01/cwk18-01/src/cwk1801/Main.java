/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk1801;

/**
 *
 * @author apatel15
 */
public class Main {

    public static <T> void printBackward(T list[]) {
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
             }





    }
    public static <T> T chooseRandom(T list[]){
        int r=(int)(Math.random()*list.length);
            return  list[r];


        }




    public static void main(String[] args) {
        String[] strArray={"hello","hiii"};
        Integer[] intArray={1,2,3,4,5};
        printBackward(strArray);
        printBackward(intArray);
        System.out.println(chooseRandom(strArray));
         System.out.println(chooseRandom(intArray));
         HasFive<Integer,Integer,String,String,Namey> h1= new  HasFive<Integer,Integer,String,String,Namey>(5,10,"hi","name",new Namey("cat"));
         System.out.println(h1);
         HasFive<Integer,String,Integer,String,Namey> h2=new HasFive<Integer,String,Integer,String,Namey>(8,"horse",15,"dog",new Namey("pop"));
          System.out.println(h2);



    }
}

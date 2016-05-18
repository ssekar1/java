
package cwrk08;

public class cwrkMain {
    public static void main(String[] args){
        int size = 6;
        double[] doubleArray = makeNums(size);
        String[] stringArray = {"Hello", "world", "how", "is", "your", "day"};
        String[] bunnyNames = {"Bob", "Angy", "Will", "Steve", "Patrick"};

        for(int i = 0; i < doubleArray.length; i++){
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();

        System.out.println("The shortest word in the stringArray is " + stringArray[shortestFinder(stringArray)]);

        System.out.println("The largest double in the doubleArray is " + findMax(doubleArray));

        System.out.println(mashUp(stringArray));

        printList(makeBunnies(bunnyNames));
    }

    public static double[] makeNums(int size){
        double[] theArray = new double[size];

        for(int i = 0; i < size; i++){
            theArray[i] = Math.random() * 100 + 50;
        }

        return theArray;
    }

    public static int shortestFinder(String [] theArray){
        int shortest = 0;
        for(int i = 0; i < theArray.length; i++){
            if(theArray[i].length() < theArray[shortest].length()){
                shortest = i;
            }
        }
        return shortest;
    }

    public static double findMax(double...list ){
        if(list != null){
            double num = list[0];
            for(int  i = 1; i < list.length; i++){
                if(list[i] > num){
                    num = list[i];
                }
            }
            return num;
        }else{
            return 0;
        }
    }

    public static String mashUp(String...list){
        if(list != null){
            String output = "";
            for(int i = 0; i < list.length; i++){
                output += list[i] + " ";
            }
            return output;
        }else{
            return "There was no input";
        }
    }

    public static Bunny[] makeBunnies(String[] stringArray){
        Bunny[] bunnyArray = new Bunny[stringArray.length];

        for(int i = 0; i < bunnyArray.length; i++){
            bunnyArray[i] = new Bunny(stringArray[i], i);
        }

        return bunnyArray;
    }

    public static void printList(Bunny[] bunnyArray){
        String output = "";
        for(int i = 0; i < bunnyArray.length; i++){
            output += bunnyArray[i].toString() + " ";
        }

        System.out.println(output);
    }

}

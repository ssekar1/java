
package cwrk2001;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student theStudent = new Student();
        boolean check = false;


        while(!check){
            try{
                System.out.println("Enter the name: ");
                theStudent.setName(scan.next());
                System.out.println("Enter the age: ");
                theStudent.setAge(Integer.parseInt(scan.next()));
                System.out.println("Enter your gpa: ");
                theStudent.setGpa(Double.parseDouble(scan.next()));
                check = true;
            }catch(NumberFormatException ex){
                System.out.println("Number Format Exception");
            }catch(IllegalArgumentException ex){
                System.out.println("Illegal Argument Exception");
            }finally{
                System.out.println("Lets Continue");
            }
            scan.nextLine();
        }
    }

}

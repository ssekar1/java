
package cwrk1203;


public class Main {

    public static void main(String[] args) {
        int floors;
        int number;
        for(int i = 0; i < 10; i++){
            floors = (int)(Math.random() * Apartment.FLOORS);
            number = (int)(Math.random() * Apartment.APTSPERFLOOR);

            Apartment.rent(floors, number);
        }
    }

}

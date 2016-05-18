
package cwrk1203;

public class Apartment {
    private AptType theApartment;
    private boolean isRented = false;
    public static final int FLOORS = 4;
    public static final int APTSPERFLOOR = 10;

    private static Apartment[][] building;

    static{
        building = new Apartment[FLOORS][APTSPERFLOOR];
        for(int i = 0; i < FLOORS; i++){
            for(int j = 0; j < APTSPERFLOOR; j++){
                building[i][j] = new Apartment();
                building[i][j].theApartment = AptType.values()[i];
            }
        }
    }

    public static void rent(int floor, int number){
        if(!building[floor][number].isRented){
            building[floor][number].isRented = true;
            System.out.println("You are renting a " + building[floor][number].theApartment.size + " square foot " + building[floor][number].theApartment.name + " apartment for $" + building[floor][number].theApartment.rent + " / month. Welcome to our building");
        }else if(building[floor][number].isRented){
            System.out.println("Sorry, the room you requested is already taken.");
        }else{
            System.out.println("You entered at least one invalid number");
        }
    }
}

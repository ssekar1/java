
package cwrk1203;

public enum AptType{
    STUDIO("Studio", 520, 480),
    BEDROOM1("1 Bedroom", 810, 720),
    BEDROOM2("2 Bedroom", 1120, 1030),
    PENTHOUSE("Penthouse", 1720, 1780);

    public final String name;
    public final int size;
    public final int rent;

    private AptType(String nameVal, int sizeVal, int rentVal){
        name = nameVal;
        size = sizeVal;
        rent = rentVal;
    }

}

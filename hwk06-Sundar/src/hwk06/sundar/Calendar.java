/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk06.sundar;

/**
 *
 * @author Ssekar1
 */
public class Calendar {
    // Instance variables
    public String monthname;
    public int daynumber;
    public int startnumber;
    // Accessors

    public String getMonthname() {
        return monthname;
    }

    public int getDaynumber() {
        return daynumber;

    }
    
    public int getStartnumber() {
        return startnumber;
    }
    // Mutators
    public void setMonthname(String newmonth) {
        monthname = newmonth;
}
    public void setDaynumber(int newdaynum){
        daynumber=newdaynum;
    }
    public void setStartnumber(int newstartnum){
        startnumber=newstartnum;
    }
    // no parameter constructor
    public Calendar(){
        monthname="unnamed month";
        daynumber=0;
        startnumber=0;
    }
    //parameterized constructor

    public Calendar(String newMonth, int newDaynum, int newStartnum) {
        setMonthname(newMonth);
        setDaynumber(newDaynum);
        setStartnumber(newStartnum);
}
    public void print(){
        System.out.println("----------------------");
        System.out.println("        " + monthname + "      ");
        System.out.println("----------------------");
        System.out.println(" S  M  T  W  T  F  S ");
        for (int i = 0; i < startnumber; i++) {
            System.out.print("   ");
        }
        for (int numberOfWeeks = 1; numberOfWeeks <= 1; numberOfWeeks++) {

            for (int days = 1; days <= daynumber; days++) {
                if (days <= 9) {
                    System.out.print(" " + days);
                    System.out.print("");
                } else if (days > 9) {
                    System.out.print(days);
                    System.out.print("");
                }
                if ((startnumber + days) % 7 == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }

        }
        System.out.println("\n----------------------");
    }
}
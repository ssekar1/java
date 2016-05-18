/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ssekar1
 */
public class Taxpayer {

    double income;
    int age;
    boolean married;
    boolean veteran;

    Taxpayer() {
        income = 0.0;
        age = 0;
        married = false;
        veteran = false;
    }
    // mutators

    public void setIncome(double yourIncome) {
        if (yourIncome >= 0) {
            income = yourIncome;
        }
    }// end of setIncome

    public void setAge(int yourAge) {
        if (yourAge >= 0) {
            age = yourAge;
        }
    }// end of setAge

    public void setMarried(boolean youMarried) {
        if (age >= 18) {
            married = youMarried;
        }
    }

    public void setVeteran(boolean youVeteran) {
        if (age >= 18) {
            veteran = youVeteran;
        }
    }
    // accesors

    public double getIncome() {
        return income;
    }

    public int getAge() {
        return age;
    }

    public boolean getMarried() {
        return married;
    }

    public boolean getVeteran() {
        return veteran;
    }

    public void printTax() {
        double taxPaid;
        if (income <= 10000) {
            taxPaid =0.0;

        }else if (income <= 35000) {
            taxPaid=.15*income;


        }
    }// end of printTax

    public String toString() {
        return String.format("Income: " + income + "\n" + "Age: " + age + "\n" + "Marital Status: " + married + "\n" + "Veteran Status: " + veteran);
    }
}

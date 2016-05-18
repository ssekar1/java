/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk0404;

/**
 *
 * @author ssekar1
 */
public class Fraction {

    private int numerator;
    private int denominator;
// constructors

    public Fraction() {
        numerator = 1;
        denominator = 2;

    }
// accesors

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
// mutators

    public void setDenominator(int val) {
        if (val != 0) {
            denominator = val;
        }
    }

    public void setNumerator(int val) {
        numerator = val;
    }

// para constructors
    public Fraction(int numVal, int denomVal) {
        setNumerator(numVal);
        setDenominator(denomVal);

    }

    public String toString() {
        return getNumerator() + "/" + getDenominator();

    }
}

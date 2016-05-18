/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk0404;

/**
 *
 * @author ssekar1
 */
public class FractionHarness {

    public static void main(String[] args) {
        Fraction testFrac = new Fraction();
        System.out.println(testFrac);
        // use accessors and mutators
        testFrac.setNumerator(2);
        testFrac.setDenominator(5);
        System.out.println(testFrac);

       // test paras
       Fraction newFrac= new Fraction(6,9);
       System.out.println(newFrac);
        // use accessors and mutators
        newFrac.setNumerator(5);
        newFrac.setDenominator(10);
        System.out.println(newFrac);

        Scorer newScorer = new Scorer();
        System.out.println(newScorer);
        newScorer.setScore(5,7);
        System.out.println(newScorer);
    }
}

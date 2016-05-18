/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk0404;

/**
 *
 * @author ssekar1
 */
public class Scorer {

    private String name;
    private Fraction score;

    public Scorer() {
        name = "default name";
        score = new Fraction(1, 1);
    }
    public Fraction getScore() {
        return score;

    }
    public void setScore(int val1, int val2) {
        score=new Fraction(val1, val2);
    }
    public void win() {
        score.setNumerator(score.getNumerator()+1);
        score.setDenominator(score.getDenominator()+1);

    }
    public void lose() {
        score.setDenominator(score.getDenominator()+1);

    }
     public String toString() {
         return "Constance has been successful " + score.getNumerator() + " out of " +
                 score.getDenominator() + " tries";
     }
}

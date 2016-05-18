/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1604;

/**
 *
 * @author ssekar1
 */
public class Fox implements Predator, Prey {
private double weight;

 public int nutrition() {
        return 160;
    }
 public void eat(Prey Y){
    System.out.println("Fox like to eat animal " + Y);
}
public boolean hunt(Prey x){
    return false;
}

    public Fox(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fox{" + " weight after eating " + weight + '}';
    }

}

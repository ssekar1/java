/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1604;

/**
 *
 * @author ssekar1
 */
public class Main {
  public static void nature(Predator A, Prey B){
 if (A.hunt(B)){
     A.eat(B);
 }

    }
  public static void runn(Run X){
      X.gorun();
  }


    public static void main(String[] args) {
      Lion X=new Lion("red");
      Deer Y=new Deer(120);
      Fox Z=new Fox(1.2);
      nature(X,Y);
      nature(X,Z);
      nature(Z,Y);
      nature(Z,Z);
          
      runn(Y);
      Tiger A=new Tiger();
      runn(A);
        }
    }




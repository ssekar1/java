/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1801;

/**
 *
 * @author apatel15
 */
public class HasFive <a,b,c,d,e> {
   private MyPair<a,b> first;
   private MyTriple<c,d,e> second;

    public HasFive(MyPair<a, b> first, MyTriple<c, d, e> second) {
        this.first = first;
        this.second = second;
    }

    public MyPair<a, b> getFirst() {
        return first;
    }

    public void setFirst(MyPair<a, b> first) {
        this.first = first;
    }

    public MyTriple<c, d, e> getSecond() {
        return second;
    }

    public void setSecond(MyTriple<c, d, e> second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "HasFive{" + "first=" + first + "second=" + second + '}';
    }
   public HasFive(a vala,b valb,c valc,d vald,e vale){
       first= new MyPair<a,b>(vala,valb);
       second=new MyTriple<c,d,e>(valc,vald,vale);

       
       
   }


}

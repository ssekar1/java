/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1801;

/**
 *
 * @author apatel15
 */

// generic class example
// A and B stand in for types to be specified
// no problem inheriting from ordinary class
class MyPair <A, B> extends Namey{

	private A first;
	private B second;

	// constructor
	public MyPair(A vala, B valb){
		super("Pair ");
		first = vala;
		second = valb;
	}

	// constructor
	public MyPair(A vala, B valb, String nval){
		super(nval);
		first = vala;
		second = valb;
	}


	// accessor for first
	public A getFirst() {
		return first;
	}

	// mutator for first
	public void setFirst(A val) {
		first = val;
	}

	// accessor for second
	public B getSecond() {
		return second;
	}

	// mutator for second
	public void setSecond(B val) {
		second = val;

		// doesn't make sense even if second will sometimes be a Cat
		// when writing generic class, treat unknown types as Object
		// val.miaow();
	}

	// string is the pair in parens
	public String toString() {
		return getName() + ": ("+first+", "+second+")";
	}
}





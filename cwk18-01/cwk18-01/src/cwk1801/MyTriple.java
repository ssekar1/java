/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1801;

/**
 *
 * @author apatel15
 */

class MyTriple <A, B, C> extends MyPair <A, B> {

	private C third;

	// constructor
	public MyTriple(A vala, B valb, C valc){
		super(vala, valb, "Triple ");
		third = valc;
	}

	// accessor for third
	public C getThird() {
		return third;
	}

	// mutator for third
	public void setThird(C val) {
		third = val;
	}

	// string is the triple in parens
	public String toString() {
		return getName() + ": ("+getFirst()+", "+getSecond()+", "+third+")";
	}
}


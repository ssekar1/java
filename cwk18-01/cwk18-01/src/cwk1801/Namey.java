/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1801;

/**
 *
 * @author apatel15
 */
public class Namey {
    private String name;

	public Namey(String val) {
		name = val;
	}

	// accessor for name
	public String getName() {
		return name;
	}

	// mutator for name
	public void setName(String val)
	{
		name = val;
	}

	// string is just name
	public String toString() {
		return name;
	}
}




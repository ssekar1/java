/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk0701;

/**
 *
 * @author apatel15
 */
public class Person {

	// primitive variable describing this person
	private int age;

	// Strings are reference variables
	private String name;

	// reference variables -- the family
	private Person mother;
	private Person father;
	private Person sister;
	private Person brother;
	private Person daughter;
	private Person son;



	/* Constructors ---------------------------------- */

	/**
	* default constructor
	**/
	public Person() {
		// set up default values
		this.name = "John Smith";
		this.age = 0;
		// don't try to get space for family --
		// infinite loop hell!

		// these are not needed,
		// but make default vals explicit
		this.mother = null;
		this.father = null;
		this.sister = null;
		this.brother = null;
		this.daughter = null;
		this.son = null;
	}


	/**
	* parameterized constructor -- no family
	**/
	public Person(String n, int a) {
		this();
		this.setName(n);
		this.setAge(a);
	}


	/**
	* parameterized constructor -- takes parents only
	**/
	public Person(String n, int a, Person mom, Person dad) {
		this(n, a);
		this.setMother(mom);
		this.setFather(dad);
	}




	/**
	* parameterized constructor -- takes whole family
	**/
	public Person(String n, int a, Person mom, Person dad, Person sis, Person bro, Person dau, Person sonny) {
		this(n, a, mom, dad);

		this.setSister(sis);
		this.setBrother(bro);
		this.setDaughter(dau);
		this.setSon(sonny);
	}







	/*  Accessors and Mutators -------------------------- */

	/**
	* accessor for name
	**/
	public String getName() {
		return this.name;
	}

	/**
	* mutator for name
	**/
	public void setName(String val) {
		this.name = val;
	}

	/**
	* Accessor for age
	**/
	public int getAge() {
		return this.age;
	}

	/**
	* mutator for age
	**/
	public void setAge(int val) {
		// set sane age range
		if (val >= 0 && val < 125) {
			this.age = val;
		}
	}

	/**
	* Accessor for mother
	**/
	public Person getMother(){
		return this.mother;
	}


	/**
	* Mutator for mother
	**/
	public void setMother(Person newvalue){
		if (newvalue != null) {
			this.mother = newvalue;
		}
	}


	/**
	* Accessor for father
	**/
	public Person getFather(){
		return this.father;
	}


	/**
	* Mutator for father
	**/
	public void setFather(Person newvalue){
		if (newvalue != null) {
			this.father = newvalue;
		}
	}


	/**
	* Accessor for sister
	**/
	public Person getSister(){
		return this.sister;
	}


	/**
	* Mutator for sister
	**/
	public void setSister(Person newvalue){
		if (newvalue != null) {
			this.sister = newvalue;
		}
	}


	/**
	* Accessor for brother
	**/
	public Person getBrother(){
		return this.brother;
	}


	/**
	* Mutator for brother
	**/
	public void setBrother(Person newvalue){
		if (newvalue != null) {
			this.brother = newvalue;
		}
	}


	/**
	* Accessor for daughter
	**/
	public Person getDaughter(){
		return this.daughter;
	}


	/**
	* Mutator for daughter
	**/
	public void setDaughter(Person newvalue){
		if (newvalue != null) {
			this.daughter = newvalue;
		}
	}


	/**
	* Accessor for son
	**/
	public Person getSon(){
		return this.son;
	}


	/**
	* Mutator for son
	**/
	public void setSon(Person newvalue){
		if (newvalue != null) {
			this.son = newvalue;
		}
	}

	/**
	* return true if the given Person is my sibling
	**/
	public boolean sibling(Person other) {
		// nonexistent Persons are not my sibling
		if (other == null) {
			return false;
		}

		// sibling if we have same mother
		if (this.mother != null
				&& other.mother != null
				&& this.mother == other.mother) {
			return true;
		}

		// sibling if we have same father
		if (this.father != null
				&& other.father != null
				&& this.father == other.father) {
			return true;
		}

                // any other case, not siblings
		return false;
	}

	/**
	* give information about this person and the family
	* return information as a string
	**/
	public String toString() {
		// build up the string through concatenation
		String str =  this.name + " is " + this.age
		+ " year" + (this.age ==1 ? "" : "s" )+" old.\n";

		if (this.getMother() != null) {
			str += "mother is " + this.getMother().getName() + "\n";
		}
		if (this.getFather() != null) {
			str += "father is " + this.getFather().getName() + "\n";
		}
		if (this.getSister() != null) {
			str += "sister is " + this.getSister().getName() + "\n";
		}
		if (this.getBrother() != null) {
			str += "brother is " + this.getBrother().getName() + "\n";
		}
		if (this.getDaughter() != null) {
			str += "daughter is " + this.getDaughter().getName() + "\n";
		}
		if (this.getSon() != null) {
			str += "son is " + this.getSon().getName() + "\n";
		}
		return str;
	}


}

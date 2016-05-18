/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk034;

/**
 *
 * @author ssekar1
 */
public class BankMemory {
public static void method2(Customer cust1, Customer cust2) {

			cust2 = cust1.acct.own;
			cust1.acct = new Account();
			cust2.acct.bal = 3999.50;
	}

	public static void method1(Customer cust, Account act, double bal) {
			act.bal = bal;
			bal = 99.33;
			act.own = cust;
			cust.acct = act;
			Account newAct = new Account();
			method2(cust, newAct.own);
	}


	public static void main(String[] args) {
		Customer joan = new Customer();
		Account ba2241 = new Account();
		double x = 4403.20;

		method1(joan, ba2241, x);

	}
}

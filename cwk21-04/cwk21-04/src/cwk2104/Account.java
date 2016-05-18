/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk2104;

/**
 *
 * @author apatel15
 */
public class Account {
    protected String name;
    protected int balance;

    public Account(){
        name= "unnamed";
        balance=0;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "name=" + name + "balance=" + balance + '}';
    }


}

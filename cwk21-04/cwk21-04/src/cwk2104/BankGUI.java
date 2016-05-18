/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk2104;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author apatel15
 */
public class BankGUI extends JFrame {

    private Account account;
    private JLabel name;
    private JLabel balance;
     private JTextField withdraw;
	private JTextField deposit;
        private JButton QuickCashButton;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public BankGUI(Account account) {
        this.account = account;
    }

    public BankGUI() {
        super("what is your name?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        account = new Account();
        String n=JOptionPane.showInputDialog("what is your name?");
        account.setName(n);
        account.setBalance(0);
        name= new JLabel(account.getName());
        balance= new JLabel(account.getBalance()+"");




    }

    public BankGUI(JLabel name, JLabel balance) {
        this.name = name;
        this.balance = balance;
    }

    public JLabel getBalance() {
        return balance;
    }

    public void setBalance(JLabel balance) {
        this.balance = balance;
    }
    public void setupWithdraw() {
		// input text box for carrots
		withdraw = new JTextField(account.getBalance());
		withdraw.setText("Withdraw");
		// on enter, change the name of the bunny to the value given
		withdraw.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						// carrotbox contains a string, so need to parse as int
							account.setBalance(account.getBalance()-Integer.parseInt(withdraw.getText()));
                                                        balance.setText(account.getBalance()+"");
					} catch(Exception ex) {
						// nasty message on bad input
						JOptionPane.showMessageDialog(
						BankGUI.this, 				// parent window to center over
						// just this would be the actionlistener, BunnyGUI.this gets us the outer class
						"enter a amountbalance, harebrain", 	// output to show
						"Bad Input", 				// message box title
						JOptionPane.ERROR_MESSAGE);	// message box style
					}
				}
			}
		);
	}
 public void setupDeposit() {
		// input text box for carrots
		deposit = new JTextField(account.getBalance());
		deposit.setText("Deposit");
		// on enter, change the name of the bunny to the value given
		deposit.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						// carrotbox contains a string, so need to parse as int
							account.setBalance(account.getBalance()+Integer.parseInt(withdraw.getText()));
                                                        balance.setText(account.getBalance()+"");
					} catch(Exception ex) {
						// nasty message on bad input
						JOptionPane.showMessageDialog(
						BankGUI.this, 				// parent window to center over
						// just this would be the actionlistener, BunnyGUI.this gets us the outer class
						"enter a amountbalance, harebrain", 	// output to show
						"Bad Input", 				// message box title
						JOptionPane.ERROR_MESSAGE);	// message box style
					}
				}
			}
		);
	}

public void setupQuickCashButton() {
		QuickCashButton = new JButton("withdraw amount");
		// on button click, feed the bunny some carrots
		QuickCashButton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                                    if(account.getBalance()>=20)

				}
			}
		);

}
}








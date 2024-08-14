/*This may sound unorthodoxed, but I wasn't entirely sure what this code would look like
*so decided to write it and then create the UML diagram.
*/

import java.util.Date;

public class CheckingAccount extends Account {
	
	private double limit = 100;
	
	public CheckingAccount(int newId, double newBalance, double newAnnualInterestRate, Date today, double overdraftLimit) {
		
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = today;
		limit = overdraftLimit;
		
	}
	
	void withdraw(double check) {
		if (check + limit > this.getBalance()) {
			System.out.println("Your Checking Account cannot be drawn to less than -$100.");
		} else {
			this.changeBalance(this.balance - check);
		}
	}
	
	public String toString() {
		String checkingAccountString = ("Id: " + this.getId() + " Balance: " + this.getBalance() + " Annual Interest Rate: " + this.getInterestRate() + " OverDraft Limit: " + this.limit + " Date Created: " + this.getDateCreated());
		return checkingAccountString;
	}

}

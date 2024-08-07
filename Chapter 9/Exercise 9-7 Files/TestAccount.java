//This program tests the Account class.
import java.util.Date;

public class TestAccount {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		Account test = new Account(1122, 20000, 4.5, today);
		
		test.withdraw(2500);
		
		test.deposit(3000);
		
		System.out.println("Account ID: " + test.getId());
		System.out.println("Balance: $" + test.getBalance());
		System.out.println("Monthlny Interest: " + test.getMonthlyInterest());
		System.out.println("Date Created: " + test.getDateCreated());

	}
	
	//I swear, I've been here before.
	
}
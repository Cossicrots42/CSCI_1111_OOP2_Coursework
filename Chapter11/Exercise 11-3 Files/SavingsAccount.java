
import java.util.Date;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int newId, double newBalance, double newAnnualInterestRate, Date today) {
		
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = today;
		
	}
	
	void withdraw(double cash) {
		if (cash > this.getBalance()) {
			System.out.println("Your Savings Account cannot be drawn to less than $0.");
		} else {
			this.changeBalance(this.balance - cash);
		}
	}
	
	public String toString() {
		String savingsAccountString = ("Id: " + this.getId() + " Balance: " + this.getBalance() + " Annual Interest Rate: " + this.getInterestRate() + " Date Created: " + this.getDateCreated());
		return savingsAccountString;
	}

}
/*I know artists are supposed to be sad, but what about computer nerds? Or is it just adolescence?
*Whatever, it doesn't matter I'm all 3. Or its...Muffin. Maybe it is Muffin. I used to think
*everything was Muffin, but I've since learned from that. Well, except for the part of me that
*hasn't. And it probably doesn't help that I made another batch. I thought they'd be yummy, but
*I never got to eat them. Actually, one of them I picked up and did start chewing on, but I always
*knew that wasn't the one I wanted, just one I was settling for, so I had to drop it.
*/
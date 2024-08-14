//This program simulates bank accounts by creating them as Java Objects
import java.util.Date;

public class Account {

	protected int id = 0;
	protected double balance = 0;
	protected double annualInterestRate = 0;
	protected Date dateCreated = new Date();
	
//Constructors
	
	public Account() {
		
	}
	
	public Account(int newId, double newBalance, double newAnnualInterestRate, Date newDateCreated) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = newDateCreated;
	}
	
//Methods
	
	double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}
	double getMonthlyInterest() {
		return (balance * (1 + ((annualInterestRate / 12) / 100)) - balance);
	}
	void withdraw(double cash) {
		balance = balance - cash;
	}
	void deposit(double check) {
		balance = balance + check;
	}
	
//Accessor and Mutator Methods
	
	public int getId() {
		return id;
	}
	public void changeId(int differentId) {
		id = differentId;
	}
	public double getBalance() {
		return balance;
	}
	public void changeBalance(double differentBalance) {
		balance = differentBalance;
	}
	public double getInterestRate() {
		return annualInterestRate;
	}
	public void changeInterestRate(double differentAnnualInterestRate) {
		annualInterestRate = differentAnnualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
//ToString Method
	public String toString() {
		String accountString = ("Id: " + this.getId() + " Balance: " + this.getBalance() + " Annual Interest Rate: " + this.getInterestRate() + " Date Created: " + this.getDateCreated());
		return accountString;
	}
}
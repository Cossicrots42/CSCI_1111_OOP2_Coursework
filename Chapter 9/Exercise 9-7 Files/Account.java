//This program simulates bank accounts by creating them as Java Objects
import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
//Anyone else have de ja vu right now?
//Constructors
	
	public Account() {
		
	}
	
	public Account(int newId, int newBalance, double newAnnualInterestRate, Date newDateCreated) {
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
	void withdraw(int cash) {
		balance = balance - cash;
	}
	void deposit(int check) {
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
}
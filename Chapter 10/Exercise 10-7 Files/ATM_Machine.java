import java.util.Scanner;
import java.util.Date;

/* Well, it turns out I've written all these programs already. But most of them were garbage so I had to
 * rewrite them. However, this one only needed a few tweaks and now it works perfectly! Except for maybe
 * the fact that the bank account can be overdrawn into the negatives with no reprocussions, however
 * nothing was brought up about that in the instructions so I'm golden.
 */

public class ATM_Machine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		java.util.Date date = new java.util.Date();
		Date today = new Date();
		Account[] ATM = new Account[10];
		for (int i = 0; i < 10; i++) {
			ATM[i] = new Account(i,100,0,today);
		}
		while (true) {
			System.out.println("This is an ATM machine.");
			int id = -1;
			while (id < 0 || id > 10) {
				System.out.println("Enter an id to start.");	
				id = input.nextInt();
				}
			
				int option = 0;
			
				while (option != 4) {
					System.out.println("Enter 1 to view the current Balance.");
					System.out.println("Enter 2 for withdrawing money.");
					System.out.println("Enter 3 for depositing money.");
					System.out.println("Enter 4 to exit.");
			
					option = input.nextInt();
			
					if (option == 1) {
						System.out.println("The current balance of your account is $" + ATM[id].getBalance());
					}
					if (option == 2) {
						System.out.println("How much money would you like to withdraw?");
						double withdrawl = input.nextDouble();
						ATM[id].withdraw(withdrawl);
					}
					if (option == 3) {
						System.out.println("How much money would you like to deposit?");
						double check = input.nextDouble();
						ATM[id].deposit(check);
					}
					if (option == 4) {
						break;
					}
					
			}
		}
	}
}

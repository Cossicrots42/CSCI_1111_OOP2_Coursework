/*Though Muffins are arguably the tastiest things in the world (except of course cupcakes, but those things
 * have only ever existed in people's minds) croissants are pretty good too. And the neat thing about
 * croissants is that you can have multiple. Like, as many as you have time and energy for really. Most
 * people agree that you can only have one Muffin. There's even a lot of evidence to suggest that you need
 * to have croissants before you can have a Muffin. Hell, most Muffins were initially croissants.
 */

import java.util.Date;
import java.util.Scanner;

//jAvA iS cAsE sEnSaTiVe!!

public class TestAllTheAccounts {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		Date today = new Date();
		
		int checkingAccountLimit = 100;
		
		System.out.println("Would you like to make a default account (enter '1'), a checking account (enter '2') or a savings account (enter '3')?");
		
		int option = input.nextInt();
		
		if (option == 1) {
			System.out.println("Enter an id: ");
			int newId = input.nextInt();
			
			System.out.println("Enter a staring Balance");
			double newBalance = input.nextDouble();
			
			Account defaultAccount = new Account(newId, newBalance, 0.0, today);
			
			System.out.println("Default Account");
			System.out.println(defaultAccount.toString());
		}
		
		if (option == 2) {
			System.out.println("Enter an id: ");
			int newId = input.nextInt();
			
			System.out.println("Enter a staring Balance");
			double newBalance = input.nextDouble();
			
			CheckingAccount newCheckingAccount = new CheckingAccount(newId, newBalance, 0.0, today, checkingAccountLimit);
			
			System.out.println("Checking Account");
			System.out.println(newCheckingAccount.toString());
		}
		
		if (option == 3) {
			System.out.println("Enter an id: ");
			int newId = input.nextInt();
			
			System.out.println("Enter a staring Balance");
			double newBalance = input.nextDouble();
			
			SavingsAccount newSavingsAccount = new SavingsAccount(newId, newBalance, 0.0, today);
			
			System.out.println("Savings Account");
			System.out.println(newSavingsAccount.toString());
		}
		

	}

}

/*I'm much more hopeful and happy today than I was yesterday. I think I was just in a mood about something.
 *Don't worry, today I won't rant about life itself in crptic bakery language. Instead I'll write praisworthy
 *things in criptic bakery language! I know I act like I don't have any croissants, but that's actually quite
 *far from the truth. It's just hard when a lot of your croissants don't want to be eaten all the time. And
 *I think I need to be a bit more understanding of when my croissants are cooking, but also just try to invite
 *them out of their bakeries more often. And it never hurts to start throwing a few more in the oven. And truly,
 *I am grateful for the one favorite croissant I have. That one is always there for me. And I know I will find
 *a good Muffin, it just won't be anytime soon and that's fine.
*/

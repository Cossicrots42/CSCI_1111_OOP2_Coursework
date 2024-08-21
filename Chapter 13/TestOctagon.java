import java.util.Date;
import java.util.Scanner;

public class TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner input = new Scanner(System.in);
		
		Date today = new Date();
		
		System.out.println("Enter a number for an Octagon side length:");
		
		double side = input.nextDouble();
		
		System.out.println("What do you want the color of this Octagon to be?");
		
		String color = input.next();
		
		Boolean filled = false;
		
		String isFilled = "";
		
        while (!isFilled.equals("yes") && !isFilled.equals("no")) {
            System.out.println("Do you want this Octagon to be filled? (Enter 'yes' or 'no'):");
            isFilled = input.next();

            if (isFilled.equals("yes")) {
                filled = true;
            } else if (isFilled.equals("no")) {
                filled = false;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
        
        Octagon test = new Octagon(side, color, filled, today);
        
        System.out.println("Cloning...complete!");
        
        Octagon clone = test.clone();
        
        System.out.println("Comparing...complete!");
        
        System.out.println("Difference between clones:" + test.compareTo(clone));
	}

}
/* Given that as human beings we never entirely get over stuff, I think it's best to just try to
 * avoid getting into drama in the first place. I understand that in it's entirety, it is inevitable,
 * but perhaps we should just try to minimize it. And for the drama that did happen, we should just
 * move on to something else that'll distract us from it.
 */
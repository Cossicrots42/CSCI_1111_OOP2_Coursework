import java.util.Scanner;
import java.util.Date;

public class TestTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program makes Java Triangle Objects. Start by entering a side length.");
		
		int side1 = input.nextInt();
		
		System.out.println("Enter a 2nd side length.");
		
		int side2 = input.nextInt();
		
		System.out.println("Enter a 3d side length.");
		
		int side3 = input.nextInt();
		
		System.out.println("Choose a color for the triangle.");
		
		String color = input.next();
		
		Boolean filled = false;
		
		String isFilled = "";
		
        while (!isFilled.equals("yes") && !isFilled.equals("no")) {
            System.out.println("Do you want this triangle to be filled? (Enter 'yes' or 'no'):");
            isFilled = input.next();

            if (isFilled.equals("yes")) {
                filled = true;
            } else if (isFilled.equals("no")) {
                filled = false;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
		
		Date today = new Date();
		
		Triangle one = new Triangle(side1, side2, side3, color, filled, today);
		
		System.out.println("Your Triangle: ");
		System.out.println(one.toString());
		System.out.println("Area: " + one.getArea());
		System.out.println("Perimeter: " + one.getPerimeter());
		System.out.println("Color: " + one.getColor());
		System.out.println("Filled: " + one.getFilled());
		System.out.println("Date Created: " + one.getDate());
		
	}

}
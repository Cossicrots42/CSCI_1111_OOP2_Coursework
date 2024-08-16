import java.util.Random;
import java.util.Scanner;

//Um, this right here is code. It does shit. Pretty cool, right?

public class IntegersArray {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Scanner input = new Scanner(System.in);
		
		int[] randomIntegers = new int[100];
		
		for (int i = 99; i >= 0; i--) {
			randomIntegers[i] = rand.nextInt(1000);
		}
		
		System.out.println("Enter a number 1-100 to access the array of random Integers.");
		
		int arrayThing = input.nextInt();
		
		try {
			System.out.println(randomIntegers[arrayThing - 1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("I SAID 1-100!!! Oh, I mean, Out of Bounds");
		}
		
	}
}
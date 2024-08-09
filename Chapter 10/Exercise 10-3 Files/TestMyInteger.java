import java.util.Scanner;
import java.util.Random;


public class TestMyInteger {
	
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		
		System.out.println("Jason, you know what this does. Or atleast what it's supposed to do. So just input a number I guess.");
		
		MyInteger cheese = new MyInteger(input.nextInt());
		
		System.out.println("So you want me to test ALL the methods? Well, strap yourself in. Let's get started.");
		
		System.out.println(cheese.getInteger() + " is even: " + cheese.isEven());
		System.out.println(cheese.getInteger() + " is odd: " + cheese.isOdd());
		System.out.println(cheese.getInteger() + " is prime: " + cheese.isPrime());
		
		System.out.println("Enough with your number, let's use one of mine.");
		
		int[] myNumbers = {42, 69, 7851, 5282023, 1831, 13};
		
		MyInteger MINE = new MyInteger(myNumbers[rand.nextInt(6)]);
		
		System.out.println(MINE.getInteger() + " is even: " + MINE.isEven(MINE));
		System.out.println(MINE.getInteger() + " is odd: " + MINE.isOdd(MINE));
		System.out.println(MINE.getInteger() + " is prime: " + MINE.isPrime(MINE));
		
		System.out.println("Our numbers are the same: " + MINE.equals(cheese));
		
		char[] numbersAsCharacters = {'4','3','5','8','6','8','8'};
		
		String numberAsAString = "4358688";
		
		MyInteger dontCallThisNumber = new MyInteger(parseInt(numbersAsCharacters));
		
		System.out.println("I'm pretty sure these methods work: " + dontCallThisNumber.equals(parseInt(numberAsAString)));
		
	}
	//Hope you don't mind if I put this over here, too. Just wanted to show that it works in a creative way.
	public static int parseInt(char[] number) {
        String actualNumber = new String(number);
        return Integer.parseInt(actualNumber);
    }
	public static int parseInt(String number) {
		return Integer.parseInt(number);
	}

}

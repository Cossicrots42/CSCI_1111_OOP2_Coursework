import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;

public class Programming17_3 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] integers = new int[100];
		
		for (int i = 0; i < integers.length; i++) {
			
			integers[i] = rand.nextInt(100);
			
		}
		
		String name = "Exercise17_03";
        String filePath = (name + ".dat");
        File myFile = new File(name + ".dat");
        
        try {
			myFile.createNewFile();
		} catch (IOException e1) {
			System.out.println("Bro, if you're reading this something got realy screwed up.");
			e1.printStackTrace();
		}

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (int j = 0; j < integers.length; j++) {
            	writer.write(integers[j] + " ");
            }
            
            writer.newLine();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        System.out.println(sumOfIntegers(name + ".dat"));

	}
	
	public static int sumOfIntegers(String FileName) {
			
		int sum = 0;
		
		try (BufferedReader reader = new BufferedReader(new FileReader(FileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split("\\s+");
                for (String number : numbers) {
                    sum += Integer.parseInt(number);
                }
            }
        } catch (IOException e) {
            System.out.println("Bro, somethin crazy happen");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Sorry, this program can only deal with integers.");
            e.printStackTrace();
        }
        
        return sum;
    }

}

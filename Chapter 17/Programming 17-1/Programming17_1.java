/* You know how a lot of cartoons have that one episode where the main character and their best
 * friend or whoever are out in some city trying to get some lunch, so they go to this one place,
 * get some food, decide they don't like it and go somewhere else, and then do that like a dozen
 * times? All I can think about that is who has that kind of money?
 * 
 */

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Random;

public class Programming17_1 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] integers = new int[100];
		
		for (int i = 0; i < integers.length; i++) {
			
			integers[i] = rand.nextInt(100);
			
		}
		
		String name = "Exercise17_01";
        String filePath = (name + ".txt");
		File txtFile = new File(name);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (int j = 0; j < integers.length; j++) {
            	writer.write(integers[j] + " ");
            }
            
            writer.newLine();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

	}

}

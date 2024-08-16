import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WriteToThatFile {

	public static void main(String[] args) {
		
		String name = "Exercise12_15";
		
		File txtFile = new File(name);
		
		Random rand = new Random();
		
		int[] randomIntegers = new int[100];
		
		//A neat thing I learned from ChatGPT is that this is a better way to populate arrays.
		for (int i = 0; i < randomIntegers.length; i++) {
			
			randomIntegers[i] = rand.nextInt(1000);
			
		}
		
		//I genuinely don't know how this bit works, but somehow it does and it doesn't seem to work any other way.
		if (txtFile.exists()) {
			
			System.out.println("Dude, that file already exists.");
            return;
            
		}
		//And yes, I did steal it from the internet. But that's like, how you code, isn't it?
		
		try (PrintWriter writer = new PrintWriter(txtFile)) { 
            for (int j = 0; j < randomIntegers.length; j++) {
                writer.println(randomIntegers[j] + " ");
            }
            System.out.println("Writing complete!");
        } catch (FileNotFoundException e) {
            System.out.println("That File doesn't exist for some reason. I bet Jared broke the code.");
        }
		
		int orderedIntegers[] = new int[100];
		
		try {
			Scanner fileReader = new Scanner(txtFile);
			
			int k = 0;
			
			while (fileReader.hasNextInt() && k < orderedIntegers.length) {
                
				orderedIntegers[k] = fileReader.nextInt();
                k++;
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Arrays.sort(orderedIntegers);
        System.out.println("Alright, here's those numbers in increasing order:");
        for (int num : orderedIntegers) {
            System.out.print(num + " ");
        }
	}
/*Ready for more criptic bakery language? ... No? OK ... how about I tell you anyway? Nah, I'm not sure
 * what to say actually. Today's just kinda chill I guess. I mean, there's a part of me that still
 * wants that gosh awful Muffin because he still thinks its a cupcake. And to that part, I say, "Are
 * you ever gonna let that go?" Like, seriously, its almost been a year now. But on the flipped side,
 * a new Muffin I've been looking at seems mighty scrumptious. The only issue is that we're both getting
 * deported kinda soon. So I havn't even started to pick that one up yet.
 */
}
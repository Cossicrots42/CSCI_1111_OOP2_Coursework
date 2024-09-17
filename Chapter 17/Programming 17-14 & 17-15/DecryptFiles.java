import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DecryptFiles {

	public static void main (String[] args) throws IOException {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the path to the file you wish to decrypt. Do not leave off the .type part.");

        String fileName = input.nextLine();
        File file = new File(fileName);
        
        if (file.exists() && file.isFile()) {
        	
            System.out.println("Wait for it...");
           
                DecryptFile(file);
            
        } else {
        	
        	System.out.println("An error occurred - Does the file exist?");
        	
        }
        
        input.close();
    }
	
	public static void DecryptFile(File DecryptMe) {
		
		try (FileInputStream readFile = new FileInputStream(DecryptMe)) {
            
			String newFileName = ((DecryptMe.getName()).substring(11));
			
			File decrypted = new File(newFileName);
				
			int value;
			
			try (FileOutputStream writeFile = new FileOutputStream(newFileName)) {
				while ((value = readFile.read()) != -1) {
					
					writeFile.write((value - 5) & 0xFF);
					
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("Succesfully restored " + newFileName);
            
        } catch (IOException e) {
            System.out.println("An error occurred - Does the file exist?");
            e.printStackTrace();
        }
	}

}

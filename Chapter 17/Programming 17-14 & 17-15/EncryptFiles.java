import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*Let me guess, you probably think that people who pay for ChatGPT+ are nerds. And perhaps you're
* probably right. But one day my Dad found out what fancy GPT could do, and he wanted it. So I 
* shared my ChatGPT login with him and now I see he uses it too.
*/

public class EncryptFiles {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the path to the file you wish to encrypt. Do not leave off the .type part.");

        String fileName = input.nextLine();
        File file = new File(fileName);
        
        if (file.exists() && file.isFile()) {
        	
            System.out.println("Wait for it...");
           
                EncryptFile(file);
            
        } else {
        	
        	System.out.println("An error occurred - Does the file exist?");
        	
        }
        
        input.close();
    }
	
	public static void EncryptFile(File encryptMe) {
		
		try (FileInputStream readFile = new FileInputStream(encryptMe)) {
            
			String newFileName = ("(encrypted)" + encryptMe.getName());
			
			File encrypted = new File(newFileName);
				
			int value;
			
			try (FileOutputStream writeFile = new FileOutputStream(newFileName)) {
				
				while ((value = readFile.read()) != -1) {
					
					writeFile.write((value + 5) & 0xFF);

				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("Succesfully created " + newFileName + "!");
            
        } catch (IOException e) {
            System.out.println("An error occurred - Does the file exist?");
            e.printStackTrace();
        }
	}
}

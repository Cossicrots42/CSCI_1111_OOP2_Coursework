/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rmazorow
 */
import java.io.*;

public class Exercise17_07 {
    public static void main(String[] args) throws FileNotFoundException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);
        
        //Just to test functionality
        Loan loan3 = new Loan(1.8, 10, 20000);
        Loan loan4 = new Loan(1.8, 10, 42000);
        Loan loan5 = new Loan(1.8, 10, 6900);
        
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));) {
            output.writeObject(loan1);
            output.writeObject(loan2);
            
            
            //Also to test functionality
            output.writeObject(loan3);
            output.writeObject(loan4);
            output.writeObject(loan5);
        } 
        catch (IOException ex) {
            System.out.println("File could not be opened");
        }
        
        outputData();
    }
    
    public static void outputData() {
    	
    	try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_07.dat"));) {
    		try {
    				String line;
    				while (true) {
    					try {
    						Loan thing = (Loan)(input.readObject());
    						System.out.println("Loan Amount:" + thing.getLoanAmount());
    				} catch (EOFException e){
    					break;
    				}
    			}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
    	}
    	catch (IOException ex) {
            System.out.println("File could not be opened");
        }
    	
    }
}

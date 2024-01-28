package catchTry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinallyYourOwnException {

	public static void main(String[] args)  {
		int a=10;
		int b=0;
		int c=0;
		//below two are unchecked exception, that is Run time exception
		try {
			
			int array[]=null;
			System.out.println(array[1]);
			c=a/b;
			
		}
		
	
		catch(ArithmeticException  e){
			System.out.println("Error occured" + e);
		}
		catch(NullPointerException e){
			System.out.println("Error occured" + e);
		}
		/*catch(ArithmeticException | NullPointerException e){
			System.out.println("Error occured" + e);
			We can give both the exceptions together in a single catch
		}*/
		/*catch(Exception e){
			System.out.println("Error occurred");
			
		}*/
		//System.out.println(c);
		//System.out.println("End of program");
		finally{
			System.out.println(c);
			System.out.println("End of program");
			
		}
		//The below one is a checked exception
		File file= new File("abc.txt");
		try {
			FileInputStream fs = new FileInputStream(file); 
			//to read data from the file
		}
		catch(FileNotFoundException e){
		System.out.println("File not existing " + e );
		e.printStackTrace();
		//The above two lines of codes can be used appropriately for printing the error
		}
		int i=0;
		System.out.println("Taking the value from the user");
		try(Scanner scanner = new Scanner(System.in))
		{
			i= scanner.nextInt();
			
		}
		System.out.println(i);
		
	
	/*If we use scanner we are supposed to close the scanner
	 using the code scanner.close(). That is the best way to use the resourses'
	 If we use the same in try catch block we need not have to close the scanner.
	 */
	/* Next we are demonstrating how uer can define his own exception*/
    int balance=800;
    int withdrawamount=700;
    try {
    if(balance < withdrawamount) {
    	throw new InsufficientFundException(withdrawamount -balance);
  
	}
    else {
    	System.out.println("Withdrawl is allowed OK");
    }
    }
    catch(InsufficientFundException e){
    System.out.println("Insufficient fund");	
    }
}
}

	




	

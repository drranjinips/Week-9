package catchTry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatchTryFinally {
	
	public static void main(String[] args) {
		int a=10 , b=5 ; 
		int c=0;
		try {
			int arr[]=null;
			System.out.println(arr[7]);
			c=a/b;
			
			//System.out.println(c);
			//System.out.println("Try Block");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception has occured");
			
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception has occured");
		}
		catch(Exception e) {
			System.out.println("Some Error  has occured");
		}
		finally {
			System.out.println(c);	
			System.out.println("End of the Programme");	
		}
		File file = new File("abc.txt");
		try {
			FileInputStream fs= new FileInputStream(file);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		/*This didn't work
		
		Scanner obj=new Scanner(System.in);
		int j= obj.nextInt();
		System.out.println(j);
		obj.close();
		try(Scanner objtwo=new Scanner(System.in)){
			
			int j = objtwo.nextInt();
		}
		System.out.println(j);
		*/ 	
	}

}
//In the above code we have demonstrated file not found exception
//e.printStackTrace() is giving us the reason why the error is 
// Instead of closinng Scanner we can gice it in a try block
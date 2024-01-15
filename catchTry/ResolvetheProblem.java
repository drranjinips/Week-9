package catchTry;

public class ResolvetheProblem {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		//The below code demonstrate where we are expecting a problem that code we have to keep in try
		
		try{
		   c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Error occured");
			//Below code display error in red color
			System.err.println("Error occured");
		}
		
		System.out.println("End of Program");

	}

}

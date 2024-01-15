package catchTry;

public class MultilpeCatch {

	public static void main(String[] args) {
		try {
			int a= args.length; //args.length will assign the length as 0
			System.out.println(" a " + a);
			int b = 50/a;
						
			int c[]= {1,8,9};
			c[42]=99;
			int d[]= {};
			System.out.println(d[4]);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Error encountered object" + e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error encountered");
			
		}
		
		
		System.out.println("After try/catch  blocks");
		
	}

}

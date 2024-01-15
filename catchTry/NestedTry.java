package catchTry;

public class NestedTry {

	public static void main(String[] args) {
		
		try {
			int a= args.length; //args.length will assign the length as 0
			System.out.println(" a " + a);
			int b = 50/a;
			if (a==1)
				a=a/(a-a);
			if (a==2) {
				int c[] = { 1 };
				c[42]=99;
			}
						
		}
		catch(NullPointerException e) {
			System.out.println("Array index out of bounds " + e);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by 0  " + e);
		}
	}

}

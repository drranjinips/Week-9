package catchTry;

public class DemoFinally {

	public static void main(String[] args) {
		try {
			int a[]= {3,4,5,6,7};
			System.out.println("Value is: " +a[6]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println(" Executed after considering exception");
		}
	}

}

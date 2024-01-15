package catchTry;

public class StringException {

	public static void main(String[] args) {
		try {
			int a[]=null;
			System.out.println(a[3]);
			
			
		}
		catch(Exception e) {
			System.out.println("Error encounterd");
			System.err.println("Error encounterd");
			
		}

	}

}

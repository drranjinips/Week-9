package catchTry;

import java.util.Random;

public class HandleError {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		Random r= new Random();
		for (int i=0; i<=150; i++ ) {
			try {
				b=r.nextInt();
				c=r.nextInt();
				a=3500/(b/c);
				System.out.println(a);
				
			}
			catch( Exception e) {
				System.out.println("Error Encountered");
				
			}
			
		}

	}

}

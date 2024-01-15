package catchTry;
import java.io.*;
import java.io.IOException;

public class Throws {

	void numcheck(int num) throws IOException , ClassNotFoundException {
	if (num==1) {
		throw new IOException("IO Exception");
	}
	else {
		throw new ClassNotFoundException("Class Not Found");
	}
	}
	public static void main(String[] args) {
		Throws objone = new Throws();
		try {
			objone.numcheck(3);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}

}

package catchTry;

public class Throw {
	void voter(int age) {
		if (age <=18) {
			throw new ArithmeticException("Not eligible for voting");
		}
		else {
			System.out.println("Eligible for voting");
		}
	}
	public static void main(String[] args) {
		Throw objone = new Throw();
		objone.voter(21);

	}

}

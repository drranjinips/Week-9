package catchTry;

public class InsufficientFundException extends Exception {
	int amount;
	InsufficientFundException(int amt) {
		amount=amt;
	}
	
}

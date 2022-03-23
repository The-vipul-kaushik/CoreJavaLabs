package Lab5;

public class NotEligibleAgeException extends Exception{

	private static final long serialVersionUID = 1L;

	public NotEligibleAgeException() {

	}

	public NotEligibleAgeException(String message) {
		super(message);

	}
}

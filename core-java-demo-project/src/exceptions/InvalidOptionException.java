package exceptions;

//public class InvalidOptionException extends RuntimeException{ // unchecked exception
public class InvalidOptionException extends Exception{ // checked exception
	int option;
	
	public InvalidOptionException(int option) {
		this.option = option;
	}

	@Override
	public String getMessage() {
		return "Option " + option + " is invalid!";
	}
	
}

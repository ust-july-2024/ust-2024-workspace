package exceptions;

public class Demo3 {

	public static void main(String[] args) {
		// throw is used to explicitly throw an exception
		// throw is more useful for custom exception
		// custom exceptions are not implicitly thrown by the JVM
		try {
			ArithmeticException ae = new ArithmeticException();
			throw ae;	
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
	}

}

package exceptions;

public class Demo5 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (InvalidOptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void method1() throws InvalidOptionException {
		method2();
	}
	
	public static void method2() throws InvalidOptionException {
		method3();
	}

	public static void method3()throws InvalidOptionException, ArithmeticException {
		int option = 7;
		
		if(option > 5 || option < 1) {
			InvalidOptionException ioe = new InvalidOptionException(option);
			throw ioe;
		}	
	}
	
}

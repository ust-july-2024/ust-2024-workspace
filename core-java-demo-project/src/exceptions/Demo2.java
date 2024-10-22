package exceptions;

public class Demo2 {
	// try, catch, finally, throw, throws
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int answer = 0;
		
		System.out.println("Going to Divide...");
		
		try {
			answer = num1 / num2; // 1. JVM figures out that an exception has occured and also its type
			// 2. JVM automatically creates an object of that exception type
			// 3. JVM will throw the exception object
			// 4. the catch block will handle the exception
			// 5. after that the program continues
	
		}catch(ArithmeticException ae) {
			// handle the exception here
			System.out.println("An exception has occured...");
			System.out.println(ae.getMessage());
			System.out.println("Fixing it...");
			num2 = 1;
			answer = num1 / num2;
		}catch(ArrayIndexOutOfBoundsException aieo) {
			System.out.println(aieo.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			// what kind of code goes here?
			// closing of resources
		}
		System.out.println("Answer is : " + answer);
		System.out.println("Division over...");
	}
}

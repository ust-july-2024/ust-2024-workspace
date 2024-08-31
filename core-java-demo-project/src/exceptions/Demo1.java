package exceptions;

public class Demo1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int answer = 0;
		
		System.out.println("Going to Divide...");
		
		answer = num1 / num2; // 1. JVM figures out that an exception has occured and also its type
								// 2. JVM automatically creates an object of that exception type
								// 3. JVM will throw the exception object
								// 4. the default handler will handle the exception
								// 5. when the control goes to the default handler it will never come back to your program
		
		System.out.println("Answer is : " + answer);
		System.out.println("Division over...");
	}

}

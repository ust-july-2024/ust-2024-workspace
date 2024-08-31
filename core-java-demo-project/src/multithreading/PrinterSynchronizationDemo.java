package multithreading;

public class PrinterSynchronizationDemo {

	public static void main(String[] args) {
		PrinterResource printer = new PrinterResource();
		
		PrintRequestThread pt1 = new PrintRequestThread("One", printer, "hello");
		PrintRequestThread pt2 = new PrintRequestThread("Two", printer, "welcome");
		PrintRequestThread pt3 = new PrintRequestThread("Three", printer, "java");
	}

}

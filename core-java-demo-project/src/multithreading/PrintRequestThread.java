package multithreading;

public class PrintRequestThread implements Runnable{
	Thread t;
	PrinterResource printer;
	String msg;
	
	public PrintRequestThread(String name, PrinterResource printer, String msg) {
		this.msg = msg;
		this.printer = printer;
		
		t = new Thread(this);
		t.setName(name);
		t.start();
	}
	
	@Override
	public void run() {
		synchronized(printer) {
			printer.print(msg);	
		}
	}
}

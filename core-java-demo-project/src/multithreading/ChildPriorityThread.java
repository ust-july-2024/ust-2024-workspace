package multithreading;

public class ChildPriorityThread implements Runnable{
	Thread t;
	long counter;
	
	public ChildPriorityThread(String name, int priority) {
		t = new Thread(this);
		t.setName(name);
		t.setPriority(priority);
		t.start();
	}
	
	@Override
	public void run() {
		while(true) {
			counter++;
		}
	}
}

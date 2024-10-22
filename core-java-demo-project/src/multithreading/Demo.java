package multithreading;

public class Demo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("ID : " + t.getId());
		System.out.println("Name : " + t.getName());
		System.out.println("Priority : " + t.getPriority());
		System.out.println("State : " + t.getState());
		
		ChildThread ct1 = new ChildThread("Child One");
		ct1.start();
		
		ChildRunnable cr1 = new ChildRunnable("Child Two");
		cr1.t.start();
		
		for(int i=1;i<5;i++) {
			System.out.println(t.getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			ct1.join();
			cr1.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getName() + " over...");
	}

}

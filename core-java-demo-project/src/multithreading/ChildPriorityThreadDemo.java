package multithreading;

public class ChildPriorityThreadDemo {

	public static void main(String[] args) {
		ChildPriorityThread cpt1 = new ChildPriorityThread("Child1", Thread.MIN_PRIORITY);
		ChildPriorityThread cpt2 = new ChildPriorityThread("Child2", Thread.MAX_PRIORITY);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cpt1.t.stop();
		cpt2.t.stop();
		
		System.out.println(cpt1.t.getName() + " : " + cpt1.counter);
		System.out.println(cpt2.t.getName() + " : " + cpt2.counter);
	}

}

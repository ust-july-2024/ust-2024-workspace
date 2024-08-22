package classesandobjects;

public class Snake extends Animal{
	
	Snake(String name){
		super(name);
	}

	@Override
	void mobility() {
		System.out.println(getName() + " crawls.");
	}
	
	void attacks() {
		System.out.println(getName() + " attacks.");
	}
}

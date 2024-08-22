package classesandobjects;

public class Dog extends Animal{

	Dog(String name){
		super(name);
	}
	
	@Override
	void mobility() {
		System.out.println(getName() + " walks on 4 legs");
	}
	
	void friendly() {
		System.out.println(getName() + " is friendly");
	}
}

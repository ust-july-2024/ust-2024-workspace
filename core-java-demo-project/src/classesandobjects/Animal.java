package classesandobjects;

// 1. if a class contains atleast one abstract method then the class becomes an abstract class
// 2. we cannot create an object for an abstract class
// 3. also called as incomplete class
// 4. abstract classes are meant to be inherited


public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void breathe() {
		System.out.println(name + " breathes...");
	}
	
	abstract void mobility();
}

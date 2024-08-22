package classesandobjects;

public class AnimalDemo {

	public static void main(String[] args) {
		Dog dog = new Dog("Roxie");
		dog.breathe();
		dog.mobility();
		dog.friendly();
		System.out.println("--------------");
		
		Snake snake = new Snake("Naga");
		snake.breathe();
		snake.mobility();
		snake.attacks();
		
		System.out.println("----------------");
		Animal animal1 = new Dog("Jackie"); // what does it mean to have a superclass reference variable pointing to a subclass object?
		
		Animal animal2 = new Snake("Pamba");
	}

}

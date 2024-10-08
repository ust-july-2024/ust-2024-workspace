package classesandobjects;

public class FordFigo {
	// a class can contain
	// 1. variables known as instance variables/fields/attributes/properties/data members/state
	// 2. methods known as member functions/behaviour
	// 3. block of statements within { }
	// 4. static blocks writtern as static{ }
	// 5. inner classes
	
	private String model;
	private String color;
	private int year;
	private double price;
	private String registrationNumber;
	
	FordFigo(String model, String color, int year, double price){
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
	}
	
	FordFigo(String model, String color, int year, double price, String registrationNumber){
		this(model, color, year, price); // constructor chaining
		this.registrationNumber = registrationNumber;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	String startCar() {
		return model + " is started.";
	}
	
	String accelerate() {
		return model + " is accelerated.";
	}
	
	String applyBrakes() {
		return model + " has applied mannual brakes.";
	}
	
	String stopCar() {
		return model + " is stopped";
	}
}

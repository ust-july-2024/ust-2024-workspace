package classesandobjects;

// polymorphism
// 2 types of polymorphism
// 1. compile time / static polymorphism
//		- eg. method overloading
//		- inheritence is not a pre-requisite
// 		- 2 or more mrthods with the same name but different arguments
// 		- different argument means either different no of args or order of args or type of args
//		- here we donot consider the return type
//		- best example for method overloading is the System.out.println()
// 2. runtime / dynamic polymorphism
//		- eg. method overriding
// 		- inheritence is a pre-requisite



public class FordFigoTitanium extends FordFigo {
	int noOfAirbags;
	
	public FordFigoTitanium(String model, String color, int year, double price, int noOfAirbags) {
		super(model, color, year, price); // constructor chaining
//		this.model = model;
//		this.color = color;
//		this.year = year;
//		this.price = price;
		this.noOfAirbags = noOfAirbags;
	}
	
	public FordFigoTitanium(String model, String color, int year, double price, String registrationNumber, int noOfAirbags) {
		super(model, color, year, price, registrationNumber);
		this.noOfAirbags = noOfAirbags;
	}
	
	String ejectAirbags() {
		return getModel() + " airbags ejected";
	}

	@Override
	String applyBrakes() {
		return getModel() + " ABS brakes are applied";
	}
	
	
}

package classesandobjects;

public class FordDemo {

	public static void main(String[] args) {
//		int mark;
//		mark = 50;
		
		int mark = 50;
		
//		FordFigo figo1;
//		figo1 = new FordFigo();
		FordFigo figo1 = new FordFigo("FIGO", "silver", 2023, 500000.0);
		
//		figo1.model = "FIGO";
//		figo1.color = "silver";
//		figo1.price = 500000.0;
//		figo1.year = 2023;
		//figo1.registrationNumber = "TN45Z3456";
		figo1.setRegistrationNumber("TN45Z3456");
		
		System.out.println(figo1.startCar());
		System.out.println(figo1.accelerate());
		System.out.println(figo1.applyBrakes());
		System.out.println(figo1.stopCar());
		System.out.println("---------------------------");
		
		FordFigo figo2 = new FordFigo("FIGO", "pear white", 2024, 550000.0, "TN453489");
		System.out.println(figo2.startCar());
		System.out.println(figo2.accelerate());
		System.out.println(figo2.applyBrakes());
		System.out.println(figo2.stopCar());
		
		System.out.println("---------------------------");
		FordFigoTitanium tita1 = new FordFigoTitanium("TITANIUM", "black", 2024, 660000.0, 4);
		System.out.println(tita1.startCar());
		System.out.println(tita1.accelerate());
		System.out.println(tita1.applyBrakes());
		System.out.println(tita1.ejectAirbags());
		System.out.println(tita1.stopCar());
		
	}

}

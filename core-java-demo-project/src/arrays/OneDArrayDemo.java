package arrays;

public class OneDArrayDemo {

	public static void main(String[] args) {
		int mathMark = 70;
		
		int[] myArray = new int[5];
		myArray[0] = 40;
		myArray[1] = 50;
		myArray[2] = 20;
		myArray[3] = 80;
		myArray[4] = 60;
		
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		System.out.println("--------------");
		for(int mark: myArray) {
			System.out.println(mark);
		}
		
		// intitialize
		int[] myData = {4,8,2,9,6,9,1,3};
	}

}

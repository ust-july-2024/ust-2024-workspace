package sortingandsearching;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] array = {20, 40, 50, 70, 75, 80, 95, 100, 120, 125, 150};
		int searchElement = 120;
		System.out.println("BInary search index : " + binarySearch(array, array.length, searchElement));
		System.out.println("BInary search index : " + binarySearch(array, array.length, 500));

	}

	// time complexity - O(log n) // n = 8, 2 power 3 = 8 // n = 64, 2 power 6 = 64
	public static int binarySearch(int[] myArray, int N, int searchElement) {
		
		int lowIndex = 0;
		int highIndex = N - 1; 
		
		while(lowIndex <= highIndex) {
			// calculate the midIndex
			int midIndex = (lowIndex + highIndex) / 2;
			if(searchElement == myArray[midIndex]) {
				return midIndex;
			} else if(searchElement < myArray[midIndex]) {
				highIndex = midIndex - 1;
			} else if(searchElement > myArray[midIndex]) {
				lowIndex = midIndex + 1;
			}	
		}
		return -1;
	}
}

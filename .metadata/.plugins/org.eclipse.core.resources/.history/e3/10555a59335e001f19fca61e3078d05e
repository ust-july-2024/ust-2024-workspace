package sortingandsearching;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int[] array = {3, 9, 34, 1, 20, 70, 52, 43, 15};
		
		int searchIndex = linearSearchByElement(array, array.length, 100);
		System.out.println("52 is at index : " + searchIndex);
		
		System.out.println("Element at index 4 is :" + searchByIndex(array, array.length, 4));
	}

	// time complexity - O(n) - linear time complexity
	public static int linearSearchByElement(int[] myArr, int N, int searchElement) {
		for(int i=0;i<N;i++) {
			if(myArr[i] == searchElement) {
				return i;
			}
		}
		return -1;
	}
	
	// time complexity - O(1) - constant time complexity
	public static int searchByIndex(int[] myArr, int N, int index) {
		return myArr[index];
	}
}

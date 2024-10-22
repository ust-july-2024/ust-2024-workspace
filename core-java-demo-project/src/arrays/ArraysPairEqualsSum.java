package arrays;

public class ArraysPairEqualsSum {

	//{10, 20, 35, 50, 75, 80}
	// sum = 70
	
	public static void main(String[] args) {
		
		int[] sortedArray = {10, 20, 35, 50, 75, 80};
		int sum = 70;
		int sum1 = 112;
		System.out.println("Naive approach : " + isPairEqualsSumNaive(sortedArray, sum));
		System.out.println("Naive approach : " + isPairEqualsSumNaive(sortedArray, sum1));
		System.out.println("----------------------------------------");
		System.out.println("Naive approach : " + isPairEqualsSumTwoPointerApproach(sortedArray, sum));
		System.out.println("Naive approach : " + isPairEqualsSumTwoPointerApproach(sortedArray, sum1));
	}
	
	// time complexity - O(n*n) 
	public static boolean isPairEqualsSumNaive(int[] sortedArray, int sum) {
		for(int i=0;i<sortedArray.length-1;i++) {
			for(int j=i+1;j<sortedArray.length;j++) {
				if((sortedArray[i] + sortedArray[j]) == sum) {
					return true;
				}
				if((sortedArray[i] + sortedArray[j]) > sum) {
					break;
				}
			}
		}
		return false;
	}
	
	// {10, 20, 35, 50, 75, 80}
	// sum = 70
	// time complexity - O(n/2) which is O(n)
	// space complexity - O(1)
	public static boolean isPairEqualsSumTwoPointerApproach(int[] sortedArray, int sum) {
		int startPointer = 0;
		int endPointer = sortedArray.length - 1;
		
		while(startPointer < endPointer) {
			if((sortedArray[startPointer] + sortedArray[endPointer]) == sum) {
				return true;
			}else if((sortedArray[startPointer] + sortedArray[endPointer]) < sum) {
				startPointer++;
			}else if((sortedArray[startPointer] + sortedArray[endPointer]) > sum){
				endPointer--;
			}
		}
		return false;
	}
}

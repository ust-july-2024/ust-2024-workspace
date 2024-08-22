package arrays;

public class ArraysMaxSubArraySum {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40}; // max(30, 50, 70) = 70
		int k1 = 2;
		
		int[] arr2 = {1, 6, 2, 8, 25, 18, 0, 20, 13}; // max(9,16,35,51,43,38,33 
		int k2 = 3;
		
		System.out.println("MaxSum is :" + maxSumSlidingWindowTechnique(arr1, arr1.length, k1));
		System.out.println("MaxSum is :" + maxSumSlidingWindowTechnique(arr2, arr2.length, k2));
		
	}
	
	// time complexity - O(n) 
	public static int maxSumSlidingWindowTechnique(int[] arr, int arrSize, int subArraySize) {
		int maxSum = 0;
		// compute the sum of first window
		for(int i=0;i<subArraySize;i++) {
			maxSum += arr[i];
		}
		// maxSum will be 9
		// compute the sums of the remaining windows by removing the first element and adding the last element
		int windowSum = maxSum;
		for(int i=subArraySize;i<arrSize;i++) {
			windowSum = windowSum + arr[i] - arr[i-subArraySize];
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

}
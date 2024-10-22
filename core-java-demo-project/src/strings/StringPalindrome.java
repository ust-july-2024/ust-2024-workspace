package strings;

public class StringPalindrome {

	public static void main(String[] args) {
		String str1 = "madam";
		String str2 = "malayalam";
		String str3 = "hello";
		
		System.out.println(str1 + " is a Palindrome ? " + isPalindromeNaive(str1));
		System.out.println(str2 + " is a Palindrome ? " + isPalindromeNaive(str2));
		System.out.println(str3 + " is a Palindrome ? " + isPalindromeNaive(str3));
		System.out.println("--------------------------------");
		
		System.out.println(str1 + " is a Palindrome ? " + isPalindromeTwoPointerApproach(str1));
		System.out.println(str2 + " is a Palindrome ? " + isPalindromeTwoPointerApproach(str2));
		System.out.println(str3 + " is a Palindrome ? " + isPalindromeTwoPointerApproach(str3));
	}
	
	// time complexity - O(n)
	// space complexity - O(n)
	public static boolean isPalindromeNaive(String str) {
		boolean output = false;
		String revStr = "";
		//run a for loop on the length of the string starting from the last char
		for(int i=str.length()-1;i>=0;i--) {
			// concatenate and accumulate the characters in another string
			revStr += str.charAt(i);
		}
		// compare if both the strings are equal, if yes set output to true
		if(str.equals(revStr) ) {
			output = true;
		}
		return output;
	}
	
	// time complexity - O(n/2) which is O(n)
	// space complexity - O(1);
	public static boolean isPalindromeTwoPointerApproach(String str) {
		boolean output = true;
		int startPointer = 0;
		int endPointer = str.length() - 1;
		
		while(startPointer < endPointer) {
			if(str.charAt(startPointer) != str.charAt(endPointer)) {
				output = false;
				break;
			}else {
				startPointer++;
				endPointer--;
			}
		}
		return output;
	}

}

package day_17;

public class PalindromeChecker {

	public static void main(String[] args) {

		// Create method checks if passed String is palindrome or no and returns boolean
		// Plaindrome examples: madam, civic, racecar, level, rotator, solos, radar,
		// refer, stats

		String a = "racecar"; //0 - 6 , 1 - 5, 2-4, 3-3
		System.out.println(isPalindrome(a));
	}

	public static String reverse(String str) {

		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reversed = reversed + str.charAt(i);
		}

		return reversed;

	}

	public static boolean isPalindrome(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			reversed = reversed + str.charAt(i);
		}

		return reversed.equals(str);
	}

	public static boolean isPalindrome2(String str) {
		int startIdx = 0;//3
		int endIdx = str.length()-1;//3
		
		while(startIdx < endIdx) {
			
			if (str.charAt(startIdx)!=str.charAt(endIdx)) {
				return false;
			}
			startIdx++;
			endIdx--;
		}
		
		return true;
	}
}

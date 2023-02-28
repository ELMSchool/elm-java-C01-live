package day_15;

public class CustomArraysToString {

	public static void main(String[] args) {

		int[] a = { 2, 5, 1, 10 };

		System.out.println(arraysToString(a));
	}

	public static String arraysToString(int nums[]) {

		String result = "["; // [ 			

		for (int i = 0; i < nums.length; i++) {

			if (i == nums.length - 1) {

				result += nums[i] + "]";
				break;
			}
	
			result +=nums[i]+ ", ";

		}
		
		return result;
	}

}

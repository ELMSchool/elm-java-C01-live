package day_17;

import java.util.Arrays;

public class SecondLargestFromIntArray {

	public static void main(String[] args) {

		// find the second  largest number from given int array
		int[] nums = { 5, 1, 13, 28, 31, 10, 31};
		
		Arrays.sort(nums); //[1, 5, 10, 13, 28, 31,     31]
//		System.out.println(nums[nums.length-2]);
					//5							
		for (int i = nums.length - 2; i >= 0; i--) {
								//31
			if (nums[i]<nums[nums.length-1]) {
				
				System.out.println(nums[i]);
				break;
			}
		}

	}

}

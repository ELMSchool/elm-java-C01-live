package day_15;

import java.util.Arrays;

public class WarmUp {
	
	public static void main(String[] args) {
		//if you going to run binarySearch() -> array must be sorted
		//binarySearch() -> helps to find the index of provided value. if values is not in the array it returns negative
		//result
		
		int [] nums = {1,3,3,6,10}; // -4 - 1 = -5
		
		int idx = Arrays.binarySearch(nums, 1);
		
		System.out.println(idx);
		
		
		
	}

}

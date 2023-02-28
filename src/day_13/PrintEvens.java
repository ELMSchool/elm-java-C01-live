package day_13;

public class PrintEvens {
	
	public static void main(String[] args) {
		
		int [] arr = {};
		System.out.println(arr[0]);
		//54
		/*           [1, 5, 10, 48, 6, 27, 2]
		 * Write a method which accepts int array
		 * prints out only even numbers
		 */

		/*
		 * Create a method accepts int array and int target
		 * we need to check if sum of any pair of number in this array will give me target
		 * return true if it does if not return false
		 * */
//		printEven(arr);
//		System.out.println(isThere(arr, 32));
	}
	
	public static void printEven(int nums []) {
		
		for (int i=0; i<nums.length; i++) {
			
			if (nums[i]%2 == 0) {
				
				System.out.println(nums[i]);
			}
		}
		
	}

//	{1, 5, 10, 48, 6, 27, 2};  //54
//	[1, 5, 10, 48, 6, 27, 2]
	public static boolean isThere(int [] arr, int target) {
		
		for (int i = 0; i<arr.length; i++) {
			
			for (int a = 0; a < arr.length; a++) {
				
				if(arr[i] + arr[a] == target && i!=a) {
					
					return true;
				}
				
			}
			
		}
		return false;
		
	}
}

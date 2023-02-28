package day_13;

public class Exercises {
	
	public static void main(String[] args) {
		
		double [] nums = {1, 5, 10, -3};
		
		int a = 5;
		
		
		//update all values of array (turn them into their negative versions)
		
		for (int i = 0; i < nums.length; i++) {
			
			nums [i] *= -1;
			
		}
		
		System.out.println(nums[3]);
		
	}
	
	public static double sumOfArray(double [] arr) {
		
		double sum = 0;
		//{1, 5, 10, -3}
		for (int i =0; i < arr.length; i++ ) {
			
			sum += arr[i];  //1 + 5 + 10 + -3
		}
		
		return sum;
	}

}

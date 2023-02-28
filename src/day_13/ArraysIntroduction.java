package day_13;
import java.util.Scanner;
public class ArraysIntroduction {
	
	public static void main(String[] args) {
		//                0  1  2    length - 1
		int [] numbers = {2, 4, 6};
		
		int[] values = new int [4]; // {0,5,20,0}
		values [1] = 5;
		values [2] = 20;
		System.out.println(values[4]);
		
		
//		for (int i = 0; i < 3; i++) {
//			
//			
//			System.out.println(numbers[i]);
//			
//		}
		
		
		//length - helps us to find the length of arrays
		
		int lengthOfArr = values.length;
		
		System.out.println(lengthOfArr);
		
	}
	
	
	

}

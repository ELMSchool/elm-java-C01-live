package day_14;
import java.util.Arrays;
public class ArrayMethods {
	
	public static void main(String[] args) {
		
		//length => returns the length of array (count of elemt spots) 
		//Arrays.toString() => converts arrays to String
		
		 
		//												     10	
		int [] numbers = {0, 2, 4, 6, 8, 10, 11, 13, 15, 17, 19}; //11
		
		//Arrays.copyOf(original, index(excluded)) => it copies original array
		int [] copy = Arrays.copyOf(numbers,12);
		
		//Arrays.copyOfRange(original, fromIdx(included), untilIdx(excluded)) => 
		//it copies original array based on given range
		int [] copyRange = Arrays.copyOfRange(numbers, numbers.length-1, numbers.length+1);
//		System.out.println(Arrays.toString(copyRange));
		
		int [] values = {8, 1, 15, 28, -9, 55};
		//Arrays.sort(array) => this method sorts the given array in ascending way
		//from smaller to bigger
		System.out.println(Arrays.toString(values));
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		int diff = values[values.length-1]  - values[0];
		System.out.println(diff); //55 - (-9) = 55 +9 = 64
		
	}

}

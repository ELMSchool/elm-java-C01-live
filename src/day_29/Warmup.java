package day_29;

import java.util.*;

public class Warmup {

	//
	public static void main(String[] args) {
		// find the second largest number from integer arrayList don't sort it
		ArrayList<Integer> numbers1 = new ArrayList<>();
		numbers1.add(10);
		numbers1.add(5);
		numbers1.add(78);
		numbers1.add(9);
		numbers1.add(-1);
		numbers1.add(0);
		numbers1.add(10);
		numbers1.add(9);
		numbers1.add(9);
		// 0   1  2  3  4  5
		//[10, 1, 5]
		System.out.println("Before: "+numbers1);
		for (int i = 0; i<numbers1.size(); i++) {  //i = 2   k = 3
			
			for (int k = i+1; k<numbers1.size(); k++) {
					//1						1
				if (numbers1.get(i) == numbers1.get(k)) {
					
					numbers1.remove(k);
					k--; 
				}
				
			}	
			
		}

		System.out.println("After: "+numbers1);
	}

	public static ArrayList<Integer> removeDuplicates (ArrayList<Integer> numbers){
		
		ArrayList<Integer> removed = new ArrayList<>();
		for (int num : numbers) {
			
			if (!removed.contains(num)) {
				removed.add(num);
			}
		}
		return removed;
	}
	
	public static ArrayList<Integer> retrunCommons(ArrayList<Integer> numbers1, ArrayList<Integer> numbers2){
		
		ArrayList <Integer> commons = new ArrayList<>(); 
		for (int i =0; i < numbers1.size(); i++) {
			
			if (numbers2.contains(numbers1.get(i))) {
				commons.add(numbers1.get(i));
			}
		}
		
		return commons;
	}
	
	public static int secondLargest(ArrayList<Integer> numbers) {
		
		int largest1 = Integer.MIN_VALUE; // 78
		int largest2 = Integer.MIN_VALUE; // 10

		for (int num : numbers) {
			//  0    >   78
			if (num > largest1) {
				
				largest2 = largest1;
				largest1 = num;
				//    0    10          	5		10
			}else if(num > largest2 && num != largest1 ) {
				
				largest2 = num;
			}
			
			
		}
		
		return largest2;
	}
}

package day_15;

public class ForEachLoop {
	
	public static void main(String[] args) {
		String [] citiesOfUSA =  {"NYC", "Alexandria", "Atlanta", "Houston"};
		
		int a [] = {1, 3, 5, 7};
//		for (int i = 0; i<a.length; i++) {
//		
//		System.out.println(a[i]);
//	}
		
		
		int numbers [][] = {
				{1,2,3}, 
				{6, 12, 15, 2}, 
				{11, 13, 8}
			};
		

		
		
	int sum = 0;
		for (int [] nums : numbers) {
			
			for (int num : nums) {
				if (num % 2 == 0) {
					sum +=num;
				}
			}
			
		}
		System.out.println(sum);
		
		
	}

}

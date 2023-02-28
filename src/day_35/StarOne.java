package day_35;

public class StarOne {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * *
		 * **
		 * ***
		 * 
		 * 
		 * 
		 * */
			printStars(3);
		
		
	}
	
	public static void printStars(int t) {
		
		for (int i = 0; i<=t; i++) {
			
			for (int j = 0; j<i;  j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}

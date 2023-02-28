package day_11;

public class PrintStars {
	
	
	
	public static void main(String[] args) {
		
		/*
		 * Create a method which accepts int parameter - 5
		 * Prints that many stars in same line      * * * * *
		 * 											* * * * *
		 * 											* * * * *		
		 * */

		int counter = 3;
		while (counter > 0) {
			
			printStar(5);
			System.out.println();
			counter--;
			
		}
		
		
	}

	public static void printStar(int num) {
		
		int counter = 0;
		while (counter < num) {
			System.out.print("*");
			counter++;
		}
		
	}
}

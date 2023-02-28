package day_11;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		//initializer, condition check, code block execution / update statement
		
		
		int counter = 1;
		
		
//		while (counter <= 10) {
//			
//			System.out.println(counter);
//			
//			counter++;
//		}
		
		//do while loop will have at lease 1 iteration
		do {
			
			System.out.println(counter);
			counter++;
			
		} while (counter > 10);
		
		
		System.out.println(counter);
	}

}

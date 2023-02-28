package day_35;

public class HandlingExceptions {
	
	//50 
	//-10 - 10

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 0;
	
		System.out.println(division(a, b));
//		findWholeDivisors(50, -5, 10);
	}
	
	public static int division(int divident, int divisor) {
		
		int result = 0;
		
		try {
			
			 result = divident/divisor; // 15/0
			System.out.println("some code after exception"); //if exception occurs above this line. this line will be skipped
			
		}catch(Exception e) {
			
			System.out.println("Can't divide by 0");
			
			return result;
		}
		
		return result;
	}

	
	
	public static void findWholeDivisors(int number, int start, int end) {
		
		//-5 ... 10
		
		for (int i = -5; i<=end; i++) {
			
			
			try {
				
				if (number % i == 0) {
					System.out.println(i);
				}
			}catch(ArithmeticException ar) {
				
				System.out.println(i+" can't divide");
			}
			
			
		}
		
	}
}

package day_06;

public class Calculator {

	public static void main(String[] args) {

		/*
		 * Create method accepts 3 arguments double char double
		 */
		method(5);
//		calculator(15, '/',0);
	}

	public static void calculator(int num1, char operator, int num2) {

		int result = 0;

		// write your code here
		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			if (num2 == 0) {
				System.out.println("You can't divide by 0.");
				//return;
			}

			result = num1 / num2;
		}

		System.out.println(result);
	}

	
	public static void method (int a ) {
		
		if (a<1 || a>7) {
			System.out.println("Not a weekday");
			return;
		}
		System.out.println("asdfadsf");
		System.out.println("fasdfsf");
		
	}
	
	
	
}

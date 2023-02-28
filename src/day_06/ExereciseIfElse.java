package day_06;

public class ExereciseIfElse {

	public static void main(String[] args) {

		/*
		 * Mathematical Formula Create a method which accepts single int argument
		 * Argument must be 3 digits number => [100 - 999] Method should if given number
		 * is divisible by 3 or not 12, 876 753 (7+5+3)
		 */
		isDivisibleJava(753);
		
	}

	public static void isDivisibleMath(int num) {

		int last = num % 10; // 3
		num = num / 10; // 75
		int middle = num % 10; // 5
		int first = num / 10; // 7

		int result = first + middle + last;

		if (num >= 100 && num <= 999) {
			if (result % 3 == 0) {
				System.out.println("Given number is divisble by 3");
			} else {
				System.out.println("Given number is NOT divisble by 3");
			}
		}else {
			System.out.println("number is not in the range");
		}
	}

	public static void isDivisibleJava(int num) {

		if (num%3 == 0) {
			System.out.println("Divisible by 3");
		}else {
			System.out.println("Not divisible by 3");
		}
	}

}

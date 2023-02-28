package day_06;

public class RelationalAndLogicalOps {

	public static void main(String[] args) {

		//positiveNegativeZero(0);
		
		int a = 11;
		
		
	}

	/**
	 * 0-100 both included [1-100] => 52 even
	 * 
	 * @param num //more than 50
	 */
	public static void evenOrOdd(int num) {

		if (num > 0 && num < 101) {

			if (num % 2 == 0) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is odd");
			}
		} else {
			System.out.println("Number is out of the range");
		}

	}

	public static void positiveNegativeZero(int num) {

		if (num == 0) {
			System.out.println("zero");
		} else if (num > 0) {
			System.out.println("positive");
		} else {
			System.out.println("negative");
		}
	}

	/*
	 * Write a method accepts int parameter prints negative positive or zero based
	 * on input
	 */

}

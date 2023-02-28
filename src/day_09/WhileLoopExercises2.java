package day_09;

import java.util.Scanner;

public class WhileLoopExercises2 {

	public static void main(String[] args) {

		// Create a flag method isPrime()
		// Accepts an int parameter
		// returns true if number is prime returns false if number is not prime

		// *Prime numbers are only divisible by 1 or by itself without reminder

		// 9 => not prime because it is divisible by 3
		// 10 => 2,3,4,5, =>
		
		System.out.println(isPrime(-6));
	}

	public static boolean isPrime(int num) {

		if(num == 1) {return false;}
		int counter = 2;
		// 2 10/2
		while (counter <= num / 2) {
			// 10 % 2
			if (num % counter == 0) {

				return false;
			}

			counter++;
		}

		return true;

	}

}

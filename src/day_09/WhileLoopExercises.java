package day_09;

public class WhileLoopExercises {

	public static void main(String[] args) {

		// Write a code that counts down from 5 to 1
		// And prints out Counting finished!

//		int num = 10;
//		
//		while (num >= 1) {
//			
//			System.out.println(num);
//			
//			num -=2;
//		}

		// System.out.println("Counting finished");

		// Write a code which prints out even numbers from 1 - 20;
		int num = 1;
		while (num <= 20) {

			if (num % 2 == 0) {
				System.out.println(num);
			}

			num++;
		}

		System.out.println("counting finished");

	}

}

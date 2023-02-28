package day_08;

import java.util.Random;

public class ExercisesMethodOverLoading {

	public static void main(String[] args) {

//		System.out.println(findAverage(10.4, 45.5, 52.1));
//		System.out.println(86 - 86 * 0.15);
		
		Random rand = new Random();
		int randomNum = rand.nextInt((10 - 6) + 1) + 6;
		System.out.println(randomNum);
	}

	public static int findAverage(int a, int b, int c) {

		return (a + b + c) / 3;
	}

	public static double findAverage(double a, double b, double c) {

		return (a + b + c) / 3;
	}
	
	
}

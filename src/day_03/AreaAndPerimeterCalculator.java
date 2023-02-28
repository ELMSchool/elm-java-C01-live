package day_03;

import java.util.Scanner;

public class AreaAndPerimeterCalculator {

	public static void main(String[] args) {

		/*
		 * Write a Java program that calculates the area and perimeter of a rectangle.
		 * The program should prompt the user to enter the width and height of the
		 * rectangle, and then print out the results. Use the Scanner class to read
		 * input from the user.
		 */
//		area =w*h
//		p = (w+h)*2		

		Scanner scan = new Scanner(System.in);

		System.out.print("Width = ");

		int width = scan.nextInt();

		System.out.print("Height = ");

		int height = scan.nextInt();

		int area = width * height;

		scan.nextLine();

		System.out.println("Area = " + area);

		int perimeter = (width + height) * 2;

		System.out.println("Perimeter = " + perimeter);
	}

}

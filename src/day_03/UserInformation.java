package day_03;

import java.util.Scanner;

public class UserInformation {

	public static void main(String[] args) {

		/*
		 * Write a Java program that prompts the user to enter their name, age, and
		 * favorite color, and then prints out a message saying
		 * "Hi, my name is [name], I am [age] years old, and my favorite color is [color]."
		 * Use the Scanner class to read input from the user.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Your Name: ");

		String fullName = scan.nextLine();

		System.out.print("Age: ");

		int age = scan.nextInt();

		scan.nextLine();

		System.out.print("Favorite color: ");

		String color = scan.nextLine();

		System.out.print("Hi, my name is " + fullName + "," + " I'm " + age + " years old, and my favorite color is "
				+ color + ".");
	}
	

}

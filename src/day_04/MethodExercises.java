package day_04;

import java.util.Scanner;

public class MethodExercises {
	
	public static void main(String[] args) {
		
		//Create a method without parameter. Name your method customPrint 
		//It should print /I\ "love" 'java'!
		
		//Write a method without parameter. Declare two local(inside of method) int variables and assign any values to them.
		//Then print the sum of those numbers. 
		//name your method simpleSum()
		//customPrint();
		
		//Create a method which will accept an integer parameter. 
		//It will print out square of it 5 ^ 2 = 25 , 6^2=36
		//squarePrint(int number)
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		squarePrint(a);
		
	}
	
	public static void simpleSum() {
		int num1=7;
		int num2= 9;
		int result = num1+num2;
		System.out.println(result);
	}
	
	public static void customPrint() {
		
		System.out.print("/I\\ \"Love\" 'Java'!");
		
	}
	
	public static void squarePrint(int age) {
		
		System.out.println(age);
		
	}

	
}

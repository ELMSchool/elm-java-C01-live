package day_05;

import java.util.Scanner;

public class MethodsWarmUp {
	
	public static void main(String[] args) {
		
//		printHello();
		//personalInfo()
		//Create a method without parameters/arguments.
		//Declare local variables and assign them Your name, Your yearOfBirth(year), currentYear, then create a variable 
		//age and minus your yearOfbirth from current year and print out all this info
		//Name: Your name
		//yearOfBirth: 1985
		//Age: 37
		personalInfo();
		
		
	}

	
	//when you name the method always try to come with a name that clarifies your method 
	public static void printHello() {
		
		String str = "Hello"; //=> local Variables
		
		System.out.println(str);
		
	}
	
	public static void personalInfo() {
		
		String name ="Fuad";
		int yearOfBirth = 1870;
		int currentYear = 2022;
		int age = currentYear - yearOfBirth;
		
		 System.out.println("Your Name: " + name);
		 System.out.println("Your Birth Year: " + yearOfBirth);
		 System.out.println("Your Age: " + age);
		
	}
	
	
	
	
}

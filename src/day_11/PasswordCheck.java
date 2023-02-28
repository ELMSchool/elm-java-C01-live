package day_11;

import java.util.Scanner;

public class PasswordCheck {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		
		if (b>a) {
			
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		
	}

	public static void passwordCheck() {	
		/*
		 * Write a code which will ask from user:
		 * Please enter your password
		 * User will enter his/her password 
		 * If Password is true it will print You've logged in
		 * Else it should ask to "Please enter your password"
		 * */
		Scanner scan = new Scanner (System.in);
		
		String expectedPassword = "Elm123!";
		String actualInput = "";
		
		do {
			
			System.out.println("Please enter your password:");
			actualInput = scan.next();	
			
		}while (!actualInput.equals(expectedPassword));
		
		System.out.println("You have logged in successfully");
		
	}
}

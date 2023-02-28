package day_03;

import java.util.Scanner;

public class EmployeeID {

	public static void main(String[] args) {
		
		String fullName;
		int empId;
		String title;
		char gender;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		fullName = scan.nextLine(); 
		
		System.out.print("Please enter your employee id: ");
		empId = scan.nextInt(); 
		
	
		System.out.println("Name: "+fullName);
		System.out.println("Id number: "+empId);
		
//		System.out.println("Please enter your title: ");
//		title = scan.nextLine();
//		
		
//		System.out.println("Please enter your gender: ");
//		gender = scan.next().charAt(0);
//		
	
	
//		System.out.println("Title: "+title);
//		System.out.println("Gender: "+gender);




		
	}

}

package day_03;
import java.util.Scanner;

public class ScannerExercises {
	
	public static void main(String[] args) {
		
		//You have a bank account 
		//Print a message to ask currentBalance
		//Enter current balance
		//Print a message to as withdraw amount
		//Print message to show remaining balance
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your current balance? ");
		//
		double currentBalance = scan.nextDouble();
		
		System.out.println("What is your withdraw amount? ");
		double amount = scan.nextDouble();
		
		double remainingBalance = currentBalance - amount;
		System.out.println("Reamining balance is: "+remainingBalance);
		
		
	}

}

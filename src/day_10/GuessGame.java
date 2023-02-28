package day_10;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	
	public static void main(String[] args) {
		
		
		Random random = new Random();
		int randomNum = random.nextInt(100);
		
		int guess = -2;
		Scanner scan = new Scanner(System.in);
		//GUESS THE NUMBER
		while (randomNum != guess) {
			System.out.println("Enter your guess:");
			guess = scan.nextInt();
			
			if (guess == randomNum) {
				System.out.println("Congrats!! YOU FOUND THE NUMBER");
			
			}else 
			
			
			if (guess<randomNum) {
					System.out.println("Try Higher...");
			}else {
					
					System.out.println("Try Lower...");
			}
				
			}
			
			
			
		}
		
	}



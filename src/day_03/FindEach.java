package day_03;

import java.util.Scanner;

public class FindEach {

	public static void main(String[] args) {

		/*
		 * Ask user to enter any number Then find how may hundreds, how many tens and
		 * how many ones(single) needs to create given number
		 * 
		 * 562
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the number: ");
		int number = input.nextInt();
		
		int countOfHundreds = number/100; //5
		//              562 %  100 = 62     
		int remainder = number % 100;
		//                  62   / 10  = 6
		int countOfTens = remainder / 10;
		//           62  %  10 = 2
		remainder = remainder % 10;
		System.out.println("We have " + countOfHundreds + " hundreds "+ countOfTens + " tens " + remainder+ " ones" );
		

	}

}

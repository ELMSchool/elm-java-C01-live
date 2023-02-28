package day_12;

import java.util.Scanner;

public class WarmUp1 {

	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in);
		
		int number = scan.nextInt();
		int reversed  = 0;
		/*
		 * Reverse given int and print it out
		 * LOOP
		 * */
		//0
		while (number != 0) {		
			int remainder = number % 10; // 3  
			reversed = reversed *10 + remainder;//8723
			number /= 10; //0
	
		}
		
		System.out.println(reversed);
		

	}

}

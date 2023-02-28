package day_12;

import java.util.Scanner;

public class PrintReversed {
	
	public static void main(String[] args) {
		
		/*
		 * reverse the given string
		 * hello - olleh
		 * o
		 * l
		 * l
		 * e
		 * h
		 */
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		for (int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));

		}
		
	}

}

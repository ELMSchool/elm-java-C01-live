package day_10;
import java.util.Scanner;
public class WarmUp2 {
	
	public static void main(String[] args) {
		
	 //charAt(), length()
		
		
		//please write a code which will calculate the sum of numbers from 1 until given number
		//
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int number = scan.nextInt();

		int counter = 1;
						//2	
		while(counter<=number) {
			
			System.out.print("*");
			counter++;
			
		}
		

	}

}

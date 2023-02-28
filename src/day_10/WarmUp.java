package day_10;

public class WarmUp {

	public static void main(String[] args) {
		
		
		//Factorial - 5! => 5 * 4 *3 * 2 * 1 = 120
		
		//Write a method accepts int param and returns factorial of given number. Use while loop and compound operators.
		//3 => 6 , 5 => 120
		System.out.println(factorial(5));
		
	}
	
	/**
	 * This method calculates factorial for given number
	 * @param num
	 * @return
	 */
	public static int factorial(int num) {
		
		int counter = 1;
		int total=1;
				//2        3
		while (counter <= num) {
			//6
			total *=counter;  //total = total * counter
			
			counter++;
		}
		
		
		return total;
	}
}

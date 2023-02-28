package day_05;

public class MethodsWithParamsWarmUp {
	
	public static void main(String[] args) {
		
		//methodWithParam(15);
//		findRemainder(29);
		
		coinMachine(121);
	}

	
	public static void methodWithParam(int num) {
		
		System.out.println(num/3);	
		
	}
	
	//create a method which will accept int argument
	//method will find the remainder from division to 10 and print it out
	
	public static void findRemainder(int num) {
		
		int remainder = num%10;
		
		System.out.println(remainder);
		
	}
	
	
	//Create a method which will accept double param. 1.4
	//quaters (25 cents), dime(10 cents), nickle(5 cents), penny(1 cent) 
	
	//140 cents 5 quaters, 1 dime, 1 nickle
	
	public static void coinMachine(int cents) {
		
		//hint
		int total= cents;
		
		int quarters = total/25;  //5
		total = total%25; // total - quarters*25 = 15
		int dimes = total/10; //1
		total = total%10;
		int nickles = total/5;
		total = total % 5;
		int pennies = total;
		
		System.out.println("We have "+ quarters+ " quarters, " + dimes + " dimes, " + nickles + " nickels, "+ pennies + " pennies." );
	}
	
}

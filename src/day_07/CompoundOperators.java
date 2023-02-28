package day_07;

public class CompoundOperators {
	
	public static void main(String[] args) {

		//assignment operator =
		//arithmetic operators +,-,/,*,%
		
		int num = 10;
		System.out.println("Previous: "+ num);
		
		num += 5; // => num += 5;
		System.out.println("Current: "+ num);
		
		num -=2;
		System.out.println(num);
		
		num *=2;  // => num = num * 2;
		System.out.println(num);
		
		num /=2;
		System.out.println(num);
		
		
		num %=5; // => 13 % 5 = 3 
		System.out.println(num);
	}

}

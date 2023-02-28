package day_02;

public class ExercisesWithOperators {

	public static void main(String[] args) {

		// 1. Assign values to these int variables and find average of 3 ints
		int num1, num2, num3;

		num1 = 6;
		num2 = 9;
		num3 = 11;

		int average = (num1 + num2 + num3) / 3;

//		System.out.println(average);

		// 2. There two int variables. Swap the values of these int variables without
		// creating 3rd variable.

		int a = 84;
		int b = 7;
	
		a = a + b; // 91
		b = a - b; // 91 - 7 = 84;
		a = a - b; // 91 - 84 = 7;
		
//		System.out.println(a);
//		System.out.println(b);
		
		//3. int variable which holds 125 %
		int number = 912; // => 521
		
		int lastNumber = number % 10; //5
		number = number / 10; //12
		int middleNumber = number % 10; //2
		number = number / 10; //1
		int firstNumber = number % 10; //1
		
		int reversedNumber = lastNumber * 100 + middleNumber * 10 + firstNumber;
		
		// 100 => 50 - 5*10 = 0 
//		System.out.println(reversedNumber); // 1 / 5 = 0 (1)

		//4. You will be provided days. I want you to calculate how many years, months, weeks and days is in given number
		int totalDays = 1523; // 1 year(365), 2 months(30), 2 weeks, 0 days
		// 439 - 1*365 = 74 
		int years = totalDays / 365; //1
		
		totalDays = totalDays - years*365; //74
		
		int months = totalDays / 30; //2
		
		totalDays = totalDays - months * 30; // 14
				
		int weeks = totalDays / 7; //2
		
		totalDays = totalDays - weeks * 7;
		
		int days = totalDays / 1;
				
		System.out.println(years +" years, " + months + " months, "+ weeks+ " weeks, "+ days + " days" );
				
		
		
		
	}
}

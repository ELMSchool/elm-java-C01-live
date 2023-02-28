package day_07;

public class Recap {
	
	public static void main(String[] args) {
		
		
		
		//Write a method accepts an int(money) argument
		//if it is more than 10000 you need to assign "yes" to your String variable else assign no 
		//Then print out that String 
		int money = 5000;
		boolean answer= (money>10000); //redundant
		System.out.println(answer);
		
		if (answer) {
			System.out.println("yes");
		}else {
			System.out.println("no");
			
		}
		
	}

	
	public static void isEvenAndLessThan50(int num) {
		
		if (num<50 && num % 2 == 0 ) {
		
			System.out.println("true");
		}else {
			
			System.out.println("Wrong input");
		}
		
		
	}
}

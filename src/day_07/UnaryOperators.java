package day_07;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
		
		
		//number++;  // number += 1; => number++;  number--;
		//System.out.println(number);
		
		//when we want to decrease/increase value of our variablse just by one 
		
		//Increment ++   Decrement --
		//Postfix   number++, number--
		//Prefix    ++number, --number
		
		//Postfix ex:
		int number = 15;
		number--;
//		System.out.println("Postfix: "+number);
//		System.out.println("Postfix in prntln: "+ number--  + "  "+ number);
		
		//Prefix ex:
		int number2 = 5;
		++number2;
		System.out.println("Prefix: "+ number2);
		System.out.println("Prefix in println: "+  ++number2 + "  " +number2);
		
		
	}

}

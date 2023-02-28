package day_35;

import java.io.IOException;

public class MultipleCatchBlock {
	
	public static void main(String[] args) {
		
		String str = "java";
		int a = 10;
		int b = 0;
		
		try {
			
			System.out.println(str.charAt(3));
			System.out.println(a/b);
			
		}catch(IndexOutOfBoundsException ar) {
			System.out.println("You can't divide by 0");
		}
		catch (IllegalArgumentException s) {
			
			System.out.println("Wrong parameter for charAt()");
		}
		catch(ArithmeticException e) {
			
			System.out.println("Something happened");
		}
		
		//NoSuchElementException 
		//ElementIsNotClickableException
		
		
		
	}

}

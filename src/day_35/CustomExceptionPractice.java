package day_35;

public class CustomExceptionPractice {
	
	public static void main(String[] args)  {
		
		
		System.out.println(2/0);
		System.out.println("hello");
		
	}
	
	
	public static void isEven(int number)  {
		
		if (number%2 != 0) {
			
			//System.out.println("Not Even");
			throw new NotEvenException("Illegal number");
		}else {
			
			System.out.println("Even");
		}
		
	}

}

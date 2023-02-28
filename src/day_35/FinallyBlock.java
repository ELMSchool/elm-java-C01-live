package day_35;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		//JVM crash
		//System.exit(0)
		try {
			
			System.out.println(5/1);
			System.out.println("try");

			
		}catch(IndexOutOfBoundsException e) {
			
			System.out.println("catch");
			
			try {
				
				
			}catch(ArithmeticException x) {
				
			}
		}
		finally {
			
			System.out.println("Finally");
		}
		
		
		
		System.out.println("After try catch");
		
		
		
		

		
	}

}

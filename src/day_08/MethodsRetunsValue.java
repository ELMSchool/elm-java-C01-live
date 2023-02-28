package day_08;

public class MethodsRetunsValue {

	public static void main(String[] args) {
		// 10
		int result = Math.max(5, 10);
		
		int big = largest(10, 15);
		System.out.println(big);
		
		System.out.println(findTheBiggest(-10, 5, -8));
	}
	
	
	public static int largest(int a, int b) {
		
		
		if (a > b) {
			
			return a;
			
		}else {
			
			return b;
		}
		
		
	}

	
	//Create a method accepts 3 int parameters
	//Returns the biggest one
	//Dont' use Math.max()			//5    		10   8
	public static int findTheBiggest(int a, int b, int c) {
		
//		int bigger = a > b ? a : b;
//		bigger = bigger > c ? bigger : c;
//		
//		return bigger;
		
		return largest(a,  largest(b,c));
		
	}
}

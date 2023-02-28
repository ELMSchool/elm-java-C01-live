package day_08;

public class FlagMethods {
	
	public static void main(String[] args) {
		
		
		int a = 10;
		
//		boolean isPositive = (a > 0);
//		System.out.println(isPositive);
		
		a = -10;
		//isPositive = (a > 0);
//		System.out.println(isPositive);
		
		System.out.println(isPositive(10));
	}
	
	
	public static boolean isPositive (int num) {
		
		return num > 0;
	}

}

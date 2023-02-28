package day_08;

public class CommonMistakesWithReturn {
	
	public static void main(String[] args) {
		
		System.out.println(checkPositive(5));
		
	}
	
	public static String checkPositive (int num) {
		
		if (num > 0) {
			
			return "positive";
		}
		
		if (num < 0) {
			return "negative";
		}
		
		if (num == 0) {
			return "zero";
		}
		
	return "";
		
	}
	

}

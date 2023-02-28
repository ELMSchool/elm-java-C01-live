package day_06;

public class IfElseMethods {
	
	public static void main(String[] args) {
	
		/*
		 * Create a method will accept int parameter (year)
		 * Method should print if it is leap year or no
		 * 2020/4
		 * */
		isLeapYear(2032);
		
		/*
		 * Create method which accepts 4 arguments
		 * double speedOfScooter, double speedOfFlow, boolean isFlowDirection, distance
		 * Method should print time of travel
		 * 55 mph
		 * 5 mph
		 * false
		 * 120 miles
		 * */
	}
	
	public static void isLeapYear(int year) {
		
		boolean isLeap = (year % 4 == 0);
		
		System.out.println("is it leap year?\n"+isLeap);
		
	}
	

}

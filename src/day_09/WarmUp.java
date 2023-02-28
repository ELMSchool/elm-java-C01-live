package day_09;

public class WarmUp {
	
	public static void main(String[] args) {
		
		//Write a method which can replace Math.abs()
		//Overload it for int and double
		
//		System.out.println(customAbs(-9.5)); 
		fizzBuzz(15);
		//Write a method accepts int parameter
		//if given number is divisible by 3 it should print out Fizz
		//if it is divisible by 5 it should print out Buzz
		//if it is divisible by 3 and 5 print out FizzBuzz
		
	}

	/**
	 * FizzBuzz
	 * @param num
	 */
	public static void fizzBuzz(int num) {
		
//		 if (num %3==0 && num%5==0){
//			 System.out.println("FizzBuzz");
//			 }else if (num%3==0){
//			 System.out.println("Fizz");
//			 }else if (num%5==0){
//			 System.out.println("Buzz");
//			 }else{
//			 System.out.println(num);
//			 }
		
		if (num%3 == 0) {
			System.out.print("Fizz");
		}
		
		if (num%5 == 0) {
			System.out.println("Buzz");
		}
	}
	
	/**
	 * This method helps to return abs/postive value 
	 * accepts int param
	 * @param
	 * @return
	 */
	public static int customAbs(int num) {
		
		if(num > 0) {
			return num;
		}else {
			return num * -1;
		}
	}
	/**
	 * This method helps to return abs/postive value 
	 * @param num
	 * @return
	 */
	public static double customAbs(double num) {
		return num<0 ? num * -1 : num;
	}
}

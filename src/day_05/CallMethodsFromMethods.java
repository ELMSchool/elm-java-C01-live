package day_05;

public class CallMethodsFromMethods {
	
	public static void main(String[] args) {
		
		sayHi();
		sayBye();
		
	}
	
	public static void sayHi() {
		
		System.out.println("hi"); //hi, bye, bye 
		sayBye();

	}
	
	public static void sayBye() {
		

		System.out.println("bye");
	}
	
	public static void method(int param) {
		
		double a = Math.pow(param, 2);
		
		double b = Math.sqrt(a);
	}

	
}

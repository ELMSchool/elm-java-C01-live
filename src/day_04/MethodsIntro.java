package day_04;

public class MethodsIntro {
	
		
	public static void main(String [] args) {
		//Write a method which accepts single String argument/parameter and prints out the first letter of that String
		//*hint - use charAt() method

//		methodWithParameter("apple");
		printFirstLetter("Java");
		
	}
	
	public static void myFirstMethod() {
		
		System.out.println("My first Method");
		
	}

	public static void methodWithParameter(String word) {
		
		String localString = word;
		System.out.println(localString);
		
		//System.out.println("our word is "+ word);
	}

	public static void printFirstLetter(String argument) {
		
		System.out.println(argument.charAt(0));
	}
	

}

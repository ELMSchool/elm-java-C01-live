package day_02;

public class VariablesRecap {
	
	public static void main (String [] args) {
		
		
		//8 primitives
		//byte short int long => numeric prims.
		//float double => floating point prims 5.2 1985.0 1985
		//char boolean F,M
		
		//0,1 || on, off || true, false
		
		//String => text, words, sentences, char sequence
		
		//name, lastName, DoB, SSN, gender, currentBalance
		
		// + overloaded => MM  
		
		String name = "Fred";
		String lastName = "Doe";
		short birthYear = 1985;
		int ssn = 888854569;
		char gender = 97;
		double currentBalance = 1584000.65;
		
//		System.out.println(name);
//		System.out.println(lastName);
//		System.out.println(birthYear);
//		System.out.println(ssn);
//		System.out.println(gender );  
//		System.out.println(currentBalance);
//		
		//String
		
		String word, str, fullName;
		
		word = "hello";
		str = "java";
		fullName = name + " "+ lastName;
		System.out.println(fullName);
		
		
		
	}
	

}

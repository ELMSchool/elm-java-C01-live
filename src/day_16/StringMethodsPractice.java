package day_16;

public class StringMethodsPractice {
	
	public static void main(String[] args) {
		
		
		//length() -- 
		//toLowerCase() --
		//toUpperCase() --
		//replace() -- replaces everything with provided value
		//equals() -- checks if 2 strings are equal or not 
		//equalsIgnoreCase() -- 
		//substring() -- 
		//charAt() -- 
		//concat() -- 
		//indexOf() -- 
		
		String word = "Hello";
		int i= word.indexOf('z'); //-1
		
		String str = word.substring(3);
		System.out.println(str);
		
		String email = "kate.wilson@gmail.com";
		
		/*
		 * Create a method accepts String param.
		 * Method should return fullName 
		 * kate wilson
		 * */
		System.out.println(fullName(email));
	}
	
	public static String fullName(String email) {
		
		String fullName = email.substring(0, 11);
		//kate wilson
		fullName = fullName.replace(".", " ");
		
		return fullName;
		
	}
	
	
	

}

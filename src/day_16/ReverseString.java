package day_16;

public class ReverseString {
	
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
		//lastIndexOf() --
		
		String word = "hello"; //3 4
		
		/*
		 * apple -> ape
		 * keyboard -> bo
		 * */
		
		
		if (word.length() % 2 == 0) {
			
			System.out.println(""+word.charAt(word.length()/2-1) + word.charAt(word.length()/2));
		}else {
			
			System.out.println(""+word.charAt(0) + word.charAt(word.length()/2) + word.charAt(word.length()-1));
			
		}
		
	}

}

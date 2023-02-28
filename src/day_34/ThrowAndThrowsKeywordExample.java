package day_34;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowAndThrowsKeywordExample {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException  {
		
		
		int age = 15;
		System.out.println("Test");
		System.out.println(isEligible(age));
		
		System.out.println("Yes he/she can go inside");
		
	}
	
	
	public static boolean isEligible (int age) throws IOException, ClassNotFoundException{
		
		
		if (age<16) {
			
			throw new IOException();
			
		}else if(age == 17) {
			
			throw new ClassNotFoundException();
		}
		
		
		return true;
	}

}

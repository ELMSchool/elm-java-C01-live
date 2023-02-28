package day_31;

import java.util.*;

public class Exercises {

	public static void main(String[] args) {
		//Find the count of each character from given String 
		String str = "java"; //[j,a,v,a]

		// j-1
		// a-2
		// v-1

		LinkedHashSet<Character> letters = new LinkedHashSet<>(); //[j,a,v,a]

		for (char letter : str.toCharArray()) {

			letters.add(letter); 
		}
//				   v	
		for (char let : letters) {
			
			int count = 0;
			//			a
			for (char letterFromStr : str.toCharArray()) {
				
				if (let == letterFromStr) {
					count++; //1
				}
			}
			System.out.println(let + "-" + count);
		}

	}

}

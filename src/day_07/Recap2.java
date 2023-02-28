package day_07;

import java.util.Scanner;

public class Recap2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = "apple"; // str.charAt(?);

		// System.out.println(str.charAt(0) +""+ str.charAt(2)+str.charAt(4));
		// Create a method which accepts single char argument
		// Prints out if it is vowel or consonant
		// timer();

		//isVowelOrConsonant('a');
	}

	public static void isVowelOrConsonant(char letter) {
		// a,e,i,o,u
//		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
//			
//			System.out.println(letter + " is vowel");
//		}else {
//			System.out.println(letter + " is consonant");
//		}

		switch (letter) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println(letter + " is vowel");
			break;
			
			default:
			System.out.println(letter + " is consonant");
			break;
		}
	}

	public static void timer() {
		for (int i = 120; i >= 0; i--) {

			try {
				Thread.sleep(1000);
				System.out.println(i + " seconds left");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}

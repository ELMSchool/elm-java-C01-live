package day_22;
import java.util.*; //wildcard

public class AutoboxVsUnbox {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(returnSum(str));
		//Question:
		/*
		 * Given String ad1sad4sa3aasfr5
		 * calculate sum of numbers
		 *  
		 */

		
	}
	public static int returnSum(String str) {
		//Character.isDigit(char c);
		int sum = 0;    //[a, p, p, l, l, e]
		for (char ch : str.toCharArray()) {
			
			if(Character.isDigit(ch)) {
				sum+=Integer.valueOf(""+ch);
			}
		}
		
		return sum;
	}

}

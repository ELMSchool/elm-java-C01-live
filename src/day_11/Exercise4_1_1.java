package day_11;

public class Exercise4_1_1 {

	public static void main(String[] args) {
		loop(81);

	}

	public static void loop(int n) {
		int i = n; //10
		// 1 > 1
		while (i > 1) {
			
			System.out.print(i+ " "); // 10  5  6  3  4  2
			
			if (i % 2 == 0) {
				
				i = i / 2; //1
				
			} else {
				i = i + 1; // 3+1  5+1  121+1
			}
			
		}
	}

}

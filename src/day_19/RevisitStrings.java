package day_19;

public class RevisitStrings {

	public static void main(String[] args) throws InterruptedException {
Thread.sleep(5);
		/*
		 * Overload lengthAll() and joinAll() so that both accept boolean, char, int and
		 * double arrays as parameters, too.
		 */
//		String arr[] = { "java", "selenium", "sql" };
//		boolean arr2[] = { true, false, true };
//		char[] arr5 = { 'a', '?', 'z', 'F', '9' };
//		int[] arr3 = { 5, 12, 8, 98, 4 };
//		double[] arr4 = { 5.2, 12.9, 8.0, 98.6, 4.1 };
//		String str = "";
//		System.out.println(customIsEmpty(str));
//		System.out.println(lengthAll(arr5));
//		System.out.println(joinAll(arr4));
//		int num = 5;
	}

//	{'a', '?', 'z', 'F', '9'}	
//	{ "java", "selenium", "sql" }   java, selenium, sql, 
//  { true, false, true } 			true, false, true	
	public static String joinAll(String[] arr) {
		String result = "";
		for (String word : arr) {

			result = result + word + ", ";
		}
		result = result.substring(0, result.length() - 2);
		return result;

	}

	public static String joinAll(boolean[] arr) {
		String result = "";
		for (boolean word : arr) {

			result = result + word + ", ";
		}
		result = result.substring(0, result.length() - 2);
		return result;

	}

	public static String joinAll(char[] arr) {
		String result = "";
		for (char word : arr) {

			result = result + word + ", ";
		}
		result = result.substring(0, result.length() - 2);
		return result;

	}

	public static String joinAll(int[] arr) {
		String result = "";
		for (int word : arr) {

			result = result + word + ", ";
		}
		result = result.substring(0, result.length() - 2);
		return result;

	}

	public static String joinAll(double[] arr) {
		String result = "";
		for (double word : arr) {

			result = result + word + ", ";
		}
		result = result.substring(0, result.length() - 2);
		return result;

	}

	public static int lengthAll(String[] arr) {
		int sum = 0;
		for (String a : arr) {

			sum = sum + a.length();
		}
		return sum;
	}

	public static int lengthAll(boolean[] arr) {
		int sum = 0;

		for (boolean a : arr) {

			sum = sum + ("" + a).length();
		}
		return sum;
	}

	public static int lengthAll(char[] arr) {
		int sum = 0;
		for (char a : arr) {

			sum += a;
		}
		return sum;
	}

	public static int lengthAll(int[] arr) {
		int sum = 0;

		for (int a : arr) {

			sum = sum + ("" + a).length();
		}
		return sum;
	}

	public static int lengthAll(double[] arr) {
		int sum = 0;

		for (double a : arr) {

			sum = sum + ("" + a).length();
		}
		return sum;
	}

	public static boolean customIsEmpty(String str) {

		if (str.length() < 1) {
			return true;
		}
		return false;
	}
	
	

}

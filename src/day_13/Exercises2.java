package day_13;

public class Exercises2 {

	public static void main(String[] args) {

		int[] a = new int[5]; //1,2,3,4,5

		// Assign values to this array from 1 to 5
		for (int i = 0; i < a.length; i++) {
			
			a[i] = i+1; //a[2] = 2 + 1
		}
		
		//swap the values at index 0 and 1
		String [] names = {"Fred", "John"}; //{"John", "John"}
		
		System.out.println(names[0] +" " + names[1]);
		String temp = names[0]; //"Fred"
		names [0] = names[1];
		names[1] = temp;
		
		System.out.println(names[0] +" " + names[1]);
	}

}

package day_18;

public class ReverseString {
	
	public static void main(String[] args) {
		
	   String str = "java";
	   String reversed = "";
	   for (int i = str.length()-1; i>=0; i--) {
		   
//		   System.out.print(str.charAt(i));
		   reversed += str.charAt(i);
	   }
	   
		System.out.println(reversed);
	}

}

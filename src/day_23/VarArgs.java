package day_23;

public class VarArgs {
	
	//Variable arguments
	//how to achieve encapsulation -> private 
	//getters, setters
	
	public static void main(String[] args) {
		print("fasdf", "asdf","asdf", "aser", "435", "tyt");
		
	}
	
	
	public static void print(String ... a) {
		
		for (String str : a) {
			System.out.println(str);
		}
		
	}

	
}

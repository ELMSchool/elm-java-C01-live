package day_16;

public class LastIndexOF {
	
	public static void main(String[] args) {
		
		//lastIndexOf()
		//lastIndexOf(value, until)
		
		String str = "Hello World";
		
		System.out.println(str.indexOf("o")); 		//4
		System.out.println(str.lastIndexOf("o"));	//7
		
		System.out.println(str.indexOf("o", 5));	//7
		System.out.println(str.lastIndexOf("o", 5));
		
		
	}

}

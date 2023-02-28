package day_16;

public class IndexOf {
	
	public static void main(String[] args) {
		//String is the char sequence
		//indexOf  -> finds the first index of given char or string and returns int
		//if given char or string is not there it will return -1
		//this method is overloaded method
		//indexOf(value, from)
		//lastIndexOf()
		//lastIndexOf(value, until)
		String str = "Elm School";
		
		int idx = str.indexOf("chool");
	
		System.out.println(idx);
		
		String email = "scarlett.johnson@yahoo.com";
		/*
		 * Create a method accepts String param.
		 * 
		 * First name: kate
		 * Last name: wilson
		 * domain: elm.school
		 * 
		 * */		
		printData(email);
	}
	
	public static void printData(String email) {
		//kate.wilson@elm.school
		String firstName = email.substring(0, email.indexOf('.'));
		String lastName = email.substring(email.indexOf('.')+1, email.indexOf('@') );
		String domain  = email.substring(email.indexOf('@')+1);
		
		System.out.println("First Name: "+ firstName);
		System.out.println("Last Name: "+ lastName);
		System.out.println("Domain: "+ domain);
	}

}

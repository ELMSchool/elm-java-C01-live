package day_35;

public class NotEvenException extends RuntimeException {
	
	
	public NotEvenException() {
		
		 
		
	}
	
	
	public NotEvenException(String message) {
		
		super(message); //calling constructor from Parent
		
	}
	
	
	public NotEvenException(String message, Throwable cause) {
		
		super(message, cause); //calling constructor from Parent
		
	}

}

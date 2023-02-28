package day_27;

public interface Food extends Edible{

	void isExpired();
	
	default void methodFood() {
		
		System.out.println("this is a defualt method coming from Food interface");
		
	}
	
	static void methodStatic() {
		System.out.println("this is a static method coming from Food interface");
	}
}

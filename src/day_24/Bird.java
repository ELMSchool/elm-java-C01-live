package day_24;

public class Bird extends Animal{
	String color;
	String wings;
	final static int NUM_LEGS; //CONSTANTS
	
	
	
	static{
		NUM_LEGS = 2;
	}
	
	{
		
		System.out.println("non-static block from Bird");
	}
	
	static {
		System.out.println("static block from Bird");
	}
	
	public void whistle() {
		
		System.out.println("Bird is whistling...");
		
	}
	
	public void eat() {
		
		System.out.println("Birds love to eat sunflower seeds");
		
	}

}

package day_24;

public class Animal {

	String name;
	int age;
	
	static{
		System.out.println("static block from Animal");
	}
	
	{
		System.out.println("non-static block from Animal");
	}
	
	public void move() {
		
		System.out.println(age + " years old "+ name + " is moving");
		
	}
	
	
	public void eat() {
		
		System.out.println("Animals love to eat everything");
		
	}
	

}

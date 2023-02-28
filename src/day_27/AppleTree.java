package day_27;

public class AppleTree extends Tree implements Food {

	String fruit;
	
	
	public AppleTree(String name, int height, String fruit) {
		
		super(name, height);
		this.fruit = fruit;
	}

	
	public void grow() {

		System.out.println("Apple tree grows 1 foot every year...");
	}

	public void isExpired() {
		
		System.out.println("is experied?");
	}
	
	public void eat() {
		
		System.out.println("you can eat");
	}


	public void methodFood() {
		
		System.out.println("this is a default method overriden inside of AppleTree");
		
	}
	
	public void staticAppleTreeMehod() {
		System.out.println("this's a static method from AppleTree class");
	}
	
}



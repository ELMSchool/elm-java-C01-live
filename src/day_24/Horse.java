package day_24;

public class Horse extends Animal {

	int maneLength;
	static{
		System.out.println("static block from Horse");
	}
	{
		System.out.println("non-static block from Horse");
	}
	
	public void neigh() {

		System.out.println("Horse sounds neigh");
	}

	//Method overriding happening in between sub and super
	
	public void eat() {

		System.out.println("Horses love to eat sugar");

	}

}

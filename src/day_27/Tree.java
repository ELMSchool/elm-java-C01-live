package day_27;

public class Tree {

	String name;
	int height;

	public Tree() {}
	public Tree(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public void grow() {
		
		System.out.println("Tree is growing...");
	}

	public String toString() {

		return name + " " + height;
	}
	



}

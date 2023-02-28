package day_27;

public class OakTree extends Tree {
	
	String nut;
	public OakTree() {}
	public OakTree(String name, int height, String nut) {
		super(name, height);
		this.nut = nut;
	}

	public void grow() {

		System.out.println("Oak tree grows 3 feet every year...");
	}
	

	
	public void oakMethod() {}


}

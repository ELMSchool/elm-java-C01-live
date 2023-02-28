package day_27;

public class Garden {
	
	public static void main(String[] args) {
	
		
		
		//Reference variable
		
		Tree tree1 = new OakTree("White Oak", 30,"acorn"); //upcasting
		Tree tree2 = new AppleTree("Fuji", 15,"green apple");
		
		
		Tree [] trees = new Tree[2];
		trees [0] = tree1;
		trees [1] = tree2;
		
		for (Tree t : trees) {
			
			t.grow();
		}
		
	}

}

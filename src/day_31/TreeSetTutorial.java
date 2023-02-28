package day_31;
import java.util.*;
public class TreeSetTutorial {
	
	public static void main(String[] args) {
		
		//TreeSet -> does not allow null values, does not allow duplicate values, maintains ascending order
		TreeSet <String> treeSet = new TreeSet<>();
		treeSet.add("java");
		treeSet.add("ruby");
		treeSet.add("rust");
		treeSet.add("pyton");
		treeSet.add("c++");
		treeSet.add("javascript");
		treeSet.add("java");
		treeSet.remove("java");
		
		System.out.println(treeSet.descendingSet());
	}

}

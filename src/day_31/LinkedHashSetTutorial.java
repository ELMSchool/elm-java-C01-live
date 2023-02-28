package day_31;
import java.util.*;

public class LinkedHashSetTutorial {

	
	public static void main(String[] args) {
		
		//LinkedHashSet - maintains insertion order
		LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("hi");
		linkedHashSet.add("bye");
		linkedHashSet.add("hello");
		linkedHashSet.add("howdy");
		linkedHashSet.add("hi");
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
		
		
		
		
		
		
	}
}

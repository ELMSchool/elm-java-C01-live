package day_31;
import java.util.*;
public class HashSetTutorial {
	
	//Set will let us to store only unique values
	//We can store only single null value

	//HashSet - stores only unique values, allows single null, does NOT maintain any order
	//LinkedHashSet
	//TreeSet
	
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList<>();
		list.add(null);
		list.add("java");
		list.add("ruby");
		list.add("rust");
		list.add("pyton");
		list.add("c++");
		list.add("javascript");
		list.add("java");
		list.add(null);
		System.out.println(list);
		
		HashSet <String> set = new HashSet<>();
	
		for (String el : list) {
			set.add(el);
		}
		System.out.println(set);
		
		
	}
}

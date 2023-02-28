package day_32;
import java.util.*;

public class HashtableTutorial {
	
	
	public static void main(String[] args) {
		
		Hashtable <String, Integer> hashtable = new Hashtable<>();
		
		hashtable.put("apple", 1);
		hashtable.put("banana", 2);
		hashtable.put("grape", 3);
		hashtable.put("peach", 5);
		hashtable.put("pear", 3);
	//	hashtable.put(null, 3);  // no null keys
	//	hashtable.put("pear", null); // no  null values
//		System.out.println(hashtable);
		
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("grape", 3);	
		map.put(null, 3);
		map.put(null, 5);
		map.put("kiwi", null);
		map.put("melon", null);
		
//		System.out.println(map);
	}

}

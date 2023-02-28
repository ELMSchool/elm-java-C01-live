package day_32;
import java.util.*;

public class EntrySetTutorial {
	
	public static void main(String[] args) {
		
		//Entry is default interface comes with Map interface. Entry Object is consist of Pair of K-V
		//entrySet() -  will return us set of key-value pair(entry)
		//each element of this set will be Entry object(K-V pair)
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("grape", 3);	
		//[1,2,3,4]
		Set <Map.Entry<String, Integer>> entries = map.entrySet();
		
		System.out.println(entries);
		
		for(Map.Entry<String, Integer> entry : entries) {
			
			System.out.println(entry.getKey() +"-->" + entry.getValue()); 
		}
		
	}

}

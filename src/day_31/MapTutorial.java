package day_31;
import java.util.*;
public class MapTutorial {
	
	public static void main(String[] args) {
		
		//[1, 2, 3, 5, 684]
		//["java", "ruby"]
		
		
		//{name = Jack, lastName = Johnson, city=Ankara}  key-value pairs || entry
		
		//HashMap
		/*
		 * Does not maintain any oder
		 * Allows only single null key 
		 * Allows as many null values you desire
		 * Allows only unique keys
		 * */
		
		HashMap <String, String> map = new HashMap<>();
		//V put(Object key, Object value) - adds a pair to map. If key is already there it just updates the value
		map.put("name", "Fred");
		map.put("lastName", "Johnson");
		map.put("city", "Anakara");
		map.put("name", "Jack");
		
		//V putIfAbsent(K key, V value) - adds a pair if key is not there
		map.putIfAbsent("name", "Edward");
		
		
		//V get(Object key) -  returns value based on given Key. If there is no such Key, ut'll return null
		System.out.println(map.get("name"));
		
		
		//V remove(Object key) - removes pair based on given key
		//map.remove("city");
		
		//boolean remove(Object key, Object value) - removes pair based on given key and value
		//map.remove("lastName", "Johnson");
		
		
		//Set keySet() -> returns keys as a set
		System.out.println(map.keySet());
		
		
		//void clear() -> clears all entries from given map
		//map.clear();
		
		//boolean isEmpty() -> checks if there is any pair in given map
		System.out.println(map.isEmpty());
		
		
		//V replace() -> replace value of given key with new one
		map.replace("name", "Josh");
		
		//boolean replace(K key, V oldValue, V newValue)
		map.replace("name", "Josh", "Jack");
		
		
		//Collection <V> values() -> returns collection view of values from given map
		System.out.println(map.values());
		
		
		//size() -> returns the number of pairs/entries from given map
		System.out.println(map.size());
		
		
		//boolean containsKey(Object key) -> will check if give key is in the map
		System.out.println(map.containsKey("name"));
		
	}

}

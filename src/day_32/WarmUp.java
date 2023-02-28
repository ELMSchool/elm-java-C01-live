package day_32;

import java.util.*;

public class WarmUp {

	public static void main(String[] args) {

		ArrayList <Integer> grades1 = new ArrayList<>();
		grades1.add(75);
		grades1.add(85);
		grades1.add(80);
		
		ArrayList <Integer> grades2 = new ArrayList<>();
		grades2.add(68);
		grades2.add(79);
		grades2.add(91);
		
		ArrayList <Integer> grades3 = new ArrayList<>();
		grades3.add(95);
		grades3.add(100);
		grades3.add(75);
		
		HashMap<String, ArrayList<Integer>> classGrades = new HashMap<>();
		classGrades.put("John", grades1);
		classGrades.put("Kate", grades2);
		classGrades.put("Tiffany", grades3);
		
//		System.out.println(classGrades);
//		printAverage(classGrades);
//		
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("grape", 3);		
		
		HashMap<Integer, String> newMap = new HashMap<>();
		
		for (String key : map.keySet()) {
			
			//key - banana,   map.get(key) - 2
			newMap.put(map.get(key), key);
			
		}
		
		System.out.println(map);
	    System.out.println(newMap);
		
		
	}
	
	//Write a program will print each student name and their average grade in front
	public static LinkedHashMap<Character, Integer> findCharacterCount(String str){
		
		LinkedHashMap <Character, Integer> map = new LinkedHashMap<>(); // { j=2, }
		
		for (char letter : str.toCharArray()) {
			
			if (!map.containsKey(letter)) {
				
				map.put(letter, 1);
				
			}else {
				int count = map.get(letter);
				count++;
				map.put(letter, count);
			}
			
		}
		return map;
	}
	
	
	public static void printAverage(HashMap<String, ArrayList<Integer>> map) {
			//					[John, Kate, Tiffany]
		for (String student : map.keySet()) {
			
			ArrayList <Integer> grades = map.get(student);
			
			int sum = 0;
			
			for(int i : grades) {
				
				sum += i;
			}
			
			System.out.println(student +" " + sum/grades.size());
				
		}
		
		
	}

}

package day_28;

import java.util.*; //wild card

import day_27.OakTree;
import day_27.Tree;

public class CollectionsIntro {
	
	//Iterable > Collection > Set, List, Queue
	
	
	public static void main(String[] args) {
		
		//ArrayList has insertion order
		
		ArrayList <Integer> listOfInts = new ArrayList<>();

		listOfInts.add(5); //add method is coming from Collection Interface helps us to add elements at the of our list and returns boolean
		listOfInts.add(1); 
		listOfInts.add(10); 
		listOfInts.add(28); 
		listOfInts.add(1, 100);
		listOfInts.add(1, -9); // add(param, param) is coming from List Interface and add element to specified position
		
//		System.out.println(listOfInts.size()); //returns int (size of given list)		
		
//		System.out.println(listOfInts.get(0)); //get(param) gets the value at given index
//		
//		System.out.println(listOfInts.indexOf(29)); //returns the index of given object
//		
//		System.out.println(listOfInts.isEmpty()); //checks if given arrayList is empty or not and returns boolean
//		
//		System.out.println(listOfInts.contains(10)); //checks if given value is appearing in the list and returns boolean
		
//		int removed = listOfInts.remove(0); //removes given index from arraylist and returns the removed value
//		System.out.println(removed);
		
//		Object o = 10;
//		System.out.println(listOfInts.remove(o)); //removed given object form the list and returns boolean
		
		
//		System.out.println(listOfInts.set(1, 11)); //it sets given object to given index in the list and returns replaced object
		
//		System.out.println(listOfInts);
		
		String word = "google"; //[g o l e]
		System.out.println(giveMeUniqueLetters(word));
	}
	
	public static ArrayList<Character> giveMeUniqueLetters(String word) {
		
		ArrayList<Character> charList = new ArrayList<>();//[g,o,l,e]
		//`					[g,o,o,g,l,e]
		for (char c : word.toCharArray()) {
			//c = 'g'
			if (!charList.contains(c)) {
			charList.add(c);
			}
		}
		
		return charList;
	}

}

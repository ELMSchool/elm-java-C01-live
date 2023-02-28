package day_29;

import java.util.*;

public class ItarateThrough {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();
		
		
		words.add("hi");
		words.add("hello");
		words.add("howdy");
		words.add("bye");
		words.add("see you never");
		

		//for loop
		//for-each loop
		//iterator
		
		//[hello, howdy, bye, see you never]
		ListIterator<String> listIterator = words.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println();
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
	}

}

package day_30;

import java.util.*;

public class SortPractice {

	public static void main(String[] args) {
//		for (int num : numbers) {
//		
//		System.out.println(num);
//	}
		
		ArrayList<Integer> numbers = new ArrayList<>();
		//insertion order
		numbers.add(10);
		numbers.add(1);
		numbers.add(8);
		numbers.add(23);
		numbers.add(-4);
		
		ArrayList<String> words = new ArrayList<>();
		words.add("java");
		words.add("selenium");
		words.add("git");
		words.add("python");
//		Collections.sort(words); //sort() comes from Collections class it sorts given list in a natural order(1-100) (Aa-Zz)
		
		
//		words.sort(Comparator.naturalOrder()); -> comes from List interface. Sorts given list either in natural order or reverseOrder
//		words.sort(Comparator.reverseOrder()); -> '' ''' ''' ' ' '' ' '
	
		
		System.out.println(words);
		
		
		
		ArrayList<Person> people = new ArrayList<>();
		
		Person p1 = new Person("Mark", 50, 703);
		Person p2 = new Person("Jack", 50, 701);
		Person p3 = new Person("Aiden", 50, 704);
		Person p4 = new Person("Apple", 85, 702);

		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
		System.out.println(people);
		Collections.sort(people);
		System.out.println(people);

	}

}

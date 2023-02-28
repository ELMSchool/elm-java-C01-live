package day_30;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		Student s1 = new Student("Refia", "Karanfil", 101, 20);
		Student s2 = new Student("Farid", "Ahmadov", 102, 20);
		Student s3 = new Student("Fuad", "Suleyman", 103, 18);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println(students);
		Collections.sort(students, new StudentComparator());
		System.out.println(students);

		students.sort(new StudentComparator());
		
		
		
	}

}

package day_31;
import java.util.*;

public class MapExercises {
	
	public static void main(String[] args) {
		
		//find avarage score for the class
		TreeMap<String, Integer> gradesOfStudents = new TreeMap<>();
		
		gradesOfStudents.put("Jack", 90);
		gradesOfStudents.put("Kate", 85);
		gradesOfStudents.put("Ted", 79);
		gradesOfStudents.put("Helen", 95);
		
		
//		System.out.println(gradesOfStudents);
		int sum = 0;
//						  [Jack, Kate, Ted, Helen]
		for (String key : gradesOfStudents.keySet()) {
			
			sum+= gradesOfStudents.get(key);
		}
		
		int ave = sum / gradesOfStudents.size();
//		System.out.println(ave);
	}

}
